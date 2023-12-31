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

import rafikigen.models.OpenapiPayoutCreateResponseAmount
import rafikigen.models.OpenapiPayoutCreateResponseSender
import rafikigen.models.OpenapiPayoutCreateResponseState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param amount 
 * @param createdAt 
 * @param customId 
 * @param id The payout unique identifier
 * @param paymentAccountId The recipient payment account receiving funds
 * @param sender 
 * @param state 
 * @param walletId The wallet ID from which the money will disburse
 */


data class OpenapiPayoutCreateResponse (

    @Json(name = "amount")
    val amount: OpenapiPayoutCreateResponseAmount? = null,

    @Json(name = "created_at")
    val createdAt: kotlin.String? = null,

    @Json(name = "custom_id")
    val customId: kotlin.String? = null,

    /* The payout unique identifier */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The recipient payment account receiving funds */
    @Json(name = "payment_account_id")
    val paymentAccountId: kotlin.String? = null,

    @Json(name = "sender")
    val sender: OpenapiPayoutCreateResponseSender? = null,

    @Json(name = "state")
    val state: OpenapiPayoutCreateResponseState? = null,

    /* The wallet ID from which the money will disburse */
    @Json(name = "wallet_id")
    val walletId: kotlin.String? = null

)

