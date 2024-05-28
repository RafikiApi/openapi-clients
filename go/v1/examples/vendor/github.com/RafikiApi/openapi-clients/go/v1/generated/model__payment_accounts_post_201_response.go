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

// checks if the PaymentAccountsPost201Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PaymentAccountsPost201Response{}

// PaymentAccountsPost201Response struct for PaymentAccountsPost201Response
type PaymentAccountsPost201Response struct {
	Data *OpenapiPaymentAccountGetOrCreateResponse `json:"data,omitempty"`
}

// NewPaymentAccountsPost201Response instantiates a new PaymentAccountsPost201Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaymentAccountsPost201Response() *PaymentAccountsPost201Response {
	this := PaymentAccountsPost201Response{}
	return &this
}

// NewPaymentAccountsPost201ResponseWithDefaults instantiates a new PaymentAccountsPost201Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaymentAccountsPost201ResponseWithDefaults() *PaymentAccountsPost201Response {
	this := PaymentAccountsPost201Response{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *PaymentAccountsPost201Response) GetData() OpenapiPaymentAccountGetOrCreateResponse {
	if o == nil || IsNil(o.Data) {
		var ret OpenapiPaymentAccountGetOrCreateResponse
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentAccountsPost201Response) GetDataOk() (*OpenapiPaymentAccountGetOrCreateResponse, bool) {
	if o == nil || IsNil(o.Data) {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *PaymentAccountsPost201Response) HasData() bool {
	if o != nil && !IsNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given OpenapiPaymentAccountGetOrCreateResponse and assigns it to the Data field.
func (o *PaymentAccountsPost201Response) SetData(v OpenapiPaymentAccountGetOrCreateResponse) {
	o.Data = &v
}

func (o PaymentAccountsPost201Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PaymentAccountsPost201Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	return toSerialize, nil
}

type NullablePaymentAccountsPost201Response struct {
	value *PaymentAccountsPost201Response
	isSet bool
}

func (v NullablePaymentAccountsPost201Response) Get() *PaymentAccountsPost201Response {
	return v.value
}

func (v *NullablePaymentAccountsPost201Response) Set(val *PaymentAccountsPost201Response) {
	v.value = val
	v.isSet = true
}

func (v NullablePaymentAccountsPost201Response) IsSet() bool {
	return v.isSet
}

func (v *NullablePaymentAccountsPost201Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaymentAccountsPost201Response(val *PaymentAccountsPost201Response) *NullablePaymentAccountsPost201Response {
	return &NullablePaymentAccountsPost201Response{value: val, isSet: true}
}

func (v NullablePaymentAccountsPost201Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaymentAccountsPost201Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


