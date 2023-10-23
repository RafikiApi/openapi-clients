# OpenapiPayoutCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional] 
**PaymentAccount** | Pointer to [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional] 
**PaymentAccountId** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional] 
**Sender** | Pointer to [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional] 
**WalletId** | Pointer to **string** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional] 

## Methods

### NewOpenapiPayoutCreateRequest

`func NewOpenapiPayoutCreateRequest() *OpenapiPayoutCreateRequest`

NewOpenapiPayoutCreateRequest instantiates a new OpenapiPayoutCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestWithDefaults

`func NewOpenapiPayoutCreateRequestWithDefaults() *OpenapiPayoutCreateRequest`

NewOpenapiPayoutCreateRequestWithDefaults instantiates a new OpenapiPayoutCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *OpenapiPayoutCreateRequest) GetAmount() OpenapiPayoutCreateRequestAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *OpenapiPayoutCreateRequest) GetAmountOk() (*OpenapiPayoutCreateRequestAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *OpenapiPayoutCreateRequest) SetAmount(v OpenapiPayoutCreateRequestAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *OpenapiPayoutCreateRequest) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetPaymentAccount

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccount() OpenapiPaymentAccountGetOrCreateRequest`

GetPaymentAccount returns the PaymentAccount field if non-nil, zero value otherwise.

### GetPaymentAccountOk

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccountOk() (*OpenapiPaymentAccountGetOrCreateRequest, bool)`

GetPaymentAccountOk returns a tuple with the PaymentAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentAccount

`func (o *OpenapiPayoutCreateRequest) SetPaymentAccount(v OpenapiPaymentAccountGetOrCreateRequest)`

SetPaymentAccount sets PaymentAccount field to given value.

### HasPaymentAccount

`func (o *OpenapiPayoutCreateRequest) HasPaymentAccount() bool`

HasPaymentAccount returns a boolean if a field has been set.

### GetPaymentAccountId

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccountId() string`

GetPaymentAccountId returns the PaymentAccountId field if non-nil, zero value otherwise.

### GetPaymentAccountIdOk

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccountIdOk() (*string, bool)`

GetPaymentAccountIdOk returns a tuple with the PaymentAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentAccountId

`func (o *OpenapiPayoutCreateRequest) SetPaymentAccountId(v string)`

SetPaymentAccountId sets PaymentAccountId field to given value.

### HasPaymentAccountId

`func (o *OpenapiPayoutCreateRequest) HasPaymentAccountId() bool`

HasPaymentAccountId returns a boolean if a field has been set.

### GetSender

`func (o *OpenapiPayoutCreateRequest) GetSender() OpenapiPayoutCreateRequestSender`

GetSender returns the Sender field if non-nil, zero value otherwise.

### GetSenderOk

`func (o *OpenapiPayoutCreateRequest) GetSenderOk() (*OpenapiPayoutCreateRequestSender, bool)`

GetSenderOk returns a tuple with the Sender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSender

`func (o *OpenapiPayoutCreateRequest) SetSender(v OpenapiPayoutCreateRequestSender)`

SetSender sets Sender field to given value.

### HasSender

`func (o *OpenapiPayoutCreateRequest) HasSender() bool`

HasSender returns a boolean if a field has been set.

### GetWalletId

`func (o *OpenapiPayoutCreateRequest) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *OpenapiPayoutCreateRequest) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *OpenapiPayoutCreateRequest) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.

### HasWalletId

`func (o *OpenapiPayoutCreateRequest) HasWalletId() bool`

HasWalletId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


