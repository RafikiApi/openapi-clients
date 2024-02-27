# \PayoutApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payouts_get**](PayoutApi.md#payouts_get) | **GET** /payouts | List
[**payouts_id_get**](PayoutApi.md#payouts_id_get) | **GET** /payouts/{id} | Get
[**payouts_post**](PayoutApi.md#payouts_post) | **POST** /payouts | Create



## payouts_get

> crate::models::PayoutsGet200Response payouts_get(created_at_from, created_at_to, paging_limit, paging_after)
List

Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**created_at_from** | Option<**String**> | Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information. |  |
**created_at_to** | Option<**String**> | Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information. |  |
**paging_limit** | Option<**i32**> | The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50 |  |
**paging_after** | Option<**String**> | The base64 URL encoded cursor used to access the next set of paginated results |  |

### Return type

[**crate::models::PayoutsGet200Response**](_payouts_get_200_response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## payouts_id_get

> crate::models::PayoutsIdGet200Response payouts_id_get(id)
Get

This endpoint enables the retrieval of a previously accepted payout using its unique ID (`pyt-xxx`) or the `custom_id` submitted when creating it. Its primary purpose is to periodically check for changes in the payout status.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | The Payout ID (pyt-xxx) or the custom_id provided at the time of payout creation | [required] |

### Return type

[**crate::models::PayoutsIdGet200Response**](_payouts__id__get_200_response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## payouts_post

> crate::models::PayoutsPost202Response payouts_post(x_idempotency_key, openapi_period_payout_create_request)
Create

The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  > ℹ️ Lifecycle > > If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. > <br> > Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. After the payout is completed, provided [webhook notifications](webhooks) are set up, Rafiki will also dispatch [payout.state-updated](payoutstate-updated) events > <br> > > <details> >  <summary>Payout States</summary> > <br> >  <table> >    <thead> >        <tr> >            <th>State</th> >            <th>Description</th> >        </tr> >    </thead> >    <tbody> >        <tr> >            <th>⏳<br>PENDING</th> >            <th>Your payout has been accepted, and it is currently awaiting processing.</th> >        </tr> >        <tr> >           <th>🎉<br>SENT</th> >           <th>The payout has been successfully processed, and the intended recipient should have received the funds.</th> >        </tr> >        <tr> >           <th>🔙<br>REVERSED</th> >           <th>Upon reaching the \"SENT\" state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.</th> >        </tr> >        <tr> >           <th>🙅<br>CANCELLED</th> >           <th>If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.</th> >        </tr> >        <tr> >           <th>💔<br>FAILED</th> >           <th> >               The funds did not reach the intended recipient due to a failure. If the \"context\" property does not provide specific information about the reason for the failure, please contact our customer support for assistance. >           </th> >        </tr> >    </tbody> >  </table> >  </details> > <br> > <details> >  <summary>Payout state context</summary> > <br> > When a payout fails, the \"context\" property of the state object will provide additional information about the reason for the failure. The table below outlines the possible values for this property. > > #### `WALLET_INSUFFICIENT_BALANCE` > > The selected wallet currently doesn't have enough money to process the payout. <br><br> > > #### `PAYMENT_ACCOUNT_INVALID_ACCOUNT_NUMBER` > > The account number provided is invalid. <br><br> > > #### `PAYMENT_ACCOUNT_BALANCE_MAXED_OUT` > > The payment account balance has reached the maximum allowed. <br><br> > > #### `PAYMENT_ACCOUNT_PER_TRANSACTION_LIMIT_REACHED` > > The amount to be sent exceeds the maximum allowed per transaction for this payment account <br><br> > > #### `PAYMENT_ACCOUNT_DAILY_LIMIT_REACHED` > > The payment account has reached the daily limit or would reach it by processing this payout. <br><br> > > #### `PAYMENT_ACCOUNT_MONTHLY_LIMIT_REACHED` > > The payment account has reached the monthly limit or would reach it by processing this payout. <br><br> > > #### `PAYMENT_ACCOUNT_LIMIT_REACHED` > > The payment account has reached a limit but we don't know which one. <br><br> > >  </details>  > ⚠️ Compliance requirements > > Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. > <br> > We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process, you can detail the requirements for each country listed below. > <br> > > <details> > <summary>🇰🇪 Kenya</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>amount.value</td> >             <td> >                 <table> >                     <thead> >                          <tr> >                             <th>Min</th> >                             <th>Max</th> >                         </tr> >                     </thead> >                     <tbody> >                         <tr> >                             <td>140 KES</td> >                             <td>500,000 KES</td> >                         </tr> >                     </tbody> >                 </table> >             </td> >         </tr> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Kenya --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>-</td> <!-- Kenya --> >         </tr> >     </tbody> > </table> > <br> > </details> >  > <details> > <summary>🇳🇬 Nigeria</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>amount.value</td> >             <td> >                 <table> >                     <thead> >                          <tr> >                             <th>Min</th> >                             <th>Max</th> >                         </tr> >                     </thead> >                     <tbody> >                         <tr> >                             <td>100 NGN</td> >                             <td> - </td> <!-- TODO --> >                         </tr> >                     </tbody> >                 </table> >             </td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Nigeria --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Nigeria --> >         </tr> >     </tbody> > </table> > <br> > </details> >  > <details> > <summary>🇹🇿 Tanzania</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>amount.value</td> >             <td> >                 <table> >                     <thead> >                          <tr> >                             <th>Min</th> >                             <th>Max</th> >                         </tr> >                     </thead> >                     <tbody> >                         <tr> >                             <td>2,500 TZS</td> >                             <td>1,000,000 TZS</td> >                         </tr> >                     </tbody> >                 </table> >             </td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Tanzania --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Tanzania --> >         </tr> >     </tbody> > </table> > <br> > </details> >  > <details> > <summary>🇷🇼 Rwanda</summary> > <table> >     <thead> >         <tr> >             <th>Field</th> >         </tr> >     </thead> >     <tbody> >         <tr> >             <td>amount.value</td> >             <td> >                 <table> >                     <thead> >                         <tr> >                             <th>Min</th> >                             <th>Max</th> >                         </tr> >                     </thead> >                     <tbody> >                         <tr> >                             <td>500 RWF</td> >                             <td>-</td> >                         </tr> >                     </tbody> >                 </table> >             </td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.type</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.name</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.line1</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.line2</td> >             <td>-</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.line3</td> >             <td>-</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.city</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.postal_code</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.address.country</td> >             <td>Required</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.dob</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.country</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.number</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.issued_on</td> >             <td>-</td> <!-- Rwanda --> >         </tr> >         <tr> >             <td>sender.individual.identity_document.expires_on</td> >             <td>Required (with type INDIVIDUAL)</td> <!-- Rwanda --> >         </tr> >     </tbody> > </table> > <br> > </details>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**x_idempotency_key** | **String** | 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency) | [required] |
**openapi_period_payout_create_request** | [**OpenapiPeriodPayoutCreateRequest**](OpenapiPeriodPayoutCreateRequest.md) | The payout | [required] |

### Return type

[**crate::models::PayoutsPost202Response**](_payouts_post_202_response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

