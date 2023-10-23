# WalletsGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[WalletsGet200ResponseAllOfDataInner]**](WalletsGet200ResponseAllOfDataInner.md) |  | [optional] 

## Example

```python
from rafikigen.models.wallets_get200_response import WalletsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of WalletsGet200Response from a JSON string
wallets_get200_response_instance = WalletsGet200Response.from_json(json)
# print the JSON string representation of the object
print WalletsGet200Response.to_json()

# convert the object into a dict
wallets_get200_response_dict = wallets_get200_response_instance.to_dict()
# create an instance of WalletsGet200Response from a dict
wallets_get200_response_form_dict = wallets_get200_response.from_dict(wallets_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


