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
 * @param code `NOT_FOUND`
 * @param message E.g. \"The resource you are looking for cannot be found.\"
 */


data class OpenapiResponseBodyNotFound (

    /* `NOT_FOUND` */
    @Json(name = "code")
    val code: kotlin.String? = null,

    /* E.g. \"The resource you are looking for cannot be found.\" */
    @Json(name = "message")
    val message: kotlin.String? = null

)

