# # OpenapiPayoutCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**\OpenAPI\Client\Model\OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional]
**payment_account** | [**\OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional]
**payment_account_id** | **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional]
**sender** | [**\OpenAPI\Client\Model\OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional]
**wallet_id** | **string** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
