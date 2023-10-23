# Resources.WalletApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletsGet**](WalletApi.md#walletsGet) | **GET** /wallets | List



## walletsGet

> WalletsGet200Response walletsGet()

List

Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.

### Example

```javascript
import Resources from 'resources';
let defaultClient = Resources.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new Resources.WalletApi();
apiInstance.walletsGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

