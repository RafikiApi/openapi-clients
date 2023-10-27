# OpenapiClient::OpenapiResponseBodyValidationFailed

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | &#x60;VALIDATION_FAILED&#x60; | [optional] |
| **errors** | [**OpenapiResponseBodyValidationFailedErrors**](OpenapiResponseBodyValidationFailedErrors.md) |  | [optional] |
| **message** | **String** | E.g. \&quot;Validation failed.\&quot; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyValidationFailed.new(
  code: VALIDATION_FAILED,
  errors: null,
  message: Validation failed.
)
```

