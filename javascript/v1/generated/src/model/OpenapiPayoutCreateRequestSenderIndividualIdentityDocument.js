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
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OpenapiPayoutCreateRequestSenderIndividualIdentityDocument model module.
 * @module model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument
 * @version 1
 */
class OpenapiPayoutCreateRequestSenderIndividualIdentityDocument {
    /**
     * Constructs a new <code>OpenapiPayoutCreateRequestSenderIndividualIdentityDocument</code>.
     * @alias module:model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument
     */
    constructor() { 
        
        OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPayoutCreateRequestSenderIndividualIdentityDocument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument} obj Optional instance to populate.
     * @return {module:model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument} The populated <code>OpenapiPayoutCreateRequestSenderIndividualIdentityDocument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPayoutCreateRequestSenderIndividualIdentityDocument();

            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('expires_on')) {
                obj['expires_on'] = ApiClient.convertToType(data['expires_on'], 'String');
            }
            if (data.hasOwnProperty('issued_on')) {
                obj['issued_on'] = ApiClient.convertToType(data['issued_on'], 'String');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPayoutCreateRequestSenderIndividualIdentityDocument</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPayoutCreateRequestSenderIndividualIdentityDocument</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['country'] && !(typeof data['country'] === 'string' || data['country'] instanceof String)) {
            throw new Error("Expected the field `country` to be a primitive type in the JSON string but got " + data['country']);
        }
        // ensure the json data is a string
        if (data['expires_on'] && !(typeof data['expires_on'] === 'string' || data['expires_on'] instanceof String)) {
            throw new Error("Expected the field `expires_on` to be a primitive type in the JSON string but got " + data['expires_on']);
        }
        // ensure the json data is a string
        if (data['issued_on'] && !(typeof data['issued_on'] === 'string' || data['issued_on'] instanceof String)) {
            throw new Error("Expected the field `issued_on` to be a primitive type in the JSON string but got " + data['issued_on']);
        }
        // ensure the json data is a string
        if (data['number'] && !(typeof data['number'] === 'string' || data['number'] instanceof String)) {
            throw new Error("Expected the field `number` to be a primitive type in the JSON string but got " + data['number']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}



/**
 * <span style=\"color:#e95f6a;\">required if identity_document is provided</span>  The ISO 3166 alpha-2 country code indicating the issuing country of the document.
 * @member {String} country
 */
OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.prototype['country'] = undefined;

/**
 * <span style=\"color:#e95f6a;\">required if identity_document is provided</span>  Date formatted as yyyy-mm-dd
 * @member {String} expires_on
 */
OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.prototype['expires_on'] = undefined;

/**
 * Date formatted as yyyy-mm-dd
 * @member {String} issued_on
 */
OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.prototype['issued_on'] = undefined;

/**
 * <span style=\"color:#e95f6a;\">required if identity_document is provided</span>
 * @member {String} number
 */
OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.prototype['number'] = undefined;

/**
 * <span style=\"color:#e95f6a;\">required if identity_document is provided</span>  One of `PASSPORT`, `DRIVING_LICENCE`, `NATIONAL_ID_CARD`
 * @member {module:model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.TypeEnum} type
 */
OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
OpenapiPayoutCreateRequestSenderIndividualIdentityDocument['TypeEnum'] = {

    /**
     * value: "PASSPORT"
     * @const
     */
    "PASSPORT": "PASSPORT",

    /**
     * value: "DRIVING_LICENCE"
     * @const
     */
    "DRIVING_LICENCE": "DRIVING_LICENCE",

    /**
     * value: "NATIONAL_ID_CARD"
     * @const
     */
    "NATIONAL_ID_CARD": "NATIONAL_ID_CARD"
};



export default OpenapiPayoutCreateRequestSenderIndividualIdentityDocument;
