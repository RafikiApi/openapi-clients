# OpenapiPayoutCreateRequestSenderIndividualIdentityDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | Option<**String**> | <span style=\"color:#e95f6a;\">required if identity_document is provided</span>  The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional]
**expires_on** | Option<**String**> | <span style=\"color:#e95f6a;\">required if identity_document is provided</span>  Date formatted as yyyy-mm-dd | [optional]
**issued_on** | Option<**String**> | Date formatted as yyyy-mm-dd | [optional]
**number** | Option<**String**> | <span style=\"color:#e95f6a;\">required if identity_document is provided</span> | [optional]
**r#type** | Option<**String**> | <span style=\"color:#e95f6a;\">required if identity_document is provided</span>  One of `PASSPORT`, `DRIVING_LICENCE`, `NATIONAL_ID_CARD` | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


