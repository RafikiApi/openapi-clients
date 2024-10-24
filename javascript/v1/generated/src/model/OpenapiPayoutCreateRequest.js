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
import OpenapiPaymentAccountGetOrCreateRequest from './OpenapiPaymentAccountGetOrCreateRequest';
import OpenapiPayoutCreateRequestAmount from './OpenapiPayoutCreateRequestAmount';
import OpenapiPayoutCreateRequestSender from './OpenapiPayoutCreateRequestSender';

/**
 * The OpenapiPayoutCreateRequest model module.
 * @module model/OpenapiPayoutCreateRequest
 * @version 1
 */
class OpenapiPayoutCreateRequest {
    /**
     * Constructs a new <code>OpenapiPayoutCreateRequest</code>.
     * @alias module:model/OpenapiPayoutCreateRequest
     */
    constructor() { 
        
        OpenapiPayoutCreateRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OpenapiPayoutCreateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenapiPayoutCreateRequest} obj Optional instance to populate.
     * @return {module:model/OpenapiPayoutCreateRequest} The populated <code>OpenapiPayoutCreateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenapiPayoutCreateRequest();

            if (data.hasOwnProperty('amount')) {
                obj['amount'] = OpenapiPayoutCreateRequestAmount.constructFromObject(data['amount']);
            }
            if (data.hasOwnProperty('custom_id')) {
                obj['custom_id'] = ApiClient.convertToType(data['custom_id'], 'String');
            }
            if (data.hasOwnProperty('on_behalf_of')) {
                obj['on_behalf_of'] = ApiClient.convertToType(data['on_behalf_of'], ['String']);
            }
            if (data.hasOwnProperty('payment_account')) {
                obj['payment_account'] = ApiClient.convertToType(data['payment_account'], OpenapiPaymentAccountGetOrCreateRequest);
            }
            if (data.hasOwnProperty('payment_account_id')) {
                obj['payment_account_id'] = ApiClient.convertToType(data['payment_account_id'], 'String');
            }
            if (data.hasOwnProperty('purpose')) {
                obj['purpose'] = ApiClient.convertToType(data['purpose'], 'String');
            }
            if (data.hasOwnProperty('sender')) {
                obj['sender'] = OpenapiPayoutCreateRequestSender.constructFromObject(data['sender']);
            }
            if (data.hasOwnProperty('wallet_id')) {
                obj['wallet_id'] = ApiClient.convertToType(data['wallet_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenapiPayoutCreateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenapiPayoutCreateRequest</code>.
     */
    static validateJSON(data) {
        // validate the optional field `amount`
        if (data['amount']) { // data not null
          OpenapiPayoutCreateRequestAmount.validateJSON(data['amount']);
        }
        // ensure the json data is a string
        if (data['custom_id'] && !(typeof data['custom_id'] === 'string' || data['custom_id'] instanceof String)) {
            throw new Error("Expected the field `custom_id` to be a primitive type in the JSON string but got " + data['custom_id']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['on_behalf_of'])) {
            throw new Error("Expected the field `on_behalf_of` to be an array in the JSON data but got " + data['on_behalf_of']);
        }
        // validate the optional field `payment_account`
        if (data['payment_account']) { // data not null
          OpenapiPaymentAccountGetOrCreateRequest.validateJSON(data['payment_account']);
        }
        // ensure the json data is a string
        if (data['payment_account_id'] && !(typeof data['payment_account_id'] === 'string' || data['payment_account_id'] instanceof String)) {
            throw new Error("Expected the field `payment_account_id` to be a primitive type in the JSON string but got " + data['payment_account_id']);
        }
        // ensure the json data is a string
        if (data['purpose'] && !(typeof data['purpose'] === 'string' || data['purpose'] instanceof String)) {
            throw new Error("Expected the field `purpose` to be a primitive type in the JSON string but got " + data['purpose']);
        }
        // validate the optional field `sender`
        if (data['sender']) { // data not null
          OpenapiPayoutCreateRequestSender.validateJSON(data['sender']);
        }
        // ensure the json data is a string
        if (data['wallet_id'] && !(typeof data['wallet_id'] === 'string' || data['wallet_id'] instanceof String)) {
            throw new Error("Expected the field `wallet_id` to be a primitive type in the JSON string but got " + data['wallet_id']);
        }

        return true;
    }


}



/**
 * @member {module:model/OpenapiPayoutCreateRequestAmount} amount
 */
OpenapiPayoutCreateRequest.prototype['amount'] = undefined;

/**
 * An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\".
 * @member {String} custom_id
 */
OpenapiPayoutCreateRequest.prototype['custom_id'] = undefined;

/**
 * @member {Array.<String>} on_behalf_of
 */
OpenapiPayoutCreateRequest.prototype['on_behalf_of'] = undefined;

/**
 * @member {module:model/OpenapiPaymentAccountGetOrCreateRequest} payment_account
 */
OpenapiPayoutCreateRequest.prototype['payment_account'] = undefined;

/**
 * <span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.
 * @member {String} payment_account_id
 */
OpenapiPayoutCreateRequest.prototype['payment_account_id'] = undefined;

/**
 * <span style=\"color:#e95f6a;\">required if payment_account country is GH,UG,EG,CI,SN or CM</span>  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  <ul> <li><code>GOODS_PURCHASE</code>: Payments made for buying physical or digital goods.</li> <li><code>SERVICES_PAYMENT</code>: Payments made for services rendered, including professional services, consulting, and freelance work.</li> <li><code>INVOICE_PAYMENT</code>: Payments made to settle invoices issued for goods or services.</li> <li><code>LOAN_REPAYMENT</code>: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.</li> <li><code>BILLS_PAYMENT</code>: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.</li> <li><code>SALARY_AND_WAGES</code>: Disbursements made to employees for their salaries and wages.</li> <li><code>P2P_TRANSFER</code>: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>REMITTANCE</code>: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.</li> <li><code>DONATION</code>: Payments made to charitable organizations or causes.</li> <li><code>GRANTS_AND_SCHOLARSHIPS</code>: Payments distributed as grants, scholarships, or other forms of financial aid.</li> <li><code>TRAVEL_AND_ACCOMMODATION</code>: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.</li> <li><code>TAX_PAYMENT</code>: Payments made for settling taxes and duties.</li> <li><code>INSURANCE_PREMIUM</code>: Payments made towards insurance policies, including health, auto, and life insurance.</li> </ul>
 * @member {module:model/OpenapiPayoutCreateRequest.PurposeEnum} purpose
 */
OpenapiPayoutCreateRequest.prototype['purpose'] = undefined;

/**
 * @member {module:model/OpenapiPayoutCreateRequestSender} sender
 */
OpenapiPayoutCreateRequest.prototype['sender'] = undefined;

/**
 * The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.
 * @member {String} wallet_id
 */
OpenapiPayoutCreateRequest.prototype['wallet_id'] = undefined;





/**
 * Allowed values for the <code>purpose</code> property.
 * @enum {String}
 * @readonly
 */
OpenapiPayoutCreateRequest['PurposeEnum'] = {

    /**
     * value: "GOODS_PURCHASE"
     * @const
     */
    "GOODS_PURCHASE": "GOODS_PURCHASE",

    /**
     * value: "SERVICES_PAYMENT"
     * @const
     */
    "SERVICES_PAYMENT": "SERVICES_PAYMENT",

    /**
     * value: "INVOICE_PAYMENT"
     * @const
     */
    "INVOICE_PAYMENT": "INVOICE_PAYMENT",

    /**
     * value: "LOAN_REPAYMENT"
     * @const
     */
    "LOAN_REPAYMENT": "LOAN_REPAYMENT",

    /**
     * value: "BILLS_PAYMENT"
     * @const
     */
    "BILLS_PAYMENT": "BILLS_PAYMENT",

    /**
     * value: "SALARY_AND_WAGES"
     * @const
     */
    "SALARY_AND_WAGES": "SALARY_AND_WAGES",

    /**
     * value: "P2P_TRANSFER"
     * @const
     */
    "P2P_TRANSFER": "P2P_TRANSFER",

    /**
     * value: "REMITTANCE"
     * @const
     */
    "REMITTANCE": "REMITTANCE",

    /**
     * value: "DONATION"
     * @const
     */
    "DONATION": "DONATION",

    /**
     * value: "GRANTS_AND_SCHOLARSHIPS"
     * @const
     */
    "GRANTS_AND_SCHOLARSHIPS": "GRANTS_AND_SCHOLARSHIPS",

    /**
     * value: "TRAVEL_AND_ACCOMMODATION"
     * @const
     */
    "TRAVEL_AND_ACCOMMODATION": "TRAVEL_AND_ACCOMMODATION",

    /**
     * value: "TAX_PAYMENT"
     * @const
     */
    "TAX_PAYMENT": "TAX_PAYMENT",

    /**
     * value: "INSURANCE_PREMIUM"
     * @const
     */
    "INSURANCE_PREMIUM": "INSURANCE_PREMIUM"
};



export default OpenapiPayoutCreateRequest;

