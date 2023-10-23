# OpenapiClient::OpenapiResponseBodySuccessCursorPaginatedMetaPaging

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cursors** | [**OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors**](OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors.md) |  | [optional] |
| **_next** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodySuccessCursorPaginatedMetaPaging.new(
  cursors: null,
  _next: https://rest.sandbox.rafiki-api.com/v1/payouts?paging_after&#x3D;dHJ4LTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw%3D%3D&amp;paging_limit&#x3D;10
)
```

