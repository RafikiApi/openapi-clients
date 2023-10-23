# OpenapiPeriodPaymentAccountGetOrCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_account** | Option<[**crate::models::OpenapiPaymentAccountGetOrCreateRequestBankAccount**](openapi_PaymentAccountGetOrCreateRequest_bank_account.md)> |  | [optional]
**country** | Option<**String**> | <span style=\"color:#e95f6a;\">required</span>  The ISO 3166 alpha-2 country code in which the payment account is registered. | [optional]
**holder** | Option<[**crate::models::OpenapiPaymentAccountGetOrCreateRequestHolder**](openapi_PaymentAccountGetOrCreateRequest_holder.md)> |  | [optional]
**mobile_money** | Option<[**crate::models::OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](openapi_PaymentAccountGetOrCreateRequest_mobile_money.md)> |  | [optional]
**r#type** | Option<**String**> | <span style=\"color:#e95f6a;\">required</span>  Either `MOBILE_MONEY` or `BANK_ACCOUNT` | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


