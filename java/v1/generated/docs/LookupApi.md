# LookupApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**lookupsAccountNumberGet**](LookupApi.md#lookupsAccountNumberGet) | **GET** /lookups/{accountNumber} | Get |


<a id="lookupsAccountNumberGet"></a>
# **lookupsAccountNumberGet**
> LookupsAccountNumberGet200Response lookupsAccountNumberGet(paymentAccountType, accountNumber, bankId)

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import rafikigen.LookupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.sandbox.rafiki-api.com/v1");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    LookupApi apiInstance = new LookupApi(defaultClient);
    String paymentAccountType = "MOBILE_MONEY"; // String | The payment account type to lookup for
    String accountNumber = "accountNumber_example"; // String | The account number, that is either the mobile money number or bank account number
    String bankId = "bankId_example"; // String | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to
    try {
      LookupsAccountNumberGet200Response result = apiInstance.lookupsAccountNumberGet(paymentAccountType, accountNumber, bankId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookupApi#lookupsAccountNumberGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentAccountType** | **String**| The payment account type to lookup for | [enum: MOBILE_MONEY, BANK_ACCOUNT] |
| **accountNumber** | **String**| The account number, that is either the mobile money number or bank account number | |
| **bankId** | **String**| If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional] |

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

