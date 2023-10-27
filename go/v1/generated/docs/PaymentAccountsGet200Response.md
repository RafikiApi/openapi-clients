# PaymentAccountsGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]OpenapiPaymentAccountGetOrCreateResponse**](OpenapiPaymentAccountGetOrCreateResponse.md) |  | [optional] 
**Meta** | Pointer to [**OpenapiPaymentAccountListResponseMeta**](OpenapiPaymentAccountListResponseMeta.md) |  | [optional] 

## Methods

### NewPaymentAccountsGet200Response

`func NewPaymentAccountsGet200Response() *PaymentAccountsGet200Response`

NewPaymentAccountsGet200Response instantiates a new PaymentAccountsGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentAccountsGet200ResponseWithDefaults

`func NewPaymentAccountsGet200ResponseWithDefaults() *PaymentAccountsGet200Response`

NewPaymentAccountsGet200ResponseWithDefaults instantiates a new PaymentAccountsGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *PaymentAccountsGet200Response) GetData() []OpenapiPaymentAccountGetOrCreateResponse`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PaymentAccountsGet200Response) GetDataOk() (*[]OpenapiPaymentAccountGetOrCreateResponse, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PaymentAccountsGet200Response) SetData(v []OpenapiPaymentAccountGetOrCreateResponse)`

SetData sets Data field to given value.

### HasData

`func (o *PaymentAccountsGet200Response) HasData() bool`

HasData returns a boolean if a field has been set.

### GetMeta

`func (o *PaymentAccountsGet200Response) GetMeta() OpenapiPaymentAccountListResponseMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *PaymentAccountsGet200Response) GetMetaOk() (*OpenapiPaymentAccountListResponseMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *PaymentAccountsGet200Response) SetMeta(v OpenapiPaymentAccountListResponseMeta)`

SetMeta sets Meta field to given value.

### HasMeta

`func (o *PaymentAccountsGet200Response) HasMeta() bool`

HasMeta returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


