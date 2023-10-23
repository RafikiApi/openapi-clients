# \PaymentAccountAPI

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PaymentAccountsPost**](PaymentAccountAPI.md#PaymentAccountsPost) | **Post** /payment-accounts | Get or create



## PaymentAccountsPost

> PaymentAccountsPost201Response PaymentAccountsPost(ctx).OpenapiPaymentAccountGetOrCreateRequest(openapiPaymentAccountGetOrCreateRequest).Execute()

Get or create



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
    openapiPaymentAccountGetOrCreateRequest := *openapiclient.NewOpenapiPaymentAccountGetOrCreateRequest() // OpenapiPaymentAccountGetOrCreateRequest | The payment account

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PaymentAccountAPI.PaymentAccountsPost(context.Background()).OpenapiPaymentAccountGetOrCreateRequest(openapiPaymentAccountGetOrCreateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PaymentAccountAPI.PaymentAccountsPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PaymentAccountsPost`: PaymentAccountsPost201Response
    fmt.Fprintf(os.Stdout, "Response from `PaymentAccountAPI.PaymentAccountsPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPaymentAccountsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openapiPaymentAccountGetOrCreateRequest** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) | The payment account | 

### Return type

[**PaymentAccountsPost201Response**](PaymentAccountsPost201Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

