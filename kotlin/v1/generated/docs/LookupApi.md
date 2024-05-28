# LookupApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lookupsAccountNumberGet**](LookupApi.md#lookupsAccountNumberGet) | **GET** /lookups/{accountNumber} | Get


<a id="lookupsAccountNumberGet"></a>
# **lookupsAccountNumberGet**
> LookupsAccountNumberGet200Response lookupsAccountNumberGet(accountNumber, paymentAccountType, bankId)

Get

The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 

### Example
```kotlin
// Import classes:
//import rafikigen.infrastructure.*
//import rafikigen.models.*

val apiInstance = LookupApi()
val accountNumber : kotlin.String = accountNumber_example // kotlin.String | The account number, that is either the mobile money number or bank account number
val paymentAccountType : kotlin.String = paymentAccountType_example // kotlin.String | The payment account type to lookup for
val bankId : kotlin.String = bankId_example // kotlin.String | If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to
try {
    val result : LookupsAccountNumberGet200Response = apiInstance.lookupsAccountNumberGet(accountNumber, paymentAccountType, bankId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LookupApi#lookupsAccountNumberGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LookupApi#lookupsAccountNumberGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumber** | **kotlin.String**| The account number, that is either the mobile money number or bank account number |
 **paymentAccountType** | **kotlin.String**| The payment account type to lookup for | [enum: MOBILE_MONEY, BANK_ACCOUNT]
 **bankId** | **kotlin.String**| If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to | [optional]

### Return type

[**LookupsAccountNumberGet200Response**](LookupsAccountNumberGet200Response.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

