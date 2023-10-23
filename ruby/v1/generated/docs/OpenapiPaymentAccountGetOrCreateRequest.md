# OpenapiClient::OpenapiPaymentAccountGetOrCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bank_account** | [**OpenapiPaymentAccountGetOrCreateRequestBankAccount**](OpenapiPaymentAccountGetOrCreateRequestBankAccount.md) |  | [optional] |
| **country** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered. | [optional] |
| **holder** | [**OpenapiPaymentAccountGetOrCreateRequestHolder**](OpenapiPaymentAccountGetOrCreateRequestHolder.md) |  | [optional] |
| **mobile_money** | [**OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md) |  | [optional] |
| **type** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPaymentAccountGetOrCreateRequest.new(
  bank_account: null,
  country: KE,
  holder: null,
  mobile_money: null,
  type: null
)
```

