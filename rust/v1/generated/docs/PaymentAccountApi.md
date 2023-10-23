# \PaymentAccountApi

All URIs are relative to *https://rest.sandbox.rafiki-api.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payment_accounts_post**](PaymentAccountApi.md#payment_accounts_post) | **POST** /payment-accounts | Get or create



## payment_accounts_post

> crate::models::PaymentAccountsPost201Response payment_accounts_post(openapi_period_payment_account_get_or_create_request)
Get or create

A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.  | Country | Operators         | |---------|-------------------| | KE      | SAFARICOM, AIRTEL |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered. Additionally, for banks with multiple branches in a country, a branch ID may be required to accurately identify and route payments.  We provide support for numerous banks and branches in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks along with their branches. 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**openapi_period_payment_account_get_or_create_request** | [**OpenapiPeriodPaymentAccountGetOrCreateRequest**](OpenapiPeriodPaymentAccountGetOrCreateRequest.md) | The payment account | [required] |

### Return type

[**crate::models::PaymentAccountsPost201Response**](_payment_accounts_post_201_response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

