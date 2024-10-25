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
 * @param number 
 * @param `operator` 
 */


data class OpenapiPaymentAccountGetOrCreateResponseMobileMoney (

    @Json(name = "number")
    val number: kotlin.String? = null,

    @Json(name = "operator")
    val `operator`: OpenapiPaymentAccountGetOrCreateResponseMobileMoney.`Operator`? = null

) {

    /**
     * 
     *
     * Values: sAFARICOM,aIRTEL,vODACOM,tIGO,hALOTEL,tTCL,mTN,vODAFONE,mOOV,oRANGE,fREE,eXPRESSO
     */
    @JsonClass(generateAdapter = false)
    enum class `Operator`(val value: kotlin.String) {
        @Json(name = "SAFARICOM") sAFARICOM("SAFARICOM"),
        @Json(name = "AIRTEL") aIRTEL("AIRTEL"),
        @Json(name = "VODACOM") vODACOM("VODACOM"),
        @Json(name = "TIGO") tIGO("TIGO"),
        @Json(name = "HALOTEL") hALOTEL("HALOTEL"),
        @Json(name = "TTCL") tTCL("TTCL"),
        @Json(name = "MTN") mTN("MTN"),
        @Json(name = "VODAFONE") vODAFONE("VODAFONE"),
        @Json(name = "MOOV") mOOV("MOOV"),
        @Json(name = "ORANGE") oRANGE("ORANGE"),
        @Json(name = "FREE") fREE("FREE"),
        @Json(name = "EXPRESSO") eXPRESSO("EXPRESSO");
    }
}

