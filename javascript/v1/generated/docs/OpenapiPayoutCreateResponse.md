# Resources.OpenapiPayoutCreateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**createdAt** | **String** |  | [optional] 
**customId** | **String** |  | [optional] 
**id** | **String** | The payout unique identifier | [optional] 
**paymentAccountId** | **String** | The recipient payment account receiving funds | [optional] 
**purpose** | **String** |  | [optional] 
**sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] 
**state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] 
**walletId** | **String** | The wallet ID from which the money will disburse | [optional] 



## Enum: PurposeEnum


* `GOODS_PURCHASE` (value: `"GOODS_PURCHASE"`)

* `SERVICES_PAYMENT` (value: `"SERVICES_PAYMENT"`)

* `INVOICE_PAYMENT` (value: `"INVOICE_PAYMENT"`)

* `LOAN_REPAYMENT` (value: `"LOAN_REPAYMENT"`)

* `BILLS_PAYMENT` (value: `"BILLS_PAYMENT"`)

* `SALARY_AND_WAGES` (value: `"SALARY_AND_WAGES"`)

* `P2P_TRANSFER` (value: `"P2P_TRANSFER"`)

* `REMITTANCE` (value: `"REMITTANCE"`)

* `DONATION` (value: `"DONATION"`)

* `GRANTS_AND_SCHOLARSHIPS` (value: `"GRANTS_AND_SCHOLARSHIPS"`)

* `TRAVEL_AND_ACCOMMODATION` (value: `"TRAVEL_AND_ACCOMMODATION"`)

* `TAX_PAYMENT` (value: `"TAX_PAYMENT"`)

* `INSURANCE_PREMIUM` (value: `"INSURANCE_PREMIUM"`)




