# OpenapiClient::BanksGet200ResponseAllOfDataInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** | The ISO 3166 alpha-2 country code in which the bank operates. | [optional] |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BanksGet200ResponseAllOfDataInner.new(
  country: TZ,
  id: bnk-xxx,
  name: TIB Corporate Bank Limited
)
```

