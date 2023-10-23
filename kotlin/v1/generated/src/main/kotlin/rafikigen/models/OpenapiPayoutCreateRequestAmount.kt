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
 * <span style=\"color:#e95f6a;\">required</span>  The intended amount to send to either the payment_account_id or payment_account
 *
 * @param currency <span style=\"color:#e95f6a;\">required</span>  The currency associated with the amount value, formatted according to ISO 4217
 * @param `value` <span style=\"color:#e95f6a;\">required</span>
 */


data class OpenapiPayoutCreateRequestAmount (

    /* <span style=\"color:#e95f6a;\">required</span>  The currency associated with the amount value, formatted according to ISO 4217 */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required</span> */
    @Json(name = "value")
    val `value`: kotlin.String? = null

)

