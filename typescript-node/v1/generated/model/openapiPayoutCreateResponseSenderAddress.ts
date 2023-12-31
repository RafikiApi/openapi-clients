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

export class OpenapiPayoutCreateResponseSenderAddress {
    'city'?: string;
    /**
    * The ISO 3166 alpha-2 country code associated with the address.
    */
    'country'?: string;
    'line1'?: string;
    'line2'?: string;
    'line3'?: string;
    'postalCode'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "city",
            "baseName": "city",
            "type": "string"
        },
        {
            "name": "country",
            "baseName": "country",
            "type": "string"
        },
        {
            "name": "line1",
            "baseName": "line_1",
            "type": "string"
        },
        {
            "name": "line2",
            "baseName": "line_2",
            "type": "string"
        },
        {
            "name": "line3",
            "baseName": "line_3",
            "type": "string"
        },
        {
            "name": "postalCode",
            "baseName": "postal_code",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPayoutCreateResponseSenderAddress.attributeTypeMap;
    }
}

