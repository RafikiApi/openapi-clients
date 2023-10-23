# # OpenapiPaymentAccountGetOrCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_account** | [**\OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequestBankAccount**](OpenapiPaymentAccountGetOrCreateRequestBankAccount.md) |  | [optional]
**country** | **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered. | [optional]
**holder** | [**\OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequestHolder**](OpenapiPaymentAccountGetOrCreateRequestHolder.md) |  | [optional]
**mobile_money** | [**\OpenAPI\Client\Model\OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md) |  | [optional]
**type** | **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60; | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
