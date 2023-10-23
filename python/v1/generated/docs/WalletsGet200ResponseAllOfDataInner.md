# WalletsGet200ResponseAllOfDataInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available** | **str** | The actual available balance | [optional] 
**balance** | **str** | The total balance yet to settle | [optional] 
**currency** | **str** | The ISO 4217 currency code associated with the wallet | [optional] 
**id** | **str** |  | [optional] 

## Example

```python
from rafikigen.models.wallets_get200_response_all_of_data_inner import WalletsGet200ResponseAllOfDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of WalletsGet200ResponseAllOfDataInner from a JSON string
wallets_get200_response_all_of_data_inner_instance = WalletsGet200ResponseAllOfDataInner.from_json(json)
# print the JSON string representation of the object
print WalletsGet200ResponseAllOfDataInner.to_json()

# convert the object into a dict
wallets_get200_response_all_of_data_inner_dict = wallets_get200_response_all_of_data_inner_instance.to_dict()
# create an instance of WalletsGet200ResponseAllOfDataInner from a dict
wallets_get200_response_all_of_data_inner_form_dict = wallets_get200_response_all_of_data_inner.from_dict(wallets_get200_response_all_of_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


