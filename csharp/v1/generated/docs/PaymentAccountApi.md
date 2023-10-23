# rafikigen.rafikigen.PaymentAccountApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PaymentAccountsPost**](PaymentAccountApi.md#paymentaccountspost) | **POST** /payment-accounts | Get or create |

<a id="paymentaccountspost"></a>
# **PaymentAccountsPost**
> PaymentAccountsPost201Response PaymentAccountsPost (OpenapiPaymentAccountGetOrCreateRequest openapiPaymentAccountGetOrCreateRequest)

Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.  | Country | Operators         | |- -- -- -- --|- -- -- -- -- -- -- -- -- --| | KE      | SAFARICOM, AIRTEL |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered. Additionally, for banks with multiple branches in a country, a branch ID may be required to accurately identify and route payments.  We provide support for numerous banks and branches in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks along with their branches. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class PaymentAccountsPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PaymentAccountApi(config);
            var openapiPaymentAccountGetOrCreateRequest = new OpenapiPaymentAccountGetOrCreateRequest(); // OpenapiPaymentAccountGetOrCreateRequest | The payment account

            try
            {
                // Get or create
                PaymentAccountsPost201Response result = apiInstance.PaymentAccountsPost(openapiPaymentAccountGetOrCreateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PaymentAccountApi.PaymentAccountsPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PaymentAccountsPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get or create
    ApiResponse<PaymentAccountsPost201Response> response = apiInstance.PaymentAccountsPostWithHttpInfo(openapiPaymentAccountGetOrCreateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PaymentAccountApi.PaymentAccountsPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **openapiPaymentAccountGetOrCreateRequest** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) | The payment account |  |

### Return type

[**PaymentAccountsPost201Response**](PaymentAccountsPost201Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | Validation failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

