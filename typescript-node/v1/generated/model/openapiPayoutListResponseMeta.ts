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
import { OpenapiPayoutListResponseMetaPaging } from './openapiPayoutListResponseMetaPaging';

export class OpenapiPayoutListResponseMeta {
    'paging'?: OpenapiPayoutListResponseMetaPaging;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "paging",
            "baseName": "paging",
            "type": "OpenapiPayoutListResponseMetaPaging"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPayoutListResponseMeta.attributeTypeMap;
    }
}

