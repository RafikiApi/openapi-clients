# BankApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**banksGet**](BankApi.md#banksGet) | **GET** /banks | List |


<a id="banksGet"></a>
# **banksGet**
> BanksGet200Response banksGet()

List

Within the scope of this API, the \&quot;Bank\&quot; resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks, including their branches, provided by our API.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import rafikigen.BankApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.sandbox.rafiki-api.com/v1");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    BankApi apiInstance = new BankApi(defaultClient);
    try {
      BanksGet200Response result = apiInstance.banksGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BankApi#banksGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BanksGet200Response**](BanksGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

