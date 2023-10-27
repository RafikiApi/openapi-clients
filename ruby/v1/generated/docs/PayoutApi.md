# OpenapiClient::PayoutApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**payouts_get**](PayoutApi.md#payouts_get) | **GET** /payouts | List |
| [**payouts_id_get**](PayoutApi.md#payouts_id_get) | **GET** /payouts/{id} | Get |
| [**payouts_post**](PayoutApi.md#payouts_post) | **POST** /payouts | Create |


## payouts_get

> <PayoutsGet200Response> payouts_get(opts)

List

Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: Bearer
  config.api_key['Bearer'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['Bearer'] = 'Bearer'
end

api_instance = OpenapiClient::PayoutApi.new
opts = {
  created_at_from: 'created_at_from_example', # String | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information.
  created_at_to: 'created_at_to_example', # String | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information.
  paging_limit: 56, # Integer | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
  paging_after: 'paging_after_example' # String | The base64 URL encoded cursor used to access the next set of paginated results
}

begin
  # List
  result = api_instance.payouts_get(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PayoutApi->payouts_get: #{e}"
end
```

#### Using the payouts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PayoutsGet200Response>, Integer, Hash)> payouts_get_with_http_info(opts)

```ruby
begin
  # List
  data, status_code, headers = api_instance.payouts_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PayoutsGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PayoutApi->payouts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at_from** | **String** | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. | [optional] |
| **created_at_to** | **String** | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. | [optional] |
| **paging_limit** | **Integer** | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional] |
| **paging_after** | **String** | The base64 URL encoded cursor used to access the next set of paginated results | [optional] |

### Return type

[**PayoutsGet200Response**](PayoutsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## payouts_id_get

> <PayoutsIdGet200Response> payouts_id_get(id)

Get

This endpoint enables the retrieval of a previously accepted payout using its unique ID (`pyt-xxx`). Its primary purpose is to periodically check for changes in the payout status. Currently, we do not provide webhooks, so this method serves as the only available option in such cases.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint.

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: Bearer
  config.api_key['Bearer'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['Bearer'] = 'Bearer'
end

api_instance = OpenapiClient::PayoutApi.new
id = 'id_example' # String | The Payout ID (pyt-xxx)

begin
  # Get
  result = api_instance.payouts_id_get(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PayoutApi->payouts_id_get: #{e}"
end
```

#### Using the payouts_id_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PayoutsIdGet200Response>, Integer, Hash)> payouts_id_get_with_http_info(id)

```ruby
begin
  # Get
  data, status_code, headers = api_instance.payouts_id_get_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PayoutsIdGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PayoutApi->payouts_id_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The Payout ID (pyt-xxx) |  |

### Return type

[**PayoutsIdGet200Response**](PayoutsIdGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## payouts_post

> <PayoutsPost202Response> payouts_post(x_idempotency_key, openapi_payout_create_request)

Create

The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  > ℹ️ Lifecycle > > If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. > <br> > Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. > <br> > <details> >  <summary>Payout States</summary> > <br> >  <table> >    <thead> >        <tr> >            <th>State</th> >            <th>Description</th> >        </tr> >    </thead> >    <tbody> >        <tr> >            <th>⏳<br>PENDING</th> >            <th>Your payout has been accepted, and it is currently awaiting processing.</th> >        </tr> >        <tr> >           <th>🎉<br>SENT</th> >           <th>The payout has been successfully processed, and the intended recipient should have received the funds.</th> >        </tr> >        <tr> >           <th>🔙<br>REVERSED</th> >           <th>Upon reaching the \"SENT\" state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.</th> >        </tr> >        <tr> >           <th>🙅<br>CANCELLED</th> >           <th>If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.</th> >        </tr> >        <tr> >           <th>💔<br>FAILED</th> >           <th> >               The funds did not reach the intended recipient due to a failure. If the \"context\" property does not provide specific information about the reason for the failure, please contact our customer support for assistance. >           </th> >        </tr> >    </tbody> >  </table> >  </details>  > ⚠️ Compliance requirements >  > Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. > <br> > We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process for you, the table below outlines the specific requirements for each country we offer payout support, streamlining the compliance process. > <br> > <details> <summary>Requirements</summary> <table>     <thead>         <tr>             <th>Field</th>             <th>KE 🇰🇪</th>         </tr>     </thead>     <tbody>         <tr>             <td>amount.value</td>             <td>                 <table>                     <thead>                          <tr>                             <th>Min</th>                             <th>Max</th>                         </tr>                     </thead>                     <tbody>                         <tr>                             <td>140 KES</td>                             <td>500,000 KES</td> <!-- Kenya -->                         </tr>                     </tbody>                 </table>             </td> <!-- Kenya -->         </tr>         <tr>             <td>sender.type</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.name</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line1</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line2</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line3</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.city</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.postal_code</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.country</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required with INDIVIDUAL sender's type</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.type</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.country</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.number</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.issued_on</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.expires_on</td>             <td>-</td> <!-- Kenya -->         </tr>     </tbody> </table> </details>

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: Bearer
  config.api_key['Bearer'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['Bearer'] = 'Bearer'
end

api_instance = OpenapiClient::PayoutApi.new
x_idempotency_key = 'x_idempotency_key_example' # String | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
openapi_payout_create_request = OpenapiClient::OpenapiPayoutCreateRequest.new # OpenapiPayoutCreateRequest | The payout

begin
  # Create
  result = api_instance.payouts_post(x_idempotency_key, openapi_payout_create_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PayoutApi->payouts_post: #{e}"
end
```

#### Using the payouts_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PayoutsPost202Response>, Integer, Hash)> payouts_post_with_http_info(x_idempotency_key, openapi_payout_create_request)

```ruby
begin
  # Create
  data, status_code, headers = api_instance.payouts_post_with_http_info(x_idempotency_key, openapi_payout_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PayoutsPost202Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PayoutApi->payouts_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **x_idempotency_key** | **String** | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) |  |
| **openapi_payout_create_request** | [**OpenapiPayoutCreateRequest**](OpenapiPayoutCreateRequest.md) | The payout |  |

### Return type

[**PayoutsPost202Response**](PayoutsPost202Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

