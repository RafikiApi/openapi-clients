# OpenapiClient::PaymentAccountApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**payment_accounts_get**](PaymentAccountApi.md#payment_accounts_get) | **GET** /payment-accounts | List |
| [**payment_accounts_post**](PaymentAccountApi.md#payment_accounts_post) | **POST** /payment-accounts | Get or create |


## payment_accounts_get

> <PaymentAccountsGet200Response> payment_accounts_get(opts)

List

Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary. 

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

api_instance = OpenapiClient::PaymentAccountApi.new
opts = {
  paging_limit: 56, # Integer | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
  paging_after: 'paging_after_example' # String | The base64 URL encoded cursor used to access the next set of paginated results
}

begin
  # List
  result = api_instance.payment_accounts_get(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentAccountApi->payment_accounts_get: #{e}"
end
```

#### Using the payment_accounts_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaymentAccountsGet200Response>, Integer, Hash)> payment_accounts_get_with_http_info(opts)

```ruby
begin
  # List
  data, status_code, headers = api_instance.payment_accounts_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaymentAccountsGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentAccountApi->payment_accounts_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging_limit** | **Integer** | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional] |
| **paging_after** | **String** | The base64 URL encoded cursor used to access the next set of paginated results | [optional] |

### Return type

[**PaymentAccountsGet200Response**](PaymentAccountsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## payment_accounts_post

> <PaymentAccountsPost200Response> payment_accounts_post(openapi_payment_account_get_or_create_request)

Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.   | Country   | Operators                            | | --------- | ------------------------------------ | | 🇰🇪 KE     | SAFARICOM, AIRTEL                    | | 🇹🇿 TZ     | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | 🇷🇼 RW     | AIRTEL, MTN                          | | 🇬🇭 GH     | AIRTEL, MTN, TIGO, VODAFONE          | | 🇺🇬 UG     | AIRTEL, MTN                          | | 🇨🇮 CI     | MTN, ORANGE, MOOV                    | | 🇸🇳 SN     | ORANGE, FREE, EXPRESSO               | | 🇨🇲 CM     | MTN, ORANGE                          |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered.  We provide support for numerous banks in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks. 

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

api_instance = OpenapiClient::PaymentAccountApi.new
openapi_payment_account_get_or_create_request = OpenapiClient::OpenapiPaymentAccountGetOrCreateRequest.new # OpenapiPaymentAccountGetOrCreateRequest | The payment account

begin
  # Get or create
  result = api_instance.payment_accounts_post(openapi_payment_account_get_or_create_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentAccountApi->payment_accounts_post: #{e}"
end
```

#### Using the payment_accounts_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaymentAccountsPost200Response>, Integer, Hash)> payment_accounts_post_with_http_info(openapi_payment_account_get_or_create_request)

```ruby
begin
  # Get or create
  data, status_code, headers = api_instance.payment_accounts_post_with_http_info(openapi_payment_account_get_or_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaymentAccountsPost200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentAccountApi->payment_accounts_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **openapi_payment_account_get_or_create_request** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) | The payment account |  |

### Return type

[**PaymentAccountsPost200Response**](PaymentAccountsPost200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

