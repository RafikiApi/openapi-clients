# OpenapiClient::OpenapiPayoutCreateResponseSenderIndividualIdentityDocument

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** | The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional] |
| **expires_on** | **String** | Date formatted as yyyy-mm-dd | [optional] |
| **issued_on** | **String** | Date formatted as yyyy-mm-dd | [optional] |
| **number** | **String** |  | [optional] |
| **type** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.new(
  country: IT,
  expires_on: 2030-01-01,
  issued_on: 2020-01-01,
  number: YA0000000,
  type: null
)
```

