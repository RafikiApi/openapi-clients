# PaymentAccountsGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[OpenapiPaymentAccountGetOrCreateResponse]**](OpenapiPaymentAccountGetOrCreateResponse.md) |  | [optional] 
**meta** | [**OpenapiPaymentAccountListResponseMeta**](OpenapiPaymentAccountListResponseMeta.md) |  | [optional] 

## Example

```python
from rafikigen.models.payment_accounts_get200_response import PaymentAccountsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentAccountsGet200Response from a JSON string
payment_accounts_get200_response_instance = PaymentAccountsGet200Response.from_json(json)
# print the JSON string representation of the object
print PaymentAccountsGet200Response.to_json()

# convert the object into a dict
payment_accounts_get200_response_dict = payment_accounts_get200_response_instance.to_dict()
# create an instance of PaymentAccountsGet200Response from a dict
payment_accounts_get200_response_form_dict = payment_accounts_get200_response.from_dict(payment_accounts_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


