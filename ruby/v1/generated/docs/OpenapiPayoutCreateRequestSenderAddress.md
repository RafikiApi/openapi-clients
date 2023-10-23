# OpenapiClient::OpenapiPayoutCreateRequestSenderAddress

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt; | [optional] |
| **country** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code associated with the address. | [optional] |
| **line_1** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt; | [optional] |
| **line_2** | **String** |  | [optional] |
| **line_3** | **String** |  | [optional] |
| **postal_code** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt;  ⚠️ We enforce postal code validation for these following country codes : GB, US, PT, IE, MT, NG, NL, SK | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateRequestSenderAddress.new(
  city: Roma,
  country: IT,
  line_1: Piazza del Colosseo,
  line_2: 1,
  line_3: ,
  postal_code: 00184
)
```

