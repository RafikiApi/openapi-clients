# \WalletAPI

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WalletsGet**](WalletAPI.md#WalletsGet) | **Get** /wallets | List



## WalletsGet

> WalletsGet200Response WalletsGet(ctx).Execute()

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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.WalletAPI.WalletsGet(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `WalletAPI.WalletsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `WalletsGet`: WalletsGet200Response
    fmt.Fprintf(os.Stdout, "Response from `WalletAPI.WalletsGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiWalletsGetRequest struct via the builder pattern


### Return type

[**WalletsGet200Response**](WalletsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

