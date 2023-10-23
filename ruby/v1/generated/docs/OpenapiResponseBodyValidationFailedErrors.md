# OpenapiClient::OpenapiResponseBodyValidationFailedErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fields** | **Hash&lt;String, Array&lt;String&gt;&gt;** | Every key corresponds to the name of a property that has not passed validation. The value associated with each key is an array of strings that serves to provide a descriptive explanation of the requirements for that particular property and the reasons for its failure. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyValidationFailedErrors.new(
  fields: null
)
```

