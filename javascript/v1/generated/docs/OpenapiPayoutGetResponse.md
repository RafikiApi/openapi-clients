# Resources.OpenapiPayoutGetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**createdAt** | **String** |  | [optional] 
**customId** | **String** |  | [optional] 
**id** | **String** | The payout unique identifier | [optional] 
**onBehalfOf** | **[String]** |  | [optional] 
**paymentAccountId** | **String** | The recipient payment account receiving funds | [optional] 
**purpose** | **String** |  | [optional] 
**receipt** | **String** | The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional] 
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




