# OpenapiPaymentAccountGetOrCreateRequestHolder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either the INDIVIDUAL full name or the BUSINESS registered legal name | [optional] 
**Type** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The holder legal entity type, whether an INDIVIDUAL person or a BUSINESS | [optional] 

## Methods

### NewOpenapiPaymentAccountGetOrCreateRequestHolder

`func NewOpenapiPaymentAccountGetOrCreateRequestHolder() *OpenapiPaymentAccountGetOrCreateRequestHolder`

NewOpenapiPaymentAccountGetOrCreateRequestHolder instantiates a new OpenapiPaymentAccountGetOrCreateRequestHolder object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPaymentAccountGetOrCreateRequestHolderWithDefaults

`func NewOpenapiPaymentAccountGetOrCreateRequestHolderWithDefaults() *OpenapiPaymentAccountGetOrCreateRequestHolder`

NewOpenapiPaymentAccountGetOrCreateRequestHolderWithDefaults instantiates a new OpenapiPaymentAccountGetOrCreateRequestHolder object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) HasName() bool`

HasName returns a boolean if a field has been set.

### GetType

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OpenapiPaymentAccountGetOrCreateRequestHolder) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


