
# OpenapiPayoutCreateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  |  [optional]
**createdAt** | **kotlin.String** |  |  [optional]
**customId** | **kotlin.String** |  |  [optional]
**id** | **kotlin.String** | The payout unique identifier |  [optional]
**paymentAccountId** | **kotlin.String** | The recipient payment account receiving funds |  [optional]
**purpose** | [**inline**](#Purpose) |  |  [optional]
**sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  |  [optional]
**state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  |  [optional]
**walletId** | **kotlin.String** | The wallet ID from which the money will disburse |  [optional]


<a id="Purpose"></a>
## Enum: purpose
Name | Value
---- | -----
purpose | GOODS_PURCHASE, SERVICES_PAYMENT, INVOICE_PAYMENT, LOAN_REPAYMENT, BILLS_PAYMENT, SALARY_AND_WAGES, P2P_TRANSFER, REMITTANCE, DONATION, GRANTS_AND_SCHOLARSHIPS, TRAVEL_AND_ACCOMMODATION, TAX_PAYMENT, INSURANCE_PREMIUM



