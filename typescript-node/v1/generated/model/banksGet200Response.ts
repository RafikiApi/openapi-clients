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
import { BanksGet200ResponseAllOfDataInner } from './banksGet200ResponseAllOfDataInner';

export class BanksGet200Response {
    'data'?: Array<BanksGet200ResponseAllOfDataInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<BanksGet200ResponseAllOfDataInner>"
        }    ];

    static getAttributeTypeMap() {
        return BanksGet200Response.attributeTypeMap;
    }
}

