

# OpenapiPaymentAccountGetOrCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bankAccount** | [**OpenapiPaymentAccountGetOrCreateRequestBankAccount**](OpenapiPaymentAccountGetOrCreateRequestBankAccount.md) |  |  [optional] |
|**country** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered. |  [optional] |
|**holder** | [**OpenapiPaymentAccountGetOrCreateRequestHolder**](OpenapiPaymentAccountGetOrCreateRequestHolder.md) |  |  [optional] |
|**mobileMoney** | [**OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60; |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MOBILE_MONEY | &quot;MOBILE_MONEY&quot; |
| BANK_ACCOUNT | &quot;BANK_ACCOUNT&quot; |



