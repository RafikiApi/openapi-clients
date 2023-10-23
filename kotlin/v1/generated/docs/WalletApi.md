# WalletApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletsGet**](WalletApi.md#walletsGet) | **GET** /wallets | List


<a id="walletsGet"></a>
# **walletsGet**
> WalletsGet200Response walletsGet()

List

Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.

### Example
```kotlin
// Import classes:
//import rafikigen.infrastructure.*
//import rafikigen.models.*

val apiInstance = WalletApi()
try {
    val result : WalletsGet200Response = apiInstance.walletsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#walletsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#walletsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WalletsGet200Response**](WalletsGet200Response.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

