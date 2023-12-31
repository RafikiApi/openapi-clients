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

import rafikigen.models.BanksGet200ResponseAllOfDataInnerBranchesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param branches If the bank operates across multiple branches within a country, this property will be included, listing all the branches available from the bank.
 * @param country The ISO 3166 alpha-2 country code in which the bank operates.
 * @param id 
 * @param name 
 */


data class BanksGet200ResponseAllOfDataInner (

    /* If the bank operates across multiple branches within a country, this property will be included, listing all the branches available from the bank. */
    @Json(name = "branches")
    val branches: kotlin.collections.List<BanksGet200ResponseAllOfDataInnerBranchesInner>? = null,

    /* The ISO 3166 alpha-2 country code in which the bank operates. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null

)

