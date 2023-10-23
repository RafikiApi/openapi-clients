# OpenapiPaymentAccountGetOrCreateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankAccount** | Pointer to [**OpenapiPaymentAccountGetOrCreateResponseBankAccount**](OpenapiPaymentAccountGetOrCreateResponseBankAccount.md) |  | [optional] 
**Country** | Pointer to **string** |  | [optional] 
**CreatedAt** | Pointer to **string** |  | [optional] 
**Holder** | Pointer to [**OpenapiPaymentAccountGetOrCreateResponseHolder**](OpenapiPaymentAccountGetOrCreateResponseHolder.md) |  | [optional] 
**Id** | Pointer to **string** | The newly created payment account unique identifier | [optional] 
**MobileMoney** | Pointer to [**OpenapiPaymentAccountGetOrCreateResponseMobileMoney**](OpenapiPaymentAccountGetOrCreateResponseMobileMoney.md) |  | [optional] 
**Type** | Pointer to **string** |  | [optional] [default to "MOBILE_MONEY"]

## Methods

### NewOpenapiPaymentAccountGetOrCreateResponse

`func NewOpenapiPaymentAccountGetOrCreateResponse() *OpenapiPaymentAccountGetOrCreateResponse`

NewOpenapiPaymentAccountGetOrCreateResponse instantiates a new OpenapiPaymentAccountGetOrCreateResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPaymentAccountGetOrCreateResponseWithDefaults

`func NewOpenapiPaymentAccountGetOrCreateResponseWithDefaults() *OpenapiPaymentAccountGetOrCreateResponse`

NewOpenapiPaymentAccountGetOrCreateResponseWithDefaults instantiates a new OpenapiPaymentAccountGetOrCreateResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankAccount

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetBankAccount() OpenapiPaymentAccountGetOrCreateResponseBankAccount`

GetBankAccount returns the BankAccount field if non-nil, zero value otherwise.

### GetBankAccountOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetBankAccountOk() (*OpenapiPaymentAccountGetOrCreateResponseBankAccount, bool)`

GetBankAccountOk returns a tuple with the BankAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankAccount

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetBankAccount(v OpenapiPaymentAccountGetOrCreateResponseBankAccount)`

SetBankAccount sets BankAccount field to given value.

### HasBankAccount

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasBankAccount() bool`

HasBankAccount returns a boolean if a field has been set.

### GetCountry

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCreatedAt

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetHolder

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetHolder() OpenapiPaymentAccountGetOrCreateResponseHolder`

GetHolder returns the Holder field if non-nil, zero value otherwise.

### GetHolderOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetHolderOk() (*OpenapiPaymentAccountGetOrCreateResponseHolder, bool)`

GetHolderOk returns a tuple with the Holder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHolder

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetHolder(v OpenapiPaymentAccountGetOrCreateResponseHolder)`

SetHolder sets Holder field to given value.

### HasHolder

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasHolder() bool`

HasHolder returns a boolean if a field has been set.

### GetId

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMobileMoney

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetMobileMoney() OpenapiPaymentAccountGetOrCreateResponseMobileMoney`

GetMobileMoney returns the MobileMoney field if non-nil, zero value otherwise.

### GetMobileMoneyOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetMobileMoneyOk() (*OpenapiPaymentAccountGetOrCreateResponseMobileMoney, bool)`

GetMobileMoneyOk returns a tuple with the MobileMoney field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobileMoney

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetMobileMoney(v OpenapiPaymentAccountGetOrCreateResponseMobileMoney)`

SetMobileMoney sets MobileMoney field to given value.

### HasMobileMoney

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasMobileMoney() bool`

HasMobileMoney returns a boolean if a field has been set.

### GetType

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OpenapiPaymentAccountGetOrCreateResponse) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OpenapiPaymentAccountGetOrCreateResponse) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OpenapiPaymentAccountGetOrCreateResponse) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


