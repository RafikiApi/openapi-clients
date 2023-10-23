# OpenapiPayoutCreateRequestSender

An optional property for incorporating sender details. Please refer to the \"💡 **Compliance requirements**\" documentation above.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**OpenapiPayoutCreateRequestSenderAddress**](OpenapiPayoutCreateRequestSenderAddress.md) |  | [optional] 
**individual** | [**OpenapiPayoutCreateRequestSenderIndividual**](OpenapiPayoutCreateRequestSenderIndividual.md) |  | [optional] 
**name** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  The individual full name or registered business legal name | [optional] 
**type** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  Either &#x60;INDIVIDUAL&#x60; or &#x60;BUSINESS&#x60; | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_request_sender import OpenapiPayoutCreateRequestSender

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateRequestSender from a JSON string
openapi_payout_create_request_sender_instance = OpenapiPayoutCreateRequestSender.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateRequestSender.to_json()

# convert the object into a dict
openapi_payout_create_request_sender_dict = openapi_payout_create_request_sender_instance.to_dict()
# create an instance of OpenapiPayoutCreateRequestSender from a dict
openapi_payout_create_request_sender_form_dict = openapi_payout_create_request_sender.from_dict(openapi_payout_create_request_sender_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


