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

import rafikigen.models.OpenapiPaymentAccountGetOrCreateRequestBankAccount
import rafikigen.models.OpenapiPaymentAccountGetOrCreateRequestHolder
import rafikigen.models.OpenapiPaymentAccountGetOrCreateRequestMobileMoney

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param bankAccount 
 * @param country <span style=\"color:#e95f6a;\">required</span>  The ISO 3166 alpha-2 country code in which the payment account is registered.
 * @param holder 
 * @param mobileMoney 
 * @param type <span style=\"color:#e95f6a;\">required</span>  Either `MOBILE_MONEY` or `BANK_ACCOUNT`
 */


data class OpenapiPaymentAccountGetOrCreateRequest (

    @Json(name = "bank_account")
    val bankAccount: OpenapiPaymentAccountGetOrCreateRequestBankAccount? = null,

    /* <span style=\"color:#e95f6a;\">required</span>  The ISO 3166 alpha-2 country code in which the payment account is registered. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "holder")
    val holder: OpenapiPaymentAccountGetOrCreateRequestHolder? = null,

    @Json(name = "mobile_money")
    val mobileMoney: OpenapiPaymentAccountGetOrCreateRequestMobileMoney? = null,

    /* <span style=\"color:#e95f6a;\">required</span>  Either `MOBILE_MONEY` or `BANK_ACCOUNT` */
    @Json(name = "type")
    val type: OpenapiPaymentAccountGetOrCreateRequest.Type? = null

) {

    /**
     * <span style=\"color:#e95f6a;\">required</span>  Either `MOBILE_MONEY` or `BANK_ACCOUNT`
     *
     * Values: mOBILEMONEY,bANKACCOUNT
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "MOBILE_MONEY") mOBILEMONEY("MOBILE_MONEY"),
        @Json(name = "BANK_ACCOUNT") bANKACCOUNT("BANK_ACCOUNT");
    }
}

