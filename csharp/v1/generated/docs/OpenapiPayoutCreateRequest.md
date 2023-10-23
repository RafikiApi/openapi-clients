# rafikigen.Model.OpenapiPayoutCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional] 
**PaymentAccount** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional] 
**PaymentAccountId** | **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional] 
**Sender** | [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional] 
**WalletId** | **string** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

