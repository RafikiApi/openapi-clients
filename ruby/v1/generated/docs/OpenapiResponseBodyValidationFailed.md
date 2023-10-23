# OpenapiClient::OpenapiResponseBodyValidationFailed

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** |  | [optional] |
| **errors** | [**OpenapiResponseBodyValidationFailedErrors**](OpenapiResponseBodyValidationFailedErrors.md) |  | [optional] |
| **message** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyValidationFailed.new(
  code: VALIDATION_FAILED,
  errors: null,
  message: Validation failed.
)
```

