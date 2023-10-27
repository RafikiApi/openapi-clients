# rafikigen.rafikigen.BankApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**BanksGet**](BankApi.md#banksget) | **GET** /banks | List |

<a id="banksget"></a>
# **BanksGet**
> BanksGet200Response BanksGet ()

List

Within the scope of this API, the \"Bank\" resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks, including their branches, provided by our API.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using rafikigen.rafikigen;
using rafikigen.Client;
using rafikigen.Model;

namespace Example
{
    public class BanksGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://rest.sandbox.rafiki-api.com/v1";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new BankApi(config);

            try
            {
                // List
                BanksGet200Response result = apiInstance.BanksGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BankApi.BanksGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the BanksGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List
    ApiResponse<BanksGet200Response> response = apiInstance.BanksGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BankApi.BanksGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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
| **500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

