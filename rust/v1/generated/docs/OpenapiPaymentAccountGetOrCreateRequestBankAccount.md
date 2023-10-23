# OpenapiPaymentAccountGetOrCreateRequestBankAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_id** | Option<**String**> | <span style=\"color:#e95f6a;\">required with type BANK_ACCOUNT</span>  The bank identifier representing the bank associated with the payment account | [optional]
**branch_id** | Option<**String**> | <span style=\"color:#e95f6a;\">required with type BANK_ACCOUNT</span> <span style=\"color:#e95f6a;\">required if the bank spans across multiple branches</span>  The branch identifier representing the branch associated with the payment account | [optional]
**number** | Option<**String**> | <span style=\"color:#e95f6a;\">required with type BANK_ACCOUNT</span>  The actual bank account number (alphanum). | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


