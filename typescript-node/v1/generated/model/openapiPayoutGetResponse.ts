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
import { OpenapiPayoutCreateResponseAmount } from './openapiPayoutCreateResponseAmount';
import { OpenapiPayoutCreateResponseSender } from './openapiPayoutCreateResponseSender';
import { OpenapiPayoutCreateResponseState } from './openapiPayoutCreateResponseState';

export class OpenapiPayoutGetResponse {
    'amount'?: OpenapiPayoutCreateResponseAmount;
    'createdAt'?: string;
    'customId'?: string;
    /**
    * The payout unique identifier
    */
    'id'?: string;
    /**
    * The recipient payment account receiving funds
    */
    'paymentAccountId'?: string;
    /**
    * The reference provided by the recipient account\'s actual bank or telco on a successful payout.  > ⚠️ > It\'s important to be aware that this information might not be accessible for every payout. If there\'s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.
    */
    'receipt'?: string;
    'sender'?: OpenapiPayoutCreateResponseSender;
    'state'?: OpenapiPayoutCreateResponseState;
    /**
    * The wallet ID from which the money will disburse
    */
    'walletId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "amount",
            "baseName": "amount",
            "type": "OpenapiPayoutCreateResponseAmount"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "string"
        },
        {
            "name": "customId",
            "baseName": "custom_id",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "paymentAccountId",
            "baseName": "payment_account_id",
            "type": "string"
        },
        {
            "name": "receipt",
            "baseName": "receipt",
            "type": "string"
        },
        {
            "name": "sender",
            "baseName": "sender",
            "type": "OpenapiPayoutCreateResponseSender"
        },
        {
            "name": "state",
            "baseName": "state",
            "type": "OpenapiPayoutCreateResponseState"
        },
        {
            "name": "walletId",
            "baseName": "wallet_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPayoutGetResponse.attributeTypeMap;
    }
}

