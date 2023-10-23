# OpenapiPaymentAccountGetOrCreateRequestMobileMoney

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Number** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The actual phone number formatted as E.164 | [optional] 
**Operator** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money). | [optional] 

## Methods

### NewOpenapiPaymentAccountGetOrCreateRequestMobileMoney

`func NewOpenapiPaymentAccountGetOrCreateRequestMobileMoney() *OpenapiPaymentAccountGetOrCreateRequestMobileMoney`

NewOpenapiPaymentAccountGetOrCreateRequestMobileMoney instantiates a new OpenapiPaymentAccountGetOrCreateRequestMobileMoney object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPaymentAccountGetOrCreateRequestMobileMoneyWithDefaults

`func NewOpenapiPaymentAccountGetOrCreateRequestMobileMoneyWithDefaults() *OpenapiPaymentAccountGetOrCreateRequestMobileMoney`

NewOpenapiPaymentAccountGetOrCreateRequestMobileMoneyWithDefaults instantiates a new OpenapiPaymentAccountGetOrCreateRequestMobileMoney object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNumber

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetOperator

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) GetOperator() string`

GetOperator returns the Operator field if non-nil, zero value otherwise.

### GetOperatorOk

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) GetOperatorOk() (*string, bool)`

GetOperatorOk returns a tuple with the Operator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperator

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) SetOperator(v string)`

SetOperator sets Operator field to given value.

### HasOperator

`func (o *OpenapiPaymentAccountGetOrCreateRequestMobileMoney) HasOperator() bool`

HasOperator returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


