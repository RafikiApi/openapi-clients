# OpenapiPayoutCreateResponseSenderAddress


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** | The ISO 3166 alpha-2 country code associated with the address. | [optional] 
**line_1** | **str** |  | [optional] 
**line_2** | **str** |  | [optional] 
**line_3** | **str** |  | [optional] 
**postal_code** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response_sender_address import OpenapiPayoutCreateResponseSenderAddress

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponseSenderAddress from a JSON string
openapi_payout_create_response_sender_address_instance = OpenapiPayoutCreateResponseSenderAddress.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponseSenderAddress.to_json()

# convert the object into a dict
openapi_payout_create_response_sender_address_dict = openapi_payout_create_response_sender_address_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponseSenderAddress from a dict
openapi_payout_create_response_sender_address_form_dict = openapi_payout_create_response_sender_address.from_dict(openapi_payout_create_response_sender_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


