# rafikigen.rafikigen.LookupApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**LookupsAccountNumberGet**](LookupApi.md#lookupsaccountnumberget) | **GET** /lookups/{accountNumber} | Get |

<a id="lookupsaccountnumberget"></a>
# **LookupsAccountNumberGet**
> LookupsAccountNumberGet200Response LookupsAccountNumberGet (string paymentAccountType, string accountNumber, string? bankId = null, string? varOperator = null)

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  For some cases like Kenya mobile money lookups, try again in 5 minutes after getting the `LOOKUP_ACCOUNT_NOT_FOUND` error. If we respond with the same error again, it is likely that the account is not registered with the operator.  ### Supported countries/account types  | Country       | Mobile Money | Bank Account | |:- -- -- -- -- -- -- -|:- -- -- -- -- -- -:|:- -- -- -- -- -- -:| | 🇳🇬 Nigeria  |     ❌       |      ✅      | | 🇺🇬 Uganda   |     ✅       |      ✅      | | 🇬🇭 Ghana    |     ✅       |      ✅      | | 🇰🇪 Kenya    |     ✅       |      ✅      | 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class LookupsAccountNumberGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new LookupApi(config);
            var paymentAccountType = "MOBILE_MONEY";  // string | The payment account type to lookup for
            var accountNumber = "accountNumber_example";  // string | The account number, that is either the mobile money number or bank account number
            var bankId = "bankId_example";  // string? | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to (optional) 
            var varOperator = "AIRTEL";  // string? | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator (optional) 

            try
            {
                // Get
                LookupsAccountNumberGet200Response result = apiInstance.LookupsAccountNumberGet(paymentAccountType, accountNumber, bankId, varOperator);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LookupApi.LookupsAccountNumberGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the LookupsAccountNumberGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get
    ApiResponse<LookupsAccountNumberGet200Response> response = apiInstance.LookupsAccountNumberGetWithHttpInfo(paymentAccountType, accountNumber, bankId, varOperator);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling LookupApi.LookupsAccountNumberGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **paymentAccountType** | **string** | The payment account type to lookup for |  |
| **accountNumber** | **string** | The account number, that is either the mobile money number or bank account number |  |
| **bankId** | **string?** | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional]  |
| **varOperator** | **string?** | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator | [optional]  |

### Return type

[**LookupsAccountNumberGet200Response**](LookupsAccountNumberGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The found looked up account number information |  -  |
| **404** | The provided account identifier is unregistered / couldn&#39;t be found |  -  |
| **422** | Validation failed, e.g. missing payment_account_type |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

