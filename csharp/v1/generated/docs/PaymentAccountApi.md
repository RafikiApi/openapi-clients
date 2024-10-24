# rafikigen.rafikigen.PaymentAccountApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PaymentAccountsGet**](PaymentAccountApi.md#paymentaccountsget) | **GET** /payment-accounts | List |
| [**PaymentAccountsPost**](PaymentAccountApi.md#paymentaccountspost) | **POST** /payment-accounts | Get or create |

<a id="paymentaccountsget"></a>
# **PaymentAccountsGet**
> PaymentAccountsGet200Response PaymentAccountsGet (int? pagingLimit = null, string? pagingAfter = null)

List

Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class PaymentAccountsGetExample
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
            var pagingLimit = 56;  // int? | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 (optional) 
            var pagingAfter = "pagingAfter_example";  // string? | The base64 URL encoded cursor used to access the next set of paginated results (optional) 

            try
            {
                // List
                PaymentAccountsGet200Response result = apiInstance.PaymentAccountsGet(pagingLimit, pagingAfter);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PaymentAccountApi.PaymentAccountsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PaymentAccountsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List
    ApiResponse<PaymentAccountsGet200Response> response = apiInstance.PaymentAccountsGetWithHttpInfo(pagingLimit, pagingAfter);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PaymentAccountApi.PaymentAccountsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pagingLimit** | **int?** | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional]  |
| **pagingAfter** | **string?** | The base64 URL encoded cursor used to access the next set of paginated results | [optional]  |

### Return type

[**PaymentAccountsGet200Response**](PaymentAccountsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="paymentaccountspost"></a>
# **PaymentAccountsPost**
> PaymentAccountsPost200Response PaymentAccountsPost (OpenapiPaymentAccountGetOrCreateRequest openapiPaymentAccountGetOrCreateRequest)

Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.   | Country   | Operators                            | | - -- -- -- -- | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | 🇰🇪 KE     | SAFARICOM, AIRTEL                    | | 🇹🇿 TZ     | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | 🇷🇼 RW     | AIRTEL, MTN                          | | 🇬🇭 GH     | AIRTEL, MTN, TIGO, VODAFONE          | | 🇺🇬 UG     | AIRTEL, MTN                          | | 🇨🇮 CI     | MTN, ORANGE, MOOV                    | | 🇸🇳 SN     | ORANGE, FREE, EXPRESSO               | | 🇨🇲 CM     | MTN, ORANGE                          |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered.  We provide support for numerous banks in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks. 

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
                PaymentAccountsPost200Response result = apiInstance.PaymentAccountsPost(openapiPaymentAccountGetOrCreateRequest);
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
    ApiResponse<PaymentAccountsPost200Response> response = apiInstance.PaymentAccountsPostWithHttpInfo(openapiPaymentAccountGetOrCreateRequest);
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

[**PaymentAccountsPost200Response**](PaymentAccountsPost200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The already existing payment account was returned |  -  |
| **201** | The payment account was created |  -  |
| **422** | Validation failed |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

