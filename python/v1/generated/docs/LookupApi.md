# rafikigen.LookupApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lookups_account_number_get**](LookupApi.md#lookups_account_number_get) | **GET** /lookups/{accountNumber} | Get


# **lookups_account_number_get**
> LookupsAccountNumberGet200Response lookups_account_number_get(payment_account_type, account_number, bank_id=bank_id, operator=operator)

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  For some cases like Kenya mobile money lookups, try again in 5 minutes after getting the `LOOKUP_ACCOUNT_NOT_FOUND` error. If we respond with the same error again, it is likely that the account is not registered with the operator.  ### Supported countries/account types  | Country       | Mobile Money | Bank Account | |:--------------|:------------:|:------------:| | 🇳🇬 Nigeria  |     ❌       |      ✅      | | 🇺🇬 Uganda   |     ✅       |      ✅      | | 🇬🇭 Ghana    |     ✅       |      ✅      | | 🇰🇪 Kenya    |     ✅       |      ✅      | 

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.lookups_account_number_get200_response import LookupsAccountNumberGet200Response
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
    api_instance = rafikigen.LookupApi(api_client)
    payment_account_type = 'payment_account_type_example' # str | The payment account type to lookup for
    account_number = 'account_number_example' # str | The account number, that is either the mobile money number or bank account number
    bank_id = 'bank_id_example' # str | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to (optional)
    operator = 'operator_example' # str | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator (optional)

    try:
        # Get
        api_response = api_instance.lookups_account_number_get(payment_account_type, account_number, bank_id=bank_id, operator=operator)
        print("The response of LookupApi->lookups_account_number_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LookupApi->lookups_account_number_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payment_account_type** | **str**| The payment account type to lookup for | 
 **account_number** | **str**| The account number, that is either the mobile money number or bank account number | 
 **bank_id** | **str**| If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional] 
 **operator** | **str**| If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator | [optional] 

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
**200** | The found looked up account number information |  -  |
**404** | The provided account identifier is unregistered / couldn&#39;t be found |  -  |
**422** | Validation failed, e.g. missing payment_account_type |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

