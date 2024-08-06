# OpenapiPayoutCreateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**CreatedAt** | Pointer to **string** |  | [optional] 
**CustomId** | Pointer to **string** |  | [optional] 
**Id** | Pointer to **string** | The payout unique identifier | [optional] 
**PaymentAccountId** | Pointer to **string** | The recipient payment account receiving funds | [optional] 
**Purpose** | Pointer to **string** |  | [optional] 
**Sender** | Pointer to [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] 
**State** | Pointer to [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] 
**WalletId** | Pointer to **string** | The wallet ID from which the money will disburse | [optional] 

## Methods

### NewOpenapiPayoutCreateResponse

`func NewOpenapiPayoutCreateResponse() *OpenapiPayoutCreateResponse`

NewOpenapiPayoutCreateResponse instantiates a new OpenapiPayoutCreateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateResponseWithDefaults

`func NewOpenapiPayoutCreateResponseWithDefaults() *OpenapiPayoutCreateResponse`

NewOpenapiPayoutCreateResponseWithDefaults instantiates a new OpenapiPayoutCreateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *OpenapiPayoutCreateResponse) GetAmount() OpenapiPayoutCreateResponseAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *OpenapiPayoutCreateResponse) GetAmountOk() (*OpenapiPayoutCreateResponseAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *OpenapiPayoutCreateResponse) SetAmount(v OpenapiPayoutCreateResponseAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *OpenapiPayoutCreateResponse) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCreatedAt

`func (o *OpenapiPayoutCreateResponse) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *OpenapiPayoutCreateResponse) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *OpenapiPayoutCreateResponse) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *OpenapiPayoutCreateResponse) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetCustomId

`func (o *OpenapiPayoutCreateResponse) GetCustomId() string`

GetCustomId returns the CustomId field if non-nil, zero value otherwise.

### GetCustomIdOk

`func (o *OpenapiPayoutCreateResponse) GetCustomIdOk() (*string, bool)`

GetCustomIdOk returns a tuple with the CustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomId

`func (o *OpenapiPayoutCreateResponse) SetCustomId(v string)`

SetCustomId sets CustomId field to given value.

### HasCustomId

`func (o *OpenapiPayoutCreateResponse) HasCustomId() bool`

HasCustomId returns a boolean if a field has been set.

### GetId

`func (o *OpenapiPayoutCreateResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OpenapiPayoutCreateResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OpenapiPayoutCreateResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OpenapiPayoutCreateResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPaymentAccountId

`func (o *OpenapiPayoutCreateResponse) GetPaymentAccountId() string`

GetPaymentAccountId returns the PaymentAccountId field if non-nil, zero value otherwise.

### GetPaymentAccountIdOk

`func (o *OpenapiPayoutCreateResponse) GetPaymentAccountIdOk() (*string, bool)`

GetPaymentAccountIdOk returns a tuple with the PaymentAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentAccountId

`func (o *OpenapiPayoutCreateResponse) SetPaymentAccountId(v string)`

SetPaymentAccountId sets PaymentAccountId field to given value.

### HasPaymentAccountId

`func (o *OpenapiPayoutCreateResponse) HasPaymentAccountId() bool`

HasPaymentAccountId returns a boolean if a field has been set.

### GetPurpose

`func (o *OpenapiPayoutCreateResponse) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *OpenapiPayoutCreateResponse) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *OpenapiPayoutCreateResponse) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *OpenapiPayoutCreateResponse) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetSender

`func (o *OpenapiPayoutCreateResponse) GetSender() OpenapiPayoutCreateResponseSender`

GetSender returns the Sender field if non-nil, zero value otherwise.

### GetSenderOk

`func (o *OpenapiPayoutCreateResponse) GetSenderOk() (*OpenapiPayoutCreateResponseSender, bool)`

GetSenderOk returns a tuple with the Sender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSender

`func (o *OpenapiPayoutCreateResponse) SetSender(v OpenapiPayoutCreateResponseSender)`

SetSender sets Sender field to given value.

### HasSender

`func (o *OpenapiPayoutCreateResponse) HasSender() bool`

HasSender returns a boolean if a field has been set.

### GetState

`func (o *OpenapiPayoutCreateResponse) GetState() OpenapiPayoutCreateResponseState`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *OpenapiPayoutCreateResponse) GetStateOk() (*OpenapiPayoutCreateResponseState, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *OpenapiPayoutCreateResponse) SetState(v OpenapiPayoutCreateResponseState)`

SetState sets State field to given value.

### HasState

`func (o *OpenapiPayoutCreateResponse) HasState() bool`

HasState returns a boolean if a field has been set.

### GetWalletId

`func (o *OpenapiPayoutCreateResponse) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *OpenapiPayoutCreateResponse) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *OpenapiPayoutCreateResponse) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.

### HasWalletId

`func (o *OpenapiPayoutCreateResponse) HasWalletId() bool`

HasWalletId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


