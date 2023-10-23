# OpenapiClient::OpenapiPaymentAccountGetOrCreateResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bank_account** | [**OpenapiPaymentAccountGetOrCreateResponseBankAccount**](OpenapiPaymentAccountGetOrCreateResponseBankAccount.md) |  | [optional] |
| **country** | **String** |  | [optional] |
| **created_at** | **String** |  | [optional] |
| **holder** | [**OpenapiPaymentAccountGetOrCreateResponseHolder**](OpenapiPaymentAccountGetOrCreateResponseHolder.md) |  | [optional] |
| **id** | **String** | The newly created payment account unique identifier | [optional] |
| **mobile_money** | [**OpenapiPaymentAccountGetOrCreateResponseMobileMoney**](OpenapiPaymentAccountGetOrCreateResponseMobileMoney.md) |  | [optional] |
| **type** | **String** |  | [optional][default to &#39;MOBILE_MONEY&#39;] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPaymentAccountGetOrCreateResponse.new(
  bank_account: null,
  country: KE,
  created_at: 2006-01-02T15:04:05Z07:00,
  holder: null,
  id: pac-xxx,
  mobile_money: null,
  type: null
)
```

