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
import BanksGet200Response from '../model/BanksGet200Response';
import OpenapiResponseBodyInternalServerError from '../model/OpenapiResponseBodyInternalServerError';

/**
* Bank service.
* @module rafikigen/BankApi
* @version 1
*/
export default class BankApi {

    /**
    * Constructs a new BankApi. 
    * @alias module:rafikigen/BankApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the banksGet operation.
     * @callback module:rafikigen/BankApi~banksGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BanksGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List
     * Within the scope of this API, the \"Bank\" resource serves the purpose of identifying the financial institutions that own payment accounts.  This endpoint enables you to retrieve the list of banks provided by our API. 
     * @param {module:rafikigen/BankApi~banksGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BanksGet200Response}
     */
    banksGet(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = BanksGet200Response;
      return this.apiClient.callApi(
        '/banks', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
