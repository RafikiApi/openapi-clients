# rafikigen.rafikigen.PayoutApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PayoutsGet**](PayoutApi.md#payoutsget) | **GET** /payouts | List |
| [**PayoutsIdGet**](PayoutApi.md#payoutsidget) | **GET** /payouts/{id} | Get |
| [**PayoutsPost**](PayoutApi.md#payoutspost) | **POST** /payouts | Create |

<a id="payoutsget"></a>
# **PayoutsGet**
> PayoutsGet200Response PayoutsGet (string? createdAtFrom = null, string? createdAtTo = null, int? pagingLimit = null, string? pagingAfter = null)

List

Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class PayoutsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PayoutApi(config);
            var createdAtFrom = "createdAtFrom_example";  // string? | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. (optional) 
            var createdAtTo = "createdAtTo_example";  // string? | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. (optional) 
            var pagingLimit = 56;  // int? | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 (optional) 
            var pagingAfter = "pagingAfter_example";  // string? | The base64 URL encoded cursor used to access the next set of paginated results (optional) 

            try
            {
                // List
                PayoutsGet200Response result = apiInstance.PayoutsGet(createdAtFrom, createdAtTo, pagingLimit, pagingAfter);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PayoutApi.PayoutsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PayoutsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List
    ApiResponse<PayoutsGet200Response> response = apiInstance.PayoutsGetWithHttpInfo(createdAtFrom, createdAtTo, pagingLimit, pagingAfter);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PayoutApi.PayoutsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createdAtFrom** | **string?** | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. | [optional]  |
| **createdAtTo** | **string?** | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. | [optional]  |
| **pagingLimit** | **int?** | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional]  |
| **pagingAfter** | **string?** | The base64 URL encoded cursor used to access the next set of paginated results | [optional]  |

### Return type

[**PayoutsGet200Response**](PayoutsGet200Response.md)

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

<a id="payoutsidget"></a>
# **PayoutsIdGet**
> PayoutsIdGet200Response PayoutsIdGet (string id)

Get

This endpoint enables the retrieval of a previously accepted payout using its unique ID (`pyt-xxx`). Its primary purpose is to periodically check for changes in the payout status. Currently, we do not provide webhooks, so this method serves as the only available option in such cases.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class PayoutsIdGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PayoutApi(config);
            var id = "id_example";  // string | The Payout ID (pyt-xxx)

            try
            {
                // Get
                PayoutsIdGet200Response result = apiInstance.PayoutsIdGet(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PayoutApi.PayoutsIdGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PayoutsIdGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get
    ApiResponse<PayoutsIdGet200Response> response = apiInstance.PayoutsIdGetWithHttpInfo(id);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PayoutApi.PayoutsIdGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | The Payout ID (pyt-xxx) |  |

### Return type

[**PayoutsIdGet200Response**](PayoutsIdGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Couldn&#39;t find any payout with the provided ID |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="payoutspost"></a>
# **PayoutsPost**
> PayoutsPost202Response PayoutsPost (string xIdempotencyKey, OpenapiPayoutCreateRequest openapiPayoutCreateRequest)

Create

The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  > ℹ️ Lifecycle > > If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. > <br> > Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. > <br> > <details> >  <summary>Payout States</summary> > <br> >  <table> >    <thead> >        <tr> >            <th>State</th> >            <th>Description</th> >        </tr> >    </thead> >    <tbody> >        <tr> >            <th>⏳<br>PENDING</th> >            <th>Your payout has been accepted, and it is currently awaiting processing.</th> >        </tr> >        <tr> >           <th>🎉<br>SENT</th> >           <th>The payout has been successfully processed, and the intended recipient should have received the funds.</th> >        </tr> >        <tr> >           <th>🔙<br>REVERSED</th> >           <th>Upon reaching the \"SENT\" state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.</th> >        </tr> >        <tr> >           <th>🙅<br>CANCELLED</th> >           <th>If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.</th> >        </tr> >        <tr> >           <th>💔<br>FAILED</th> >           <th> >               The funds did not reach the intended recipient due to a failure. If the \"context\" property does not provide specific information about the reason for the failure, please contact our customer support for assistance. >           </th> >        </tr> >    </tbody> >  </table> >  </details>  > ⚠️ Compliance requirements >  > Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. > <br> > We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process for you, the table below outlines the specific requirements for each country we offer payout support, streamlining the compliance process. > <br> > <details> <summary>Requirements</summary> <table>     <thead>         <tr>             <th>Field</th>             <th>KE 🇰🇪</th>         </tr>     </thead>     <tbody>         <tr>             <td>amount.value</td>             <td>                 <table>                     <thead>                          <tr>                             <th>Min</th>                             <th>Max</th>                         </tr>                     </thead>                     <tbody>                         <tr>                             <td>140 KES</td>                             <td>500,000 KES</td> <!- - Kenya - ->                         </tr>                     </tbody>                 </table>             </td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.type</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.name</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.address.line1</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.address.line2</td>             <td>-</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.address.line3</td>             <td>-</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.address.city</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.address.postal_code</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.address.country</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required with INDIVIDUAL sender's type</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.identity_document.type</td>             <td>-</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.identity_document.country</td>             <td>-</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.identity_document.number</td>             <td>-</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.identity_document.issued_on</td>             <td>-</td> <!- - Kenya - ->         </tr>         <tr>             <td>sender.individual.identity_document.expires_on</td>             <td>-</td> <!- - Kenya - ->         </tr>     </tbody> </table> </details>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class PayoutsPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new PayoutApi(config);
            var xIdempotencyKey = "xIdempotencyKey_example";  // string | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
            var openapiPayoutCreateRequest = new OpenapiPayoutCreateRequest(); // OpenapiPayoutCreateRequest | The payout

            try
            {
                // Create
                PayoutsPost202Response result = apiInstance.PayoutsPost(xIdempotencyKey, openapiPayoutCreateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PayoutApi.PayoutsPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PayoutsPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create
    ApiResponse<PayoutsPost202Response> response = apiInstance.PayoutsPostWithHttpInfo(xIdempotencyKey, openapiPayoutCreateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PayoutApi.PayoutsPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **xIdempotencyKey** | **string** | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) |  |
| **openapiPayoutCreateRequest** | [**OpenapiPayoutCreateRequest**](OpenapiPayoutCreateRequest.md) | The payout |  |

### Return type

[**PayoutsPost202Response**](PayoutsPost202Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **402** | Not enough balance, see [error codes](error-codes#wallet_insufficient_balance-http-402) |  -  |
| **409** | Idempotency conflict, see [error codes](error-codes#idempotency_race-http-409) |  -  |
| **422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

