
# OpenapiPaymentAccountGetOrCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccount** | [**OpenapiPaymentAccountGetOrCreateRequestBankAccount**](OpenapiPaymentAccountGetOrCreateRequestBankAccount.md) |  |  [optional]
**country** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered. |  [optional]
**holder** | [**OpenapiPaymentAccountGetOrCreateRequestHolder**](OpenapiPaymentAccountGetOrCreateRequestHolder.md) |  |  [optional]
**mobileMoney** | [**OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md) |  |  [optional]
**type** | [**inline**](#Type) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60; |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | MOBILE_MONEY, BANK_ACCOUNT



