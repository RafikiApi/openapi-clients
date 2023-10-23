# OpenapiPayoutCreateResponseState


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | The state code signifies the overall status of a payout. For detailed information about the meaning of each state, please consult the lifecycle section above. | [optional] 
**context** | **str** | Together with the \&quot;code\&quot; property, the \&quot;context\&quot; property offers additional context and information, whenever possible, about the specific state. For instance, if a payout fails, there are numerous reasons why this might occur. The \&quot;context\&quot; property will provide more detailed information in such cases. | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response_state import OpenapiPayoutCreateResponseState

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponseState from a JSON string
openapi_payout_create_response_state_instance = OpenapiPayoutCreateResponseState.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponseState.to_json()

# convert the object into a dict
openapi_payout_create_response_state_dict = openapi_payout_create_response_state_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponseState from a dict
openapi_payout_create_response_state_form_dict = openapi_payout_create_response_state.from_dict(openapi_payout_create_response_state_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


