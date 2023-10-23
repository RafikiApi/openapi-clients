# OpenapiClient::OpenapiPayoutCreateRequestSenderIndividualIdentityDocument

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional] |
| **expires_on** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  Date formatted as yyyy-mm-dd | [optional] |
| **issued_on** | **String** | Date formatted as yyyy-mm-dd | [optional] |
| **number** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt; | [optional] |
| **type** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  One of &#x60;PASSPORT&#x60;, &#x60;DRIVING_LICENCE&#x60;, &#x60;NATIONAL_ID_CARD&#x60; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.new(
  country: IT,
  expires_on: 2030-01-01,
  issued_on: 2020-01-01,
  number: YA0000000,
  type: null
)
```

