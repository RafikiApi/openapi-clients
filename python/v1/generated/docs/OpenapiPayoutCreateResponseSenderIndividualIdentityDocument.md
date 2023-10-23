# OpenapiPayoutCreateResponseSenderIndividualIdentityDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional] 
**expires_on** | **str** | Date formatted as yyyy-mm-dd | [optional] 
**issued_on** | **str** | Date formatted as yyyy-mm-dd | [optional] 
**number** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_response_sender_individual_identity_document import OpenapiPayoutCreateResponseSenderIndividualIdentityDocument

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument from a JSON string
openapi_payout_create_response_sender_individual_identity_document_instance = OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.to_json()

# convert the object into a dict
openapi_payout_create_response_sender_individual_identity_document_dict = openapi_payout_create_response_sender_individual_identity_document_instance.to_dict()
# create an instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument from a dict
openapi_payout_create_response_sender_individual_identity_document_form_dict = openapi_payout_create_response_sender_individual_identity_document.from_dict(openapi_payout_create_response_sender_individual_identity_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


