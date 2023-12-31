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

import rafikigen.models.OpenapiPayoutCreateRequestSenderAddress
import rafikigen.models.OpenapiPayoutCreateRequestSenderIndividual

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An optional property for incorporating sender details. Please refer to the \"💡 **Compliance requirements**\" documentation above.
 *
 * @param address 
 * @param individual 
 * @param name <span style=\"color:#e95f6a;\">required if sender is provided</span>  The individual full name or registered business legal name
 * @param type <span style=\"color:#e95f6a;\">required if sender is provided</span>  Either `INDIVIDUAL` or `BUSINESS`
 */


data class OpenapiPayoutCreateRequestSender (

    @Json(name = "address")
    val address: OpenapiPayoutCreateRequestSenderAddress? = null,

    @Json(name = "individual")
    val individual: OpenapiPayoutCreateRequestSenderIndividual? = null,

    /* <span style=\"color:#e95f6a;\">required if sender is provided</span>  The individual full name or registered business legal name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required if sender is provided</span>  Either `INDIVIDUAL` or `BUSINESS` */
    @Json(name = "type")
    val type: OpenapiPayoutCreateRequestSender.Type? = null

) {

    /**
     * <span style=\"color:#e95f6a;\">required if sender is provided</span>  Either `INDIVIDUAL` or `BUSINESS`
     *
     * Values: iNDIVIDUAL,bUSINESS
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "INDIVIDUAL") iNDIVIDUAL("INDIVIDUAL"),
        @Json(name = "BUSINESS") bUSINESS("BUSINESS");
    }
}

