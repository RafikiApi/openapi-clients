/**
 * Resources
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { OpenapiPaymentAccountGetOrCreateRequest } from './openapiPaymentAccountGetOrCreateRequest';
import { OpenapiPayoutCreateRequestAmount } from './openapiPayoutCreateRequestAmount';
import { OpenapiPayoutCreateRequestSender } from './openapiPayoutCreateRequestSender';

export class OpenapiPayoutCreateRequest {
    'amount'?: OpenapiPayoutCreateRequestAmount;
    /**
    * An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\".
    */
    'customId'?: string;
    'paymentAccount'?: OpenapiPaymentAccountGetOrCreateRequest;
    /**
    * <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.
    */
    'paymentAccountId'?: string;
    'sender'?: OpenapiPayoutCreateRequestSender;
    /**
    * The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.
    */
    'walletId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "amount",
            "baseName": "amount",
            "type": "OpenapiPayoutCreateRequestAmount"
        },
        {
            "name": "customId",
            "baseName": "custom_id",
            "type": "string"
        },
        {
            "name": "paymentAccount",
            "baseName": "payment_account",
            "type": "OpenapiPaymentAccountGetOrCreateRequest"
        },
        {
            "name": "paymentAccountId",
            "baseName": "payment_account_id",
            "type": "string"
        },
        {
            "name": "sender",
            "baseName": "sender",
            "type": "OpenapiPayoutCreateRequestSender"
        },
        {
            "name": "walletId",
            "baseName": "wallet_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPayoutCreateRequest.attributeTypeMap;
    }
}

