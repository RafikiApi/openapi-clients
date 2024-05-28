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

// checks if the PaymentAccountsPost200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PaymentAccountsPost200Response{}

// PaymentAccountsPost200Response struct for PaymentAccountsPost200Response
type PaymentAccountsPost200Response struct {
	Data *OpenapiPaymentAccountGetOrCreateResponse `json:"data,omitempty"`
}

// NewPaymentAccountsPost200Response instantiates a new PaymentAccountsPost200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaymentAccountsPost200Response() *PaymentAccountsPost200Response {
	this := PaymentAccountsPost200Response{}
	return &this
}

// NewPaymentAccountsPost200ResponseWithDefaults instantiates a new PaymentAccountsPost200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaymentAccountsPost200ResponseWithDefaults() *PaymentAccountsPost200Response {
	this := PaymentAccountsPost200Response{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *PaymentAccountsPost200Response) GetData() OpenapiPaymentAccountGetOrCreateResponse {
	if o == nil || IsNil(o.Data) {
		var ret OpenapiPaymentAccountGetOrCreateResponse
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaymentAccountsPost200Response) GetDataOk() (*OpenapiPaymentAccountGetOrCreateResponse, bool) {
	if o == nil || IsNil(o.Data) {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *PaymentAccountsPost200Response) HasData() bool {
	if o != nil && !IsNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given OpenapiPaymentAccountGetOrCreateResponse and assigns it to the Data field.
func (o *PaymentAccountsPost200Response) SetData(v OpenapiPaymentAccountGetOrCreateResponse) {
	o.Data = &v
}

func (o PaymentAccountsPost200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PaymentAccountsPost200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	return toSerialize, nil
}

type NullablePaymentAccountsPost200Response struct {
	value *PaymentAccountsPost200Response
	isSet bool
}

func (v NullablePaymentAccountsPost200Response) Get() *PaymentAccountsPost200Response {
	return v.value
}

func (v *NullablePaymentAccountsPost200Response) Set(val *PaymentAccountsPost200Response) {
	v.value = val
	v.isSet = true
}

func (v NullablePaymentAccountsPost200Response) IsSet() bool {
	return v.isSet
}

func (v *NullablePaymentAccountsPost200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaymentAccountsPost200Response(val *PaymentAccountsPost200Response) *NullablePaymentAccountsPost200Response {
	return &NullablePaymentAccountsPost200Response{value: val, isSet: true}
}

func (v NullablePaymentAccountsPost200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaymentAccountsPost200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


