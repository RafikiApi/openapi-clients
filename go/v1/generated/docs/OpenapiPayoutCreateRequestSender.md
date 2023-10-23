# OpenapiPayoutCreateRequestSender

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | Pointer to [**OpenapiPayoutCreateRequestSenderAddress**](OpenapiPayoutCreateRequestSenderAddress.md) |  | [optional] 
**Individual** | Pointer to [**OpenapiPayoutCreateRequestSenderIndividual**](OpenapiPayoutCreateRequestSenderIndividual.md) |  | [optional] 
**Name** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  The individual full name or registered business legal name | [optional] 
**Type** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  Either &#x60;INDIVIDUAL&#x60; or &#x60;BUSINESS&#x60; | [optional] 

## Methods

### NewOpenapiPayoutCreateRequestSender

`func NewOpenapiPayoutCreateRequestSender() *OpenapiPayoutCreateRequestSender`

NewOpenapiPayoutCreateRequestSender instantiates a new OpenapiPayoutCreateRequestSender object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestSenderWithDefaults

`func NewOpenapiPayoutCreateRequestSenderWithDefaults() *OpenapiPayoutCreateRequestSender`

NewOpenapiPayoutCreateRequestSenderWithDefaults instantiates a new OpenapiPayoutCreateRequestSender object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *OpenapiPayoutCreateRequestSender) GetAddress() OpenapiPayoutCreateRequestSenderAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *OpenapiPayoutCreateRequestSender) GetAddressOk() (*OpenapiPayoutCreateRequestSenderAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *OpenapiPayoutCreateRequestSender) SetAddress(v OpenapiPayoutCreateRequestSenderAddress)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *OpenapiPayoutCreateRequestSender) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetIndividual

`func (o *OpenapiPayoutCreateRequestSender) GetIndividual() OpenapiPayoutCreateRequestSenderIndividual`

GetIndividual returns the Individual field if non-nil, zero value otherwise.

### GetIndividualOk

`func (o *OpenapiPayoutCreateRequestSender) GetIndividualOk() (*OpenapiPayoutCreateRequestSenderIndividual, bool)`

GetIndividualOk returns a tuple with the Individual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndividual

`func (o *OpenapiPayoutCreateRequestSender) SetIndividual(v OpenapiPayoutCreateRequestSenderIndividual)`

SetIndividual sets Individual field to given value.

### HasIndividual

`func (o *OpenapiPayoutCreateRequestSender) HasIndividual() bool`

HasIndividual returns a boolean if a field has been set.

### GetName

`func (o *OpenapiPayoutCreateRequestSender) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OpenapiPayoutCreateRequestSender) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OpenapiPayoutCreateRequestSender) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *OpenapiPayoutCreateRequestSender) HasName() bool`

HasName returns a boolean if a field has been set.

### GetType

`func (o *OpenapiPayoutCreateRequestSender) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OpenapiPayoutCreateRequestSender) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OpenapiPayoutCreateRequestSender) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OpenapiPayoutCreateRequestSender) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


