# OpenapiPayoutCreateRequestSenderAddress

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**City** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt; | [optional] 
**Country** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code associated with the address. | [optional] 
**Line1** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt; | [optional] 
**Line2** | Pointer to **string** |  | [optional] 
**Line3** | Pointer to **string** |  | [optional] 
**PostalCode** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt;  ⚠️ We enforce postal code validation for these following country codes : GB, US, PT, IE, MT, NG, NL, SK | [optional] 

## Methods

### NewOpenapiPayoutCreateRequestSenderAddress

`func NewOpenapiPayoutCreateRequestSenderAddress() *OpenapiPayoutCreateRequestSenderAddress`

NewOpenapiPayoutCreateRequestSenderAddress instantiates a new OpenapiPayoutCreateRequestSenderAddress object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestSenderAddressWithDefaults

`func NewOpenapiPayoutCreateRequestSenderAddressWithDefaults() *OpenapiPayoutCreateRequestSenderAddress`

NewOpenapiPayoutCreateRequestSenderAddressWithDefaults instantiates a new OpenapiPayoutCreateRequestSenderAddress object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCity

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *OpenapiPayoutCreateRequestSenderAddress) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *OpenapiPayoutCreateRequestSenderAddress) HasCity() bool`

HasCity returns a boolean if a field has been set.

### GetCountry

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *OpenapiPayoutCreateRequestSenderAddress) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *OpenapiPayoutCreateRequestSenderAddress) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetLine1

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetLine1() string`

GetLine1 returns the Line1 field if non-nil, zero value otherwise.

### GetLine1Ok

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetLine1Ok() (*string, bool)`

GetLine1Ok returns a tuple with the Line1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLine1

`func (o *OpenapiPayoutCreateRequestSenderAddress) SetLine1(v string)`

SetLine1 sets Line1 field to given value.

### HasLine1

`func (o *OpenapiPayoutCreateRequestSenderAddress) HasLine1() bool`

HasLine1 returns a boolean if a field has been set.

### GetLine2

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetLine2() string`

GetLine2 returns the Line2 field if non-nil, zero value otherwise.

### GetLine2Ok

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetLine2Ok() (*string, bool)`

GetLine2Ok returns a tuple with the Line2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLine2

`func (o *OpenapiPayoutCreateRequestSenderAddress) SetLine2(v string)`

SetLine2 sets Line2 field to given value.

### HasLine2

`func (o *OpenapiPayoutCreateRequestSenderAddress) HasLine2() bool`

HasLine2 returns a boolean if a field has been set.

### GetLine3

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetLine3() string`

GetLine3 returns the Line3 field if non-nil, zero value otherwise.

### GetLine3Ok

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetLine3Ok() (*string, bool)`

GetLine3Ok returns a tuple with the Line3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLine3

`func (o *OpenapiPayoutCreateRequestSenderAddress) SetLine3(v string)`

SetLine3 sets Line3 field to given value.

### HasLine3

`func (o *OpenapiPayoutCreateRequestSenderAddress) HasLine3() bool`

HasLine3 returns a boolean if a field has been set.

### GetPostalCode

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetPostalCode() string`

GetPostalCode returns the PostalCode field if non-nil, zero value otherwise.

### GetPostalCodeOk

`func (o *OpenapiPayoutCreateRequestSenderAddress) GetPostalCodeOk() (*string, bool)`

GetPostalCodeOk returns a tuple with the PostalCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostalCode

`func (o *OpenapiPayoutCreateRequestSenderAddress) SetPostalCode(v string)`

SetPostalCode sets PostalCode field to given value.

### HasPostalCode

`func (o *OpenapiPayoutCreateRequestSenderAddress) HasPostalCode() bool`

HasPostalCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


