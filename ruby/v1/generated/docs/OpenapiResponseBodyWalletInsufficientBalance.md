# OpenapiClient::OpenapiResponseBodyWalletInsufficientBalance

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **String** | &#x60;WALLET_INSUFFICIENT_BALANCE&#x60; | [optional] |
| **message** | **String** | E.g. \&quot;Wallet &#39;{wlt-xxx}&#39; doesn&#39;t have enough balance\&quot; | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiResponseBodyWalletInsufficientBalance.new(
  code: WALLET_INSUFFICIENT_BALANCE,
  message: wallet &#39;{wlt-xxx}&#39; doesn&#39;t have enough balance
)
```

