# OpenapiClient::LookupApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**lookups_account_number_get**](LookupApi.md#lookups_account_number_get) | **GET** /lookups/{accountNumber} | Get |


## lookups_account_number_get

> <LookupsAccountNumberGet200Response> lookups_account_number_get(payment_account_type, account_number, opts)

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  For some cases like Kenya mobile money lookups, try again in 5 minutes after getting the `LOOKUP_ACCOUNT_NOT_FOUND` error. If we respond with the same error again, it is likely that the account is not registered with the operator.  ### Supported countries/account types  | Country       | Mobile Money | Bank Account | |:--------------|:------------:|:------------:| | 🇳🇬 Nigeria  |     ❌       |      ✅      | | 🇺🇬 Uganda   |     ✅       |      ✅      | | 🇬🇭 Ghana    |     ✅       |      ✅      | | 🇰🇪 Kenya    |     ✅       |      ✅      | 

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

api_instance = OpenapiClient::LookupApi.new
payment_account_type = 'MOBILE_MONEY' # String | The payment account type to lookup for
account_number = 'account_number_example' # String | The account number, that is either the mobile money number or bank account number
opts = {
  bank_id: 'bank_id_example', # String | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to
  operator: 'AIRTEL' # String | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator
}

begin
  # Get
  result = api_instance.lookups_account_number_get(payment_account_type, account_number, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LookupApi->lookups_account_number_get: #{e}"
end
```

#### Using the lookups_account_number_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LookupsAccountNumberGet200Response>, Integer, Hash)> lookups_account_number_get_with_http_info(payment_account_type, account_number, opts)

```ruby
begin
  # Get
  data, status_code, headers = api_instance.lookups_account_number_get_with_http_info(payment_account_type, account_number, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LookupsAccountNumberGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling LookupApi->lookups_account_number_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **payment_account_type** | **String** | The payment account type to lookup for |  |
| **account_number** | **String** | The account number, that is either the mobile money number or bank account number |  |
| **bank_id** | **String** | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional] |
| **operator** | **String** | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator | [optional] |

### Return type

[**LookupsAccountNumberGet200Response**](LookupsAccountNumberGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

