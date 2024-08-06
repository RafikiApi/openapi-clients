# OpenapiPayoutGetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**CreatedAt** | Pointer to **string** |  | [optional] 
**CustomId** | Pointer to **string** |  | [optional] 
**Id** | Pointer to **string** | The payout unique identifier | [optional] 
**PaymentAccountId** | Pointer to **string** | The recipient payment account receiving funds | [optional] 
**Purpose** | Pointer to **string** |  | [optional] 
**Receipt** | Pointer to **string** | The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional] 
**Sender** | Pointer to [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] 
**State** | Pointer to [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] 
**WalletId** | Pointer to **string** | The wallet ID from which the money will disburse | [optional] 

## Methods

### NewOpenapiPayoutGetResponse

`func NewOpenapiPayoutGetResponse() *OpenapiPayoutGetResponse`

NewOpenapiPayoutGetResponse instantiates a new OpenapiPayoutGetResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutGetResponseWithDefaults

`func NewOpenapiPayoutGetResponseWithDefaults() *OpenapiPayoutGetResponse`

NewOpenapiPayoutGetResponseWithDefaults instantiates a new OpenapiPayoutGetResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *OpenapiPayoutGetResponse) GetAmount() OpenapiPayoutCreateResponseAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *OpenapiPayoutGetResponse) GetAmountOk() (*OpenapiPayoutCreateResponseAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *OpenapiPayoutGetResponse) SetAmount(v OpenapiPayoutCreateResponseAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *OpenapiPayoutGetResponse) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCreatedAt

`func (o *OpenapiPayoutGetResponse) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *OpenapiPayoutGetResponse) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *OpenapiPayoutGetResponse) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *OpenapiPayoutGetResponse) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetCustomId

`func (o *OpenapiPayoutGetResponse) GetCustomId() string`

GetCustomId returns the CustomId field if non-nil, zero value otherwise.

### GetCustomIdOk

`func (o *OpenapiPayoutGetResponse) GetCustomIdOk() (*string, bool)`

GetCustomIdOk returns a tuple with the CustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomId

`func (o *OpenapiPayoutGetResponse) SetCustomId(v string)`

SetCustomId sets CustomId field to given value.

### HasCustomId

`func (o *OpenapiPayoutGetResponse) HasCustomId() bool`

HasCustomId returns a boolean if a field has been set.

### GetId

`func (o *OpenapiPayoutGetResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OpenapiPayoutGetResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OpenapiPayoutGetResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OpenapiPayoutGetResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPaymentAccountId

`func (o *OpenapiPayoutGetResponse) GetPaymentAccountId() string`

GetPaymentAccountId returns the PaymentAccountId field if non-nil, zero value otherwise.

### GetPaymentAccountIdOk

`func (o *OpenapiPayoutGetResponse) GetPaymentAccountIdOk() (*string, bool)`

GetPaymentAccountIdOk returns a tuple with the PaymentAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentAccountId

`func (o *OpenapiPayoutGetResponse) SetPaymentAccountId(v string)`

SetPaymentAccountId sets PaymentAccountId field to given value.

### HasPaymentAccountId

`func (o *OpenapiPayoutGetResponse) HasPaymentAccountId() bool`

HasPaymentAccountId returns a boolean if a field has been set.

### GetPurpose

`func (o *OpenapiPayoutGetResponse) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *OpenapiPayoutGetResponse) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *OpenapiPayoutGetResponse) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *OpenapiPayoutGetResponse) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetReceipt

`func (o *OpenapiPayoutGetResponse) GetReceipt() string`

GetReceipt returns the Receipt field if non-nil, zero value otherwise.

### GetReceiptOk

`func (o *OpenapiPayoutGetResponse) GetReceiptOk() (*string, bool)`

GetReceiptOk returns a tuple with the Receipt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceipt

`func (o *OpenapiPayoutGetResponse) SetReceipt(v string)`

SetReceipt sets Receipt field to given value.

### HasReceipt

`func (o *OpenapiPayoutGetResponse) HasReceipt() bool`

HasReceipt returns a boolean if a field has been set.

### GetSender

`func (o *OpenapiPayoutGetResponse) GetSender() OpenapiPayoutCreateResponseSender`

GetSender returns the Sender field if non-nil, zero value otherwise.

### GetSenderOk

`func (o *OpenapiPayoutGetResponse) GetSenderOk() (*OpenapiPayoutCreateResponseSender, bool)`

GetSenderOk returns a tuple with the Sender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSender

`func (o *OpenapiPayoutGetResponse) SetSender(v OpenapiPayoutCreateResponseSender)`

SetSender sets Sender field to given value.

### HasSender

`func (o *OpenapiPayoutGetResponse) HasSender() bool`

HasSender returns a boolean if a field has been set.

### GetState

`func (o *OpenapiPayoutGetResponse) GetState() OpenapiPayoutCreateResponseState`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *OpenapiPayoutGetResponse) GetStateOk() (*OpenapiPayoutCreateResponseState, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *OpenapiPayoutGetResponse) SetState(v OpenapiPayoutCreateResponseState)`

SetState sets State field to given value.

### HasState

`func (o *OpenapiPayoutGetResponse) HasState() bool`

HasState returns a boolean if a field has been set.

### GetWalletId

`func (o *OpenapiPayoutGetResponse) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *OpenapiPayoutGetResponse) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *OpenapiPayoutGetResponse) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.

### HasWalletId

`func (o *OpenapiPayoutGetResponse) HasWalletId() bool`

HasWalletId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


