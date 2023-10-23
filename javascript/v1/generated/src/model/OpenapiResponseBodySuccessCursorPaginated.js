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
import OpenapiResponseBodySuccessCursorPaginatedMeta from './OpenapiResponseBodySuccessCursorPaginatedMeta';

/**
 * The OpenapiResponseBodySuccessCursorPaginated model module.
 * @module model/OpenapiResponseBodySuccessCursorPaginated
 * @version 1
 */
class OpenapiResponseBodySuccessCursorPaginated {
    /**
     * Constructs a new <code>OpenapiResponseBodySuccessCursorPaginated</code>.
     * @alias module:model/OpenapiResponseBodySuccessCursorPaginated
     */
    constructor() { 
        
        OpenapiResponseBodySuccessCursorPaginated.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiResponseBodySuccessCursorPaginated</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiResponseBodySuccessCursorPaginated} obj Optional instance to populate.
     * @return {module:model/OpenapiResponseBodySuccessCursorPaginated} The populated <code>OpenapiResponseBodySuccessCursorPaginated</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiResponseBodySuccessCursorPaginated();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Object]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = OpenapiResponseBodySuccessCursorPaginatedMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiResponseBodySuccessCursorPaginated</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiResponseBodySuccessCursorPaginated</code>.
     */
    static validateJSON(data) {
        // ensure the json data is an array
        if (!Array.isArray(data['data'])) {
            throw new Error("Expected the field `data` to be an array in the JSON data but got " + data['data']);
        }
        // validate the optional field `meta`
        if (data['meta']) { // data not null
          OpenapiResponseBodySuccessCursorPaginatedMeta.validateJSON(data['meta']);
        }

        return true;
    }


}



/**
 * @member {Array.<Object>} data
 */
OpenapiResponseBodySuccessCursorPaginated.prototype['data'] = undefined;

/**
 * @member {module:model/OpenapiResponseBodySuccessCursorPaginatedMeta} meta
 */
OpenapiResponseBodySuccessCursorPaginated.prototype['meta'] = undefined;






export default OpenapiResponseBodySuccessCursorPaginated;

