# OpenapiClient::OpenapiPayoutCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amount** | [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional] |
| **custom_id** | **String** | An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \&quot;-\&quot; and \&quot;_\&quot;. | [optional] |
| **on_behalf_of** | **Array&lt;String&gt;** |  | [optional] |
| **payment_account** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional] |
| **payment_account_id** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional] |
| **purpose** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account country is GH,UG,EG,CI,SN or CM&lt;/span&gt;  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  &lt;ul&gt; &lt;li&gt;&lt;code&gt;GOODS_PURCHASE&lt;/code&gt;: Payments made for buying physical or digital goods.&lt;/li&gt; &lt;li&gt;&lt;code&gt;SERVICES_PAYMENT&lt;/code&gt;: Payments made for services rendered, including professional services, consulting, and freelance work.&lt;/li&gt; &lt;li&gt;&lt;code&gt;INVOICE_PAYMENT&lt;/code&gt;: Payments made to settle invoices issued for goods or services.&lt;/li&gt; &lt;li&gt;&lt;code&gt;LOAN_REPAYMENT&lt;/code&gt;: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.&lt;/li&gt; &lt;li&gt;&lt;code&gt;BILLS_PAYMENT&lt;/code&gt;: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.&lt;/li&gt; &lt;li&gt;&lt;code&gt;SALARY_AND_WAGES&lt;/code&gt;: Disbursements made to employees for their salaries and wages.&lt;/li&gt; &lt;li&gt;&lt;code&gt;P2P_TRANSFER&lt;/code&gt;: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMITTANCE&lt;/code&gt;: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.&lt;/li&gt; &lt;li&gt;&lt;code&gt;DONATION&lt;/code&gt;: Payments made to charitable organizations or causes.&lt;/li&gt; &lt;li&gt;&lt;code&gt;GRANTS_AND_SCHOLARSHIPS&lt;/code&gt;: Payments distributed as grants, scholarships, or other forms of financial aid.&lt;/li&gt; &lt;li&gt;&lt;code&gt;TRAVEL_AND_ACCOMMODATION&lt;/code&gt;: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.&lt;/li&gt; &lt;li&gt;&lt;code&gt;TAX_PAYMENT&lt;/code&gt;: Payments made for settling taxes and duties.&lt;/li&gt; &lt;li&gt;&lt;code&gt;INSURANCE_PREMIUM&lt;/code&gt;: Payments made towards insurance policies, including health, auto, and life insurance.&lt;/li&gt; &lt;/ul&gt; | [optional] |
| **sender** | [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional] |
| **wallet_id** | **String** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OpenapiPayoutCreateRequest.new(
  amount: null,
  custom_id: custom-id-xxx,
  on_behalf_of: [&quot;[\&quot;org-xxx\&quot;]&quot;],
  payment_account: null,
  payment_account_id: pac-xxx,
  purpose: REMITTANCE,
  sender: null,
  wallet_id: wlt-xxx
)
```

