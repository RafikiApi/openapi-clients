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
import { OpenapiPayoutCreateRequestSenderIndividualIdentityDocument } from './openapiPayoutCreateRequestSenderIndividualIdentityDocument';

export class OpenapiPayoutCreateRequestSenderIndividual {
    /**
    * Date of birth formatted as yyyy-mm-dd
    */
    'dob'?: string;
    'identityDocument'?: OpenapiPayoutCreateRequestSenderIndividualIdentityDocument;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dob",
            "baseName": "dob",
            "type": "string"
        },
        {
            "name": "identityDocument",
            "baseName": "identity_document",
            "type": "OpenapiPayoutCreateRequestSenderIndividualIdentityDocument"
        }    ];

    static getAttributeTypeMap() {
        return OpenapiPayoutCreateRequestSenderIndividual.attributeTypeMap;
    }
}

