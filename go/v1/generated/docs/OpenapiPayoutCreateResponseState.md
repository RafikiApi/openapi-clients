# OpenapiPayoutCreateResponseState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | The state code signifies the overall status of a payout. For detailed information about the meaning of each state, please consult the lifecycle section above. | [optional] 
**Context** | Pointer to **string** | Together with the \&quot;code\&quot; property, the \&quot;context\&quot; property offers additional context and information, whenever possible, about the specific state. For instance, if a payout fails, there are numerous reasons why this might occur. The \&quot;context\&quot; property will provide more detailed information in such cases. | [optional] 

## Methods

### NewOpenapiPayoutCreateResponseState

`func NewOpenapiPayoutCreateResponseState() *OpenapiPayoutCreateResponseState`

NewOpenapiPayoutCreateResponseState instantiates a new OpenapiPayoutCreateResponseState object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateResponseStateWithDefaults

`func NewOpenapiPayoutCreateResponseStateWithDefaults() *OpenapiPayoutCreateResponseState`

NewOpenapiPayoutCreateResponseStateWithDefaults instantiates a new OpenapiPayoutCreateResponseState object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *OpenapiPayoutCreateResponseState) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *OpenapiPayoutCreateResponseState) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *OpenapiPayoutCreateResponseState) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *OpenapiPayoutCreateResponseState) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetContext

`func (o *OpenapiPayoutCreateResponseState) GetContext() string`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *OpenapiPayoutCreateResponseState) GetContextOk() (*string, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *OpenapiPayoutCreateResponseState) SetContext(v string)`

SetContext sets Context field to given value.

### HasContext

`func (o *OpenapiPayoutCreateResponseState) HasContext() bool`

HasContext returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


