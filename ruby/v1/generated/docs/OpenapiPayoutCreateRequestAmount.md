# OpenapiClient::OpenapiPayoutCreateRequestAmount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **currency** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The currency associated with the amount value, formatted according to ISO 4217 | [optional] |
| **value** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateRequestAmount.new(
  currency: KES,
  value: 2000.99
)
```

