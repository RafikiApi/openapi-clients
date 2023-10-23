# OpenAPI\Client\WalletApi

All URIs are relative to https://rest.sandbox.rafiki-api.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**walletsGet()**](WalletApi.md#walletsGet) | **GET** /wallets | List |


## `walletsGet()`

```php
walletsGet(): \OpenAPI\Client\Model\WalletsGet200Response
```

List

Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->walletsGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->walletsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\WalletsGet200Response**](../Model/WalletsGet200Response.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
