# OpenapiClient::OpenapiResponseBodyNotFound

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | &#x60;NOT_FOUND&#x60; | [optional] |
| **message** | **String** | E.g. \&quot;The resource you are looking for cannot be found.\&quot; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyNotFound.new(
  code: NOT_FOUND,
  message: The resource you are looking for cannot be found.
)
```

