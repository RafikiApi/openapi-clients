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

import rafikigen.models.OpenapiPaymentAccountListResponseMetaPagingCursors

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param cursors 
 * @param next 
 */


data class OpenapiPaymentAccountListResponseMetaPaging (

    @Json(name = "cursors")
    val cursors: OpenapiPaymentAccountListResponseMetaPagingCursors? = null,

    @Json(name = "next")
    val next: kotlin.String? = null

)

