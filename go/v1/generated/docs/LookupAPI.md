# \LookupAPI

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LookupsAccountNumberGet**](LookupAPI.md#LookupsAccountNumberGet) | **Get** /lookups/{accountNumber} | Get



## LookupsAccountNumberGet

> LookupsAccountNumberGet200Response LookupsAccountNumberGet(ctx, accountNumber).PaymentAccountType(paymentAccountType).BankId(bankId).Operator(operator).Execute()

Get



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/RafikiApi/openapi-clients/go/v1/generated"
)

func main() {
    paymentAccountType := "paymentAccountType_example" // string | The payment account type to lookup for
    accountNumber := "accountNumber_example" // string | The account number, that is either the mobile money number or bank account number
    bankId := "bankId_example" // string | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to (optional)
    operator := "operator_example" // string | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LookupAPI.LookupsAccountNumberGet(context.Background(), accountNumber).PaymentAccountType(paymentAccountType).BankId(bankId).Operator(operator).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LookupAPI.LookupsAccountNumberGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `LookupsAccountNumberGet`: LookupsAccountNumberGet200Response
    fmt.Fprintf(os.Stdout, "Response from `LookupAPI.LookupsAccountNumberGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**accountNumber** | **string** | The account number, that is either the mobile money number or bank account number | 

### Other Parameters

Other parameters are passed through a pointer to a apiLookupsAccountNumberGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentAccountType** | **string** | The payment account type to lookup for | 

 **bankId** | **string** | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | 
 **operator** | **string** | If payment_account_type is MOBILE_MONEY, this will be a mandatory field representing the mobile money operator | 

### Return type

[**LookupsAccountNumberGet200Response**](LookupsAccountNumberGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

