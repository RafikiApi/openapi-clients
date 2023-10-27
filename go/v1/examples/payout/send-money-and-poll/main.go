package main

import (
	"context"
	"fmt"
	client "github.com/RafikiApi/openapi-clients/go/v1/generated"
	"github.com/google/uuid"
	"log"
	"os"
	"strings"
	"time"
)

func main() {

	apiKey := os.Getenv("RAFIKI_API_KEY")
	if apiKey == "" {
		log.Fatal("The env variable RAFIKI_API_KEY needs to be set")
	}

	// points to the sandbox environment by default
	conf := client.NewConfiguration()

	// Uncomment to point to the production environment instead
	//conf.Servers[0].URL = "https://rest.prod.rafiki-api.com/v1"

	c := client.NewAPIClient(conf)

	ctx := context.WithValue(
		context.Background(),
		client.ContextAPIKeys,
		map[string]client.APIKey{
			"Bearer": {Key: apiKey},
		},
	)

	ik, err := uuid.NewRandom()
	if err != nil {
		log.Fatal(err)
	}

	req := c.PayoutAPI.PayoutsPost(ctx).
		XIdempotencyKey(ik.String()).
		OpenapiPayoutCreateRequest(client.OpenapiPayoutCreateRequest{
			Amount: &client.OpenapiPayoutCreateRequestAmount{
				Currency: client.PtrString("KES"),
				Value:    client.PtrString("300.99"),
			},
			PaymentAccount: &client.OpenapiPaymentAccountGetOrCreateRequest{
				Type:    client.PtrString("MOBILE_MONEY"),
				Country: client.PtrString("KE"),
				Holder: &client.OpenapiPaymentAccountGetOrCreateRequestHolder{
					Name: client.PtrString("Employee's full name"),
					Type: client.PtrString("INDIVIDUAL"),
				},
				MobileMoney: &client.OpenapiPaymentAccountGetOrCreateRequestMobileMoney{
					Number:   client.PtrString("+254705912000"),
					Operator: client.PtrString("SAFARICOM"),
				},
			},
			Sender: &client.OpenapiPayoutCreateRequestSender{
				Type: client.PtrString("BUSINESS"),
				Name: client.PtrString("The payroll company name"),
				Address: &client.OpenapiPayoutCreateRequestSenderAddress{
					City:       client.PtrString("Roma"),
					PostalCode: client.PtrString("00184"),
					Country:    client.PtrString("IT"),
					Line1:      client.PtrString("Piazza Del Colosseo"),
				},
			},
		})

	pyt, _, err := c.PayoutAPI.PayoutsPostExecute(req)
	if err != nil {
		if err, ok := err.(*client.GenericOpenAPIError); ok {
			sb := strings.Builder{}
			sb.WriteString(fmt.Sprintf("Error: %s\n", err))
			switch err := err.Model().(type) {
			case client.OpenapiResponseBodyValidationFailed:
				errors := err.GetErrors()
				for field, errors := range errors.GetFields() {
					sb.WriteString(fmt.Sprintf("Field: %s\n", field))
					for _, errorMessage := range errors {
						sb.WriteString(fmt.Sprintf("  - %s\n", errorMessage))
					}
				}
			}
			log.Fatal(sb.String())
		}
		log.Fatal(fmt.Sprintf("unknown error: %s", err))
	}

	log.Printf("Payout accepted with ID: %s", *pyt.Data.Id)

	log.Print("Polling for updates...")

	for {

		pyt, _, err := c.PayoutAPI.PayoutsIdGetExecute(
			c.PayoutAPI.PayoutsIdGet(ctx, *pyt.Data.Id),
		)
		if err != nil {
			log.Fatalf("Error fetching payout: %s", err)
		}

		if pyt.Data.State.GetCode() == "PENDING" {
			log.Print("The payout is still processing, retrying in 5 seconds...")
			time.Sleep(time.Second * 5)
			continue
		}

		if pyt.Data.State.GetCode() == "SENT" {
			receipt := "unavailable"
			if r := pyt.Data.Receipt; r != nil {
				receipt = *r
			}
			log.Printf("The payout was sent successfully with receipt reference: %s", receipt)
			break
		}

		log.Printf("The payout failed with state: %s", pyt.Data.State.GetCode())

		break
	}

	log.Printf("Bye!")
}
