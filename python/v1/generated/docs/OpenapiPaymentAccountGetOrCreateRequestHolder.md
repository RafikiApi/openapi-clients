# OpenapiPaymentAccountGetOrCreateRequestHolder

<span style=\"color:#e95f6a;\">required</span>  The individual (or business) in whose name the bank account is registered

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either the INDIVIDUAL full name or the BUSINESS registered legal name | [optional] 
**type** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The holder legal entity type, whether an INDIVIDUAL person or a BUSINESS | [optional] 

## Example

```python
from rafikigen.models.openapi_payment_account_get_or_create_request_holder import OpenapiPaymentAccountGetOrCreateRequestHolder

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPaymentAccountGetOrCreateRequestHolder from a JSON string
openapi_payment_account_get_or_create_request_holder_instance = OpenapiPaymentAccountGetOrCreateRequestHolder.from_json(json)
# print the JSON string representation of the object
print OpenapiPaymentAccountGetOrCreateRequestHolder.to_json()

# convert the object into a dict
openapi_payment_account_get_or_create_request_holder_dict = openapi_payment_account_get_or_create_request_holder_instance.to_dict()
# create an instance of OpenapiPaymentAccountGetOrCreateRequestHolder from a dict
openapi_payment_account_get_or_create_request_holder_form_dict = openapi_payment_account_get_or_create_request_holder.from_dict(openapi_payment_account_get_or_create_request_holder_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


