# OpenapiPayoutCreateRequestSender

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | Option<[**crate::models::OpenapiPayoutCreateRequestSenderAddress**](openapi_PayoutCreateRequest_sender_address.md)> |  | [optional]
**individual** | Option<[**crate::models::OpenapiPayoutCreateRequestSenderIndividual**](openapi_PayoutCreateRequest_sender_individual.md)> |  | [optional]
**name** | Option<**String**> | <span style=\"color:#e95f6a;\">required if sender is provided</span>  The individual full name or registered business legal name | [optional]
**r#type** | Option<**String**> | <span style=\"color:#e95f6a;\">required if sender is provided</span>  Either `INDIVIDUAL` or `BUSINESS` | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


