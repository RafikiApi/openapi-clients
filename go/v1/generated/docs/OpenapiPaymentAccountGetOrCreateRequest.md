# OpenapiPaymentAccountGetOrCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankAccount** | Pointer to [**OpenapiPaymentAccountGetOrCreateRequestBankAccount**](OpenapiPaymentAccountGetOrCreateRequestBankAccount.md) |  | [optional] 
**Country** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered. | [optional] 
**Holder** | Pointer to [**OpenapiPaymentAccountGetOrCreateRequestHolder**](OpenapiPaymentAccountGetOrCreateRequestHolder.md) |  | [optional] 
**MobileMoney** | Pointer to [**OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md) |  | [optional] 
**Type** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60; | [optional] 

## Methods

### NewOpenapiPaymentAccountGetOrCreateRequest

`func NewOpenapiPaymentAccountGetOrCreateRequest() *OpenapiPaymentAccountGetOrCreateRequest`

NewOpenapiPaymentAccountGetOrCreateRequest instantiates a new OpenapiPaymentAccountGetOrCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPaymentAccountGetOrCreateRequestWithDefaults

`func NewOpenapiPaymentAccountGetOrCreateRequestWithDefaults() *OpenapiPaymentAccountGetOrCreateRequest`

NewOpenapiPaymentAccountGetOrCreateRequestWithDefaults instantiates a new OpenapiPaymentAccountGetOrCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankAccount

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetBankAccount() OpenapiPaymentAccountGetOrCreateRequestBankAccount`

GetBankAccount returns the BankAccount field if non-nil, zero value otherwise.

### GetBankAccountOk

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetBankAccountOk() (*OpenapiPaymentAccountGetOrCreateRequestBankAccount, bool)`

GetBankAccountOk returns a tuple with the BankAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankAccount

`func (o *OpenapiPaymentAccountGetOrCreateRequest) SetBankAccount(v OpenapiPaymentAccountGetOrCreateRequestBankAccount)`

SetBankAccount sets BankAccount field to given value.

### HasBankAccount

`func (o *OpenapiPaymentAccountGetOrCreateRequest) HasBankAccount() bool`

HasBankAccount returns a boolean if a field has been set.

### GetCountry

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *OpenapiPaymentAccountGetOrCreateRequest) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *OpenapiPaymentAccountGetOrCreateRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetHolder

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetHolder() OpenapiPaymentAccountGetOrCreateRequestHolder`

GetHolder returns the Holder field if non-nil, zero value otherwise.

### GetHolderOk

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetHolderOk() (*OpenapiPaymentAccountGetOrCreateRequestHolder, bool)`

GetHolderOk returns a tuple with the Holder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHolder

`func (o *OpenapiPaymentAccountGetOrCreateRequest) SetHolder(v OpenapiPaymentAccountGetOrCreateRequestHolder)`

SetHolder sets Holder field to given value.

### HasHolder

`func (o *OpenapiPaymentAccountGetOrCreateRequest) HasHolder() bool`

HasHolder returns a boolean if a field has been set.

### GetMobileMoney

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetMobileMoney() OpenapiPaymentAccountGetOrCreateRequestMobileMoney`

GetMobileMoney returns the MobileMoney field if non-nil, zero value otherwise.

### GetMobileMoneyOk

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetMobileMoneyOk() (*OpenapiPaymentAccountGetOrCreateRequestMobileMoney, bool)`

GetMobileMoneyOk returns a tuple with the MobileMoney field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMobileMoney

`func (o *OpenapiPaymentAccountGetOrCreateRequest) SetMobileMoney(v OpenapiPaymentAccountGetOrCreateRequestMobileMoney)`

SetMobileMoney sets MobileMoney field to given value.

### HasMobileMoney

`func (o *OpenapiPaymentAccountGetOrCreateRequest) HasMobileMoney() bool`

HasMobileMoney returns a boolean if a field has been set.

### GetType

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OpenapiPaymentAccountGetOrCreateRequest) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OpenapiPaymentAccountGetOrCreateRequest) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OpenapiPaymentAccountGetOrCreateRequest) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


