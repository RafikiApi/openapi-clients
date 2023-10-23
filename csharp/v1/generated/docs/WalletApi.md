# rafikigen.rafikigen.WalletApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**WalletsGet**](WalletApi.md#walletsget) | **GET** /wallets | List |

<a id="walletsget"></a>
# **WalletsGet**
> WalletsGet200Response WalletsGet ()

List

Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class WalletsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new WalletApi(config);

            try
            {
                // List
                WalletsGet200Response result = apiInstance.WalletsGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling WalletApi.WalletsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the WalletsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List
    ApiResponse<WalletsGet200Response> response = apiInstance.WalletsGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling WalletApi.WalletsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**WalletsGet200Response**](WalletsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

