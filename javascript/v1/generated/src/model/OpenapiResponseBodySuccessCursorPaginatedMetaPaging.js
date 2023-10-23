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
import OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors from './OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors';

/**
 * The OpenapiResponseBodySuccessCursorPaginatedMetaPaging model module.
 * @module model/OpenapiResponseBodySuccessCursorPaginatedMetaPaging
 * @version 1
 */
class OpenapiResponseBodySuccessCursorPaginatedMetaPaging {
    /**
     * Constructs a new <code>OpenapiResponseBodySuccessCursorPaginatedMetaPaging</code>.
     * @alias module:model/OpenapiResponseBodySuccessCursorPaginatedMetaPaging
     */
    constructor() { 
        
        OpenapiResponseBodySuccessCursorPaginatedMetaPaging.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiResponseBodySuccessCursorPaginatedMetaPaging</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiResponseBodySuccessCursorPaginatedMetaPaging} obj Optional instance to populate.
     * @return {module:model/OpenapiResponseBodySuccessCursorPaginatedMetaPaging} The populated <code>OpenapiResponseBodySuccessCursorPaginatedMetaPaging</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiResponseBodySuccessCursorPaginatedMetaPaging();

            if (data.hasOwnProperty('cursors')) {
                obj['cursors'] = OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors.constructFromObject(data['cursors']);
            }
            if (data.hasOwnProperty('next')) {
                obj['next'] = ApiClient.convertToType(data['next'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiResponseBodySuccessCursorPaginatedMetaPaging</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiResponseBodySuccessCursorPaginatedMetaPaging</code>.
     */
    static validateJSON(data) {
        // validate the optional field `cursors`
        if (data['cursors']) { // data not null
          OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors.validateJSON(data['cursors']);
        }
        // ensure the json data is a string
        if (data['next'] && !(typeof data['next'] === 'string' || data['next'] instanceof String)) {
            throw new Error("Expected the field `next` to be a primitive type in the JSON string but got " + data['next']);
        }

        return true;
    }


}



/**
 * @member {module:model/OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors} cursors
 */
OpenapiResponseBodySuccessCursorPaginatedMetaPaging.prototype['cursors'] = undefined;

/**
 * @member {String} next
 */
OpenapiResponseBodySuccessCursorPaginatedMetaPaging.prototype['next'] = undefined;






export default OpenapiResponseBodySuccessCursorPaginatedMetaPaging;
