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
import OpenapiPayoutCreateResponseAmount from './OpenapiPayoutCreateResponseAmount';
import OpenapiPayoutCreateResponseSender from './OpenapiPayoutCreateResponseSender';
import OpenapiPayoutCreateResponseState from './OpenapiPayoutCreateResponseState';

/**
 * The OpenapiPayoutGetResponse model module.
 * @module model/OpenapiPayoutGetResponse
 * @version 1
 */
class OpenapiPayoutGetResponse {
    /**
     * Constructs a new <code>OpenapiPayoutGetResponse</code>.
     * @alias module:model/OpenapiPayoutGetResponse
     */
    constructor() { 
        
        OpenapiPayoutGetResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPayoutGetResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPayoutGetResponse} obj Optional instance to populate.
     * @return {module:model/OpenapiPayoutGetResponse} The populated <code>OpenapiPayoutGetResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPayoutGetResponse();

            if (data.hasOwnProperty('amount')) {
                obj['amount'] = OpenapiPayoutCreateResponseAmount.constructFromObject(data['amount']);
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('payment_account_id')) {
                obj['payment_account_id'] = ApiClient.convertToType(data['payment_account_id'], 'String');
            }
            if (data.hasOwnProperty('receipt')) {
                obj['receipt'] = ApiClient.convertToType(data['receipt'], 'String');
            }
            if (data.hasOwnProperty('sender')) {
                obj['sender'] = OpenapiPayoutCreateResponseSender.constructFromObject(data['sender']);
            }
            if (data.hasOwnProperty('state')) {
                obj['state'] = OpenapiPayoutCreateResponseState.constructFromObject(data['state']);
            }
            if (data.hasOwnProperty('wallet_id')) {
                obj['wallet_id'] = ApiClient.convertToType(data['wallet_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPayoutGetResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPayoutGetResponse</code>.
     */
    static validateJSON(data) {
        // validate the optional field `amount`
        if (data['amount']) { // data not null
          OpenapiPayoutCreateResponseAmount.validateJSON(data['amount']);
        }
        // ensure the json data is a string
        if (data['created_at'] && !(typeof data['created_at'] === 'string' || data['created_at'] instanceof String)) {
            throw new Error("Expected the field `created_at` to be a primitive type in the JSON string but got " + data['created_at']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['payment_account_id'] && !(typeof data['payment_account_id'] === 'string' || data['payment_account_id'] instanceof String)) {
            throw new Error("Expected the field `payment_account_id` to be a primitive type in the JSON string but got " + data['payment_account_id']);
        }
        // ensure the json data is a string
        if (data['receipt'] && !(typeof data['receipt'] === 'string' || data['receipt'] instanceof String)) {
            throw new Error("Expected the field `receipt` to be a primitive type in the JSON string but got " + data['receipt']);
        }
        // validate the optional field `sender`
        if (data['sender']) { // data not null
          OpenapiPayoutCreateResponseSender.validateJSON(data['sender']);
        }
        // validate the optional field `state`
        if (data['state']) { // data not null
          OpenapiPayoutCreateResponseState.validateJSON(data['state']);
        }
        // ensure the json data is a string
        if (data['wallet_id'] && !(typeof data['wallet_id'] === 'string' || data['wallet_id'] instanceof String)) {
            throw new Error("Expected the field `wallet_id` to be a primitive type in the JSON string but got " + data['wallet_id']);
        }

        return true;
    }


}



/**
 * @member {module:model/OpenapiPayoutCreateResponseAmount} amount
 */
OpenapiPayoutGetResponse.prototype['amount'] = undefined;

/**
 * @member {String} created_at
 */
OpenapiPayoutGetResponse.prototype['created_at'] = undefined;

/**
 * The payout unique identifier
 * @member {String} id
 */
OpenapiPayoutGetResponse.prototype['id'] = undefined;

/**
 * The recipient payment account receiving funds
 * @member {String} payment_account_id
 */
OpenapiPayoutGetResponse.prototype['payment_account_id'] = undefined;

/**
 * The reference provided by the recipient account's actual bank or telco on a successful payout.  > ⚠️ > It's important to be aware that this information might not be accessible for every payout. If there's no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.
 * @member {String} receipt
 */
OpenapiPayoutGetResponse.prototype['receipt'] = undefined;

/**
 * @member {module:model/OpenapiPayoutCreateResponseSender} sender
 */
OpenapiPayoutGetResponse.prototype['sender'] = undefined;

/**
 * @member {module:model/OpenapiPayoutCreateResponseState} state
 */
OpenapiPayoutGetResponse.prototype['state'] = undefined;

/**
 * The wallet ID from which the money will disburse
 * @member {String} wallet_id
 */
OpenapiPayoutGetResponse.prototype['wallet_id'] = undefined;






export default OpenapiPayoutGetResponse;

