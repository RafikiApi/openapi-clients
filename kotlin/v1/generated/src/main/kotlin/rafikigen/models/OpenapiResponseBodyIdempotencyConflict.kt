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
 * @param code Can be either `IDEMPOTENCY_RACE` or `IDEMPOTENCY_KEY_ALREADY_USED`
 * @param message E.g. \"Idempotency key already in use\"
 */


data class OpenapiResponseBodyIdempotencyConflict (

    /* Can be either `IDEMPOTENCY_RACE` or `IDEMPOTENCY_KEY_ALREADY_USED` */
    @Json(name = "code")
    val code: kotlin.String? = null,

    /* E.g. \"Idempotency key already in use\" */
    @Json(name = "message")
    val message: kotlin.String? = null

)

