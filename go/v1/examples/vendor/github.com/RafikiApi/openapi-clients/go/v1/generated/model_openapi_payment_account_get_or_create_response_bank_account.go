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

// checks if the OpenapiPaymentAccountGetOrCreateResponseBankAccount type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OpenapiPaymentAccountGetOrCreateResponseBankAccount{}

// OpenapiPaymentAccountGetOrCreateResponseBankAccount struct for OpenapiPaymentAccountGetOrCreateResponseBankAccount
type OpenapiPaymentAccountGetOrCreateResponseBankAccount struct {
	BankId *string `json:"bank_id,omitempty"`
	BranchId *string `json:"branch_id,omitempty"`
	Number *string `json:"number,omitempty"`
}

// NewOpenapiPaymentAccountGetOrCreateResponseBankAccount instantiates a new OpenapiPaymentAccountGetOrCreateResponseBankAccount object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOpenapiPaymentAccountGetOrCreateResponseBankAccount() *OpenapiPaymentAccountGetOrCreateResponseBankAccount {
	this := OpenapiPaymentAccountGetOrCreateResponseBankAccount{}
	return &this
}

// NewOpenapiPaymentAccountGetOrCreateResponseBankAccountWithDefaults instantiates a new OpenapiPaymentAccountGetOrCreateResponseBankAccount object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOpenapiPaymentAccountGetOrCreateResponseBankAccountWithDefaults() *OpenapiPaymentAccountGetOrCreateResponseBankAccount {
	this := OpenapiPaymentAccountGetOrCreateResponseBankAccount{}
	return &this
}

// GetBankId returns the BankId field value if set, zero value otherwise.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) GetBankId() string {
	if o == nil || IsNil(o.BankId) {
		var ret string
		return ret
	}
	return *o.BankId
}

// GetBankIdOk returns a tuple with the BankId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) GetBankIdOk() (*string, bool) {
	if o == nil || IsNil(o.BankId) {
		return nil, false
	}
	return o.BankId, true
}

// HasBankId returns a boolean if a field has been set.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) HasBankId() bool {
	if o != nil && !IsNil(o.BankId) {
		return true
	}

	return false
}

// SetBankId gets a reference to the given string and assigns it to the BankId field.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) SetBankId(v string) {
	o.BankId = &v
}

// GetBranchId returns the BranchId field value if set, zero value otherwise.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) GetBranchId() string {
	if o == nil || IsNil(o.BranchId) {
		var ret string
		return ret
	}
	return *o.BranchId
}

// GetBranchIdOk returns a tuple with the BranchId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) GetBranchIdOk() (*string, bool) {
	if o == nil || IsNil(o.BranchId) {
		return nil, false
	}
	return o.BranchId, true
}

// HasBranchId returns a boolean if a field has been set.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) HasBranchId() bool {
	if o != nil && !IsNil(o.BranchId) {
		return true
	}

	return false
}

// SetBranchId gets a reference to the given string and assigns it to the BranchId field.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) SetBranchId(v string) {
	o.BranchId = &v
}

// GetNumber returns the Number field value if set, zero value otherwise.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) GetNumber() string {
	if o == nil || IsNil(o.Number) {
		var ret string
		return ret
	}
	return *o.Number
}

// GetNumberOk returns a tuple with the Number field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) GetNumberOk() (*string, bool) {
	if o == nil || IsNil(o.Number) {
		return nil, false
	}
	return o.Number, true
}

// HasNumber returns a boolean if a field has been set.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) HasNumber() bool {
	if o != nil && !IsNil(o.Number) {
		return true
	}

	return false
}

// SetNumber gets a reference to the given string and assigns it to the Number field.
func (o *OpenapiPaymentAccountGetOrCreateResponseBankAccount) SetNumber(v string) {
	o.Number = &v
}

func (o OpenapiPaymentAccountGetOrCreateResponseBankAccount) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OpenapiPaymentAccountGetOrCreateResponseBankAccount) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.BankId) {
		toSerialize["bank_id"] = o.BankId
	}
	if !IsNil(o.BranchId) {
		toSerialize["branch_id"] = o.BranchId
	}
	if !IsNil(o.Number) {
		toSerialize["number"] = o.Number
	}
	return toSerialize, nil
}

type NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount struct {
	value *OpenapiPaymentAccountGetOrCreateResponseBankAccount
	isSet bool
}

func (v NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount) Get() *OpenapiPaymentAccountGetOrCreateResponseBankAccount {
	return v.value
}

func (v *NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount) Set(val *OpenapiPaymentAccountGetOrCreateResponseBankAccount) {
	v.value = val
	v.isSet = true
}

func (v NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount) IsSet() bool {
	return v.isSet
}

func (v *NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOpenapiPaymentAccountGetOrCreateResponseBankAccount(val *OpenapiPaymentAccountGetOrCreateResponseBankAccount) *NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount {
	return &NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount{value: val, isSet: true}
}

func (v NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOpenapiPaymentAccountGetOrCreateResponseBankAccount) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

