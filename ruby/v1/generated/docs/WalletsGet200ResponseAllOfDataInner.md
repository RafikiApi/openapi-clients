# OpenapiClient::WalletsGet200ResponseAllOfDataInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **available** | **String** | The actual available balance | [optional] |
| **balance** | **String** | The total balance yet to settle | [optional] |
| **currency** | **String** | The ISO 4217 currency code associated with the wallet | [optional] |
| **id** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::WalletsGet200ResponseAllOfDataInner.new(
  available: 2000.99,
  balance: 2000.99,
  currency: KES,
  id: wlt-xxx
)
```

