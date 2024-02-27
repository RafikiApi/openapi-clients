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

export class OpenapiPaymentAccountGetOrCreateResponseMobileMoney {
    'number'?: string;
    'operator'?: OpenapiPaymentAccountGetOrCreateResponseMobileMoney.OperatorEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "number",
            "baseName": "number",
            "type": "string"
        },
        {
            "name": "operator",
            "baseName": "operator",
            "type": "OpenapiPaymentAccountGetOrCreateResponseMobileMoney.OperatorEnum"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPaymentAccountGetOrCreateResponseMobileMoney.attributeTypeMap;
    }
}

export namespace OpenapiPaymentAccountGetOrCreateResponseMobileMoney {
    export enum OperatorEnum {
        Safaricom = <any> 'SAFARICOM',
        Airtel = <any> 'AIRTEL',
        Vodacom = <any> 'VODACOM',
        Tigo = <any> 'TIGO',
        Halotel = <any> 'HALOTEL',
        Ttcl = <any> 'TTCL',
        Mtn = <any> 'MTN'
    }
}
