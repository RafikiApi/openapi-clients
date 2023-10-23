# OpenapiClient::BanksGet200ResponseAllOfDataInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **branches** | [**Array&lt;BanksGet200ResponseAllOfDataInnerBranchesInner&gt;**](BanksGet200ResponseAllOfDataInnerBranchesInner.md) | If the bank operates across multiple branches within a country, this property will be included, listing all the branches available from the bank. | [optional] |
| **country** | **String** | The ISO 3166 alpha-2 country code in which the bank operates. | [optional] |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BanksGet200ResponseAllOfDataInner.new(
  branches: null,
  country: TZ,
  id: bnk-xxx,
  name: TIB Corporate Bank Limited
)
```

