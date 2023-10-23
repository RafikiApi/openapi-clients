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
import OpenapiResponseBodySuccessNoMeta from './OpenapiResponseBodySuccessNoMeta';

/**
 * The PayoutsIdGet200Response model module.
 * @module model/PayoutsIdGet200Response
 * @version 1
 */
class PayoutsIdGet200Response {
    /**
     * Constructs a new <code>PayoutsIdGet200Response</code>.
     * @alias module:model/PayoutsIdGet200Response
     * @implements module:model/OpenapiResponseBodySuccessNoMeta
     */
    constructor() { 
        OpenapiResponseBodySuccessNoMeta.initialize(this);
        PayoutsIdGet200Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PayoutsIdGet200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PayoutsIdGet200Response} obj Optional instance to populate.
     * @return {module:model/PayoutsIdGet200Response} The populated <code>PayoutsIdGet200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PayoutsIdGet200Response();
            OpenapiResponseBodySuccessNoMeta.constructFromObject(data, obj);

            if (data.hasOwnProperty('data')) {
                obj['data'] = OpenapiPayoutGetResponse.constructFromObject(data['data']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PayoutsIdGet200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PayoutsIdGet200Response</code>.
     */
    static validateJSON(data) {
        // validate the optional field `data`
        if (data['data']) { // data not null
          OpenapiPayoutGetResponse.validateJSON(data['data']);
        }

        return true;
    }


}



/**
 * @member {module:model/OpenapiPayoutGetResponse} data
 */
PayoutsIdGet200Response.prototype['data'] = undefined;


// Implement OpenapiResponseBodySuccessNoMeta interface:
/**
 * @member {Object} data
 */
OpenapiResponseBodySuccessNoMeta.prototype['data'] = undefined;




export default PayoutsIdGet200Response;

