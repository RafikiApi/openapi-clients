# OpenapiResponseBodyValidationFailed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | &#x60;VALIDATION_FAILED&#x60; | [optional] 
**Errors** | Pointer to [**OpenapiResponseBodyValidationFailedErrors**](OpenapiResponseBodyValidationFailedErrors.md) |  | [optional] 
**Message** | Pointer to **string** | E.g. \&quot;Validation failed.\&quot; | [optional] 

## Methods

### NewOpenapiResponseBodyValidationFailed

`func NewOpenapiResponseBodyValidationFailed() *OpenapiResponseBodyValidationFailed`

NewOpenapiResponseBodyValidationFailed instantiates a new OpenapiResponseBodyValidationFailed object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiResponseBodyValidationFailedWithDefaults

`func NewOpenapiResponseBodyValidationFailedWithDefaults() *OpenapiResponseBodyValidationFailed`

NewOpenapiResponseBodyValidationFailedWithDefaults instantiates a new OpenapiResponseBodyValidationFailed object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *OpenapiResponseBodyValidationFailed) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *OpenapiResponseBodyValidationFailed) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *OpenapiResponseBodyValidationFailed) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *OpenapiResponseBodyValidationFailed) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetErrors

`func (o *OpenapiResponseBodyValidationFailed) GetErrors() OpenapiResponseBodyValidationFailedErrors`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *OpenapiResponseBodyValidationFailed) GetErrorsOk() (*OpenapiResponseBodyValidationFailedErrors, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *OpenapiResponseBodyValidationFailed) SetErrors(v OpenapiResponseBodyValidationFailedErrors)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *OpenapiResponseBodyValidationFailed) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetMessage

`func (o *OpenapiResponseBodyValidationFailed) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *OpenapiResponseBodyValidationFailed) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *OpenapiResponseBodyValidationFailed) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *OpenapiResponseBodyValidationFailed) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


