# OpenapiClient::OpenapiPayoutCreateResponseSenderAddress

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** |  | [optional] |
| **country** | **String** | The ISO 3166 alpha-2 country code associated with the address. | [optional] |
| **line_1** | **String** |  | [optional] |
| **line_2** | **String** |  | [optional] |
| **line_3** | **String** |  | [optional] |
| **postal_code** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateResponseSenderAddress.new(
  city: Roma,
  country: IT,
  line_1: Piazza del Colosseo,
  line_2: 1,
  line_3: ,
  postal_code: 00184
)
```

