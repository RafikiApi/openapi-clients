# OpenapiResponseBodyIdempotencyConflict


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Can be either &#x60;IDEMPOTENCY_RACE&#x60; or &#x60;IDEMPOTENCY_KEY_ALREADY_USED&#x60; | [optional] 
**message** | **str** | E.g. \&quot;Idempotency key already in use\&quot; | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_idempotency_conflict import OpenapiResponseBodyIdempotencyConflict

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyIdempotencyConflict from a JSON string
openapi_response_body_idempotency_conflict_instance = OpenapiResponseBodyIdempotencyConflict.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyIdempotencyConflict.to_json()

# convert the object into a dict
openapi_response_body_idempotency_conflict_dict = openapi_response_body_idempotency_conflict_instance.to_dict()
# create an instance of OpenapiResponseBodyIdempotencyConflict from a dict
openapi_response_body_idempotency_conflict_form_dict = openapi_response_body_idempotency_conflict.from_dict(openapi_response_body_idempotency_conflict_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


