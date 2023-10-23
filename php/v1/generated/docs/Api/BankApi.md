# OpenAPI\Client\BankApi

All URIs are relative to https://rest.sandbox.rafiki-api.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**banksGet()**](BankApi.md#banksGet) | **GET** /banks | List |


## `banksGet()`

```php
banksGet(): \OpenAPI\Client\Model\BanksGet200Response
```

List

Within the scope of this API, the \"Bank\" resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks, including their branches, provided by our API.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\BankApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->banksGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BankApi->banksGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\BanksGet200Response**](../Model/BanksGet200Response.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
