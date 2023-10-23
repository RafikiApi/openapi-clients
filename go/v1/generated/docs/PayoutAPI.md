# \PayoutAPI

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PayoutsGet**](PayoutAPI.md#PayoutsGet) | **Get** /payouts | List
[**PayoutsIdGet**](PayoutAPI.md#PayoutsIdGet) | **Get** /payouts/{id} | Query status
[**PayoutsPost**](PayoutAPI.md#PayoutsPost) | **Post** /payouts | Send money



## PayoutsGet

> PayoutsGet200Response PayoutsGet(ctx).CreatedAtFrom(createdAtFrom).CreatedAtTo(createdAtTo).PagingLimit(pagingLimit).PagingAfter(pagingAfter).Execute()

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
    createdAtFrom := "createdAtFrom_example" // string | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. (optional)
    createdAtTo := "createdAtTo_example" // string | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. (optional)
    pagingLimit := int32(56) // int32 | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 (optional)
    pagingAfter := "pagingAfter_example" // string | The base64 URL encoded cursor used to access the next set of paginated results (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PayoutAPI.PayoutsGet(context.Background()).CreatedAtFrom(createdAtFrom).CreatedAtTo(createdAtTo).PagingLimit(pagingLimit).PagingAfter(pagingAfter).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PayoutAPI.PayoutsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PayoutsGet`: PayoutsGet200Response
    fmt.Fprintf(os.Stdout, "Response from `PayoutAPI.PayoutsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPayoutsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAtFrom** | **string** | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. | 
 **createdAtTo** | **string** | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. | 
 **pagingLimit** | **int32** | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | 
 **pagingAfter** | **string** | The base64 URL encoded cursor used to access the next set of paginated results | 

### Return type

[**PayoutsGet200Response**](PayoutsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PayoutsIdGet

> PayoutsIdGet200Response PayoutsIdGet(ctx, id).Execute()

Query status



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
    id := "id_example" // string | The Payout ID (pyt-xxx)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PayoutAPI.PayoutsIdGet(context.Background(), id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PayoutAPI.PayoutsIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PayoutsIdGet`: PayoutsIdGet200Response
    fmt.Fprintf(os.Stdout, "Response from `PayoutAPI.PayoutsIdGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**id** | **string** | The Payout ID (pyt-xxx) | 

### Other Parameters

Other parameters are passed through a pointer to a apiPayoutsIdGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**PayoutsIdGet200Response**](PayoutsIdGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PayoutsPost

> PayoutsPost202Response PayoutsPost(ctx).XIdempotencyKey(xIdempotencyKey).OpenapiPayoutCreateRequest(openapiPayoutCreateRequest).Execute()

Send money



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
    xIdempotencyKey := "xIdempotencyKey_example" // string | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
    openapiPayoutCreateRequest := *openapiclient.NewOpenapiPayoutCreateRequest() // OpenapiPayoutCreateRequest | The payout

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.PayoutAPI.PayoutsPost(context.Background()).XIdempotencyKey(xIdempotencyKey).OpenapiPayoutCreateRequest(openapiPayoutCreateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `PayoutAPI.PayoutsPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `PayoutsPost`: PayoutsPost202Response
    fmt.Fprintf(os.Stdout, "Response from `PayoutAPI.PayoutsPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPayoutsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xIdempotencyKey** | **string** | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) | 
 **openapiPayoutCreateRequest** | [**OpenapiPayoutCreateRequest**](OpenapiPayoutCreateRequest.md) | The payout | 

### Return type

[**PayoutsPost202Response**](PayoutsPost202Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

