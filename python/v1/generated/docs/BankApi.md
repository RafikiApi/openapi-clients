# rafikigen.BankApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**banks_get**](BankApi.md#banks_get) | **GET** /banks | List


# **banks_get**
> BanksGet200Response banks_get()

List

Within the scope of this API, the \"Bank\" resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks provided by our API. 

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.banks_get200_response import BanksGet200Response
from rafikigen.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://rest.sandbox.rafiki-api.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = rafikigen.Configuration(
    host = "https://rest.sandbox.rafiki-api.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Bearer
configuration.api_key['Bearer'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Bearer'] = 'Bearer'

# Enter a context with an instance of the API client
with rafikigen.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = rafikigen.BankApi(api_client)

    try:
        # List
        api_response = api_instance.banks_get()
        print("The response of BankApi->banks_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BankApi->banks_get: %s\n" % e)
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
**200** | OK |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

