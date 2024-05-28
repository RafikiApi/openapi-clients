# OpenapiClient::OpenapiResponseBodyLookupAccountNotFound

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | &#x60;LOOKUP_ACCOUNT_NOT_FOUND&#x60; | [optional] |
| **message** | **String** | E.g. \&quot;Invalid bank account number, or, syntactically valid, but not registered with any banking entity\&quot; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyLookupAccountNotFound.new(
  code: LOOKUP_ACCOUNT_NOT_FOUND,
  message: the provided account identifier {&#39;xxxxxxxxx&#39;} couldn&#39;t be looked up
)
```

