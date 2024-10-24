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


import ApiClient from "../ApiClient";
import OpenapiPaymentAccountGetOrCreateRequest from '../model/OpenapiPaymentAccountGetOrCreateRequest';
import OpenapiResponseBodyInternalServerError from '../model/OpenapiResponseBodyInternalServerError';
import OpenapiResponseBodyValidationFailed from '../model/OpenapiResponseBodyValidationFailed';
import PaymentAccountsGet200Response from '../model/PaymentAccountsGet200Response';
import PaymentAccountsPost200Response from '../model/PaymentAccountsPost200Response';

/**
* PaymentAccount service.
* @module rafikigen/PaymentAccountApi
* @version 1
*/
export default class PaymentAccountApi {

    /**
    * Constructs a new PaymentAccountApi. 
    * @alias module:rafikigen/PaymentAccountApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the paymentAccountsGet operation.
     * @callback module:rafikigen/PaymentAccountApi~paymentAccountsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PaymentAccountsGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List
     * Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary. 
     * @param {Object} opts Optional parameters
     * @param {Number} [pagingLimit] The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
     * @param {String} [pagingAfter] The base64 URL encoded cursor used to access the next set of paginated results
     * @param {module:rafikigen/PaymentAccountApi~paymentAccountsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PaymentAccountsGet200Response}
     */
    paymentAccountsGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'paging_limit': opts['pagingLimit'],
        'paging_after': opts['pagingAfter']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = PaymentAccountsGet200Response;
      return this.apiClient.callApi(
        '/payment-accounts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the paymentAccountsPost operation.
     * @callback module:rafikigen/PaymentAccountApi~paymentAccountsPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PaymentAccountsPost200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get or create
     * A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.   | Country   | Operators                            | | --------- | ------------------------------------ | | 🇰🇪 KE     | SAFARICOM, AIRTEL                    | | 🇹🇿 TZ     | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | 🇷🇼 RW     | AIRTEL, MTN                          | | 🇬🇭 GH     | AIRTEL, MTN, TIGO, VODAFONE          | | 🇺🇬 UG     | AIRTEL, MTN                          | | 🇨🇮 CI     | MTN, ORANGE, MOOV                    | | 🇸🇳 SN     | ORANGE, FREE, EXPRESSO               | | 🇨🇲 CM     | MTN, ORANGE                          |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered.  We provide support for numerous banks in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks. 
     * @param {module:model/OpenapiPaymentAccountGetOrCreateRequest} openapiPaymentAccountGetOrCreateRequest The payment account
     * @param {module:rafikigen/PaymentAccountApi~paymentAccountsPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PaymentAccountsPost200Response}
     */
    paymentAccountsPost(openapiPaymentAccountGetOrCreateRequest, callback) {
      let postBody = openapiPaymentAccountGetOrCreateRequest;
      // verify the required parameter 'openapiPaymentAccountGetOrCreateRequest' is set
      if (openapiPaymentAccountGetOrCreateRequest === undefined || openapiPaymentAccountGetOrCreateRequest === null) {
        throw new Error("Missing the required parameter 'openapiPaymentAccountGetOrCreateRequest' when calling paymentAccountsPost");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = PaymentAccountsPost200Response;
      return this.apiClient.callApi(
        '/payment-accounts', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
