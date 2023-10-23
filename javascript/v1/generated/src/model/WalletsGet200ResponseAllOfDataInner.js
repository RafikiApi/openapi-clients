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
 * The WalletsGet200ResponseAllOfDataInner model module.
 * @module model/WalletsGet200ResponseAllOfDataInner
 * @version 1
 */
class WalletsGet200ResponseAllOfDataInner {
    /**
     * Constructs a new <code>WalletsGet200ResponseAllOfDataInner</code>.
     * @alias module:model/WalletsGet200ResponseAllOfDataInner
     */
    constructor() { 
        
        WalletsGet200ResponseAllOfDataInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>WalletsGet200ResponseAllOfDataInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/WalletsGet200ResponseAllOfDataInner} obj Optional instance to populate.
     * @return {module:model/WalletsGet200ResponseAllOfDataInner} The populated <code>WalletsGet200ResponseAllOfDataInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WalletsGet200ResponseAllOfDataInner();

            if (data.hasOwnProperty('available')) {
                obj['available'] = ApiClient.convertToType(data['available'], 'String');
            }
            if (data.hasOwnProperty('balance')) {
                obj['balance'] = ApiClient.convertToType(data['balance'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>WalletsGet200ResponseAllOfDataInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>WalletsGet200ResponseAllOfDataInner</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['available'] && !(typeof data['available'] === 'string' || data['available'] instanceof String)) {
            throw new Error("Expected the field `available` to be a primitive type in the JSON string but got " + data['available']);
        }
        // ensure the json data is a string
        if (data['balance'] && !(typeof data['balance'] === 'string' || data['balance'] instanceof String)) {
            throw new Error("Expected the field `balance` to be a primitive type in the JSON string but got " + data['balance']);
        }
        // ensure the json data is a string
        if (data['currency'] && !(typeof data['currency'] === 'string' || data['currency'] instanceof String)) {
            throw new Error("Expected the field `currency` to be a primitive type in the JSON string but got " + data['currency']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }

        return true;
    }


}



/**
 * The actual available balance
 * @member {String} available
 */
WalletsGet200ResponseAllOfDataInner.prototype['available'] = undefined;

/**
 * The total balance yet to settle
 * @member {String} balance
 */
WalletsGet200ResponseAllOfDataInner.prototype['balance'] = undefined;

/**
 * The ISO 4217 currency code associated with the wallet
 * @member {String} currency
 */
WalletsGet200ResponseAllOfDataInner.prototype['currency'] = undefined;

/**
 * @member {String} id
 */
WalletsGet200ResponseAllOfDataInner.prototype['id'] = undefined;






export default WalletsGet200ResponseAllOfDataInner;

