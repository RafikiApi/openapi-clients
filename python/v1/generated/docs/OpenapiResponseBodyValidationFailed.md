# OpenapiResponseBodyValidationFailed


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | [optional] 
**errors** | [**OpenapiResponseBodyValidationFailedErrors**](OpenapiResponseBodyValidationFailedErrors.md) |  | [optional] 
**message** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_validation_failed import OpenapiResponseBodyValidationFailed

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyValidationFailed from a JSON string
openapi_response_body_validation_failed_instance = OpenapiResponseBodyValidationFailed.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyValidationFailed.to_json()

# convert the object into a dict
openapi_response_body_validation_failed_dict = openapi_response_body_validation_failed_instance.to_dict()
# create an instance of OpenapiResponseBodyValidationFailed from a dict
openapi_response_body_validation_failed_form_dict = openapi_response_body_validation_failed.from_dict(openapi_response_body_validation_failed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


