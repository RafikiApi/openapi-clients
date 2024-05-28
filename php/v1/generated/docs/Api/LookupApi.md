# OpenAPI\Client\LookupApi

All URIs are relative to https://rest.sandbox.rafiki-api.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**lookupsAccountNumberGet()**](LookupApi.md#lookupsAccountNumberGet) | **GET** /lookups/{accountNumber} | Get |


## `lookupsAccountNumberGet()`

```php
lookupsAccountNumberGet($payment_account_type, $account_number, $bank_id): \OpenAPI\Client\Model\LookupsAccountNumberGet200Response
```

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      |

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\LookupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$payment_account_type = 'payment_account_type_example'; // string | The payment account type to lookup for
$account_number = 'account_number_example'; // string | The account number, that is either the mobile money number or bank account number
$bank_id = 'bank_id_example'; // string | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to

try {
    $result = $apiInstance->lookupsAccountNumberGet($payment_account_type, $account_number, $bank_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LookupApi->lookupsAccountNumberGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payment_account_type** | **string**| The payment account type to lookup for | |
| **account_number** | **string**| The account number, that is either the mobile money number or bank account number | |
| **bank_id** | **string**| If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional] |

### Return type

[**\OpenAPI\Client\Model\LookupsAccountNumberGet200Response**](../Model/LookupsAccountNumberGet200Response.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
