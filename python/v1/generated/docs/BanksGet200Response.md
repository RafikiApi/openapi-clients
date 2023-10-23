# BanksGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[BanksGet200ResponseAllOfDataInner]**](BanksGet200ResponseAllOfDataInner.md) |  | [optional] 

## Example

```python
from rafikigen.models.banks_get200_response import BanksGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BanksGet200Response from a JSON string
banks_get200_response_instance = BanksGet200Response.from_json(json)
# print the JSON string representation of the object
print BanksGet200Response.to_json()

# convert the object into a dict
banks_get200_response_dict = banks_get200_response_instance.to_dict()
# create an instance of BanksGet200Response from a dict
banks_get200_response_form_dict = banks_get200_response.from_dict(banks_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


