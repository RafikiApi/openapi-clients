# BanksGet200ResponseAllOfDataInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branches** | [**List[BanksGet200ResponseAllOfDataInnerBranchesInner]**](BanksGet200ResponseAllOfDataInnerBranchesInner.md) | If the bank operates across multiple branches within a country, this property will be included, listing all the branches available from the bank. | [optional] 
**country** | **str** | The ISO 3166 alpha-2 country code in which the bank operates. | [optional] 
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.banks_get200_response_all_of_data_inner import BanksGet200ResponseAllOfDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of BanksGet200ResponseAllOfDataInner from a JSON string
banks_get200_response_all_of_data_inner_instance = BanksGet200ResponseAllOfDataInner.from_json(json)
# print the JSON string representation of the object
print BanksGet200ResponseAllOfDataInner.to_json()

# convert the object into a dict
banks_get200_response_all_of_data_inner_dict = banks_get200_response_all_of_data_inner_instance.to_dict()
# create an instance of BanksGet200ResponseAllOfDataInner from a dict
banks_get200_response_all_of_data_inner_form_dict = banks_get200_response_all_of_data_inner.from_dict(banks_get200_response_all_of_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


