# OpenapiPayoutListResponseMetaPaging


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cursors** | [**OpenapiPayoutListResponseMetaPagingCursors**](OpenapiPayoutListResponseMetaPagingCursors.md) |  | [optional] 
**next** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_list_response_meta_paging import OpenapiPayoutListResponseMetaPaging

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutListResponseMetaPaging from a JSON string
openapi_payout_list_response_meta_paging_instance = OpenapiPayoutListResponseMetaPaging.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutListResponseMetaPaging.to_json()

# convert the object into a dict
openapi_payout_list_response_meta_paging_dict = openapi_payout_list_response_meta_paging_instance.to_dict()
# create an instance of OpenapiPayoutListResponseMetaPaging from a dict
openapi_payout_list_response_meta_paging_form_dict = openapi_payout_list_response_meta_paging.from_dict(openapi_payout_list_response_meta_paging_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


