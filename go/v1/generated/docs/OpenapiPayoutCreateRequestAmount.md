# OpenapiPayoutCreateRequestAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The currency associated with the amount value, formatted according to ISO 4217 | [optional] 
**Value** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt; | [optional] 

## Methods

### NewOpenapiPayoutCreateRequestAmount

`func NewOpenapiPayoutCreateRequestAmount() *OpenapiPayoutCreateRequestAmount`

NewOpenapiPayoutCreateRequestAmount instantiates a new OpenapiPayoutCreateRequestAmount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestAmountWithDefaults

`func NewOpenapiPayoutCreateRequestAmountWithDefaults() *OpenapiPayoutCreateRequestAmount`

NewOpenapiPayoutCreateRequestAmountWithDefaults instantiates a new OpenapiPayoutCreateRequestAmount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrency

`func (o *OpenapiPayoutCreateRequestAmount) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *OpenapiPayoutCreateRequestAmount) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *OpenapiPayoutCreateRequestAmount) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *OpenapiPayoutCreateRequestAmount) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetValue

`func (o *OpenapiPayoutCreateRequestAmount) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *OpenapiPayoutCreateRequestAmount) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *OpenapiPayoutCreateRequestAmount) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *OpenapiPayoutCreateRequestAmount) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


