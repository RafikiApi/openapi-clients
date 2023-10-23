# PayoutsGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]OpenapiPayoutGetResponse**](OpenapiPayoutGetResponse.md) |  | [optional] 
**Meta** | Pointer to [**OpenapiResponseBodySuccessCursorPaginatedMeta**](OpenapiResponseBodySuccessCursorPaginatedMeta.md) |  | [optional] 

## Methods

### NewPayoutsGet200Response

`func NewPayoutsGet200Response() *PayoutsGet200Response`

NewPayoutsGet200Response instantiates a new PayoutsGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPayoutsGet200ResponseWithDefaults

`func NewPayoutsGet200ResponseWithDefaults() *PayoutsGet200Response`

NewPayoutsGet200ResponseWithDefaults instantiates a new PayoutsGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *PayoutsGet200Response) GetData() []OpenapiPayoutGetResponse`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PayoutsGet200Response) GetDataOk() (*[]OpenapiPayoutGetResponse, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PayoutsGet200Response) SetData(v []OpenapiPayoutGetResponse)`

SetData sets Data field to given value.

### HasData

`func (o *PayoutsGet200Response) HasData() bool`

HasData returns a boolean if a field has been set.

### GetMeta

`func (o *PayoutsGet200Response) GetMeta() OpenapiResponseBodySuccessCursorPaginatedMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *PayoutsGet200Response) GetMetaOk() (*OpenapiResponseBodySuccessCursorPaginatedMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *PayoutsGet200Response) SetMeta(v OpenapiResponseBodySuccessCursorPaginatedMeta)`

SetMeta sets Meta field to given value.

### HasMeta

`func (o *PayoutsGet200Response) HasMeta() bool`

HasMeta returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


