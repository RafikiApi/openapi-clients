# OpenapiClient::OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | &#x60;PAYOUT_BANK_TEMPORARILY_UNAVAILABLE&#x60; | [optional] |
| **message** | **String** | E.g. \&quot;Payout to this bank is not available.\&quot; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable.new(
  code: PAYOUT_BANK_TEMPORARILY_UNAVAILABLE,
  message: Payout to this bank is not available.
)
```

