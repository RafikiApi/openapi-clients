# rafikigen.Model.OpenapiPayoutGetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**CreatedAt** | **string** |  | [optional] 
**CustomId** | **string** |  | [optional] 
**Id** | **string** | The payout unique identifier | [optional] 
**OnBehalfOf** | **List&lt;string&gt;** |  | [optional] 
**PaymentAccountId** | **string** | The recipient payment account receiving funds | [optional] 
**Purpose** | **string** |  | [optional] 
**Receipt** | **string** | The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional] 
**Sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] 
**State** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] 
**WalletId** | **string** | The wallet ID from which the money will disburse | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

