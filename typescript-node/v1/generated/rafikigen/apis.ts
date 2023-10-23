export * from './bankApi';
import { BankApi } from './bankApi';
export * from './paymentAccountApi';
import { PaymentAccountApi } from './paymentAccountApi';
export * from './payoutApi';
import { PayoutApi } from './payoutApi';
export * from './walletApi';
import { WalletApi } from './walletApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [BankApi, PaymentAccountApi, PayoutApi, WalletApi];
