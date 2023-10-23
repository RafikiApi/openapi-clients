# OpenapiClient::OpenapiPayoutCreateResponseSender

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **address** | [**OpenapiPayoutCreateResponseSenderAddress**](OpenapiPayoutCreateResponseSenderAddress.md) |  | [optional] |
| **individual** | [**OpenapiPayoutCreateResponseSenderIndividual**](OpenapiPayoutCreateResponseSenderIndividual.md) |  | [optional] |
| **name** | **String** | The individual full name or registered business legal name | [optional] |
| **type** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateResponseSender.new(
  address: null,
  individual: null,
  name: Mario Rossi,
  type: null
)
```

