# PaymentAccountApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**paymentAccountsPost**](PaymentAccountApi.md#paymentAccountsPost) | **POST** /payment-accounts | Get or create |


<a id="paymentAccountsPost"></a>
# **paymentAccountsPost**
> PaymentAccountsPost201Response paymentAccountsPost(openapiPaymentAccountGetOrCreateRequest)

Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  &gt; 💁 &gt; &gt; Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a &#x60;200 OK&#x60; status. Otherwise, we proceed to create a new one and respond with a &#x60;201 Created&#x60; status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \&quot;mobile money\&quot; type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.  | Country | Operators         | |---------|-------------------| | KE      | SAFARICOM, AIRTEL |  ### Bank account  The \&quot;bank account\&quot; type is designated for conventional accounts registered with bank institutions, such as \&quot;Equity Bank.\&quot; It comprises an account number and the associated bank ID, where accounts are registered. Additionally, for banks with multiple branches in a country, a branch ID may be required to accurately identify and route payments.  We provide support for numerous banks and branches in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks along with their branches. 

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import rafikigen.PaymentAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.sandbox.rafiki-api.com/v1");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PaymentAccountApi apiInstance = new PaymentAccountApi(defaultClient);
    OpenapiPaymentAccountGetOrCreateRequest openapiPaymentAccountGetOrCreateRequest = new OpenapiPaymentAccountGetOrCreateRequest(); // OpenapiPaymentAccountGetOrCreateRequest | The payment account
    try {
      PaymentAccountsPost201Response result = apiInstance.paymentAccountsPost(openapiPaymentAccountGetOrCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentAccountApi#paymentAccountsPost");
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
| **openapiPaymentAccountGetOrCreateRequest** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md)| The payment account | |

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

