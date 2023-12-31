

# OpenapiPayoutGetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**customId** | **String** |  |  [optional] |
|**id** | **String** | The payout unique identifier |  [optional] |
|**paymentAccountId** | **String** | The recipient payment account receiving funds |  [optional] |
|**receipt** | **String** | The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. |  [optional] |
|**sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  |  [optional] |
|**state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  |  [optional] |
|**walletId** | **String** | The wallet ID from which the money will disburse |  [optional] |



