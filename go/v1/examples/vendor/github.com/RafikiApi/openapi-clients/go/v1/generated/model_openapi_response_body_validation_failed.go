/*
Resources

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package rafikigen

import (
	"encoding/json"
)

// checks if the OpenapiResponseBodyValidationFailed type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OpenapiResponseBodyValidationFailed{}

// OpenapiResponseBodyValidationFailed struct for OpenapiResponseBodyValidationFailed
type OpenapiResponseBodyValidationFailed struct {
	// `VALIDATION_FAILED`
	Code *string `json:"code,omitempty"`
	Errors *OpenapiResponseBodyValidationFailedErrors `json:"errors,omitempty"`
	// E.g. \"Validation failed.\"
	Message *string `json:"message,omitempty"`
}

// NewOpenapiResponseBodyValidationFailed instantiates a new OpenapiResponseBodyValidationFailed object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOpenapiResponseBodyValidationFailed() *OpenapiResponseBodyValidationFailed {
	this := OpenapiResponseBodyValidationFailed{}
	return &this
}

// NewOpenapiResponseBodyValidationFailedWithDefaults instantiates a new OpenapiResponseBodyValidationFailed object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOpenapiResponseBodyValidationFailedWithDefaults() *OpenapiResponseBodyValidationFailed {
	this := OpenapiResponseBodyValidationFailed{}
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *OpenapiResponseBodyValidationFailed) GetCode() string {
	if o == nil || IsNil(o.Code) {
		var ret string
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiResponseBodyValidationFailed) GetCodeOk() (*string, bool) {
	if o == nil || IsNil(o.Code) {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *OpenapiResponseBodyValidationFailed) HasCode() bool {
	if o != nil && !IsNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given string and assigns it to the Code field.
func (o *OpenapiResponseBodyValidationFailed) SetCode(v string) {
	o.Code = &v
}

// GetErrors returns the Errors field value if set, zero value otherwise.
func (o *OpenapiResponseBodyValidationFailed) GetErrors() OpenapiResponseBodyValidationFailedErrors {
	if o == nil || IsNil(o.Errors) {
		var ret OpenapiResponseBodyValidationFailedErrors
		return ret
	}
	return *o.Errors
}

// GetErrorsOk returns a tuple with the Errors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiResponseBodyValidationFailed) GetErrorsOk() (*OpenapiResponseBodyValidationFailedErrors, bool) {
	if o == nil || IsNil(o.Errors) {
		return nil, false
	}
	return o.Errors, true
}

// HasErrors returns a boolean if a field has been set.
func (o *OpenapiResponseBodyValidationFailed) HasErrors() bool {
	if o != nil && !IsNil(o.Errors) {
		return true
	}

	return false
}

// SetErrors gets a reference to the given OpenapiResponseBodyValidationFailedErrors and assigns it to the Errors field.
func (o *OpenapiResponseBodyValidationFailed) SetErrors(v OpenapiResponseBodyValidationFailedErrors) {
	o.Errors = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *OpenapiResponseBodyValidationFailed) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiResponseBodyValidationFailed) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *OpenapiResponseBodyValidationFailed) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *OpenapiResponseBodyValidationFailed) SetMessage(v string) {
	o.Message = &v
}

func (o OpenapiResponseBodyValidationFailed) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OpenapiResponseBodyValidationFailed) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Code) {
		toSerialize["code"] = o.Code
	}
	if !IsNil(o.Errors) {
		toSerialize["errors"] = o.Errors
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	return toSerialize, nil
}

type NullableOpenapiResponseBodyValidationFailed struct {
	value *OpenapiResponseBodyValidationFailed
	isSet bool
}

func (v NullableOpenapiResponseBodyValidationFailed) Get() *OpenapiResponseBodyValidationFailed {
	return v.value
}

func (v *NullableOpenapiResponseBodyValidationFailed) Set(val *OpenapiResponseBodyValidationFailed) {
	v.value = val
	v.isSet = true
}

func (v NullableOpenapiResponseBodyValidationFailed) IsSet() bool {
	return v.isSet
}

func (v *NullableOpenapiResponseBodyValidationFailed) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOpenapiResponseBodyValidationFailed(val *OpenapiResponseBodyValidationFailed) *NullableOpenapiResponseBodyValidationFailed {
	return &NullableOpenapiResponseBodyValidationFailed{value: val, isSet: true}
}

func (v NullableOpenapiResponseBodyValidationFailed) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOpenapiResponseBodyValidationFailed) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

