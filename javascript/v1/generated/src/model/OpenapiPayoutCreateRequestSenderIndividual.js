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
import OpenapiPayoutCreateRequestSenderIndividualIdentityDocument from './OpenapiPayoutCreateRequestSenderIndividualIdentityDocument';

/**
 * The OpenapiPayoutCreateRequestSenderIndividual model module.
 * @module model/OpenapiPayoutCreateRequestSenderIndividual
 * @version 1
 */
class OpenapiPayoutCreateRequestSenderIndividual {
    /**
     * Constructs a new <code>OpenapiPayoutCreateRequestSenderIndividual</code>.
     * @alias module:model/OpenapiPayoutCreateRequestSenderIndividual
     */
    constructor() { 
        
        OpenapiPayoutCreateRequestSenderIndividual.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPayoutCreateRequestSenderIndividual</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPayoutCreateRequestSenderIndividual} obj Optional instance to populate.
     * @return {module:model/OpenapiPayoutCreateRequestSenderIndividual} The populated <code>OpenapiPayoutCreateRequestSenderIndividual</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPayoutCreateRequestSenderIndividual();

            if (data.hasOwnProperty('dob')) {
                obj['dob'] = ApiClient.convertToType(data['dob'], 'String');
            }
            if (data.hasOwnProperty('identity_document')) {
                obj['identity_document'] = OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.constructFromObject(data['identity_document']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPayoutCreateRequestSenderIndividual</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPayoutCreateRequestSenderIndividual</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['dob'] && !(typeof data['dob'] === 'string' || data['dob'] instanceof String)) {
            throw new Error("Expected the field `dob` to be a primitive type in the JSON string but got " + data['dob']);
        }
        // validate the optional field `identity_document`
        if (data['identity_document']) { // data not null
          OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.validateJSON(data['identity_document']);
        }

        return true;
    }


}



/**
 * Date of birth formatted as yyyy-mm-dd
 * @member {String} dob
 */
OpenapiPayoutCreateRequestSenderIndividual.prototype['dob'] = undefined;

/**
 * @member {module:model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument} identity_document
 */
OpenapiPayoutCreateRequestSenderIndividual.prototype['identity_document'] = undefined;






export default OpenapiPayoutCreateRequestSenderIndividual;

