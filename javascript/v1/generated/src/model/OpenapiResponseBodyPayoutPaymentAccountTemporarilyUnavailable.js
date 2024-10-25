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
 * The OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable model module.
 * @module model/OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable
 * @version 1
 */
class OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable {
    /**
     * Constructs a new <code>OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable</code>.
     * @alias module:model/OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable
     */
    constructor() { 
        
        OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable} obj Optional instance to populate.
     * @return {module:model/OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable} The populated <code>OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['code'] && !(typeof data['code'] === 'string' || data['code'] instanceof String)) {
            throw new Error("Expected the field `code` to be a primitive type in the JSON string but got " + data['code']);
        }
        // ensure the json data is a string
        if (data['message'] && !(typeof data['message'] === 'string' || data['message'] instanceof String)) {
            throw new Error("Expected the field `message` to be a primitive type in the JSON string but got " + data['message']);
        }

        return true;
    }


}



/**
 * `PAYOUT_BANK_TEMPORARILY_UNAVAILABLE`
 * @member {String} code
 */
OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable.prototype['code'] = undefined;

/**
 * E.g. \"Payout to this bank is not available.\"
 * @member {String} message
 */
OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable.prototype['message'] = undefined;






export default OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable;

