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

// checks if the OpenapiPayoutListResponseMeta type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OpenapiPayoutListResponseMeta{}

// OpenapiPayoutListResponseMeta struct for OpenapiPayoutListResponseMeta
type OpenapiPayoutListResponseMeta struct {
	Paging *OpenapiPayoutListResponseMetaPaging `json:"paging,omitempty"`
}

// NewOpenapiPayoutListResponseMeta instantiates a new OpenapiPayoutListResponseMeta object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOpenapiPayoutListResponseMeta() *OpenapiPayoutListResponseMeta {
	this := OpenapiPayoutListResponseMeta{}
	return &this
}

// NewOpenapiPayoutListResponseMetaWithDefaults instantiates a new OpenapiPayoutListResponseMeta object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOpenapiPayoutListResponseMetaWithDefaults() *OpenapiPayoutListResponseMeta {
	this := OpenapiPayoutListResponseMeta{}
	return &this
}

// GetPaging returns the Paging field value if set, zero value otherwise.
func (o *OpenapiPayoutListResponseMeta) GetPaging() OpenapiPayoutListResponseMetaPaging {
	if o == nil || IsNil(o.Paging) {
		var ret OpenapiPayoutListResponseMetaPaging
		return ret
	}
	return *o.Paging
}

// GetPagingOk returns a tuple with the Paging field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiPayoutListResponseMeta) GetPagingOk() (*OpenapiPayoutListResponseMetaPaging, bool) {
	if o == nil || IsNil(o.Paging) {
		return nil, false
	}
	return o.Paging, true
}

// HasPaging returns a boolean if a field has been set.
func (o *OpenapiPayoutListResponseMeta) HasPaging() bool {
	if o != nil && !IsNil(o.Paging) {
		return true
	}

	return false
}

// SetPaging gets a reference to the given OpenapiPayoutListResponseMetaPaging and assigns it to the Paging field.
func (o *OpenapiPayoutListResponseMeta) SetPaging(v OpenapiPayoutListResponseMetaPaging) {
	o.Paging = &v
}

func (o OpenapiPayoutListResponseMeta) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OpenapiPayoutListResponseMeta) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Paging) {
		toSerialize["paging"] = o.Paging
	}
	return toSerialize, nil
}

type NullableOpenapiPayoutListResponseMeta struct {
	value *OpenapiPayoutListResponseMeta
	isSet bool
}

func (v NullableOpenapiPayoutListResponseMeta) Get() *OpenapiPayoutListResponseMeta {
	return v.value
}

func (v *NullableOpenapiPayoutListResponseMeta) Set(val *OpenapiPayoutListResponseMeta) {
	v.value = val
	v.isSet = true
}

func (v NullableOpenapiPayoutListResponseMeta) IsSet() bool {
	return v.isSet
}

func (v *NullableOpenapiPayoutListResponseMeta) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOpenapiPayoutListResponseMeta(val *OpenapiPayoutListResponseMeta) *NullableOpenapiPayoutListResponseMeta {
	return &NullableOpenapiPayoutListResponseMeta{value: val, isSet: true}
}

func (v NullableOpenapiPayoutListResponseMeta) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOpenapiPayoutListResponseMeta) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


