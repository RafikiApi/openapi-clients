# OpenapiPayoutCreateResponseAmount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **str** | The currency associated with the amount value, formatted according to ISO 4217 | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response_amount import OpenapiPayoutCreateResponseAmount

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponseAmount from a JSON string
openapi_payout_create_response_amount_instance = OpenapiPayoutCreateResponseAmount.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponseAmount.to_json()

# convert the object into a dict
openapi_payout_create_response_amount_dict = openapi_payout_create_response_amount_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponseAmount from a dict
openapi_payout_create_response_amount_form_dict = openapi_payout_create_response_amount.from_dict(openapi_payout_create_response_amount_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


