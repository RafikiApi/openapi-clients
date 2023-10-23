# OpenapiClient::WalletApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**wallets_get**](WalletApi.md#wallets_get) | **GET** /wallets | List |


## wallets_get

> <WalletsGet200Response> wallets_get

List

Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.

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

api_instance = OpenapiClient::WalletApi.new

begin
  # List
  result = api_instance.wallets_get
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling WalletApi->wallets_get: #{e}"
end
```

#### Using the wallets_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<WalletsGet200Response>, Integer, Hash)> wallets_get_with_http_info

```ruby
begin
  # List
  data, status_code, headers = api_instance.wallets_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <WalletsGet200Response>
rescue OpenapiClient::ApiError => e
  puts "Error when calling WalletApi->wallets_get_with_http_info: #{e}"
end
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

