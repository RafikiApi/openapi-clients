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
import { OpenapiPaymentAccountGetOrCreateResponseBankAccount } from './openapiPaymentAccountGetOrCreateResponseBankAccount';
import { OpenapiPaymentAccountGetOrCreateResponseHolder } from './openapiPaymentAccountGetOrCreateResponseHolder';
import { OpenapiPaymentAccountGetOrCreateResponseMobileMoney } from './openapiPaymentAccountGetOrCreateResponseMobileMoney';

export class OpenapiPaymentAccountGetOrCreateResponse {
    'bankAccount'?: OpenapiPaymentAccountGetOrCreateResponseBankAccount;
    'country'?: string;
    'createdAt'?: string;
    'holder'?: OpenapiPaymentAccountGetOrCreateResponseHolder;
    /**
    * The newly created payment account unique identifier
    */
    'id'?: string;
    'mobileMoney'?: OpenapiPaymentAccountGetOrCreateResponseMobileMoney;
    'type'?: string = 'MOBILE_MONEY';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "bankAccount",
            "baseName": "bank_account",
            "type": "OpenapiPaymentAccountGetOrCreateResponseBankAccount"
        },
        {
            "name": "country",
            "baseName": "country",
            "type": "string"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "string"
        },
        {
            "name": "holder",
            "baseName": "holder",
            "type": "OpenapiPaymentAccountGetOrCreateResponseHolder"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "mobileMoney",
            "baseName": "mobile_money",
            "type": "OpenapiPaymentAccountGetOrCreateResponseMobileMoney"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPaymentAccountGetOrCreateResponse.attributeTypeMap;
    }
}

