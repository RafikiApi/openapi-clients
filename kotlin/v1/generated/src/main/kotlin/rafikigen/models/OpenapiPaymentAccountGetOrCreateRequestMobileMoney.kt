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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param number <span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The actual phone number formatted as E.164
 * @param `operator` <span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money).
 */


data class OpenapiPaymentAccountGetOrCreateRequestMobileMoney (

    /* <span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The actual phone number formatted as E.164 */
    @Json(name = "number")
    val number: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money). */
    @Json(name = "operator")
    val `operator`: OpenapiPaymentAccountGetOrCreateRequestMobileMoney.`Operator`? = null

) {

    /**
     * <span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money).
     *
     * Values: sAFARICOM,aIRTEL,vODACOM,tIGO,hALOTEL,tTCL,mTN
     */
    @JsonClass(generateAdapter = false)
    enum class `Operator`(val value: kotlin.String) {
        @Json(name = "SAFARICOM") sAFARICOM("SAFARICOM"),
        @Json(name = "AIRTEL") aIRTEL("AIRTEL"),
        @Json(name = "VODACOM") vODACOM("VODACOM"),
        @Json(name = "TIGO") tIGO("TIGO"),
        @Json(name = "HALOTEL") hALOTEL("HALOTEL"),
        @Json(name = "TTCL") tTCL("TTCL"),
        @Json(name = "MTN") mTN("MTN");
    }
}

