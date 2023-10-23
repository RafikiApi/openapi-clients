# OpenapiClient::OpenapiPayoutCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amount** | [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional] |
| **payment_account** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional] |
| **payment_account_id** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional] |
| **sender** | [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional] |
| **wallet_id** | **String** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateRequest.new(
  amount: null,
  payment_account: null,
  payment_account_id: pac-xxx,
  sender: null,
  wallet_id: wlt-xxx
)
```

