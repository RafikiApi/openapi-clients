# OpenapiPayoutCreateRequestSenderIndividualIdentityDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional] 
**ExpiresOn** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  Date formatted as yyyy-mm-dd | [optional] 
**IssuedOn** | Pointer to **string** | Date formatted as yyyy-mm-dd | [optional] 
**Number** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt; | [optional] 
**Type** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  One of &#x60;PASSPORT&#x60;, &#x60;DRIVING_LICENCE&#x60;, &#x60;NATIONAL_ID_CARD&#x60;, &#x60;RESIDENCE_PERMIT&#x60; | [optional] 

## Methods

### NewOpenapiPayoutCreateRequestSenderIndividualIdentityDocument

`func NewOpenapiPayoutCreateRequestSenderIndividualIdentityDocument() *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument`

NewOpenapiPayoutCreateRequestSenderIndividualIdentityDocument instantiates a new OpenapiPayoutCreateRequestSenderIndividualIdentityDocument object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestSenderIndividualIdentityDocumentWithDefaults

`func NewOpenapiPayoutCreateRequestSenderIndividualIdentityDocumentWithDefaults() *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument`

NewOpenapiPayoutCreateRequestSenderIndividualIdentityDocumentWithDefaults instantiates a new OpenapiPayoutCreateRequestSenderIndividualIdentityDocument object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetExpiresOn

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetExpiresOn() string`

GetExpiresOn returns the ExpiresOn field if non-nil, zero value otherwise.

### GetExpiresOnOk

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetExpiresOnOk() (*string, bool)`

GetExpiresOnOk returns a tuple with the ExpiresOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresOn

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) SetExpiresOn(v string)`

SetExpiresOn sets ExpiresOn field to given value.

### HasExpiresOn

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) HasExpiresOn() bool`

HasExpiresOn returns a boolean if a field has been set.

### GetIssuedOn

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetIssuedOn() string`

GetIssuedOn returns the IssuedOn field if non-nil, zero value otherwise.

### GetIssuedOnOk

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetIssuedOnOk() (*string, bool)`

GetIssuedOnOk returns a tuple with the IssuedOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuedOn

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) SetIssuedOn(v string)`

SetIssuedOn sets IssuedOn field to given value.

### HasIssuedOn

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) HasIssuedOn() bool`

HasIssuedOn returns a boolean if a field has been set.

### GetNumber

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetType

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OpenapiPayoutCreateRequestSenderIndividualIdentityDocument) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


