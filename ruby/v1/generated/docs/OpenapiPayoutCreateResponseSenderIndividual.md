# OpenapiClient::OpenapiPayoutCreateResponseSenderIndividual

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dob** | **String** | Date of birth formatted as yyyy-mm-dd | [optional] |
| **identity_document** | [**OpenapiPayoutCreateResponseSenderIndividualIdentityDocument**](OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateResponseSenderIndividual.new(
  dob: 1970-01-01,
  identity_document: null
)
```

