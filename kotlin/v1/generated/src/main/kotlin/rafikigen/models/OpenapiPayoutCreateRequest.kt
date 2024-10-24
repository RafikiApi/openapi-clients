/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package rafikigen.models

import rafikigen.models.OpenapiPaymentAccountGetOrCreateRequest
import rafikigen.models.OpenapiPayoutCreateRequestAmount
import rafikigen.models.OpenapiPayoutCreateRequestSender

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param amount 
 * @param customId An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\".
 * @param onBehalfOf 
 * @param paymentAccount 
 * @param paymentAccountId <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.
 * @param purpose <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul>
 * @param sender 
 * @param walletId The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.
 */


data class OpenapiPayoutCreateRequest (

    @Json(name = "amount")
    val amount: OpenapiPayoutCreateRequestAmount? = null,

    /* An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\". */
    @Json(name = "custom_id")
    val customId: kotlin.String? = null,

    @Json(name = "on_behalf_of")
    val onBehalfOf: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "payment_account")
    val paymentAccount: OpenapiPaymentAccountGetOrCreateRequest? = null,

    /* <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. */
    @Json(name = "payment_account_id")
    val paymentAccountId: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul> */
    @Json(name = "purpose")
    val purpose: OpenapiPayoutCreateRequest.Purpose? = null,

    @Json(name = "sender")
    val sender: OpenapiPayoutCreateRequestSender? = null,

    /* The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. */
    @Json(name = "wallet_id")
    val walletId: kotlin.String? = null

) {

    /**
     * <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul>
     *
     * Values: gOODSPURCHASE,sERVICESPAYMENT,iNVOICEPAYMENT,lOANREPAYMENT,bILLSPAYMENT,sALARYANDWAGES,p2PTRANSFER,rEMITTANCE,dONATION,gRANTSANDSCHOLARSHIPS,tRAVELANDACCOMMODATION,tAXPAYMENT,iNSURANCEPREMIUM
     */
    @JsonClass(generateAdapter = false)
    enum class Purpose(val value: kotlin.String) {
        @Json(name = "GOODS_PURCHASE") gOODSPURCHASE("GOODS_PURCHASE"),
        @Json(name = "SERVICES_PAYMENT") sERVICESPAYMENT("SERVICES_PAYMENT"),
        @Json(name = "INVOICE_PAYMENT") iNVOICEPAYMENT("INVOICE_PAYMENT"),
        @Json(name = "LOAN_REPAYMENT") lOANREPAYMENT("LOAN_REPAYMENT"),
        @Json(name = "BILLS_PAYMENT") bILLSPAYMENT("BILLS_PAYMENT"),
        @Json(name = "SALARY_AND_WAGES") sALARYANDWAGES("SALARY_AND_WAGES"),
        @Json(name = "P2P_TRANSFER") p2PTRANSFER("P2P_TRANSFER"),
        @Json(name = "REMITTANCE") rEMITTANCE("REMITTANCE"),
        @Json(name = "DONATION") dONATION("DONATION"),
        @Json(name = "GRANTS_AND_SCHOLARSHIPS") gRANTSANDSCHOLARSHIPS("GRANTS_AND_SCHOLARSHIPS"),
        @Json(name = "TRAVEL_AND_ACCOMMODATION") tRAVELANDACCOMMODATION("TRAVEL_AND_ACCOMMODATION"),
        @Json(name = "TAX_PAYMENT") tAXPAYMENT("TAX_PAYMENT"),
        @Json(name = "INSURANCE_PREMIUM") iNSURANCEPREMIUM("INSURANCE_PREMIUM");
    }
}

