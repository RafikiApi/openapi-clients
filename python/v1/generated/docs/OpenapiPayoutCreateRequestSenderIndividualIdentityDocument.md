# OpenapiPayoutCreateRequestSenderIndividualIdentityDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional] 
**expires_on** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  Date formatted as yyyy-mm-dd | [optional] 
**issued_on** | **str** | Date formatted as yyyy-mm-dd | [optional] 
**number** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt; | [optional] 
**type** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  One of &#x60;PASSPORT&#x60;, &#x60;DRIVING_LICENCE&#x60;, &#x60;NATIONAL_ID_CARD&#x60; | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_request_sender_individual_identity_document import OpenapiPayoutCreateRequestSenderIndividualIdentityDocument

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateRequestSenderIndividualIdentityDocument from a JSON string
openapi_payout_create_request_sender_individual_identity_document_instance = OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.to_json()

# convert the object into a dict
openapi_payout_create_request_sender_individual_identity_document_dict = openapi_payout_create_request_sender_individual_identity_document_instance.to_dict()
# create an instance of OpenapiPayoutCreateRequestSenderIndividualIdentityDocument from a dict
openapi_payout_create_request_sender_individual_identity_document_form_dict = openapi_payout_create_request_sender_individual_identity_document.from_dict(openapi_payout_create_request_sender_individual_identity_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


