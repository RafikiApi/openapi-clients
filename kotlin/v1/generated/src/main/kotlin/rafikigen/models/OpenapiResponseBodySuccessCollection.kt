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
 * @param `data` 
 * @param meta 
 */


data class OpenapiResponseBodySuccessCollection (

    @Json(name = "data")
    val `data`: kotlin.collections.List<kotlin.Any>? = null,

    @Json(name = "meta")
    val meta: kotlin.Any? = null

)

