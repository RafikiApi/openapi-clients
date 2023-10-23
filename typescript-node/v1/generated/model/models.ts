import localVarRequest from 'request';

export * from './banksGet200Response';
export * from './banksGet200ResponseAllOfDataInner';
export * from './banksGet200ResponseAllOfDataInnerBranchesInner';
export * from './openapiPaymentAccountGetOrCreateRequest';
export * from './openapiPaymentAccountGetOrCreateRequestBankAccount';
export * from './openapiPaymentAccountGetOrCreateRequestHolder';
export * from './openapiPaymentAccountGetOrCreateRequestMobileMoney';
export * from './openapiPaymentAccountGetOrCreateResponse';
export * from './openapiPaymentAccountGetOrCreateResponseBankAccount';
export * from './openapiPaymentAccountGetOrCreateResponseHolder';
export * from './openapiPaymentAccountGetOrCreateResponseMobileMoney';
export * from './openapiPayoutCreateRequest';
export * from './openapiPayoutCreateRequestAmount';
export * from './openapiPayoutCreateRequestSender';
export * from './openapiPayoutCreateRequestSenderAddress';
export * from './openapiPayoutCreateRequestSenderIndividual';
export * from './openapiPayoutCreateRequestSenderIndividualIdentityDocument';
export * from './openapiPayoutCreateResponse';
export * from './openapiPayoutCreateResponseAmount';
export * from './openapiPayoutCreateResponseSender';
export * from './openapiPayoutCreateResponseSenderAddress';
export * from './openapiPayoutCreateResponseSenderIndividual';
export * from './openapiPayoutCreateResponseSenderIndividualIdentityDocument';
export * from './openapiPayoutCreateResponseState';
export * from './openapiPayoutGetResponse';
export * from './openapiResponseBodySuccessCollectionNoMeta';
export * from './openapiResponseBodySuccessCursorPaginated';
export * from './openapiResponseBodySuccessCursorPaginatedMeta';
export * from './openapiResponseBodySuccessCursorPaginatedMetaPaging';
export * from './openapiResponseBodySuccessCursorPaginatedMetaPagingCursors';
export * from './openapiResponseBodySuccessNoMeta';
export * from './openapiResponseBodyValidationFailed';
export * from './openapiResponseBodyValidationFailedErrors';
export * from './openapiResponseBodyWalletInsufficientBalance';
export * from './paymentAccountsPost201Response';
export * from './payoutsGet200Response';
export * from './payoutsIdGet200Response';
export * from './payoutsPost202Response';
export * from './walletsGet200Response';
export * from './walletsGet200ResponseAllOfDataInner';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { BanksGet200Response } from './banksGet200Response';
import { BanksGet200ResponseAllOfDataInner } from './banksGet200ResponseAllOfDataInner';
import { BanksGet200ResponseAllOfDataInnerBranchesInner } from './banksGet200ResponseAllOfDataInnerBranchesInner';
import { OpenapiPaymentAccountGetOrCreateRequest } from './openapiPaymentAccountGetOrCreateRequest';
import { OpenapiPaymentAccountGetOrCreateRequestBankAccount } from './openapiPaymentAccountGetOrCreateRequestBankAccount';
import { OpenapiPaymentAccountGetOrCreateRequestHolder } from './openapiPaymentAccountGetOrCreateRequestHolder';
import { OpenapiPaymentAccountGetOrCreateRequestMobileMoney } from './openapiPaymentAccountGetOrCreateRequestMobileMoney';
import { OpenapiPaymentAccountGetOrCreateResponse } from './openapiPaymentAccountGetOrCreateResponse';
import { OpenapiPaymentAccountGetOrCreateResponseBankAccount } from './openapiPaymentAccountGetOrCreateResponseBankAccount';
import { OpenapiPaymentAccountGetOrCreateResponseHolder } from './openapiPaymentAccountGetOrCreateResponseHolder';
import { OpenapiPaymentAccountGetOrCreateResponseMobileMoney } from './openapiPaymentAccountGetOrCreateResponseMobileMoney';
import { OpenapiPayoutCreateRequest } from './openapiPayoutCreateRequest';
import { OpenapiPayoutCreateRequestAmount } from './openapiPayoutCreateRequestAmount';
import { OpenapiPayoutCreateRequestSender } from './openapiPayoutCreateRequestSender';
import { OpenapiPayoutCreateRequestSenderAddress } from './openapiPayoutCreateRequestSenderAddress';
import { OpenapiPayoutCreateRequestSenderIndividual } from './openapiPayoutCreateRequestSenderIndividual';
import { OpenapiPayoutCreateRequestSenderIndividualIdentityDocument } from './openapiPayoutCreateRequestSenderIndividualIdentityDocument';
import { OpenapiPayoutCreateResponse } from './openapiPayoutCreateResponse';
import { OpenapiPayoutCreateResponseAmount } from './openapiPayoutCreateResponseAmount';
import { OpenapiPayoutCreateResponseSender } from './openapiPayoutCreateResponseSender';
import { OpenapiPayoutCreateResponseSenderAddress } from './openapiPayoutCreateResponseSenderAddress';
import { OpenapiPayoutCreateResponseSenderIndividual } from './openapiPayoutCreateResponseSenderIndividual';
import { OpenapiPayoutCreateResponseSenderIndividualIdentityDocument } from './openapiPayoutCreateResponseSenderIndividualIdentityDocument';
import { OpenapiPayoutCreateResponseState } from './openapiPayoutCreateResponseState';
import { OpenapiPayoutGetResponse } from './openapiPayoutGetResponse';
import { OpenapiResponseBodySuccessCollectionNoMeta } from './openapiResponseBodySuccessCollectionNoMeta';
import { OpenapiResponseBodySuccessCursorPaginated } from './openapiResponseBodySuccessCursorPaginated';
import { OpenapiResponseBodySuccessCursorPaginatedMeta } from './openapiResponseBodySuccessCursorPaginatedMeta';
import { OpenapiResponseBodySuccessCursorPaginatedMetaPaging } from './openapiResponseBodySuccessCursorPaginatedMetaPaging';
import { OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors } from './openapiResponseBodySuccessCursorPaginatedMetaPagingCursors';
import { OpenapiResponseBodySuccessNoMeta } from './openapiResponseBodySuccessNoMeta';
import { OpenapiResponseBodyValidationFailed } from './openapiResponseBodyValidationFailed';
import { OpenapiResponseBodyValidationFailedErrors } from './openapiResponseBodyValidationFailedErrors';
import { OpenapiResponseBodyWalletInsufficientBalance } from './openapiResponseBodyWalletInsufficientBalance';
import { PaymentAccountsPost201Response } from './paymentAccountsPost201Response';
import { PayoutsGet200Response } from './payoutsGet200Response';
import { PayoutsIdGet200Response } from './payoutsIdGet200Response';
import { PayoutsPost202Response } from './payoutsPost202Response';
import { WalletsGet200Response } from './walletsGet200Response';
import { WalletsGet200ResponseAllOfDataInner } from './walletsGet200ResponseAllOfDataInner';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "OpenapiPaymentAccountGetOrCreateRequest.TypeEnum": OpenapiPaymentAccountGetOrCreateRequest.TypeEnum,
        "OpenapiPaymentAccountGetOrCreateRequestHolder.TypeEnum": OpenapiPaymentAccountGetOrCreateRequestHolder.TypeEnum,
        "OpenapiPaymentAccountGetOrCreateRequestMobileMoney.OperatorEnum": OpenapiPaymentAccountGetOrCreateRequestMobileMoney.OperatorEnum,
        "OpenapiPaymentAccountGetOrCreateResponseHolder.TypeEnum": OpenapiPaymentAccountGetOrCreateResponseHolder.TypeEnum,
        "OpenapiPaymentAccountGetOrCreateResponseMobileMoney.OperatorEnum": OpenapiPaymentAccountGetOrCreateResponseMobileMoney.OperatorEnum,
        "OpenapiPayoutCreateRequestSender.TypeEnum": OpenapiPayoutCreateRequestSender.TypeEnum,
        "OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.TypeEnum": OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.TypeEnum,
        "OpenapiPayoutCreateResponseSender.TypeEnum": OpenapiPayoutCreateResponseSender.TypeEnum,
        "OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.TypeEnum": OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.TypeEnum,
        "OpenapiPayoutCreateResponseState.CodeEnum": OpenapiPayoutCreateResponseState.CodeEnum,
}

let typeMap: {[index: string]: any} = {
    "BanksGet200Response": BanksGet200Response,
    "BanksGet200ResponseAllOfDataInner": BanksGet200ResponseAllOfDataInner,
    "BanksGet200ResponseAllOfDataInnerBranchesInner": BanksGet200ResponseAllOfDataInnerBranchesInner,
    "OpenapiPaymentAccountGetOrCreateRequest": OpenapiPaymentAccountGetOrCreateRequest,
    "OpenapiPaymentAccountGetOrCreateRequestBankAccount": OpenapiPaymentAccountGetOrCreateRequestBankAccount,
    "OpenapiPaymentAccountGetOrCreateRequestHolder": OpenapiPaymentAccountGetOrCreateRequestHolder,
    "OpenapiPaymentAccountGetOrCreateRequestMobileMoney": OpenapiPaymentAccountGetOrCreateRequestMobileMoney,
    "OpenapiPaymentAccountGetOrCreateResponse": OpenapiPaymentAccountGetOrCreateResponse,
    "OpenapiPaymentAccountGetOrCreateResponseBankAccount": OpenapiPaymentAccountGetOrCreateResponseBankAccount,
    "OpenapiPaymentAccountGetOrCreateResponseHolder": OpenapiPaymentAccountGetOrCreateResponseHolder,
    "OpenapiPaymentAccountGetOrCreateResponseMobileMoney": OpenapiPaymentAccountGetOrCreateResponseMobileMoney,
    "OpenapiPayoutCreateRequest": OpenapiPayoutCreateRequest,
    "OpenapiPayoutCreateRequestAmount": OpenapiPayoutCreateRequestAmount,
    "OpenapiPayoutCreateRequestSender": OpenapiPayoutCreateRequestSender,
    "OpenapiPayoutCreateRequestSenderAddress": OpenapiPayoutCreateRequestSenderAddress,
    "OpenapiPayoutCreateRequestSenderIndividual": OpenapiPayoutCreateRequestSenderIndividual,
    "OpenapiPayoutCreateRequestSenderIndividualIdentityDocument": OpenapiPayoutCreateRequestSenderIndividualIdentityDocument,
    "OpenapiPayoutCreateResponse": OpenapiPayoutCreateResponse,
    "OpenapiPayoutCreateResponseAmount": OpenapiPayoutCreateResponseAmount,
    "OpenapiPayoutCreateResponseSender": OpenapiPayoutCreateResponseSender,
    "OpenapiPayoutCreateResponseSenderAddress": OpenapiPayoutCreateResponseSenderAddress,
    "OpenapiPayoutCreateResponseSenderIndividual": OpenapiPayoutCreateResponseSenderIndividual,
    "OpenapiPayoutCreateResponseSenderIndividualIdentityDocument": OpenapiPayoutCreateResponseSenderIndividualIdentityDocument,
    "OpenapiPayoutCreateResponseState": OpenapiPayoutCreateResponseState,
    "OpenapiPayoutGetResponse": OpenapiPayoutGetResponse,
    "OpenapiResponseBodySuccessCollectionNoMeta": OpenapiResponseBodySuccessCollectionNoMeta,
    "OpenapiResponseBodySuccessCursorPaginated": OpenapiResponseBodySuccessCursorPaginated,
    "OpenapiResponseBodySuccessCursorPaginatedMeta": OpenapiResponseBodySuccessCursorPaginatedMeta,
    "OpenapiResponseBodySuccessCursorPaginatedMetaPaging": OpenapiResponseBodySuccessCursorPaginatedMetaPaging,
    "OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors": OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors,
    "OpenapiResponseBodySuccessNoMeta": OpenapiResponseBodySuccessNoMeta,
    "OpenapiResponseBodyValidationFailed": OpenapiResponseBodyValidationFailed,
    "OpenapiResponseBodyValidationFailedErrors": OpenapiResponseBodyValidationFailedErrors,
    "OpenapiResponseBodyWalletInsufficientBalance": OpenapiResponseBodyWalletInsufficientBalance,
    "PaymentAccountsPost201Response": PaymentAccountsPost201Response,
    "PayoutsGet200Response": PayoutsGet200Response,
    "PayoutsIdGet200Response": PayoutsIdGet200Response,
    "PayoutsPost202Response": PayoutsPost202Response,
    "WalletsGet200Response": WalletsGet200Response,
    "WalletsGet200ResponseAllOfDataInner": WalletsGet200ResponseAllOfDataInner,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
