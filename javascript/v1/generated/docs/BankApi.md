# Resources.BankApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**banksGet**](BankApi.md#banksGet) | **GET** /banks | List



## banksGet

> BanksGet200Response banksGet()

List

Within the scope of this API, the \&quot;Bank\&quot; resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks, including their branches, provided by our API.

### Example

```javascript
import Resources from 'resources';
let defaultClient = Resources.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new Resources.BankApi();
apiInstance.banksGet((error, data, response) => {
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

[**BanksGet200Response**](BanksGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

