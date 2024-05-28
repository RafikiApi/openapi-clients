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
 * The OpenapiLookupGetResponseHolder model module.
 * @module model/OpenapiLookupGetResponseHolder
 * @version 1
 */
class OpenapiLookupGetResponseHolder {
    /**
     * Constructs a new <code>OpenapiLookupGetResponseHolder</code>.
     * @alias module:model/OpenapiLookupGetResponseHolder
     */
    constructor() { 
        
        OpenapiLookupGetResponseHolder.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiLookupGetResponseHolder</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiLookupGetResponseHolder} obj Optional instance to populate.
     * @return {module:model/OpenapiLookupGetResponseHolder} The populated <code>OpenapiLookupGetResponseHolder</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiLookupGetResponseHolder();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiLookupGetResponseHolder</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiLookupGetResponseHolder</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}



/**
 * The payment account owner's registered full name at the banking entity
 * @member {String} name
 */
OpenapiLookupGetResponseHolder.prototype['name'] = undefined;






export default OpenapiLookupGetResponseHolder;
