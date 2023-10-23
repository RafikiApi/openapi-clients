# OpenapiPayoutCreateRequestSenderIndividual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dob** | Pointer to **string** | Date of birth formatted as yyyy-mm-dd | [optional] 
**IdentityDocument** | Pointer to [**OpenapiPayoutCreateRequestSenderIndividualIdentityDocument**](OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.md) |  | [optional] 

## Methods

### NewOpenapiPayoutCreateRequestSenderIndividual

`func NewOpenapiPayoutCreateRequestSenderIndividual() *OpenapiPayoutCreateRequestSenderIndividual`

NewOpenapiPayoutCreateRequestSenderIndividual instantiates a new OpenapiPayoutCreateRequestSenderIndividual object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestSenderIndividualWithDefaults

`func NewOpenapiPayoutCreateRequestSenderIndividualWithDefaults() *OpenapiPayoutCreateRequestSenderIndividual`

NewOpenapiPayoutCreateRequestSenderIndividualWithDefaults instantiates a new OpenapiPayoutCreateRequestSenderIndividual object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDob

`func (o *OpenapiPayoutCreateRequestSenderIndividual) GetDob() string`

GetDob returns the Dob field if non-nil, zero value otherwise.

### GetDobOk

`func (o *OpenapiPayoutCreateRequestSenderIndividual) GetDobOk() (*string, bool)`

GetDobOk returns a tuple with the Dob field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDob

`func (o *OpenapiPayoutCreateRequestSenderIndividual) SetDob(v string)`

SetDob sets Dob field to given value.

### HasDob

`func (o *OpenapiPayoutCreateRequestSenderIndividual) HasDob() bool`

HasDob returns a boolean if a field has been set.

### GetIdentityDocument

`func (o *OpenapiPayoutCreateRequestSenderIndividual) GetIdentityDocument() OpenapiPayoutCreateRequestSenderIndividualIdentityDocument`

GetIdentityDocument returns the IdentityDocument field if non-nil, zero value otherwise.

### GetIdentityDocumentOk

`func (o *OpenapiPayoutCreateRequestSenderIndividual) GetIdentityDocumentOk() (*OpenapiPayoutCreateRequestSenderIndividualIdentityDocument, bool)`

GetIdentityDocumentOk returns a tuple with the IdentityDocument field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityDocument

`func (o *OpenapiPayoutCreateRequestSenderIndividual) SetIdentityDocument(v OpenapiPayoutCreateRequestSenderIndividualIdentityDocument)`

SetIdentityDocument sets IdentityDocument field to given value.

### HasIdentityDocument

`func (o *OpenapiPayoutCreateRequestSenderIndividual) HasIdentityDocument() bool`

HasIdentityDocument returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


