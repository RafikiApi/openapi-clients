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
 */


import localVarRequest from 'request';
import http from 'http';

/* tslint:disable:no-unused-locals */
import { LookupsAccountNumberGet200Response } from '../model/lookupsAccountNumberGet200Response';
import { OpenapiResponseBodyInternalServerError } from '../model/openapiResponseBodyInternalServerError';
import { OpenapiResponseBodyLookupAccountNotFound } from '../model/openapiResponseBodyLookupAccountNotFound';
import { OpenapiResponseBodyValidationFailed } from '../model/openapiResponseBodyValidationFailed';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';
import { HttpBasicAuth, HttpBearerAuth, ApiKeyAuth, OAuth } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://rest.sandbox.rafiki-api.com/v1';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum LookupApiApiKeys {
    Bearer,
}

export class LookupApi {
    protected _basePath = defaultBasePath;
    protected _defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
        'Bearer': new ApiKeyAuth('header', 'Authorization'),
    }

    protected interceptors: Interceptor[] = [];

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    set defaultHeaders(defaultHeaders: any) {
        this._defaultHeaders = defaultHeaders;
    }

    get defaultHeaders() {
        return this._defaultHeaders;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: LookupApiApiKeys, value: string) {
        (this.authentications as any)[LookupApiApiKeys[key]].apiKey = value;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 
     * @summary Get
     * @param paymentAccountType The payment account type to lookup for
     * @param accountNumber The account number, that is either the mobile money number or bank account number
     * @param bankId If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to
     */
    public async lookupsAccountNumberGet (paymentAccountType: 'MOBILE_MONEY' | 'BANK_ACCOUNT', accountNumber: string, bankId?: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: LookupsAccountNumberGet200Response;  }> {
        const localVarPath = this.basePath + '/lookups/{accountNumber}'
            .replace('{' + 'accountNumber' + '}', encodeURIComponent(String(accountNumber)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'paymentAccountType' is not null or undefined
        if (paymentAccountType === null || paymentAccountType === undefined) {
            throw new Error('Required parameter paymentAccountType was null or undefined when calling lookupsAccountNumberGet.');
        }

        // verify required parameter 'accountNumber' is not null or undefined
        if (accountNumber === null || accountNumber === undefined) {
            throw new Error('Required parameter accountNumber was null or undefined when calling lookupsAccountNumberGet.');
        }

        if (paymentAccountType !== undefined) {
            localVarQueryParameters['payment_account_type'] = ObjectSerializer.serialize(paymentAccountType, "'MOBILE_MONEY' | 'BANK_ACCOUNT'");
        }

        if (bankId !== undefined) {
            localVarQueryParameters['bank_id'] = ObjectSerializer.serialize(bankId, "string");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.Bearer.apiKey) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.Bearer.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: LookupsAccountNumberGet200Response;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "LookupsAccountNumberGet200Response");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
}
