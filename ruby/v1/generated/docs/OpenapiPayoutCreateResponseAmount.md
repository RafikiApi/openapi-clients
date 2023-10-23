# OpenapiClient::OpenapiPayoutCreateResponseAmount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **currency** | **String** | The currency associated with the amount value, formatted according to ISO 4217 | [optional] |
| **value** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateResponseAmount.new(
  currency: KES,
  value: 2000.99
)
```

