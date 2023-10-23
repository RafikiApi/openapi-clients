# OpenapiClient::OpenapiPayoutGetResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] |
| **bank_reference** | **String** | The reference provided by the recipient account&#39;s actual bank on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional] |
| **created_at** | **String** |  | [optional] |
| **id** | **String** | The payout unique identifier | [optional] |
| **payment_account_id** | **String** | The recipient payment account receiving funds | [optional] |
| **sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] |
| **state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] |
| **wallet_id** | **String** | The wallet ID from which the money will disburse | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutGetResponse.new(
  amount: null,
  bank_reference: ref-xxx,
  created_at: 2006-01-02T15:04:05Z07:00,
  id: pyt-xxx,
  payment_account_id: pac-xxx,
  sender: null,
  state: null,
  wallet_id: wlt-xxx
)
```

