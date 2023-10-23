# PayoutsPost202Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**OpenapiPayoutCreateResponse**](OpenapiPayoutCreateResponse.md) |  | [optional] 

## Example

```python
from rafikigen.models.payouts_post202_response import PayoutsPost202Response

# TODO update the JSON string below
json = "{}"
# create an instance of PayoutsPost202Response from a JSON string
payouts_post202_response_instance = PayoutsPost202Response.from_json(json)
# print the JSON string representation of the object
print PayoutsPost202Response.to_json()

# convert the object into a dict
payouts_post202_response_dict = payouts_post202_response_instance.to_dict()
# create an instance of PayoutsPost202Response from a dict
payouts_post202_response_form_dict = payouts_post202_response.from_dict(payouts_post202_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


