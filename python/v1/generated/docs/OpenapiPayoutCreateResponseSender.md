# OpenapiPayoutCreateResponseSender


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**OpenapiPayoutCreateResponseSenderAddress**](OpenapiPayoutCreateResponseSenderAddress.md) |  | [optional] 
**individual** | [**OpenapiPayoutCreateResponseSenderIndividual**](OpenapiPayoutCreateResponseSenderIndividual.md) |  | [optional] 
**name** | **str** | The individual full name or registered business legal name | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response_sender import OpenapiPayoutCreateResponseSender

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponseSender from a JSON string
openapi_payout_create_response_sender_instance = OpenapiPayoutCreateResponseSender.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponseSender.to_json()

# convert the object into a dict
openapi_payout_create_response_sender_dict = openapi_payout_create_response_sender_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponseSender from a dict
openapi_payout_create_response_sender_form_dict = openapi_payout_create_response_sender.from_dict(openapi_payout_create_response_sender_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


