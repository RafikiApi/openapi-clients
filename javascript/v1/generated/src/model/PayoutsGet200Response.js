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
import OpenapiPayoutGetResponse from './OpenapiPayoutGetResponse';
import OpenapiPayoutListResponseMeta from './OpenapiPayoutListResponseMeta';
import OpenapiResponseBodySuccessCollection from './OpenapiResponseBodySuccessCollection';

/**
 * The PayoutsGet200Response model module.
 * @module model/PayoutsGet200Response
 * @version 1
 */
class PayoutsGet200Response {
    /**
     * Constructs a new <code>PayoutsGet200Response</code>.
     * @alias module:model/PayoutsGet200Response
     * @implements module:model/OpenapiResponseBodySuccessCollection
     */
    constructor() { 
        OpenapiResponseBodySuccessCollection.initialize(this);
        PayoutsGet200Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PayoutsGet200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PayoutsGet200Response} obj Optional instance to populate.
     * @return {module:model/PayoutsGet200Response} The populated <code>PayoutsGet200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PayoutsGet200Response();
            OpenapiResponseBodySuccessCollection.constructFromObject(data, obj);

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [OpenapiPayoutGetResponse]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = OpenapiPayoutListResponseMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PayoutsGet200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PayoutsGet200Response</code>.
     */
    static validateJSON(data) {
        if (data['data']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['data'])) {
                throw new Error("Expected the field `data` to be an array in the JSON data but got " + data['data']);
            }
            // validate the optional field `data` (array)
            for (const item of data['data']) {
                OpenapiPayoutGetResponse.validateJSON(item);
            };
        }
        // validate the optional field `meta`
        if (data['meta']) { // data not null
          OpenapiPayoutListResponseMeta.validateJSON(data['meta']);
        }

        return true;
    }


}



/**
 * @member {Array.<module:model/OpenapiPayoutGetResponse>} data
 */
PayoutsGet200Response.prototype['data'] = undefined;

/**
 * @member {module:model/OpenapiPayoutListResponseMeta} meta
 */
PayoutsGet200Response.prototype['meta'] = undefined;


// Implement OpenapiResponseBodySuccessCollection interface:
/**
 * @member {Array.<Object>} data
 */
OpenapiResponseBodySuccessCollection.prototype['data'] = undefined;
/**
 * @member {Object} meta
 */
OpenapiResponseBodySuccessCollection.prototype['meta'] = undefined;




export default PayoutsGet200Response;

