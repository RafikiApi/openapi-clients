# OpenapiPayoutCreateRequestSenderAddress


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt; | [optional] 
**country** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code associated with the address. | [optional] 
**line_1** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt; | [optional] 
**line_2** | **str** |  | [optional] 
**line_3** | **str** |  | [optional] 
**postal_code** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if address is provided&lt;/span&gt;  ⚠️ We enforce postal code validation for these following country codes : GB, US, PT, IE, MT, NG, NL, SK | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_request_sender_address import OpenapiPayoutCreateRequestSenderAddress

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateRequestSenderAddress from a JSON string
openapi_payout_create_request_sender_address_instance = OpenapiPayoutCreateRequestSenderAddress.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateRequestSenderAddress.to_json()

# convert the object into a dict
openapi_payout_create_request_sender_address_dict = openapi_payout_create_request_sender_address_instance.to_dict()
# create an instance of OpenapiPayoutCreateRequestSenderAddress from a dict
openapi_payout_create_request_sender_address_form_dict = openapi_payout_create_request_sender_address.from_dict(openapi_payout_create_request_sender_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


