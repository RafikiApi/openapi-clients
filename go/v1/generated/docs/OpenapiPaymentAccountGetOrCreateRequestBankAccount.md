# OpenapiPaymentAccountGetOrCreateRequestBankAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BankId** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The bank identifier representing the bank associated with the payment account | [optional] 
**BranchId** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt; &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if the bank spans across multiple branches&lt;/span&gt;  The branch identifier representing the branch associated with the payment account | [optional] 
**Number** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The actual bank account number (alphanum). | [optional] 

## Methods

### NewOpenapiPaymentAccountGetOrCreateRequestBankAccount

`func NewOpenapiPaymentAccountGetOrCreateRequestBankAccount() *OpenapiPaymentAccountGetOrCreateRequestBankAccount`

NewOpenapiPaymentAccountGetOrCreateRequestBankAccount instantiates a new OpenapiPaymentAccountGetOrCreateRequestBankAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPaymentAccountGetOrCreateRequestBankAccountWithDefaults

`func NewOpenapiPaymentAccountGetOrCreateRequestBankAccountWithDefaults() *OpenapiPaymentAccountGetOrCreateRequestBankAccount`

NewOpenapiPaymentAccountGetOrCreateRequestBankAccountWithDefaults instantiates a new OpenapiPaymentAccountGetOrCreateRequestBankAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBankId

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) GetBankId() string`

GetBankId returns the BankId field if non-nil, zero value otherwise.

### GetBankIdOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) GetBankIdOk() (*string, bool)`

GetBankIdOk returns a tuple with the BankId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBankId

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) SetBankId(v string)`

SetBankId sets BankId field to given value.

### HasBankId

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) HasBankId() bool`

HasBankId returns a boolean if a field has been set.

### GetBranchId

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) GetBranchId() string`

GetBranchId returns the BranchId field if non-nil, zero value otherwise.

### GetBranchIdOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) GetBranchIdOk() (*string, bool)`

GetBranchIdOk returns a tuple with the BranchId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBranchId

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) SetBranchId(v string)`

SetBranchId sets BranchId field to given value.

### HasBranchId

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) HasBranchId() bool`

HasBranchId returns a boolean if a field has been set.

### GetNumber

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *OpenapiPaymentAccountGetOrCreateRequestBankAccount) HasNumber() bool`

HasNumber returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


