# OpenapiPayoutCreateResponseSender

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to [**OpenapiPayoutCreateResponseSenderAddress**](OpenapiPayoutCreateResponseSenderAddress.md) |  | [optional] 
**Individual** | Pointer to [**OpenapiPayoutCreateResponseSenderIndividual**](OpenapiPayoutCreateResponseSenderIndividual.md) |  | [optional] 
**Name** | Pointer to **string** | The individual full name or registered business legal name | [optional] 
**Type** | Pointer to **string** |  | [optional] 

## Methods

### NewOpenapiPayoutCreateResponseSender

`func NewOpenapiPayoutCreateResponseSender() *OpenapiPayoutCreateResponseSender`

NewOpenapiPayoutCreateResponseSender instantiates a new OpenapiPayoutCreateResponseSender object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateResponseSenderWithDefaults

`func NewOpenapiPayoutCreateResponseSenderWithDefaults() *OpenapiPayoutCreateResponseSender`

NewOpenapiPayoutCreateResponseSenderWithDefaults instantiates a new OpenapiPayoutCreateResponseSender object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *OpenapiPayoutCreateResponseSender) GetAddress() OpenapiPayoutCreateResponseSenderAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *OpenapiPayoutCreateResponseSender) GetAddressOk() (*OpenapiPayoutCreateResponseSenderAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *OpenapiPayoutCreateResponseSender) SetAddress(v OpenapiPayoutCreateResponseSenderAddress)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *OpenapiPayoutCreateResponseSender) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetIndividual

`func (o *OpenapiPayoutCreateResponseSender) GetIndividual() OpenapiPayoutCreateResponseSenderIndividual`

GetIndividual returns the Individual field if non-nil, zero value otherwise.

### GetIndividualOk

`func (o *OpenapiPayoutCreateResponseSender) GetIndividualOk() (*OpenapiPayoutCreateResponseSenderIndividual, bool)`

GetIndividualOk returns a tuple with the Individual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndividual

`func (o *OpenapiPayoutCreateResponseSender) SetIndividual(v OpenapiPayoutCreateResponseSenderIndividual)`

SetIndividual sets Individual field to given value.

### HasIndividual

`func (o *OpenapiPayoutCreateResponseSender) HasIndividual() bool`

HasIndividual returns a boolean if a field has been set.

### GetName

`func (o *OpenapiPayoutCreateResponseSender) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OpenapiPayoutCreateResponseSender) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OpenapiPayoutCreateResponseSender) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *OpenapiPayoutCreateResponseSender) HasName() bool`

HasName returns a boolean if a field has been set.

### GetType

`func (o *OpenapiPayoutCreateResponseSender) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OpenapiPayoutCreateResponseSender) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OpenapiPayoutCreateResponseSender) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OpenapiPayoutCreateResponseSender) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


