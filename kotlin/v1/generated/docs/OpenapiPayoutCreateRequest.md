
# OpenapiPayoutCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  |  [optional]
**customId** | **kotlin.String** | An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \&quot;-\&quot; and \&quot;_\&quot;. |  [optional]
**paymentAccount** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  |  [optional]
**paymentAccountId** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. |  [optional]
**sender** | [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  |  [optional]
**walletId** | **kotlin.String** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. |  [optional]



