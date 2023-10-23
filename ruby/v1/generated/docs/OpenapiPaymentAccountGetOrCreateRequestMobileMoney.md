# OpenapiClient::OpenapiPaymentAccountGetOrCreateRequestMobileMoney

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **number** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The actual phone number formatted as E.164 | [optional] |
| **operator** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money). | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPaymentAccountGetOrCreateRequestMobileMoney.new(
  number: +254000000000,
  operator: null
)
```

