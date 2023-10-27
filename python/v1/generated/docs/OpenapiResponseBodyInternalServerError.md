# OpenapiResponseBodyInternalServerError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | &#x60;INTERNAL_SERVER_ERROR&#x60; | [optional] 
**message** | **str** | E.g. \&quot;An internal error has occurred.\&quot; | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_internal_server_error import OpenapiResponseBodyInternalServerError

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyInternalServerError from a JSON string
openapi_response_body_internal_server_error_instance = OpenapiResponseBodyInternalServerError.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyInternalServerError.to_json()

# convert the object into a dict
openapi_response_body_internal_server_error_dict = openapi_response_body_internal_server_error_instance.to_dict()
# create an instance of OpenapiResponseBodyInternalServerError from a dict
openapi_response_body_internal_server_error_form_dict = openapi_response_body_internal_server_error.from_dict(openapi_response_body_internal_server_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


