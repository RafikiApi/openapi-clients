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

// checks if the OpenapiPayoutListResponseMetaPaging type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OpenapiPayoutListResponseMetaPaging{}

// OpenapiPayoutListResponseMetaPaging struct for OpenapiPayoutListResponseMetaPaging
type OpenapiPayoutListResponseMetaPaging struct {
	Cursors *OpenapiPayoutListResponseMetaPagingCursors `json:"cursors,omitempty"`
	Next *string `json:"next,omitempty"`
}

// NewOpenapiPayoutListResponseMetaPaging instantiates a new OpenapiPayoutListResponseMetaPaging object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOpenapiPayoutListResponseMetaPaging() *OpenapiPayoutListResponseMetaPaging {
	this := OpenapiPayoutListResponseMetaPaging{}
	return &this
}

// NewOpenapiPayoutListResponseMetaPagingWithDefaults instantiates a new OpenapiPayoutListResponseMetaPaging object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOpenapiPayoutListResponseMetaPagingWithDefaults() *OpenapiPayoutListResponseMetaPaging {
	this := OpenapiPayoutListResponseMetaPaging{}
	return &this
}

// GetCursors returns the Cursors field value if set, zero value otherwise.
func (o *OpenapiPayoutListResponseMetaPaging) GetCursors() OpenapiPayoutListResponseMetaPagingCursors {
	if o == nil || IsNil(o.Cursors) {
		var ret OpenapiPayoutListResponseMetaPagingCursors
		return ret
	}
	return *o.Cursors
}

// GetCursorsOk returns a tuple with the Cursors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiPayoutListResponseMetaPaging) GetCursorsOk() (*OpenapiPayoutListResponseMetaPagingCursors, bool) {
	if o == nil || IsNil(o.Cursors) {
		return nil, false
	}
	return o.Cursors, true
}

// HasCursors returns a boolean if a field has been set.
func (o *OpenapiPayoutListResponseMetaPaging) HasCursors() bool {
	if o != nil && !IsNil(o.Cursors) {
		return true
	}

	return false
}

// SetCursors gets a reference to the given OpenapiPayoutListResponseMetaPagingCursors and assigns it to the Cursors field.
func (o *OpenapiPayoutListResponseMetaPaging) SetCursors(v OpenapiPayoutListResponseMetaPagingCursors) {
	o.Cursors = &v
}

// GetNext returns the Next field value if set, zero value otherwise.
func (o *OpenapiPayoutListResponseMetaPaging) GetNext() string {
	if o == nil || IsNil(o.Next) {
		var ret string
		return ret
	}
	return *o.Next
}

// GetNextOk returns a tuple with the Next field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiPayoutListResponseMetaPaging) GetNextOk() (*string, bool) {
	if o == nil || IsNil(o.Next) {
		return nil, false
	}
	return o.Next, true
}

// HasNext returns a boolean if a field has been set.
func (o *OpenapiPayoutListResponseMetaPaging) HasNext() bool {
	if o != nil && !IsNil(o.Next) {
		return true
	}

	return false
}

// SetNext gets a reference to the given string and assigns it to the Next field.
func (o *OpenapiPayoutListResponseMetaPaging) SetNext(v string) {
	o.Next = &v
}

func (o OpenapiPayoutListResponseMetaPaging) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OpenapiPayoutListResponseMetaPaging) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Cursors) {
		toSerialize["cursors"] = o.Cursors
	}
	if !IsNil(o.Next) {
		toSerialize["next"] = o.Next
	}
	return toSerialize, nil
}

type NullableOpenapiPayoutListResponseMetaPaging struct {
	value *OpenapiPayoutListResponseMetaPaging
	isSet bool
}

func (v NullableOpenapiPayoutListResponseMetaPaging) Get() *OpenapiPayoutListResponseMetaPaging {
	return v.value
}

func (v *NullableOpenapiPayoutListResponseMetaPaging) Set(val *OpenapiPayoutListResponseMetaPaging) {
	v.value = val
	v.isSet = true
}

func (v NullableOpenapiPayoutListResponseMetaPaging) IsSet() bool {
	return v.isSet
}

func (v *NullableOpenapiPayoutListResponseMetaPaging) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOpenapiPayoutListResponseMetaPaging(val *OpenapiPayoutListResponseMetaPaging) *NullableOpenapiPayoutListResponseMetaPaging {
	return &NullableOpenapiPayoutListResponseMetaPaging{value: val, isSet: true}
}

func (v NullableOpenapiPayoutListResponseMetaPaging) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOpenapiPayoutListResponseMetaPaging) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


