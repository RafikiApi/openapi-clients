# OpenapiPayoutCreateResponseSenderIndividual

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dob** | Pointer to **string** | Date of birth formatted as yyyy-mm-dd | [optional] 
**IdentityDocument** | Pointer to [**OpenapiPayoutCreateResponseSenderIndividualIdentityDocument**](OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.md) |  | [optional] 

## Methods

### NewOpenapiPayoutCreateResponseSenderIndividual

`func NewOpenapiPayoutCreateResponseSenderIndividual() *OpenapiPayoutCreateResponseSenderIndividual`

NewOpenapiPayoutCreateResponseSenderIndividual instantiates a new OpenapiPayoutCreateResponseSenderIndividual object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateResponseSenderIndividualWithDefaults

`func NewOpenapiPayoutCreateResponseSenderIndividualWithDefaults() *OpenapiPayoutCreateResponseSenderIndividual`

NewOpenapiPayoutCreateResponseSenderIndividualWithDefaults instantiates a new OpenapiPayoutCreateResponseSenderIndividual object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDob

`func (o *OpenapiPayoutCreateResponseSenderIndividual) GetDob() string`

GetDob returns the Dob field if non-nil, zero value otherwise.

### GetDobOk

`func (o *OpenapiPayoutCreateResponseSenderIndividual) GetDobOk() (*string, bool)`

GetDobOk returns a tuple with the Dob field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDob

`func (o *OpenapiPayoutCreateResponseSenderIndividual) SetDob(v string)`

SetDob sets Dob field to given value.

### HasDob

`func (o *OpenapiPayoutCreateResponseSenderIndividual) HasDob() bool`

HasDob returns a boolean if a field has been set.

### GetIdentityDocument

`func (o *OpenapiPayoutCreateResponseSenderIndividual) GetIdentityDocument() OpenapiPayoutCreateResponseSenderIndividualIdentityDocument`

GetIdentityDocument returns the IdentityDocument field if non-nil, zero value otherwise.

### GetIdentityDocumentOk

`func (o *OpenapiPayoutCreateResponseSenderIndividual) GetIdentityDocumentOk() (*OpenapiPayoutCreateResponseSenderIndividualIdentityDocument, bool)`

GetIdentityDocumentOk returns a tuple with the IdentityDocument field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentityDocument

`func (o *OpenapiPayoutCreateResponseSenderIndividual) SetIdentityDocument(v OpenapiPayoutCreateResponseSenderIndividualIdentityDocument)`

SetIdentityDocument sets IdentityDocument field to given value.

### HasIdentityDocument

`func (o *OpenapiPayoutCreateResponseSenderIndividual) HasIdentityDocument() bool`

HasIdentityDocument returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


