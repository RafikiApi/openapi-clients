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


import ApiClient from './ApiClient';
import BanksGet200Response from './model/BanksGet200Response';
import BanksGet200ResponseAllOfDataInner from './model/BanksGet200ResponseAllOfDataInner';
import OpenapiPaymentAccountGetOrCreateRequest from './model/OpenapiPaymentAccountGetOrCreateRequest';
import OpenapiPaymentAccountGetOrCreateRequestBankAccount from './model/OpenapiPaymentAccountGetOrCreateRequestBankAccount';
import OpenapiPaymentAccountGetOrCreateRequestHolder from './model/OpenapiPaymentAccountGetOrCreateRequestHolder';
import OpenapiPaymentAccountGetOrCreateRequestMobileMoney from './model/OpenapiPaymentAccountGetOrCreateRequestMobileMoney';
import OpenapiPaymentAccountGetOrCreateResponse from './model/OpenapiPaymentAccountGetOrCreateResponse';
import OpenapiPaymentAccountGetOrCreateResponseBankAccount from './model/OpenapiPaymentAccountGetOrCreateResponseBankAccount';
import OpenapiPaymentAccountGetOrCreateResponseHolder from './model/OpenapiPaymentAccountGetOrCreateResponseHolder';
import OpenapiPaymentAccountGetOrCreateResponseMobileMoney from './model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney';
import OpenapiPaymentAccountListResponseMeta from './model/OpenapiPaymentAccountListResponseMeta';
import OpenapiPaymentAccountListResponseMetaPaging from './model/OpenapiPaymentAccountListResponseMetaPaging';
import OpenapiPaymentAccountListResponseMetaPagingCursors from './model/OpenapiPaymentAccountListResponseMetaPagingCursors';
import OpenapiPayoutCreateRequest from './model/OpenapiPayoutCreateRequest';
import OpenapiPayoutCreateRequestAmount from './model/OpenapiPayoutCreateRequestAmount';
import OpenapiPayoutCreateRequestSender from './model/OpenapiPayoutCreateRequestSender';
import OpenapiPayoutCreateRequestSenderAddress from './model/OpenapiPayoutCreateRequestSenderAddress';
import OpenapiPayoutCreateRequestSenderIndividual from './model/OpenapiPayoutCreateRequestSenderIndividual';
import OpenapiPayoutCreateRequestSenderIndividualIdentityDocument from './model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument';
import OpenapiPayoutCreateResponse from './model/OpenapiPayoutCreateResponse';
import OpenapiPayoutCreateResponseAmount from './model/OpenapiPayoutCreateResponseAmount';
import OpenapiPayoutCreateResponseSender from './model/OpenapiPayoutCreateResponseSender';
import OpenapiPayoutCreateResponseSenderAddress from './model/OpenapiPayoutCreateResponseSenderAddress';
import OpenapiPayoutCreateResponseSenderIndividual from './model/OpenapiPayoutCreateResponseSenderIndividual';
import OpenapiPayoutCreateResponseSenderIndividualIdentityDocument from './model/OpenapiPayoutCreateResponseSenderIndividualIdentityDocument';
import OpenapiPayoutCreateResponseState from './model/OpenapiPayoutCreateResponseState';
import OpenapiPayoutGetResponse from './model/OpenapiPayoutGetResponse';
import OpenapiPayoutListResponseMeta from './model/OpenapiPayoutListResponseMeta';
import OpenapiPayoutListResponseMetaPaging from './model/OpenapiPayoutListResponseMetaPaging';
import OpenapiPayoutListResponseMetaPagingCursors from './model/OpenapiPayoutListResponseMetaPagingCursors';
import OpenapiResponseBodyIdempotencyConflict from './model/OpenapiResponseBodyIdempotencyConflict';
import OpenapiResponseBodyInternalServerError from './model/OpenapiResponseBodyInternalServerError';
import OpenapiResponseBodyNotFound from './model/OpenapiResponseBodyNotFound';
import OpenapiResponseBodySuccessCollection from './model/OpenapiResponseBodySuccessCollection';
import OpenapiResponseBodySuccessCollectionNoMeta from './model/OpenapiResponseBodySuccessCollectionNoMeta';
import OpenapiResponseBodySuccessNoMeta from './model/OpenapiResponseBodySuccessNoMeta';
import OpenapiResponseBodyValidationFailed from './model/OpenapiResponseBodyValidationFailed';
import OpenapiResponseBodyValidationFailedErrors from './model/OpenapiResponseBodyValidationFailedErrors';
import OpenapiResponseBodyWalletInsufficientBalance from './model/OpenapiResponseBodyWalletInsufficientBalance';
import PaymentAccountsGet200Response from './model/PaymentAccountsGet200Response';
import PaymentAccountsPost200Response from './model/PaymentAccountsPost200Response';
import PayoutsGet200Response from './model/PayoutsGet200Response';
import PayoutsIdGet200Response from './model/PayoutsIdGet200Response';
import PayoutsPost202Response from './model/PayoutsPost202Response';
import WalletsGet200Response from './model/WalletsGet200Response';
import WalletsGet200ResponseAllOfDataInner from './model/WalletsGet200ResponseAllOfDataInner';
import BankApi from './rafikigen/BankApi';
import PaymentAccountApi from './rafikigen/PaymentAccountApi';
import PayoutApi from './rafikigen/PayoutApi';
import WalletApi from './rafikigen/WalletApi';


/**
* JS API client generated by OpenAPI Generator.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var Resources = require('index'); // See note below*.
* var xxxSvc = new Resources.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new Resources.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new Resources.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new Resources.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The BanksGet200Response model constructor.
     * @property {module:model/BanksGet200Response}
     */
    BanksGet200Response,

    /**
     * The BanksGet200ResponseAllOfDataInner model constructor.
     * @property {module:model/BanksGet200ResponseAllOfDataInner}
     */
    BanksGet200ResponseAllOfDataInner,

    /**
     * The OpenapiPaymentAccountGetOrCreateRequest model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateRequest}
     */
    OpenapiPaymentAccountGetOrCreateRequest,

    /**
     * The OpenapiPaymentAccountGetOrCreateRequestBankAccount model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateRequestBankAccount}
     */
    OpenapiPaymentAccountGetOrCreateRequestBankAccount,

    /**
     * The OpenapiPaymentAccountGetOrCreateRequestHolder model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateRequestHolder}
     */
    OpenapiPaymentAccountGetOrCreateRequestHolder,

    /**
     * The OpenapiPaymentAccountGetOrCreateRequestMobileMoney model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateRequestMobileMoney}
     */
    OpenapiPaymentAccountGetOrCreateRequestMobileMoney,

    /**
     * The OpenapiPaymentAccountGetOrCreateResponse model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateResponse}
     */
    OpenapiPaymentAccountGetOrCreateResponse,

    /**
     * The OpenapiPaymentAccountGetOrCreateResponseBankAccount model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateResponseBankAccount}
     */
    OpenapiPaymentAccountGetOrCreateResponseBankAccount,

    /**
     * The OpenapiPaymentAccountGetOrCreateResponseHolder model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateResponseHolder}
     */
    OpenapiPaymentAccountGetOrCreateResponseHolder,

    /**
     * The OpenapiPaymentAccountGetOrCreateResponseMobileMoney model constructor.
     * @property {module:model/OpenapiPaymentAccountGetOrCreateResponseMobileMoney}
     */
    OpenapiPaymentAccountGetOrCreateResponseMobileMoney,

    /**
     * The OpenapiPaymentAccountListResponseMeta model constructor.
     * @property {module:model/OpenapiPaymentAccountListResponseMeta}
     */
    OpenapiPaymentAccountListResponseMeta,

    /**
     * The OpenapiPaymentAccountListResponseMetaPaging model constructor.
     * @property {module:model/OpenapiPaymentAccountListResponseMetaPaging}
     */
    OpenapiPaymentAccountListResponseMetaPaging,

    /**
     * The OpenapiPaymentAccountListResponseMetaPagingCursors model constructor.
     * @property {module:model/OpenapiPaymentAccountListResponseMetaPagingCursors}
     */
    OpenapiPaymentAccountListResponseMetaPagingCursors,

    /**
     * The OpenapiPayoutCreateRequest model constructor.
     * @property {module:model/OpenapiPayoutCreateRequest}
     */
    OpenapiPayoutCreateRequest,

    /**
     * The OpenapiPayoutCreateRequestAmount model constructor.
     * @property {module:model/OpenapiPayoutCreateRequestAmount}
     */
    OpenapiPayoutCreateRequestAmount,

    /**
     * The OpenapiPayoutCreateRequestSender model constructor.
     * @property {module:model/OpenapiPayoutCreateRequestSender}
     */
    OpenapiPayoutCreateRequestSender,

    /**
     * The OpenapiPayoutCreateRequestSenderAddress model constructor.
     * @property {module:model/OpenapiPayoutCreateRequestSenderAddress}
     */
    OpenapiPayoutCreateRequestSenderAddress,

    /**
     * The OpenapiPayoutCreateRequestSenderIndividual model constructor.
     * @property {module:model/OpenapiPayoutCreateRequestSenderIndividual}
     */
    OpenapiPayoutCreateRequestSenderIndividual,

    /**
     * The OpenapiPayoutCreateRequestSenderIndividualIdentityDocument model constructor.
     * @property {module:model/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument}
     */
    OpenapiPayoutCreateRequestSenderIndividualIdentityDocument,

    /**
     * The OpenapiPayoutCreateResponse model constructor.
     * @property {module:model/OpenapiPayoutCreateResponse}
     */
    OpenapiPayoutCreateResponse,

    /**
     * The OpenapiPayoutCreateResponseAmount model constructor.
     * @property {module:model/OpenapiPayoutCreateResponseAmount}
     */
    OpenapiPayoutCreateResponseAmount,

    /**
     * The OpenapiPayoutCreateResponseSender model constructor.
     * @property {module:model/OpenapiPayoutCreateResponseSender}
     */
    OpenapiPayoutCreateResponseSender,

    /**
     * The OpenapiPayoutCreateResponseSenderAddress model constructor.
     * @property {module:model/OpenapiPayoutCreateResponseSenderAddress}
     */
    OpenapiPayoutCreateResponseSenderAddress,

    /**
     * The OpenapiPayoutCreateResponseSenderIndividual model constructor.
     * @property {module:model/OpenapiPayoutCreateResponseSenderIndividual}
     */
    OpenapiPayoutCreateResponseSenderIndividual,

    /**
     * The OpenapiPayoutCreateResponseSenderIndividualIdentityDocument model constructor.
     * @property {module:model/OpenapiPayoutCreateResponseSenderIndividualIdentityDocument}
     */
    OpenapiPayoutCreateResponseSenderIndividualIdentityDocument,

    /**
     * The OpenapiPayoutCreateResponseState model constructor.
     * @property {module:model/OpenapiPayoutCreateResponseState}
     */
    OpenapiPayoutCreateResponseState,

    /**
     * The OpenapiPayoutGetResponse model constructor.
     * @property {module:model/OpenapiPayoutGetResponse}
     */
    OpenapiPayoutGetResponse,

    /**
     * The OpenapiPayoutListResponseMeta model constructor.
     * @property {module:model/OpenapiPayoutListResponseMeta}
     */
    OpenapiPayoutListResponseMeta,

    /**
     * The OpenapiPayoutListResponseMetaPaging model constructor.
     * @property {module:model/OpenapiPayoutListResponseMetaPaging}
     */
    OpenapiPayoutListResponseMetaPaging,

    /**
     * The OpenapiPayoutListResponseMetaPagingCursors model constructor.
     * @property {module:model/OpenapiPayoutListResponseMetaPagingCursors}
     */
    OpenapiPayoutListResponseMetaPagingCursors,

    /**
     * The OpenapiResponseBodyIdempotencyConflict model constructor.
     * @property {module:model/OpenapiResponseBodyIdempotencyConflict}
     */
    OpenapiResponseBodyIdempotencyConflict,

    /**
     * The OpenapiResponseBodyInternalServerError model constructor.
     * @property {module:model/OpenapiResponseBodyInternalServerError}
     */
    OpenapiResponseBodyInternalServerError,

    /**
     * The OpenapiResponseBodyNotFound model constructor.
     * @property {module:model/OpenapiResponseBodyNotFound}
     */
    OpenapiResponseBodyNotFound,

    /**
     * The OpenapiResponseBodySuccessCollection model constructor.
     * @property {module:model/OpenapiResponseBodySuccessCollection}
     */
    OpenapiResponseBodySuccessCollection,

    /**
     * The OpenapiResponseBodySuccessCollectionNoMeta model constructor.
     * @property {module:model/OpenapiResponseBodySuccessCollectionNoMeta}
     */
    OpenapiResponseBodySuccessCollectionNoMeta,

    /**
     * The OpenapiResponseBodySuccessNoMeta model constructor.
     * @property {module:model/OpenapiResponseBodySuccessNoMeta}
     */
    OpenapiResponseBodySuccessNoMeta,

    /**
     * The OpenapiResponseBodyValidationFailed model constructor.
     * @property {module:model/OpenapiResponseBodyValidationFailed}
     */
    OpenapiResponseBodyValidationFailed,

    /**
     * The OpenapiResponseBodyValidationFailedErrors model constructor.
     * @property {module:model/OpenapiResponseBodyValidationFailedErrors}
     */
    OpenapiResponseBodyValidationFailedErrors,

    /**
     * The OpenapiResponseBodyWalletInsufficientBalance model constructor.
     * @property {module:model/OpenapiResponseBodyWalletInsufficientBalance}
     */
    OpenapiResponseBodyWalletInsufficientBalance,

    /**
     * The PaymentAccountsGet200Response model constructor.
     * @property {module:model/PaymentAccountsGet200Response}
     */
    PaymentAccountsGet200Response,

    /**
     * The PaymentAccountsPost200Response model constructor.
     * @property {module:model/PaymentAccountsPost200Response}
     */
    PaymentAccountsPost200Response,

    /**
     * The PayoutsGet200Response model constructor.
     * @property {module:model/PayoutsGet200Response}
     */
    PayoutsGet200Response,

    /**
     * The PayoutsIdGet200Response model constructor.
     * @property {module:model/PayoutsIdGet200Response}
     */
    PayoutsIdGet200Response,

    /**
     * The PayoutsPost202Response model constructor.
     * @property {module:model/PayoutsPost202Response}
     */
    PayoutsPost202Response,

    /**
     * The WalletsGet200Response model constructor.
     * @property {module:model/WalletsGet200Response}
     */
    WalletsGet200Response,

    /**
     * The WalletsGet200ResponseAllOfDataInner model constructor.
     * @property {module:model/WalletsGet200ResponseAllOfDataInner}
     */
    WalletsGet200ResponseAllOfDataInner,

    /**
    * The BankApi service constructor.
    * @property {module:rafikigen/BankApi}
    */
    BankApi,

    /**
    * The PaymentAccountApi service constructor.
    * @property {module:rafikigen/PaymentAccountApi}
    */
    PaymentAccountApi,

    /**
    * The PayoutApi service constructor.
    * @property {module:rafikigen/PayoutApi}
    */
    PayoutApi,

    /**
    * The WalletApi service constructor.
    * @property {module:rafikigen/WalletApi}
    */
    WalletApi
};
