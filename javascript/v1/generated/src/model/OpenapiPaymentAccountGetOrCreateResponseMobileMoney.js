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
 * The OpenapiPaymentAccountGetOrCreateResponseMobileMoney model module.
 * @module model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney
 * @version 1
 */
class OpenapiPaymentAccountGetOrCreateResponseMobileMoney {
    /**
     * Constructs a new <code>OpenapiPaymentAccountGetOrCreateResponseMobileMoney</code>.
     * @alias module:model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney
     */
    constructor() { 
        
        OpenapiPaymentAccountGetOrCreateResponseMobileMoney.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPaymentAccountGetOrCreateResponseMobileMoney</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney} obj Optional instance to populate.
     * @return {module:model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney} The populated <code>OpenapiPaymentAccountGetOrCreateResponseMobileMoney</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPaymentAccountGetOrCreateResponseMobileMoney();

            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'String');
            }
            if (data.hasOwnProperty('operator')) {
                obj['operator'] = ApiClient.convertToType(data['operator'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPaymentAccountGetOrCreateResponseMobileMoney</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPaymentAccountGetOrCreateResponseMobileMoney</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['number'] && !(typeof data['number'] === 'string' || data['number'] instanceof String)) {
            throw new Error("Expected the field `number` to be a primitive type in the JSON string but got " + data['number']);
        }
        // ensure the json data is a string
        if (data['operator'] && !(typeof data['operator'] === 'string' || data['operator'] instanceof String)) {
            throw new Error("Expected the field `operator` to be a primitive type in the JSON string but got " + data['operator']);
        }

        return true;
    }


}



/**
 * @member {String} number
 */
OpenapiPaymentAccountGetOrCreateResponseMobileMoney.prototype['number'] = undefined;

/**
 * @member {module:model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney.OperatorEnum} operator
 */
OpenapiPaymentAccountGetOrCreateResponseMobileMoney.prototype['operator'] = undefined;





/**
 * Allowed values for the <code>operator</code> property.
 * @enum {String}
 * @readonly
 */
OpenapiPaymentAccountGetOrCreateResponseMobileMoney['OperatorEnum'] = {

    /**
     * value: "SAFARICOM"
     * @const
     */
    "SAFARICOM": "SAFARICOM",

    /**
     * value: "AIRTEL"
     * @const
     */
    "AIRTEL": "AIRTEL"
};



export default OpenapiPaymentAccountGetOrCreateResponseMobileMoney;
