# OpenapiPaymentAccountGetOrCreateResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_account** | [**OpenapiPaymentAccountGetOrCreateResponseBankAccount**](OpenapiPaymentAccountGetOrCreateResponseBankAccount.md) |  | [optional] 
**country** | **str** |  | [optional] 
**created_at** | **str** |  | [optional] 
**holder** | [**OpenapiPaymentAccountGetOrCreateResponseHolder**](OpenapiPaymentAccountGetOrCreateResponseHolder.md) |  | [optional] 
**id** | **str** | The newly created payment account unique identifier | [optional] 
**mobile_money** | [**OpenapiPaymentAccountGetOrCreateResponseMobileMoney**](OpenapiPaymentAccountGetOrCreateResponseMobileMoney.md) |  | [optional] 
**type** | **str** |  | [optional] [default to 'MOBILE_MONEY']

## Example

```python
from rafikigen.models.openapi_payment_account_get_or_create_response import OpenapiPaymentAccountGetOrCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPaymentAccountGetOrCreateResponse from a JSON string
openapi_payment_account_get_or_create_response_instance = OpenapiPaymentAccountGetOrCreateResponse.from_json(json)
# print the JSON string representation of the object
print OpenapiPaymentAccountGetOrCreateResponse.to_json()

# convert the object into a dict
openapi_payment_account_get_or_create_response_dict = openapi_payment_account_get_or_create_response_instance.to_dict()
# create an instance of OpenapiPaymentAccountGetOrCreateResponse from a dict
openapi_payment_account_get_or_create_response_form_dict = openapi_payment_account_get_or_create_response.from_dict(openapi_payment_account_get_or_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


