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
import OpenapiPayoutListResponseMetaPaging from './OpenapiPayoutListResponseMetaPaging';

/**
 * The OpenapiPayoutListResponseMeta model module.
 * @module model/OpenapiPayoutListResponseMeta
 * @version 1
 */
class OpenapiPayoutListResponseMeta {
    /**
     * Constructs a new <code>OpenapiPayoutListResponseMeta</code>.
     * @alias module:model/OpenapiPayoutListResponseMeta
     */
    constructor() { 
        
        OpenapiPayoutListResponseMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPayoutListResponseMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPayoutListResponseMeta} obj Optional instance to populate.
     * @return {module:model/OpenapiPayoutListResponseMeta} The populated <code>OpenapiPayoutListResponseMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPayoutListResponseMeta();

            if (data.hasOwnProperty('paging')) {
                obj['paging'] = OpenapiPayoutListResponseMetaPaging.constructFromObject(data['paging']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPayoutListResponseMeta</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPayoutListResponseMeta</code>.
     */
    static validateJSON(data) {
        // validate the optional field `paging`
        if (data['paging']) { // data not null
          OpenapiPayoutListResponseMetaPaging.validateJSON(data['paging']);
        }

        return true;
    }


}



/**
 * @member {module:model/OpenapiPayoutListResponseMetaPaging} paging
 */
OpenapiPayoutListResponseMeta.prototype['paging'] = undefined;






export default OpenapiPayoutListResponseMeta;
