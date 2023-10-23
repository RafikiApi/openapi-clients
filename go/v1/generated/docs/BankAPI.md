# \BankAPI

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BanksGet**](BankAPI.md#BanksGet) | **Get** /banks | List



## BanksGet

> BanksGet200Response BanksGet(ctx).Execute()

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
    resp, r, err := apiClient.BankAPI.BanksGet(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BankAPI.BanksGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BanksGet`: BanksGet200Response
    fmt.Fprintf(os.Stdout, "Response from `BankAPI.BanksGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiBanksGetRequest struct via the builder pattern


### Return type

[**BanksGet200Response**](BanksGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

