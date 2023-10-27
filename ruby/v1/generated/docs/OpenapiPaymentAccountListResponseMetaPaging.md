# OpenapiClient::OpenapiPaymentAccountListResponseMetaPaging

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cursors** | [**OpenapiPaymentAccountListResponseMetaPagingCursors**](OpenapiPaymentAccountListResponseMetaPagingCursors.md) |  | [optional] |
| **_next** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPaymentAccountListResponseMetaPaging.new(
  cursors: null,
  _next: https://rest.sandbox.rafiki-api.com/v1/payment-accounts?paging_after&#x3D;cGFjLTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw%3D%3D&amp;paging_limit&#x3D;15
)
```

