# rafikigen.PaymentAccountApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payment_accounts_get**](PaymentAccountApi.md#payment_accounts_get) | **GET** /payment-accounts | List
[**payment_accounts_post**](PaymentAccountApi.md#payment_accounts_post) | **POST** /payment-accounts | Get or create


# **payment_accounts_get**
> PaymentAccountsGet200Response payment_accounts_get(paging_limit=paging_limit, paging_after=paging_after)

List

Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary. 

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.payment_accounts_get200_response import PaymentAccountsGet200Response
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
    api_instance = rafikigen.PaymentAccountApi(api_client)
    paging_limit = 56 # int | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 (optional)
    paging_after = 'paging_after_example' # str | The base64 URL encoded cursor used to access the next set of paginated results (optional)

    try:
        # List
        api_response = api_instance.payment_accounts_get(paging_limit=paging_limit, paging_after=paging_after)
        print("The response of PaymentAccountApi->payment_accounts_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentAccountApi->payment_accounts_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paging_limit** | **int**| The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional] 
 **paging_after** | **str**| The base64 URL encoded cursor used to access the next set of paginated results | [optional] 

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
**200** | OK |  -  |
**422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **payment_accounts_post**
> PaymentAccountsPost200Response payment_accounts_post(openapi_payment_account_get_or_create_request)

Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.   | Country   | Operators                            | | --------- | ------------------------------------ | | 🇰🇪 KE     | SAFARICOM, AIRTEL                    | | 🇹🇿 TZ     | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | 🇷🇼 RW     | AIRTEL, MTN                          | | 🇬🇭 GH     | AIRTEL, MTN, TIGO, VODAFONE          | | 🇺🇬 UG     | AIRTEL, MTN                          | | 🇨🇮 CI     | MTN, ORANGE, MOOV                    | | 🇸🇳 SN     | ORANGE, FREE, EXPRESSO               | | 🇨🇲 CM     | MTN, ORANGE                          |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered.  We provide support for numerous banks in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks. 

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.openapi_payment_account_get_or_create_request import OpenapiPaymentAccountGetOrCreateRequest
from rafikigen.models.payment_accounts_post200_response import PaymentAccountsPost200Response
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
    api_instance = rafikigen.PaymentAccountApi(api_client)
    openapi_payment_account_get_or_create_request = rafikigen.OpenapiPaymentAccountGetOrCreateRequest() # OpenapiPaymentAccountGetOrCreateRequest | The payment account

    try:
        # Get or create
        api_response = api_instance.payment_accounts_post(openapi_payment_account_get_or_create_request)
        print("The response of PaymentAccountApi->payment_accounts_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentAccountApi->payment_accounts_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openapi_payment_account_get_or_create_request** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md)| The payment account | 

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
**200** | The already existing payment account was returned |  -  |
**201** | The payment account was created |  -  |
**422** | Validation failed |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

