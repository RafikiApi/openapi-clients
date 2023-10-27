# OpenapiResponseBodyWalletInsufficientBalance


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | &#x60;WALLET_INSUFFICIENT_BALANCE&#x60; | [optional] 
**message** | **str** | E.g. \&quot;Wallet &#39;{wlt-xxx}&#39; doesn&#39;t have enough balance\&quot; | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_wallet_insufficient_balance import OpenapiResponseBodyWalletInsufficientBalance

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyWalletInsufficientBalance from a JSON string
openapi_response_body_wallet_insufficient_balance_instance = OpenapiResponseBodyWalletInsufficientBalance.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyWalletInsufficientBalance.to_json()

# convert the object into a dict
openapi_response_body_wallet_insufficient_balance_dict = openapi_response_body_wallet_insufficient_balance_instance.to_dict()
# create an instance of OpenapiResponseBodyWalletInsufficientBalance from a dict
openapi_response_body_wallet_insufficient_balance_form_dict = openapi_response_body_wallet_insufficient_balance.from_dict(openapi_response_body_wallet_insufficient_balance_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


