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
import OpenapiPayoutCreateRequest from '../model/OpenapiPayoutCreateRequest';
import OpenapiResponseBodyIdempotencyConflict from '../model/OpenapiResponseBodyIdempotencyConflict';
import OpenapiResponseBodyInternalServerError from '../model/OpenapiResponseBodyInternalServerError';
import OpenapiResponseBodyNotFound from '../model/OpenapiResponseBodyNotFound';
import OpenapiResponseBodyValidationFailed from '../model/OpenapiResponseBodyValidationFailed';
import OpenapiResponseBodyWalletInsufficientBalance from '../model/OpenapiResponseBodyWalletInsufficientBalance';
import PayoutsGet200Response from '../model/PayoutsGet200Response';
import PayoutsIdGet200Response from '../model/PayoutsIdGet200Response';
import PayoutsPost202Response from '../model/PayoutsPost202Response';

/**
* Payout service.
* @module rafikigen/PayoutApi
* @version 1
*/
export default class PayoutApi {

    /**
    * Constructs a new PayoutApi. 
    * @alias module:rafikigen/PayoutApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the payoutsGet operation.
     * @callback module:rafikigen/PayoutApi~payoutsGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PayoutsGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List
     * Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     
     * @param {Object} opts Optional parameters
     * @param {String} [createdAtFrom] Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information.
     * @param {String} [createdAtTo] Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information.
     * @param {Number} [pagingLimit] The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
     * @param {String} [pagingAfter] The base64 URL encoded cursor used to access the next set of paginated results
     * @param {module:rafikigen/PayoutApi~payoutsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PayoutsGet200Response}
     */
    payoutsGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'created_at_from': opts['createdAtFrom'],
        'created_at_to': opts['createdAtTo'],
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
      let returnType = PayoutsGet200Response;
      return this.apiClient.callApi(
        '/payouts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the payoutsIdGet operation.
     * @callback module:rafikigen/PayoutApi~payoutsIdGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PayoutsIdGet200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get
     * This endpoint enables the retrieval of a previously accepted payout using its unique ID (`pyt-xxx`). Its primary purpose is to periodically check for changes in the payout status. Currently, we do not provide webhooks, so this method serves as the only available option in such cases.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint.
     * @param {String} id The Payout ID (pyt-xxx)
     * @param {module:rafikigen/PayoutApi~payoutsIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PayoutsIdGet200Response}
     */
    payoutsIdGet(id, callback) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling payoutsIdGet");
      }

      let pathParams = {
        'id': id
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
      let returnType = PayoutsIdGet200Response;
      return this.apiClient.callApi(
        '/payouts/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the payoutsPost operation.
     * @callback module:rafikigen/PayoutApi~payoutsPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PayoutsPost202Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create
     * The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  > ℹ️ Lifecycle > > If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. > <br> > Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. > <br> > <details> >  <summary>Payout States</summary> > <br> >  <table> >    <thead> >        <tr> >            <th>State</th> >            <th>Description</th> >        </tr> >    </thead> >    <tbody> >        <tr> >            <th>⏳<br>PENDING</th> >            <th>Your payout has been accepted, and it is currently awaiting processing.</th> >        </tr> >        <tr> >           <th>🎉<br>SENT</th> >           <th>The payout has been successfully processed, and the intended recipient should have received the funds.</th> >        </tr> >        <tr> >           <th>🔙<br>REVERSED</th> >           <th>Upon reaching the \"SENT\" state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.</th> >        </tr> >        <tr> >           <th>🙅<br>CANCELLED</th> >           <th>If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.</th> >        </tr> >        <tr> >           <th>💔<br>FAILED</th> >           <th> >               The funds did not reach the intended recipient due to a failure. If the \"context\" property does not provide specific information about the reason for the failure, please contact our customer support for assistance. >           </th> >        </tr> >    </tbody> >  </table> >  </details>  > ⚠️ Compliance requirements >  > Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. > <br> > We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process for you, the table below outlines the specific requirements for each country we offer payout support, streamlining the compliance process. > <br> > <details> <summary>Requirements</summary> <table>     <thead>         <tr>             <th>Field</th>             <th>KE 🇰🇪</th>         </tr>     </thead>     <tbody>         <tr>             <td>amount.value</td>             <td>                 <table>                     <thead>                          <tr>                             <th>Min</th>                             <th>Max</th>                         </tr>                     </thead>                     <tbody>                         <tr>                             <td>140 KES</td>                             <td>500,000 KES</td> <!-- Kenya -->                         </tr>                     </tbody>                 </table>             </td> <!-- Kenya -->         </tr>         <tr>             <td>sender.type</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.name</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line1</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line2</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line3</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.city</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.postal_code</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.country</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required with INDIVIDUAL sender's type</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.type</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.country</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.number</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.issued_on</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.expires_on</td>             <td>-</td> <!-- Kenya -->         </tr>     </tbody> </table> </details>
     * @param {String} xIdempotencyKey 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
     * @param {module:model/OpenapiPayoutCreateRequest} openapiPayoutCreateRequest The payout
     * @param {module:rafikigen/PayoutApi~payoutsPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PayoutsPost202Response}
     */
    payoutsPost(xIdempotencyKey, openapiPayoutCreateRequest, callback) {
      let postBody = openapiPayoutCreateRequest;
      // verify the required parameter 'xIdempotencyKey' is set
      if (xIdempotencyKey === undefined || xIdempotencyKey === null) {
        throw new Error("Missing the required parameter 'xIdempotencyKey' when calling payoutsPost");
      }
      // verify the required parameter 'openapiPayoutCreateRequest' is set
      if (openapiPayoutCreateRequest === undefined || openapiPayoutCreateRequest === null) {
        throw new Error("Missing the required parameter 'openapiPayoutCreateRequest' when calling payoutsPost");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'X-Idempotency-Key': xIdempotencyKey
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = PayoutsPost202Response;
      return this.apiClient.callApi(
        '/payouts', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
