# PayoutApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payoutsGet**](PayoutApi.md#payoutsGet) | **GET** /payouts | List
[**payoutsIdGet**](PayoutApi.md#payoutsIdGet) | **GET** /payouts/{id} | Get
[**payoutsPost**](PayoutApi.md#payoutsPost) | **POST** /payouts | Create


<a id="payoutsGet"></a>
# **payoutsGet**
> PayoutsGet200Response payoutsGet(createdAtFrom, createdAtTo, pagingLimit, pagingAfter)

List

Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     

### Example
```kotlin
// Import classes:
//import rafikigen.infrastructure.*
//import rafikigen.models.*

val apiInstance = PayoutApi()
val createdAtFrom : kotlin.String = createdAtFrom_example // kotlin.String | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information.
val createdAtTo : kotlin.String = createdAtTo_example // kotlin.String | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information.
val pagingLimit : kotlin.Int = 56 // kotlin.Int | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
val pagingAfter : kotlin.String = pagingAfter_example // kotlin.String | The base64 URL encoded cursor used to access the next set of paginated results
try {
    val result : PayoutsGet200Response = apiInstance.payoutsGet(createdAtFrom, createdAtTo, pagingLimit, pagingAfter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#payoutsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#payoutsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAtFrom** | **kotlin.String**| Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. | [optional]
 **createdAtTo** | **kotlin.String**| Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. | [optional]
 **pagingLimit** | **kotlin.Int**| The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional]
 **pagingAfter** | **kotlin.String**| The base64 URL encoded cursor used to access the next set of paginated results | [optional]

### Return type

[**PayoutsGet200Response**](PayoutsGet200Response.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="payoutsIdGet"></a>
# **payoutsIdGet**
> PayoutsIdGet200Response payoutsIdGet(id)

Get

This endpoint enables the retrieval of a previously accepted payout using its unique ID (&#x60;pyt-xxx&#x60;) or the &#x60;custom_id&#x60; submitted when creating it. Its primary purpose is to periodically check for changes in the payout status. Currently, we do not provide webhooks, so this method serves as the only available option in such cases.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint. 

### Example
```kotlin
// Import classes:
//import rafikigen.infrastructure.*
//import rafikigen.models.*

val apiInstance = PayoutApi()
val id : kotlin.String = id_example // kotlin.String | The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation
try {
    val result : PayoutsIdGet200Response = apiInstance.payoutsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#payoutsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#payoutsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation |

### Return type

[**PayoutsIdGet200Response**](PayoutsIdGet200Response.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="payoutsPost"></a>
# **payoutsPost**
> PayoutsPost202Response payoutsPost(xIdempotencyKey, openapiPayoutCreateRequest)

Create

The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  &gt; ℹ️ Lifecycle &gt; &gt; If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. &gt; &lt;br&gt; &gt; Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. &gt; &lt;br&gt; &gt; &lt;details&gt; &gt;  &lt;summary&gt;Payout States&lt;/summary&gt; &gt; &lt;br&gt; &gt;  &lt;table&gt; &gt;    &lt;thead&gt; &gt;        &lt;tr&gt; &gt;            &lt;th&gt;State&lt;/th&gt; &gt;            &lt;th&gt;Description&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;    &lt;/thead&gt; &gt;    &lt;tbody&gt; &gt;        &lt;tr&gt; &gt;            &lt;th&gt;⏳&lt;br&gt;PENDING&lt;/th&gt; &gt;            &lt;th&gt;Your payout has been accepted, and it is currently awaiting processing.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🎉&lt;br&gt;SENT&lt;/th&gt; &gt;           &lt;th&gt;The payout has been successfully processed, and the intended recipient should have received the funds.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🔙&lt;br&gt;REVERSED&lt;/th&gt; &gt;           &lt;th&gt;Upon reaching the \&quot;SENT\&quot; state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🙅&lt;br&gt;CANCELLED&lt;/th&gt; &gt;           &lt;th&gt;If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;💔&lt;br&gt;FAILED&lt;/th&gt; &gt;           &lt;th&gt; &gt;               The funds did not reach the intended recipient due to a failure. If the \&quot;context\&quot; property does not provide specific information about the reason for the failure, please contact our customer support for assistance. &gt;           &lt;/th&gt; &gt;        &lt;/tr&gt; &gt;    &lt;/tbody&gt; &gt;  &lt;/table&gt; &gt;  &lt;/details&gt;  &gt; ⚠️ Compliance requirements &gt;  &gt; Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. &gt; &lt;br&gt; &gt; We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process for you, the table below outlines the specific requirements for each country we offer payout support, streamlining the compliance process. &gt; &lt;br&gt; &gt; &lt;details&gt; &lt;summary&gt;Requirements&lt;/summary&gt; &lt;table&gt;     &lt;thead&gt;         &lt;tr&gt;             &lt;th&gt;Field&lt;/th&gt;             &lt;th&gt;KE 🇰🇪&lt;/th&gt;         &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;         &lt;tr&gt;             &lt;td&gt;amount.value&lt;/td&gt;             &lt;td&gt;                 &lt;table&gt;                     &lt;thead&gt;                          &lt;tr&gt;                             &lt;th&gt;Min&lt;/th&gt;                             &lt;th&gt;Max&lt;/th&gt;                         &lt;/tr&gt;                     &lt;/thead&gt;                     &lt;tbody&gt;                         &lt;tr&gt;                             &lt;td&gt;140 KES&lt;/td&gt;                             &lt;td&gt;500,000 KES&lt;/td&gt; &lt;!-- Kenya --&gt;                         &lt;/tr&gt;                     &lt;/tbody&gt;                 &lt;/table&gt;             &lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.type&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.name&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.line1&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.line2&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.line3&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.city&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.postal_code&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.country&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt;             &lt;td&gt;Required with INDIVIDUAL sender&#39;s type&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.type&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.country&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.number&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.issued_on&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.expires_on&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;     &lt;/tbody&gt; &lt;/table&gt; &lt;/details&gt;

### Example
```kotlin
// Import classes:
//import rafikigen.infrastructure.*
//import rafikigen.models.*

val apiInstance = PayoutApi()
val xIdempotencyKey : kotlin.String = xIdempotencyKey_example // kotlin.String | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
val openapiPayoutCreateRequest : OpenapiPayoutCreateRequest =  // OpenapiPayoutCreateRequest | The payout
try {
    val result : PayoutsPost202Response = apiInstance.payoutsPost(xIdempotencyKey, openapiPayoutCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutApi#payoutsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutApi#payoutsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xIdempotencyKey** | **kotlin.String**| 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) |
 **openapiPayoutCreateRequest** | [**OpenapiPayoutCreateRequest**](OpenapiPayoutCreateRequest.md)| The payout |

### Return type

[**PayoutsPost202Response**](PayoutsPost202Response.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

