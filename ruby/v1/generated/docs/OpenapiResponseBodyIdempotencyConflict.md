# OpenapiClient::OpenapiResponseBodyIdempotencyConflict

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | Can be either &#x60;IDEMPOTENCY_RACE&#x60; or &#x60;IDEMPOTENCY_KEY_ALREADY_USED&#x60; | [optional] |
| **message** | **String** | E.g. \&quot;Idempotency key already in use\&quot; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyIdempotencyConflict.new(
  code: IDEMPOTENCY_RACE,
  message: Idempotency key already in use
)
```

