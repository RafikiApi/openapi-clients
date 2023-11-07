# OpenapiClient::OpenapiPayoutCreateResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] |
| **created_at** | **String** |  | [optional] |
| **custom_id** | **String** |  | [optional] |
| **id** | **String** | The payout unique identifier | [optional] |
| **payment_account_id** | **String** | The recipient payment account receiving funds | [optional] |
| **sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] |
| **state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] |
| **wallet_id** | **String** | The wallet ID from which the money will disburse | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateResponse.new(
  amount: null,
  created_at: 2006-01-02T15:04:05Z07:00,
  custom_id: custom-id-xxx,
  id: pyt-xxx,
  payment_account_id: pac-xxx,
  sender: null,
  state: null,
  wallet_id: wlt-xxx
)
```

