# OpenapiPayoutCreateResponseSenderIndividual


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dob** | **str** | Date of birth formatted as yyyy-mm-dd | [optional] 
**identity_document** | [**OpenapiPayoutCreateResponseSenderIndividualIdentityDocument**](OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.md) |  | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response_sender_individual import OpenapiPayoutCreateResponseSenderIndividual

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponseSenderIndividual from a JSON string
openapi_payout_create_response_sender_individual_instance = OpenapiPayoutCreateResponseSenderIndividual.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponseSenderIndividual.to_json()

# convert the object into a dict
openapi_payout_create_response_sender_individual_dict = openapi_payout_create_response_sender_individual_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponseSenderIndividual from a dict
openapi_payout_create_response_sender_individual_form_dict = openapi_payout_create_response_sender_individual.from_dict(openapi_payout_create_response_sender_individual_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


