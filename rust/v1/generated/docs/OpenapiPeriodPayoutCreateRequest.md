# OpenapiPeriodPayoutCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | Option<[**crate::models::OpenapiPayoutCreateRequestAmount**](openapi_PayoutCreateRequest_amount.md)> |  | [optional]
**payment_account** | Option<[**crate::models::OpenapiPeriodPaymentAccountGetOrCreateRequest**](openapi.PaymentAccountGetOrCreateRequest.md)> |  | [optional]
**payment_account_id** | Option<**String**> | <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional]
**sender** | Option<[**crate::models::OpenapiPayoutCreateRequestSender**](openapi_PayoutCreateRequest_sender.md)> |  | [optional]
**wallet_id** | Option<**String**> | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


