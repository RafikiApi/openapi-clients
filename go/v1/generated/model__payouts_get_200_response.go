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

// checks if the PayoutsGet200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PayoutsGet200Response{}

// PayoutsGet200Response struct for PayoutsGet200Response
type PayoutsGet200Response struct {
	Data []OpenapiPayoutGetResponse `json:"data,omitempty"`
	Meta *OpenapiResponseBodySuccessCursorPaginatedMeta `json:"meta,omitempty"`
}

// NewPayoutsGet200Response instantiates a new PayoutsGet200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPayoutsGet200Response() *PayoutsGet200Response {
	this := PayoutsGet200Response{}
	return &this
}

// NewPayoutsGet200ResponseWithDefaults instantiates a new PayoutsGet200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPayoutsGet200ResponseWithDefaults() *PayoutsGet200Response {
	this := PayoutsGet200Response{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *PayoutsGet200Response) GetData() []OpenapiPayoutGetResponse {
	if o == nil || IsNil(o.Data) {
		var ret []OpenapiPayoutGetResponse
		return ret
	}
	return o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PayoutsGet200Response) GetDataOk() ([]OpenapiPayoutGetResponse, bool) {
	if o == nil || IsNil(o.Data) {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *PayoutsGet200Response) HasData() bool {
	if o != nil && !IsNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given []OpenapiPayoutGetResponse and assigns it to the Data field.
func (o *PayoutsGet200Response) SetData(v []OpenapiPayoutGetResponse) {
	o.Data = v
}

// GetMeta returns the Meta field value if set, zero value otherwise.
func (o *PayoutsGet200Response) GetMeta() OpenapiResponseBodySuccessCursorPaginatedMeta {
	if o == nil || IsNil(o.Meta) {
		var ret OpenapiResponseBodySuccessCursorPaginatedMeta
		return ret
	}
	return *o.Meta
}

// GetMetaOk returns a tuple with the Meta field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PayoutsGet200Response) GetMetaOk() (*OpenapiResponseBodySuccessCursorPaginatedMeta, bool) {
	if o == nil || IsNil(o.Meta) {
		return nil, false
	}
	return o.Meta, true
}

// HasMeta returns a boolean if a field has been set.
func (o *PayoutsGet200Response) HasMeta() bool {
	if o != nil && !IsNil(o.Meta) {
		return true
	}

	return false
}

// SetMeta gets a reference to the given OpenapiResponseBodySuccessCursorPaginatedMeta and assigns it to the Meta field.
func (o *PayoutsGet200Response) SetMeta(v OpenapiResponseBodySuccessCursorPaginatedMeta) {
	o.Meta = &v
}

func (o PayoutsGet200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PayoutsGet200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !IsNil(o.Meta) {
		toSerialize["meta"] = o.Meta
	}
	return toSerialize, nil
}

type NullablePayoutsGet200Response struct {
	value *PayoutsGet200Response
	isSet bool
}

func (v NullablePayoutsGet200Response) Get() *PayoutsGet200Response {
	return v.value
}

func (v *NullablePayoutsGet200Response) Set(val *PayoutsGet200Response) {
	v.value = val
	v.isSet = true
}

func (v NullablePayoutsGet200Response) IsSet() bool {
	return v.isSet
}

func (v *NullablePayoutsGet200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePayoutsGet200Response(val *PayoutsGet200Response) *NullablePayoutsGet200Response {
	return &NullablePayoutsGet200Response{value: val, isSet: true}
}

func (v NullablePayoutsGet200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePayoutsGet200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

