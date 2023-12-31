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

// checks if the OpenapiResponseBodyIdempotencyConflict type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OpenapiResponseBodyIdempotencyConflict{}

// OpenapiResponseBodyIdempotencyConflict struct for OpenapiResponseBodyIdempotencyConflict
type OpenapiResponseBodyIdempotencyConflict struct {
	// Can be either `IDEMPOTENCY_RACE` or `IDEMPOTENCY_KEY_ALREADY_USED`
	Code *string `json:"code,omitempty"`
	// E.g. \"Idempotency key already in use\"
	Message *string `json:"message,omitempty"`
}

// NewOpenapiResponseBodyIdempotencyConflict instantiates a new OpenapiResponseBodyIdempotencyConflict object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOpenapiResponseBodyIdempotencyConflict() *OpenapiResponseBodyIdempotencyConflict {
	this := OpenapiResponseBodyIdempotencyConflict{}
	return &this
}

// NewOpenapiResponseBodyIdempotencyConflictWithDefaults instantiates a new OpenapiResponseBodyIdempotencyConflict object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOpenapiResponseBodyIdempotencyConflictWithDefaults() *OpenapiResponseBodyIdempotencyConflict {
	this := OpenapiResponseBodyIdempotencyConflict{}
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *OpenapiResponseBodyIdempotencyConflict) GetCode() string {
	if o == nil || IsNil(o.Code) {
		var ret string
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiResponseBodyIdempotencyConflict) GetCodeOk() (*string, bool) {
	if o == nil || IsNil(o.Code) {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *OpenapiResponseBodyIdempotencyConflict) HasCode() bool {
	if o != nil && !IsNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given string and assigns it to the Code field.
func (o *OpenapiResponseBodyIdempotencyConflict) SetCode(v string) {
	o.Code = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *OpenapiResponseBodyIdempotencyConflict) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiResponseBodyIdempotencyConflict) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *OpenapiResponseBodyIdempotencyConflict) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *OpenapiResponseBodyIdempotencyConflict) SetMessage(v string) {
	o.Message = &v
}

func (o OpenapiResponseBodyIdempotencyConflict) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OpenapiResponseBodyIdempotencyConflict) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Code) {
		toSerialize["code"] = o.Code
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	return toSerialize, nil
}

type NullableOpenapiResponseBodyIdempotencyConflict struct {
	value *OpenapiResponseBodyIdempotencyConflict
	isSet bool
}

func (v NullableOpenapiResponseBodyIdempotencyConflict) Get() *OpenapiResponseBodyIdempotencyConflict {
	return v.value
}

func (v *NullableOpenapiResponseBodyIdempotencyConflict) Set(val *OpenapiResponseBodyIdempotencyConflict) {
	v.value = val
	v.isSet = true
}

func (v NullableOpenapiResponseBodyIdempotencyConflict) IsSet() bool {
	return v.isSet
}

func (v *NullableOpenapiResponseBodyIdempotencyConflict) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOpenapiResponseBodyIdempotencyConflict(val *OpenapiResponseBodyIdempotencyConflict) *NullableOpenapiResponseBodyIdempotencyConflict {
	return &NullableOpenapiResponseBodyIdempotencyConflict{value: val, isSet: true}
}

func (v NullableOpenapiResponseBodyIdempotencyConflict) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOpenapiResponseBodyIdempotencyConflict) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


