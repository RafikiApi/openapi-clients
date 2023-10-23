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
import WalletsGet200Response from '../model/WalletsGet200Response';

/**
* Wallet service.
* @module rafikigen/WalletApi
* @version 1
*/
export default class WalletApi {

    /**
    * Constructs a new WalletApi. 
    * @alias module:rafikigen/WalletApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the walletsGet operation.
     * @callback module:rafikigen/WalletApi~walletsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletsGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List
     * Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.
     * @param {module:rafikigen/WalletApi~walletsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/WalletsGet200Response}
     */
    walletsGet(callback) {
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
      let returnType = WalletsGet200Response;
      return this.apiClient.callApi(
        '/wallets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
