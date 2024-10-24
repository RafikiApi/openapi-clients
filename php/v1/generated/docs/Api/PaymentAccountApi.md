# OpenAPI\Client\PaymentAccountApi

All URIs are relative to https://rest.sandbox.rafiki-api.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**paymentAccountsGet()**](PaymentAccountApi.md#paymentAccountsGet) | **GET** /payment-accounts | List |
| [**paymentAccountsPost()**](PaymentAccountApi.md#paymentAccountsPost) | **POST** /payment-accounts | Get or create |


## `paymentAccountsGet()`

```php
paymentAccountsGet($paging_limit, $paging_after): \OpenAPI\Client\Model\PaymentAccountsGet200Response
```

List

Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\PaymentAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$paging_limit = 56; // int | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
$paging_after = 'paging_after_example'; // string | The base64 URL encoded cursor used to access the next set of paginated results

try {
    $result = $apiInstance->paymentAccountsGet($paging_limit, $paging_after);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentAccountApi->paymentAccountsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paging_limit** | **int**| The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional] |
| **paging_after** | **string**| The base64 URL encoded cursor used to access the next set of paginated results | [optional] |

### Return type

[**\OpenAPI\Client\Model\PaymentAccountsGet200Response**](../Model/PaymentAccountsGet200Response.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `paymentAccountsPost()`

```php
paymentAccountsPost($openapi_payment_account_get_or_create_request): \OpenAPI\Client\Model\PaymentAccountsPost200Response
```

Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.   | Country   | Operators                            | | --------- | ------------------------------------ | | 🇰🇪 KE     | SAFARICOM, AIRTEL                    | | 🇹🇿 TZ     | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | 🇷🇼 RW     | AIRTEL, MTN                          | | 🇬🇭 GH     | AIRTEL, MTN, TIGO, VODAFONE          | | 🇺🇬 UG     | AIRTEL, MTN                          | | 🇨🇮 CI     | MTN, ORANGE, MOOV                    | | 🇸🇳 SN     | ORANGE, FREE, EXPRESSO               | | 🇨🇲 CM     | MTN, ORANGE                          |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered.  We provide support for numerous banks in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: Bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\PaymentAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$openapi_payment_account_get_or_create_request = new \OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequest(); // \OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequest | The payment account

try {
    $result = $apiInstance->paymentAccountsPost($openapi_payment_account_get_or_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentAccountApi->paymentAccountsPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **openapi_payment_account_get_or_create_request** | [**\OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequest**](../Model/OpenapiPaymentAccountGetOrCreateRequest.md)| The payment account | |

### Return type

[**\OpenAPI\Client\Model\PaymentAccountsPost200Response**](../Model/PaymentAccountsPost200Response.md)

### Authorization

[Bearer](../../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
