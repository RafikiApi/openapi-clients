/*
 * Resources
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package rafikigen;

import invalidPackageName.ApiException;
import org.openapitools.client.model.LookupsAccountNumberGet200Response;
import org.openapitools.client.model.OpenapiResponseBodyInternalServerError;
import org.openapitools.client.model.OpenapiResponseBodyLookupAccountNotFound;
import org.openapitools.client.model.OpenapiResponseBodyValidationFailed;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LookupApi
 */
@Disabled
public class LookupApiTest {

    private final LookupApi api = new LookupApi();

    /**
     * Get
     *
     * The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupsAccountNumberGetTest() throws ApiException {
        String paymentAccountType = null;
        String accountNumber = null;
        String bankId = null;
        LookupsAccountNumberGet200Response response = api.lookupsAccountNumberGet(paymentAccountType, accountNumber, bankId);
        // TODO: test validations
    }

}