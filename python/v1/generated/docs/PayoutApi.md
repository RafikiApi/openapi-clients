# rafikigen.PayoutApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payouts_get**](PayoutApi.md#payouts_get) | **GET** /payouts | List
[**payouts_id_get**](PayoutApi.md#payouts_id_get) | **GET** /payouts/{id} | Get
[**payouts_post**](PayoutApi.md#payouts_post) | **POST** /payouts | Create


# **payouts_get**
> PayoutsGet200Response payouts_get(created_at_from=created_at_from, created_at_to=created_at_to, paging_limit=paging_limit, paging_after=paging_after)

List

Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.payouts_get200_response import PayoutsGet200Response
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
    api_instance = rafikigen.PayoutApi(api_client)
    created_at_from = 'created_at_from_example' # str | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. (optional)
    created_at_to = 'created_at_to_example' # str | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. (optional)
    paging_limit = 56 # int | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 (optional)
    paging_after = 'paging_after_example' # str | The base64 URL encoded cursor used to access the next set of paginated results (optional)

    try:
        # List
        api_response = api_instance.payouts_get(created_at_from=created_at_from, created_at_to=created_at_to, paging_limit=paging_limit, paging_after=paging_after)
        print("The response of PayoutApi->payouts_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PayoutApi->payouts_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created_at_from** | **str**| Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. | [optional] 
 **created_at_to** | **str**| Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. | [optional] 
 **paging_limit** | **int**| The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional] 
 **paging_after** | **str**| The base64 URL encoded cursor used to access the next set of paginated results | [optional] 

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
**200** | OK |  -  |
**422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **payouts_id_get**
> PayoutsIdGet200Response payouts_id_get(id)

Get

This endpoint enables the retrieval of a previously accepted payout using its unique ID (`pyt-xxx`) or the `custom_id` submitted when creating it. Its primary purpose is to periodically check for changes in the payout status.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint. 

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.payouts_id_get200_response import PayoutsIdGet200Response
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
    api_instance = rafikigen.PayoutApi(api_client)
    id = 'id_example' # str | The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation

    try:
        # Get
        api_response = api_instance.payouts_id_get(id)
        print("The response of PayoutApi->payouts_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PayoutApi->payouts_id_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation | 

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
**200** | OK |  -  |
**404** | Couldn&#39;t find any payout with the provided ID |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **payouts_post**
> PayoutsPost202Response payouts_post(x_idempotency_key, openapi_payout_create_request)

Create

The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  > ℹ️ Lifecycle > > If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. > <br> > Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. After the payout is completed, provided [webhook notifications](webhooks) are set up, Rafiki will also dispatch [payout.state-updated](payoutstate-updated) events > <br> > > <details> >  <summary>Payout States</summary> > <br> >  <table> >    <thead> >        <tr> >            <th>State</th> >            <th>Description</th> >        </tr> >    </thead> >    <tbody> >        <tr> >            <th>⏳<br>PENDING</th> >            <th>Your payout has been accepted, and it is currently awaiting processing.</th> >        </tr> >        <tr> >           <th>🎉<br>SENT</th> >           <th>The payout has been successfully processed, and the intended recipient should have received the funds.</th> >        </tr> >        <tr> >           <th>🔙<br>REVERSED</th> >           <th>Upon reaching the \"SENT\" state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.</th> >        </tr> >        <tr> >           <th>🙅<br>CANCELLED</th> >           <th>If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.</th> >        </tr> >        <tr> >           <th>💔<br>FAILED</th> >           <th> >               The funds did not reach the intended recipient due to a failure. If the \"context\" property does not provide specific information about the reason for the failure, please contact our customer support for assistance. >           </th> >        </tr> >    </tbody> >  </table> >  </details> > <br> > <details> >  <summary>Payout state context</summary> > <br> > When a payout fails, the \"context\" property of the state object will provide additional information about the reason for the failure. The table below outlines the possible values for this property. > > #### `WALLET_INSUFFICIENT_BALANCE` > > The selected wallet currently doesn't have enough money to process the payout. <br><br> > > #### `PAYMENT_ACCOUNT_INVALID_ACCOUNT_NUMBER` > > The account number provided is invalid. <br><br> > > #### `PAYMENT_ACCOUNT_BALANCE_MAXED_OUT` > > The payment account balance has reached the maximum allowed. <br><br> > > #### `PAYMENT_ACCOUNT_PER_TRANSACTION_LIMIT_REACHED` > > The amount to be sent exceeds the maximum allowed per transaction for this payment account <br><br> > > #### `PAYMENT_ACCOUNT_DAILY_LIMIT_REACHED` > > The payment account has reached the daily limit or would reach it by processing this payout. <br><br> > > #### `PAYMENT_ACCOUNT_MONTHLY_LIMIT_REACHED` > > The payment account has reached the monthly limit or would reach it by processing this payout. <br><br> > > #### `PAYMENT_ACCOUNT_LIMIT_REACHED` > > The payment account has reached a limit but we don't know which one. <br><br> > >  </details>  > 📘 Payout amount limits > > Depending on the payment account type and destination currency, different transactions amount limits apply. > <br> > Such limits might be enforced for compliance reasons or mandated by the banking authority that owns the payment account or the country in which the account resides. > <br> > <details> > <summary>Per transaction limits</summary> > <br> > <table> >     <thead> >         <th>Country</th> >         <th>Minimum</th> >         <th>Maximum</th> >    </thead> >    <tbody> >          <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇰🇪 Kenya</td> >             <td>KSh 140</td> >             <td> >                 <table> >                     <thead> >                         <th>Bank Account</th> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>KSh 950,000</td> >                             <td>KSh 250,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇹🇿 Tanzania</td> >             <td>TSh 2,500</td> >             <td> >                 <table> >                     <thead> >                         <th>Bank Account</th> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>TSh 20,000,000</td> >                             <td>TSh 5,000,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇷🇼 Rwanda</td> >             <td>R&#x20A3; 500</td> >             <td> >                 <table> >                     <thead> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td style=\"text-align: center; vertical-align: middle;\"> >                                 <strong>MTN</strong> R&#x20A3; 2,000,000 <br> >                                 <strong>Airtel</strong> R&#x20A3; 500,000 <br> >                             </td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇳🇬 Nigeria</td> >             <td>&#x20A6; 100</td> >             <td> >                 <table> >                     <thead> >                         <th>Bank Account</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>&#x20A6; 50,000,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇬🇭 Ghana</td> >             <td>&#8373; 10</td> >             <td> >                 <table> >                     <thead> >                         <th>Bank Account</th> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>&#8373; 50,000</td> >                             <td>&#8373; 15,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇺🇬 Uganda</td> >             <td>USh 5,000</td> >             <td> >                 <table> >                     <thead> >                         <th>Bank Account</th> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>USh 5,000,000</td> >                             <td>USh 5,000,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇪🇬 Egypt</td> >             <td>&pound; 200</td> >             <td> >                 <table> >                     <thead> >                         <th>Bank Account</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>&pound; 300,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇸🇳 Senegal</td> >             <td>XOF 2,000</td> >             <td> >                 <table> >                     <thead> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>XOF 1,500,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇨🇮 C&ocirc;te d'Ivoire</td> >             <td>XOF 2,000</td> >             <td> >                 <table> >                     <thead> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>XOF 1,500,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr style=\"text-align: center; vertical-align: middle;\"> >             <td>🇨🇲 Cameroon</td> >             <td>XAF 500</td> >             <td> >                 <table> >                     <thead> >                         <th>Mobile Money</th> >                     </thead> >                     <tbody> >                         <tr> >                             <td>XAF 1,000,000</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >     </tbody> > </table> > </details>  > ⚠️ Sender requirements > > Some countries might necessitate different and more comprehensive sender details. > <br> > We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process, you can detail the requirements for each country listed below. > <br> > > <details> > <summary>🇰🇪 Kenya</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>-</td> <!-- Kenya --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇳🇬 Nigeria</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇹🇿 Tanzania</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇷🇼 Rwanda</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇬🇭 Ghana</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Ghana --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Ghana --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇺🇬 Uganda</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Uganda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Uganda --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇪🇬 Egypt</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Egypt --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Egypt --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇸🇳 Senegal</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Senegal --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Senegal --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇨🇮 C&ocirc;te d'Ivoire</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Côte d'Ivoire --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Côte d'Ivoire --> >         </tr> >     </tbody> > </table> > <br> > </details> > > <details> > <summary>🇨🇲 Cameroon</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >             <th>Requirements</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.type</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Cameroon --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Cameroon --> >         </tr> >     </tbody> > </table> > <br> > </details> 

### Example

* Api Key Authentication (Bearer):
```python
import time
import os
import rafikigen
from rafikigen.models.openapi_payout_create_request import OpenapiPayoutCreateRequest
from rafikigen.models.payouts_post202_response import PayoutsPost202Response
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
    api_instance = rafikigen.PayoutApi(api_client)
    x_idempotency_key = 'x_idempotency_key_example' # str | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
    openapi_payout_create_request = rafikigen.OpenapiPayoutCreateRequest() # OpenapiPayoutCreateRequest | The payout

    try:
        # Create
        api_response = api_instance.payouts_post(x_idempotency_key, openapi_payout_create_request)
        print("The response of PayoutApi->payouts_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PayoutApi->payouts_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_idempotency_key** | **str**| 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) | 
 **openapi_payout_create_request** | [**OpenapiPayoutCreateRequest**](OpenapiPayoutCreateRequest.md)| The payout | 

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
**202** | Accepted |  -  |
**402** | Not enough balance, see [error codes](error-codes#wallet_insufficient_balance-http-402) |  -  |
**409** | Idempotency conflict, see [error codes](error-codes#idempotency_race-http-409) |  -  |
**422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

