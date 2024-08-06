# OpenapiPeriodPayoutCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | Option<[**crate::models::OpenapiPayoutCreateRequestAmount**](openapi_PayoutCreateRequest_amount.md)> |  | [optional]
**custom_id** | Option<**String**> | An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\". | [optional]
**payment_account** | Option<[**crate::models::OpenapiPeriodPaymentAccountGetOrCreateRequest**](openapi.PaymentAccountGetOrCreateRequest.md)> |  | [optional]
**payment_account_id** | Option<**String**> | <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional]
**purpose** | Option<**String**> | <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul> | [optional]
**sender** | Option<[**crate::models::OpenapiPayoutCreateRequestSender**](openapi_PayoutCreateRequest_sender.md)> |  | [optional]
**wallet_id** | Option<**String**> | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


