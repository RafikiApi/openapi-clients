# OpenapiClient::OpenapiPaymentAccountGetOrCreateRequestBankAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bank_id** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The bank identifier representing the bank associated with the payment account | [optional] |
| **number** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The actual bank account number (alphanum). | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPaymentAccountGetOrCreateRequestBankAccount.new(
  bank_id: bnk-xxx,
  number: 12345678
)
```

