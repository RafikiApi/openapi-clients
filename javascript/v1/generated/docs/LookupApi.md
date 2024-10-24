# Resources.LookupApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lookupsAccountNumberGet**](LookupApi.md#lookupsAccountNumberGet) | **GET** /lookups/{accountNumber} | Get



## lookupsAccountNumberGet

> LookupsAccountNumberGet200Response lookupsAccountNumberGet(paymentAccountType, accountNumber, opts)

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  For some cases like Kenya mobile money lookups, try again in 5 minutes after getting the &#x60;LOOKUP_ACCOUNT_NOT_FOUND&#x60; error. If we respond with the same error again, it is likely that the account is not registered with the operator.  ### Supported countries/account types  | Country       | Mobile Money | Bank Account | |:--------------|:------------:|:------------:| | 🇳🇬 Nigeria  |     ❌       |      ✅      | | 🇺🇬 Uganda   |     ✅       |      ✅      | | 🇬🇭 Ghana    |     ✅       |      ✅      | | 🇰🇪 Kenya    |     ✅       |      ✅      | 

### Example

```javascript
import Resources from 'resources';
let defaultClient = Resources.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new Resources.LookupApi();
let paymentAccountType = "paymentAccountType_example"; // String | The payment account type to lookup for
let accountNumber = "accountNumber_example"; // String | The account number, that is either the mobile money number or bank account number
let opts = {
  'bankId': "bankId_example", // String | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to
  'operator': "operator_example" // String | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator
};
apiInstance.lookupsAccountNumberGet(paymentAccountType, accountNumber, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAccountType** | **String**| The payment account type to lookup for | 
 **accountNumber** | **String**| The account number, that is either the mobile money number or bank account number | 
 **bankId** | **String**| If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional] 
 **operator** | **String**| If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator | [optional] 

### Return type

[**LookupsAccountNumberGet200Response**](LookupsAccountNumberGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

