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
 * @param fields Every key corresponds to the name of a property that has not passed validation. The value associated with each key is an array of strings that serves to provide a descriptive explanation of the requirements for that particular property and the reasons for its failure.
 */


data class OpenapiResponseBodyValidationFailedErrors (

    /* Every key corresponds to the name of a property that has not passed validation. The value associated with each key is an array of strings that serves to provide a descriptive explanation of the requirements for that particular property and the reasons for its failure. */
    @Json(name = "fields")
    val fields: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null

)

