# PayoutApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**payoutsGet**](PayoutApi.md#payoutsGet) | **GET** /payouts | List |
| [**payoutsIdGet**](PayoutApi.md#payoutsIdGet) | **GET** /payouts/{id} | Get |
| [**payoutsPost**](PayoutApi.md#payoutsPost) | **POST** /payouts | Create |


<a id="payoutsGet"></a>
# **payoutsGet**
> PayoutsGet200Response payoutsGet(createdAtFrom, createdAtTo, pagingLimit, pagingAfter)

List

Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import rafikigen.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.sandbox.rafiki-api.com/v1");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    String createdAtFrom = "createdAtFrom_example"; // String | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information.
    String createdAtTo = "createdAtTo_example"; // String | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information.
    Integer pagingLimit = 56; // Integer | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
    String pagingAfter = "pagingAfter_example"; // String | The base64 URL encoded cursor used to access the next set of paginated results
    try {
      PayoutsGet200Response result = apiInstance.payoutsGet(createdAtFrom, createdAtTo, pagingLimit, pagingAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#payoutsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createdAtFrom** | **String**| Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. | [optional] |
| **createdAtTo** | **String**| Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. | [optional] |
| **pagingLimit** | **Integer**| The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 | [optional] |
| **pagingAfter** | **String**| The base64 URL encoded cursor used to access the next set of paginated results | [optional] |

### Return type

[**PayoutsGet200Response**](PayoutsGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
| **500** | Internal server error |  -  |

<a id="payoutsIdGet"></a>
# **payoutsIdGet**
> PayoutsIdGet200Response payoutsIdGet(id)

Get

This endpoint enables the retrieval of a previously accepted payout using its unique ID (&#x60;pyt-xxx&#x60;) or the &#x60;custom_id&#x60; submitted when creating it. Its primary purpose is to periodically check for changes in the payout status.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint. 

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import rafikigen.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.sandbox.rafiki-api.com/v1");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    String id = "id_example"; // String | The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation
    try {
      PayoutsIdGet200Response result = apiInstance.payoutsIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#payoutsIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation | |

### Return type

[**PayoutsIdGet200Response**](PayoutsIdGet200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Couldn&#39;t find any payout with the provided ID |  -  |
| **500** | Internal server error |  -  |

<a id="payoutsPost"></a>
# **payoutsPost**
> PayoutsPost202Response payoutsPost(xIdempotencyKey, openapiPayoutCreateRequest)

Create

The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  &gt; ℹ️ Lifecycle &gt; &gt; If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. &gt; &lt;br&gt; &gt; Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. After the payout is completed, provided [webhook notifications](webhooks) are set up, Rafiki will also dispatch [payout.state-updated](payoutstate-updated) events &gt; &lt;br&gt; &gt; &gt; &lt;details&gt; &gt;  &lt;summary&gt;Payout States&lt;/summary&gt; &gt; &lt;br&gt; &gt;  &lt;table&gt; &gt;    &lt;thead&gt; &gt;        &lt;tr&gt; &gt;            &lt;th&gt;State&lt;/th&gt; &gt;            &lt;th&gt;Description&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;    &lt;/thead&gt; &gt;    &lt;tbody&gt; &gt;        &lt;tr&gt; &gt;            &lt;th&gt;⏳&lt;br&gt;PENDING&lt;/th&gt; &gt;            &lt;th&gt;Your payout has been accepted, and it is currently awaiting processing.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🎉&lt;br&gt;SENT&lt;/th&gt; &gt;           &lt;th&gt;The payout has been successfully processed, and the intended recipient should have received the funds.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🔙&lt;br&gt;REVERSED&lt;/th&gt; &gt;           &lt;th&gt;Upon reaching the \&quot;SENT\&quot; state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🙅&lt;br&gt;CANCELLED&lt;/th&gt; &gt;           &lt;th&gt;If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;💔&lt;br&gt;FAILED&lt;/th&gt; &gt;           &lt;th&gt; &gt;               The funds did not reach the intended recipient due to a failure. If the \&quot;context\&quot; property does not provide specific information about the reason for the failure, please contact our customer support for assistance. &gt;           &lt;/th&gt; &gt;        &lt;/tr&gt; &gt;    &lt;/tbody&gt; &gt;  &lt;/table&gt; &gt;  &lt;/details&gt; &gt; &lt;br&gt; &gt; &lt;details&gt; &gt;  &lt;summary&gt;Payout state context&lt;/summary&gt; &gt; &lt;br&gt; &gt; When a payout fails, the \&quot;context\&quot; property of the state object will provide additional information about the reason for the failure. The table below outlines the possible values for this property. &gt; &gt; #### &#x60;WALLET_INSUFFICIENT_BALANCE&#x60; &gt; &gt; The selected wallet currently doesn&#39;t have enough money to process the payout. &lt;br&gt;&lt;br&gt; &gt; &gt; #### &#x60;PAYMENT_ACCOUNT_INVALID_ACCOUNT_NUMBER&#x60; &gt; &gt; The account number provided is invalid. &lt;br&gt;&lt;br&gt; &gt; &gt; #### &#x60;PAYMENT_ACCOUNT_BALANCE_MAXED_OUT&#x60; &gt; &gt; The payment account balance has reached the maximum allowed. &lt;br&gt;&lt;br&gt; &gt; &gt; #### &#x60;PAYMENT_ACCOUNT_PER_TRANSACTION_LIMIT_REACHED&#x60; &gt; &gt; The amount to be sent exceeds the maximum allowed per transaction for this payment account &lt;br&gt;&lt;br&gt; &gt; &gt; #### &#x60;PAYMENT_ACCOUNT_DAILY_LIMIT_REACHED&#x60; &gt; &gt; The payment account has reached the daily limit or would reach it by processing this payout. &lt;br&gt;&lt;br&gt; &gt; &gt; #### &#x60;PAYMENT_ACCOUNT_MONTHLY_LIMIT_REACHED&#x60; &gt; &gt; The payment account has reached the monthly limit or would reach it by processing this payout. &lt;br&gt;&lt;br&gt; &gt; &gt; #### &#x60;PAYMENT_ACCOUNT_LIMIT_REACHED&#x60; &gt; &gt; The payment account has reached a limit but we don&#39;t know which one. &lt;br&gt;&lt;br&gt; &gt; &gt;  &lt;/details&gt;  &gt; ⚠️ Compliance requirements &gt; &gt; Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. &gt; &lt;br&gt; &gt; We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process, you can detail the requirements for each country listed below. &gt; &lt;br&gt; &gt; &gt; &lt;details&gt; &gt; &lt;summary&gt;🇰🇪 Kenya&lt;/summary&gt; &gt; &lt;table&gt; &gt;     &lt;thead&gt; &gt;         &lt;tr&gt; &gt;             &lt;th&gt;Field&lt;/th&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/thead&gt; &gt;     &lt;tbody&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;amount.value&lt;/td&gt; &gt;             &lt;td&gt; &gt;                 &lt;table&gt; &gt;                     &lt;thead&gt; &gt;                          &lt;tr&gt; &gt;                             &lt;th&gt;Min&lt;/th&gt; &gt;                             &lt;th&gt;Max&lt;/th&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/thead&gt; &gt;                     &lt;tbody&gt; &gt;                         &lt;tr&gt; &gt;                             &lt;td&gt;140 KES&lt;/td&gt; &gt;                             &lt;td&gt;250,000 KES&lt;/td&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/tbody&gt; &gt;                 &lt;/table&gt; &gt;             &lt;/td&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.type&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.name&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line1&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line2&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line3&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.city&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.postal_code&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.country&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.country&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.number&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.issued_on&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.expires_on&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/tbody&gt; &gt; &lt;/table&gt; &gt; &lt;br&gt; &gt; &lt;/details&gt; &gt;  &gt; &lt;details&gt; &gt; &lt;summary&gt;🇳🇬 Nigeria&lt;/summary&gt; &gt; &lt;table&gt; &gt;     &lt;thead&gt; &gt;         &lt;tr&gt; &gt;             &lt;th&gt;Field&lt;/th&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/thead&gt; &gt;     &lt;tbody&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;amount.value&lt;/td&gt; &gt;             &lt;td&gt; &gt;                 &lt;table&gt; &gt;                     &lt;thead&gt; &gt;                          &lt;tr&gt; &gt;                             &lt;th&gt;Min&lt;/th&gt; &gt;                             &lt;th&gt;Max&lt;/th&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/thead&gt; &gt;                     &lt;tbody&gt; &gt;                         &lt;tr&gt; &gt;                             &lt;td&gt;100 NGN&lt;/td&gt; &gt;                             &lt;td&gt; - &lt;/td&gt; &lt;!-- TODO --&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/tbody&gt; &gt;                 &lt;/table&gt; &gt;             &lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.type&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.name&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line1&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line2&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line3&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.city&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.postal_code&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.country&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.country&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.number&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.issued_on&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.expires_on&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Nigeria --&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/tbody&gt; &gt; &lt;/table&gt; &gt; &lt;br&gt; &gt; &lt;/details&gt; &gt;  &gt; &lt;details&gt; &gt; &lt;summary&gt;🇹🇿 Tanzania&lt;/summary&gt; &gt; &lt;table&gt; &gt;     &lt;thead&gt; &gt;         &lt;tr&gt; &gt;             &lt;th&gt;Field&lt;/th&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/thead&gt; &gt;     &lt;tbody&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;amount.value&lt;/td&gt; &gt;             &lt;td&gt; &gt;                 &lt;table&gt; &gt;                     &lt;thead&gt; &gt;                          &lt;tr&gt; &gt;                             &lt;th&gt;Min&lt;/th&gt; &gt;                             &lt;th&gt;Max&lt;/th&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/thead&gt; &gt;                     &lt;tbody&gt; &gt;                         &lt;tr&gt; &gt;                             &lt;td&gt;2,500 TZS&lt;/td&gt; &gt;                             &lt;td&gt;1,000,000 TZS&lt;/td&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/tbody&gt; &gt;                 &lt;/table&gt; &gt;             &lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.type&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.name&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line1&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line2&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line3&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.city&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.postal_code&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.country&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.country&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.number&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.issued_on&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.expires_on&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Tanzania --&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/tbody&gt; &gt; &lt;/table&gt; &gt; &lt;br&gt; &gt; &lt;/details&gt; &gt;  &gt; &lt;details&gt; &gt; &lt;summary&gt;🇷🇼 Rwanda&lt;/summary&gt; &gt; &lt;table&gt; &gt;     &lt;thead&gt; &gt;         &lt;tr&gt; &gt;             &lt;th&gt;Field&lt;/th&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/thead&gt; &gt;     &lt;tbody&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;amount.value&lt;/td&gt; &gt;             &lt;td&gt; &gt;                 &lt;table&gt; &gt;                     &lt;thead&gt; &gt;                         &lt;tr&gt; &gt;                             &lt;th&gt;Min&lt;/th&gt; &gt;                             &lt;th&gt;Max&lt;/th&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/thead&gt; &gt;                     &lt;tbody&gt; &gt;                         &lt;tr&gt; &gt;                             &lt;td&gt;500 RWF&lt;/td&gt; &gt;                             &lt;td&gt;-&lt;/td&gt; &gt;                         &lt;/tr&gt; &gt;                     &lt;/tbody&gt; &gt;                 &lt;/table&gt; &gt;             &lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.type&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.name&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line1&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line2&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.line3&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.city&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.postal_code&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.address.country&lt;/td&gt; &gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.country&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.number&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.issued_on&lt;/td&gt; &gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;         &lt;tr&gt; &gt;             &lt;td&gt;sender.individual.identity_document.expires_on&lt;/td&gt; &gt;             &lt;td&gt;Required (with type INDIVIDUAL)&lt;/td&gt; &lt;!-- Rwanda --&gt; &gt;         &lt;/tr&gt; &gt;     &lt;/tbody&gt; &gt; &lt;/table&gt; &gt; &lt;br&gt; &gt; &lt;/details&gt;

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import rafikigen.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.sandbox.rafiki-api.com/v1");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
    OpenapiPayoutCreateRequest openapiPayoutCreateRequest = new OpenapiPayoutCreateRequest(); // OpenapiPayoutCreateRequest | The payout
    try {
      PayoutsPost202Response result = apiInstance.payoutsPost(xIdempotencyKey, openapiPayoutCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#payoutsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xIdempotencyKey** | **String**| 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) | |
| **openapiPayoutCreateRequest** | [**OpenapiPayoutCreateRequest**](OpenapiPayoutCreateRequest.md)| The payout | |

### Return type

[**PayoutsPost202Response**](PayoutsPost202Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **402** | Not enough balance, see [error codes](error-codes#wallet_insufficient_balance-http-402) |  -  |
| **409** | Idempotency conflict, see [error codes](error-codes#idempotency_race-http-409) |  -  |
| **422** | Validation failed, see [error codes](error-codes#validation_failed-http-422) |  -  |
| **500** | Internal server error |  -  |

