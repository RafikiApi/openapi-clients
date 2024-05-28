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
import LookupsAccountNumberGet200Response from '../model/LookupsAccountNumberGet200Response';
import OpenapiResponseBodyInternalServerError from '../model/OpenapiResponseBodyInternalServerError';
import OpenapiResponseBodyLookupAccountNotFound from '../model/OpenapiResponseBodyLookupAccountNotFound';
import OpenapiResponseBodyValidationFailed from '../model/OpenapiResponseBodyValidationFailed';

/**
* Lookup service.
* @module rafikigen/LookupApi
* @version 1
*/
export default class LookupApi {

    /**
    * Constructs a new LookupApi. 
    * @alias module:rafikigen/LookupApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the lookupsAccountNumberGet operation.
     * @callback module:rafikigen/LookupApi~lookupsAccountNumberGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LookupsAccountNumberGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get
     * The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 
     * @param {module:model/String} paymentAccountType The payment account type to lookup for
     * @param {String} accountNumber The account number, that is either the mobile money number or bank account number
     * @param {Object} opts Optional parameters
     * @param {String} [bankId] If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to
     * @param {module:rafikigen/LookupApi~lookupsAccountNumberGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/LookupsAccountNumberGet200Response}
     */
    lookupsAccountNumberGet(paymentAccountType, accountNumber, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'paymentAccountType' is set
      if (paymentAccountType === undefined || paymentAccountType === null) {
        throw new Error("Missing the required parameter 'paymentAccountType' when calling lookupsAccountNumberGet");
      }
      // verify the required parameter 'accountNumber' is set
      if (accountNumber === undefined || accountNumber === null) {
        throw new Error("Missing the required parameter 'accountNumber' when calling lookupsAccountNumberGet");
      }

      let pathParams = {
        'accountNumber': accountNumber
      };
      let queryParams = {
        'payment_account_type': paymentAccountType,
        'bank_id': opts['bankId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = LookupsAccountNumberGet200Response;
      return this.apiClient.callApi(
        '/lookups/{accountNumber}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
