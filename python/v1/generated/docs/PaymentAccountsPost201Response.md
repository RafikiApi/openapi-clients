# PaymentAccountsPost201Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**OpenapiPaymentAccountGetOrCreateResponse**](OpenapiPaymentAccountGetOrCreateResponse.md) |  | [optional] 

## Example

```python
from rafikigen.models.payment_accounts_post201_response import PaymentAccountsPost201Response

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentAccountsPost201Response from a JSON string
payment_accounts_post201_response_instance = PaymentAccountsPost201Response.from_json(json)
# print the JSON string representation of the object
print PaymentAccountsPost201Response.to_json()

# convert the object into a dict
payment_accounts_post201_response_dict = payment_accounts_post201_response_instance.to_dict()
# create an instance of PaymentAccountsPost201Response from a dict
payment_accounts_post201_response_form_dict = payment_accounts_post201_response.from_dict(payment_accounts_post201_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


