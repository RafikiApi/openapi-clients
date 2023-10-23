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
 * @param city <span style=\"color:#e95f6a;\">required if address is provided</span>
 * @param country <span style=\"color:#e95f6a;\">required if address is provided</span>  The ISO 3166 alpha-2 country code associated with the address.
 * @param line1 <span style=\"color:#e95f6a;\">required if address is provided</span>
 * @param line2 
 * @param line3 
 * @param postalCode <span style=\"color:#e95f6a;\">required if address is provided</span>  ⚠️ We enforce postal code validation for these following country codes : GB, US, PT, IE, MT, NG, NL, SK
 */


data class OpenapiPayoutCreateRequestSenderAddress (

    /* <span style=\"color:#e95f6a;\">required if address is provided</span> */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required if address is provided</span>  The ISO 3166 alpha-2 country code associated with the address. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required if address is provided</span> */
    @Json(name = "line_1")
    val line1: kotlin.String? = null,

    @Json(name = "line_2")
    val line2: kotlin.String? = null,

    @Json(name = "line_3")
    val line3: kotlin.String? = null,

    /* <span style=\"color:#e95f6a;\">required if address is provided</span>  ⚠️ We enforce postal code validation for these following country codes : GB, US, PT, IE, MT, NG, NL, SK */
    @Json(name = "postal_code")
    val postalCode: kotlin.String? = null

)
