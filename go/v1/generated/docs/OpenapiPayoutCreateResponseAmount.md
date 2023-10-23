# OpenapiPayoutCreateResponseAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | Pointer to **string** | The currency associated with the amount value, formatted according to ISO 4217 | [optional] 
**Value** | Pointer to **string** |  | [optional] 

## Methods

### NewOpenapiPayoutCreateResponseAmount

`func NewOpenapiPayoutCreateResponseAmount() *OpenapiPayoutCreateResponseAmount`

NewOpenapiPayoutCreateResponseAmount instantiates a new OpenapiPayoutCreateResponseAmount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateResponseAmountWithDefaults

`func NewOpenapiPayoutCreateResponseAmountWithDefaults() *OpenapiPayoutCreateResponseAmount`

NewOpenapiPayoutCreateResponseAmountWithDefaults instantiates a new OpenapiPayoutCreateResponseAmount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrency

`func (o *OpenapiPayoutCreateResponseAmount) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *OpenapiPayoutCreateResponseAmount) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *OpenapiPayoutCreateResponseAmount) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *OpenapiPayoutCreateResponseAmount) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetValue

`func (o *OpenapiPayoutCreateResponseAmount) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *OpenapiPayoutCreateResponseAmount) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *OpenapiPayoutCreateResponseAmount) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *OpenapiPayoutCreateResponseAmount) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


