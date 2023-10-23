# Rust API client for rafikigen

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


## Overview

This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 1
- Package version: 1
- Build package: `org.openapitools.codegen.languages.RustClientCodegen`

## Installation

Put the package under your project folder in a directory named `rafikigen` and add the following to `Cargo.toml` under `[dependencies]`:

```
rafikigen = { path = "./rafikigen" }
```

## Documentation for API Endpoints

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BankApi* | [**banks_get**](docs/BankApi.md#banks_get) | **GET** /banks | List
*PaymentAccountApi* | [**payment_accounts_post**](docs/PaymentAccountApi.md#payment_accounts_post) | **POST** /payment-accounts | Get or create
*PayoutApi* | [**payouts_get**](docs/PayoutApi.md#payouts_get) | **GET** /payouts | List
*PayoutApi* | [**payouts_id_get**](docs/PayoutApi.md#payouts_id_get) | **GET** /payouts/{id} | Query status
*PayoutApi* | [**payouts_post**](docs/PayoutApi.md#payouts_post) | **POST** /payouts | Send money
*WalletApi* | [**wallets_get**](docs/WalletApi.md#wallets_get) | **GET** /wallets | List


## Documentation For Models

 - [BanksGet200Response](docs/BanksGet200Response.md)
 - [BanksGet200ResponseAllOfDataInner](docs/BanksGet200ResponseAllOfDataInner.md)
 - [BanksGet200ResponseAllOfDataInnerBranchesInner](docs/BanksGet200ResponseAllOfDataInnerBranchesInner.md)
 - [OpenapiPaymentAccountGetOrCreateRequestBankAccount](docs/OpenapiPaymentAccountGetOrCreateRequestBankAccount.md)
 - [OpenapiPaymentAccountGetOrCreateRequestHolder](docs/OpenapiPaymentAccountGetOrCreateRequestHolder.md)
 - [OpenapiPaymentAccountGetOrCreateRequestMobileMoney](docs/OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md)
 - [OpenapiPaymentAccountGetOrCreateResponseBankAccount](docs/OpenapiPaymentAccountGetOrCreateResponseBankAccount.md)
 - [OpenapiPaymentAccountGetOrCreateResponseHolder](docs/OpenapiPaymentAccountGetOrCreateResponseHolder.md)
 - [OpenapiPaymentAccountGetOrCreateResponseMobileMoney](docs/OpenapiPaymentAccountGetOrCreateResponseMobileMoney.md)
 - [OpenapiPayoutCreateRequestAmount](docs/OpenapiPayoutCreateRequestAmount.md)
 - [OpenapiPayoutCreateRequestSender](docs/OpenapiPayoutCreateRequestSender.md)
 - [OpenapiPayoutCreateRequestSenderAddress](docs/OpenapiPayoutCreateRequestSenderAddress.md)
 - [OpenapiPayoutCreateRequestSenderIndividual](docs/OpenapiPayoutCreateRequestSenderIndividual.md)
 - [OpenapiPayoutCreateRequestSenderIndividualIdentityDocument](docs/OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.md)
 - [OpenapiPayoutCreateResponseAmount](docs/OpenapiPayoutCreateResponseAmount.md)
 - [OpenapiPayoutCreateResponseSender](docs/OpenapiPayoutCreateResponseSender.md)
 - [OpenapiPayoutCreateResponseSenderAddress](docs/OpenapiPayoutCreateResponseSenderAddress.md)
 - [OpenapiPayoutCreateResponseSenderIndividual](docs/OpenapiPayoutCreateResponseSenderIndividual.md)
 - [OpenapiPayoutCreateResponseSenderIndividualIdentityDocument](docs/OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.md)
 - [OpenapiPayoutCreateResponseState](docs/OpenapiPayoutCreateResponseState.md)
 - [OpenapiPeriodPaymentAccountGetOrCreateRequest](docs/OpenapiPeriodPaymentAccountGetOrCreateRequest.md)
 - [OpenapiPeriodPaymentAccountGetOrCreateResponse](docs/OpenapiPeriodPaymentAccountGetOrCreateResponse.md)
 - [OpenapiPeriodPayoutCreateRequest](docs/OpenapiPeriodPayoutCreateRequest.md)
 - [OpenapiPeriodPayoutCreateResponse](docs/OpenapiPeriodPayoutCreateResponse.md)
 - [OpenapiPeriodPayoutGetResponse](docs/OpenapiPeriodPayoutGetResponse.md)
 - [OpenapiPeriodResponseBodySuccessCollectionNoMeta](docs/OpenapiPeriodResponseBodySuccessCollectionNoMeta.md)
 - [OpenapiPeriodResponseBodySuccessCursorPaginated](docs/OpenapiPeriodResponseBodySuccessCursorPaginated.md)
 - [OpenapiPeriodResponseBodySuccessNoMeta](docs/OpenapiPeriodResponseBodySuccessNoMeta.md)
 - [OpenapiPeriodResponseBodyValidationFailed](docs/OpenapiPeriodResponseBodyValidationFailed.md)
 - [OpenapiPeriodResponseBodyWalletInsufficientBalance](docs/OpenapiPeriodResponseBodyWalletInsufficientBalance.md)
 - [OpenapiResponseBodySuccessCursorPaginatedMeta](docs/OpenapiResponseBodySuccessCursorPaginatedMeta.md)
 - [OpenapiResponseBodySuccessCursorPaginatedMetaPaging](docs/OpenapiResponseBodySuccessCursorPaginatedMetaPaging.md)
 - [OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors](docs/OpenapiResponseBodySuccessCursorPaginatedMetaPagingCursors.md)
 - [OpenapiResponseBodyValidationFailedErrors](docs/OpenapiResponseBodyValidationFailedErrors.md)
 - [PaymentAccountsPost201Response](docs/PaymentAccountsPost201Response.md)
 - [PayoutsGet200Response](docs/PayoutsGet200Response.md)
 - [PayoutsIdGet200Response](docs/PayoutsIdGet200Response.md)
 - [PayoutsPost202Response](docs/PayoutsPost202Response.md)
 - [WalletsGet200Response](docs/WalletsGet200Response.md)
 - [WalletsGet200ResponseAllOfDataInner](docs/WalletsGet200ResponseAllOfDataInner.md)


To get access to the crate's generated documentation, use:

```
cargo doc --open
```

## Author


