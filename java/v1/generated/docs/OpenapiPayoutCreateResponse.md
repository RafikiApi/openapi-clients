

# OpenapiPayoutCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**customId** | **String** |  |  [optional] |
|**id** | **String** | The payout unique identifier |  [optional] |
|**onBehalfOf** | **List&lt;String&gt;** |  |  [optional] |
|**paymentAccountId** | **String** | The recipient payment account receiving funds |  [optional] |
|**purpose** | [**PurposeEnum**](#PurposeEnum) |  |  [optional] |
|**sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  |  [optional] |
|**state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  |  [optional] |
|**walletId** | **String** | The wallet ID from which the money will disburse |  [optional] |



## Enum: PurposeEnum

| Name | Value |
|---- | -----|
| GOODS_PURCHASE | &quot;GOODS_PURCHASE&quot; |
| SERVICES_PAYMENT | &quot;SERVICES_PAYMENT&quot; |
| INVOICE_PAYMENT | &quot;INVOICE_PAYMENT&quot; |
| LOAN_REPAYMENT | &quot;LOAN_REPAYMENT&quot; |
| BILLS_PAYMENT | &quot;BILLS_PAYMENT&quot; |
| SALARY_AND_WAGES | &quot;SALARY_AND_WAGES&quot; |
| P2P_TRANSFER | &quot;P2P_TRANSFER&quot; |
| REMITTANCE | &quot;REMITTANCE&quot; |
| DONATION | &quot;DONATION&quot; |
| GRANTS_AND_SCHOLARSHIPS | &quot;GRANTS_AND_SCHOLARSHIPS&quot; |
| TRAVEL_AND_ACCOMMODATION | &quot;TRAVEL_AND_ACCOMMODATION&quot; |
| TAX_PAYMENT | &quot;TAX_PAYMENT&quot; |
| INSURANCE_PREMIUM | &quot;INSURANCE_PREMIUM&quot; |



