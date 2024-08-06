# OpenapiPeriodPayoutGetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | Option<[**crate::models::OpenapiPayoutCreateResponseAmount**](openapi_PayoutCreateResponse_amount.md)> |  | [optional]
**created_at** | Option<**String**> |  | [optional]
**custom_id** | Option<**String**> |  | [optional]
**id** | Option<**String**> | The payout unique identifier | [optional]
**payment_account_id** | Option<**String**> | The recipient payment account receiving funds | [optional]
**purpose** | Option<**String**> |  | [optional]
**receipt** | Option<**String**> | The reference provided by the recipient account's actual bank or telco on a successful payout.  > ⚠️ > It's important to be aware that this information might not be accessible for every payout. If there's no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional]
**sender** | Option<[**crate::models::OpenapiPayoutCreateResponseSender**](openapi_PayoutCreateResponse_sender.md)> |  | [optional]
**state** | Option<[**crate::models::OpenapiPayoutCreateResponseState**](openapi_PayoutCreateResponse_state.md)> |  | [optional]
**wallet_id** | Option<**String**> | The wallet ID from which the money will disburse | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


