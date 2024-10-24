# # OpenapiPayoutGetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**\OpenAPI\Client\Model\OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional]
**created_at** | **string** |  | [optional]
**custom_id** | **string** |  | [optional]
**id** | **string** | The payout unique identifier | [optional]
**on_behalf_of** | **string[]** |  | [optional]
**payment_account_id** | **string** | The recipient payment account receiving funds | [optional]
**purpose** | **string** |  | [optional]
**receipt** | **string** | The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional]
**sender** | [**\OpenAPI\Client\Model\OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional]
**state** | [**\OpenAPI\Client\Model\OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional]
**wallet_id** | **string** | The wallet ID from which the money will disburse | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
