# OpenapiPayoutCreateResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**created_at** | **str** |  | [optional] 
**custom_id** | **str** |  | [optional] 
**id** | **str** | The payout unique identifier | [optional] 
**payment_account_id** | **str** | The recipient payment account receiving funds | [optional] 
**purpose** | **str** |  | [optional] 
**sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] 
**state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] 
**wallet_id** | **str** | The wallet ID from which the money will disburse | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response import OpenapiPayoutCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponse from a JSON string
openapi_payout_create_response_instance = OpenapiPayoutCreateResponse.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponse.to_json()

# convert the object into a dict
openapi_payout_create_response_dict = openapi_payout_create_response_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponse from a dict
openapi_payout_create_response_form_dict = openapi_payout_create_response.from_dict(openapi_payout_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


