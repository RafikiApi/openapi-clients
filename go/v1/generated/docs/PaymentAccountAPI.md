# \PaymentAccountAPI

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PaymentAccountsGet**](PaymentAccountAPI.md#PaymentAccountsGet) | **Get** /payment-accounts | List
[**PaymentAccountsPost**](PaymentAccountAPI.md#PaymentAccountsPost) | **Post** /payment-accounts | Get or create



## PaymentAccountsGet

> PaymentAccountsGet200Response PaymentAccountsGet(ctx).PagingLimit(pagingLimit).PagingAfter(pagingAfter).Execute()

List



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
    pagingLimit := int32(56) // int32 | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 (optional)
    pagingAfter := "pagingAfter_example" // string | The base64 URL encoded cursor used to access the next set of paginated results (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PaymentAccountAPI.PaymentAccountsGet(context.Background()).PagingLimit(pagingLimit).PagingAfter(pagingAfter).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PaymentAccountAPI.PaymentAccountsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PaymentAccountsGet`: PaymentAccountsGet200Response
    fmt.Fprintf(os.Stdout, "Response from `PaymentAccountAPI.PaymentAccountsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPaymentAccountsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagingLimit** | **int32** | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | 
 **pagingAfter** | **string** | The base64 URL encoded cursor used to access the next set of paginated results | 

### Return type

[**PaymentAccountsGet200Response**](PaymentAccountsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PaymentAccountsPost

> PaymentAccountsPost200Response PaymentAccountsPost(ctx).OpenapiPaymentAccountGetOrCreateRequest(openapiPaymentAccountGetOrCreateRequest).Execute()

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
    // response from `PaymentAccountsPost`: PaymentAccountsPost200Response
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

[**PaymentAccountsPost200Response**](PaymentAccountsPost200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

