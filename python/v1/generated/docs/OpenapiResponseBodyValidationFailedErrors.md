# OpenapiResponseBodyValidationFailedErrors


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | **Dict[str, List[str]]** | Every key corresponds to the name of a property that has not passed validation. The value associated with each key is an array of strings that serves to provide a descriptive explanation of the requirements for that particular property and the reasons for its failure. | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_validation_failed_errors import OpenapiResponseBodyValidationFailedErrors

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyValidationFailedErrors from a JSON string
openapi_response_body_validation_failed_errors_instance = OpenapiResponseBodyValidationFailedErrors.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyValidationFailedErrors.to_json()

# convert the object into a dict
openapi_response_body_validation_failed_errors_dict = openapi_response_body_validation_failed_errors_instance.to_dict()
# create an instance of OpenapiResponseBodyValidationFailedErrors from a dict
openapi_response_body_validation_failed_errors_form_dict = openapi_response_body_validation_failed_errors.from_dict(openapi_response_body_validation_failed_errors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


