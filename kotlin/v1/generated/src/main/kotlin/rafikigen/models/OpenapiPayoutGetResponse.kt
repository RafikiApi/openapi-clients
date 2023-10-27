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
 * @param id The payout unique identifier
 * @param paymentAccountId The recipient payment account receiving funds
 * @param receipt The reference provided by the recipient account's actual bank or telco on a successful payout.  > ⚠️ > It's important to be aware that this information might not be accessible for every payout. If there's no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.
 * @param sender 
 * @param state 
 * @param walletId The wallet ID from which the money will disburse
 */


data class OpenapiPayoutGetResponse (

    @Json(name = "amount")
    val amount: OpenapiPayoutCreateResponseAmount? = null,

    @Json(name = "created_at")
    val createdAt: kotlin.String? = null,

    /* The payout unique identifier */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The recipient payment account receiving funds */
    @Json(name = "payment_account_id")
    val paymentAccountId: kotlin.String? = null,

    /* The reference provided by the recipient account's actual bank or telco on a successful payout.  > ⚠️ > It's important to be aware that this information might not be accessible for every payout. If there's no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. */
    @Json(name = "receipt")
    val receipt: kotlin.String? = null,

    @Json(name = "sender")
    val sender: OpenapiPayoutCreateResponseSender? = null,

    @Json(name = "state")
    val state: OpenapiPayoutCreateResponseState? = null,

    /* The wallet ID from which the money will disburse */
    @Json(name = "wallet_id")
    val walletId: kotlin.String? = null

)

