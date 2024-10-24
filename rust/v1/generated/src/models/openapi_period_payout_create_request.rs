/*
 * Resources
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct OpenapiPeriodPayoutCreateRequest {
    #[serde(rename = "amount", skip_serializing_if = "Option::is_none")]
    pub amount: Option<Box<crate::models::OpenapiPayoutCreateRequestAmount>>,
    /// An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\".
    #[serde(rename = "custom_id", skip_serializing_if = "Option::is_none")]
    pub custom_id: Option<String>,
    #[serde(rename = "on_behalf_of", skip_serializing_if = "Option::is_none")]
    pub on_behalf_of: Option<Vec<String>>,
    #[serde(rename = "payment_account", skip_serializing_if = "Option::is_none")]
    pub payment_account: Option<Box<crate::models::OpenapiPeriodPaymentAccountGetOrCreateRequest>>,
    /// <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.
    #[serde(rename = "payment_account_id", skip_serializing_if = "Option::is_none")]
    pub payment_account_id: Option<String>,
    /// <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul>
    #[serde(rename = "purpose", skip_serializing_if = "Option::is_none")]
    pub purpose: Option<Purpose>,
    #[serde(rename = "sender", skip_serializing_if = "Option::is_none")]
    pub sender: Option<Box<crate::models::OpenapiPayoutCreateRequestSender>>,
    /// The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.
    #[serde(rename = "wallet_id", skip_serializing_if = "Option::is_none")]
    pub wallet_id: Option<String>,
}

impl OpenapiPeriodPayoutCreateRequest {
    pub fn new() -> OpenapiPeriodPayoutCreateRequest {
        OpenapiPeriodPayoutCreateRequest {
            amount: None,
            custom_id: None,
            on_behalf_of: None,
            payment_account: None,
            payment_account_id: None,
            purpose: None,
            sender: None,
            wallet_id: None,
        }
    }
}

/// <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul>
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Purpose {
    #[serde(rename = "GOODS_PURCHASE")]
    GoodsPurchase,
    #[serde(rename = "SERVICES_PAYMENT")]
    ServicesPayment,
    #[serde(rename = "INVOICE_PAYMENT")]
    InvoicePayment,
    #[serde(rename = "LOAN_REPAYMENT")]
    LoanRepayment,
    #[serde(rename = "BILLS_PAYMENT")]
    BillsPayment,
    #[serde(rename = "SALARY_AND_WAGES")]
    SalaryAndWages,
    #[serde(rename = "P2P_TRANSFER")]
    P2PTransfer,
    #[serde(rename = "REMITTANCE")]
    Remittance,
    #[serde(rename = "DONATION")]
    Donation,
    #[serde(rename = "GRANTS_AND_SCHOLARSHIPS")]
    GrantsAndScholarships,
    #[serde(rename = "TRAVEL_AND_ACCOMMODATION")]
    TravelAndAccommodation,
    #[serde(rename = "TAX_PAYMENT")]
    TaxPayment,
    #[serde(rename = "INSURANCE_PREMIUM")]
    InsurancePremium,
}

impl Default for Purpose {
    fn default() -> Purpose {
        Self::GoodsPurchase
    }
}

