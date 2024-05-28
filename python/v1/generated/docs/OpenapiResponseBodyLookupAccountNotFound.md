# OpenapiResponseBodyLookupAccountNotFound


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | &#x60;LOOKUP_ACCOUNT_NOT_FOUND&#x60; | [optional] 
**message** | **str** | E.g. \&quot;Invalid bank account number, or, syntactically valid, but not registered with any banking entity\&quot; | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_lookup_account_not_found import OpenapiResponseBodyLookupAccountNotFound

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyLookupAccountNotFound from a JSON string
openapi_response_body_lookup_account_not_found_instance = OpenapiResponseBodyLookupAccountNotFound.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyLookupAccountNotFound.to_json()

# convert the object into a dict
openapi_response_body_lookup_account_not_found_dict = openapi_response_body_lookup_account_not_found_instance.to_dict()
# create an instance of OpenapiResponseBodyLookupAccountNotFound from a dict
openapi_response_body_lookup_account_not_found_form_dict = openapi_response_body_lookup_account_not_found.from_dict(openapi_response_body_lookup_account_not_found_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


