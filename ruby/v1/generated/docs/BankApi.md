# OpenapiClient::BankApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**banks_get**](BankApi.md#banks_get) | **GET** /banks | List |


## banks_get

> <BanksGet200Response> banks_get

List

Within the scope of this API, the \"Bank\" resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks, including their branches, provided by our API.

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

api_instance = OpenapiClient::BankApi.new

begin
  # List
  result = api_instance.banks_get
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BankApi->banks_get: #{e}"
end
```

#### Using the banks_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BanksGet200Response>, Integer, Hash)> banks_get_with_http_info

```ruby
begin
  # List
  data, status_code, headers = api_instance.banks_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BanksGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BankApi->banks_get_with_http_info: #{e}"
end
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

