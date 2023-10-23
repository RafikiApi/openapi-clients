# OpenapiClient::OpenapiPaymentAccountGetOrCreateRequestHolder

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either the INDIVIDUAL full name or the BUSINESS registered legal name | [optional] |
| **type** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The holder legal entity type, whether an INDIVIDUAL person or a BUSINESS | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPaymentAccountGetOrCreateRequestHolder.new(
  name: null,
  type: null
)
```

