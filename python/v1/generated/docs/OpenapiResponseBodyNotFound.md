# OpenapiResponseBodyNotFound


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | &#x60;NOT_FOUND&#x60; | [optional] 
**message** | **str** | E.g. \&quot;The resource you are looking for cannot be found.\&quot; | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_not_found import OpenapiResponseBodyNotFound

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyNotFound from a JSON string
openapi_response_body_not_found_instance = OpenapiResponseBodyNotFound.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyNotFound.to_json()

# convert the object into a dict
openapi_response_body_not_found_dict = openapi_response_body_not_found_instance.to_dict()
# create an instance of OpenapiResponseBodyNotFound from a dict
openapi_response_body_not_found_form_dict = openapi_response_body_not_found.from_dict(openapi_response_body_not_found_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


