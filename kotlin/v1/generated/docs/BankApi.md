# BankApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**banksGet**](BankApi.md#banksGet) | **GET** /banks | List


<a id="banksGet"></a>
# **banksGet**
> BanksGet200Response banksGet()

List

Within the scope of this API, the \&quot;Bank\&quot; resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks provided by our API. 

### Example
```kotlin
// Import classes:
//import rafikigen.infrastructure.*
//import rafikigen.models.*

val apiInstance = BankApi()
try {
    val result : BanksGet200Response = apiInstance.banksGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankApi#banksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankApi#banksGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BanksGet200Response**](BanksGet200Response.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

