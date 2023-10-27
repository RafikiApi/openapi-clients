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
import OpenapiPaymentAccountListResponseMetaPagingCursors from './OpenapiPaymentAccountListResponseMetaPagingCursors';

/**
 * The OpenapiPaymentAccountListResponseMetaPaging model module.
 * @module model/OpenapiPaymentAccountListResponseMetaPaging
 * @version 1
 */
class OpenapiPaymentAccountListResponseMetaPaging {
    /**
     * Constructs a new <code>OpenapiPaymentAccountListResponseMetaPaging</code>.
     * @alias module:model/OpenapiPaymentAccountListResponseMetaPaging
     */
    constructor() { 
        
        OpenapiPaymentAccountListResponseMetaPaging.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPaymentAccountListResponseMetaPaging</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPaymentAccountListResponseMetaPaging} obj Optional instance to populate.
     * @return {module:model/OpenapiPaymentAccountListResponseMetaPaging} The populated <code>OpenapiPaymentAccountListResponseMetaPaging</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPaymentAccountListResponseMetaPaging();

            if (data.hasOwnProperty('cursors')) {
                obj['cursors'] = OpenapiPaymentAccountListResponseMetaPagingCursors.constructFromObject(data['cursors']);
            }
            if (data.hasOwnProperty('next')) {
                obj['next'] = ApiClient.convertToType(data['next'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPaymentAccountListResponseMetaPaging</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPaymentAccountListResponseMetaPaging</code>.
     */
    static validateJSON(data) {
        // validate the optional field `cursors`
        if (data['cursors']) { // data not null
          OpenapiPaymentAccountListResponseMetaPagingCursors.validateJSON(data['cursors']);
        }
        // ensure the json data is a string
        if (data['next'] && !(typeof data['next'] === 'string' || data['next'] instanceof String)) {
            throw new Error("Expected the field `next` to be a primitive type in the JSON string but got " + data['next']);
        }

        return true;
    }


}



/**
 * @member {module:model/OpenapiPaymentAccountListResponseMetaPagingCursors} cursors
 */
OpenapiPaymentAccountListResponseMetaPaging.prototype['cursors'] = undefined;

/**
 * @member {String} next
 */
OpenapiPaymentAccountListResponseMetaPaging.prototype['next'] = undefined;






export default OpenapiPaymentAccountListResponseMetaPaging;

