# PaymentAccountsPost200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**OpenapiPaymentAccountGetOrCreateResponse**](OpenapiPaymentAccountGetOrCreateResponse.md) |  | [optional] 

## Example

```python
from rafikigen.models.payment_accounts_post200_response import PaymentAccountsPost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentAccountsPost200Response from a JSON string
payment_accounts_post200_response_instance = PaymentAccountsPost200Response.from_json(json)
# print the JSON string representation of the object
print PaymentAccountsPost200Response.to_json()

# convert the object into a dict
payment_accounts_post200_response_dict = payment_accounts_post200_response_instance.to_dict()
# create an instance of PaymentAccountsPost200Response from a dict
payment_accounts_post200_response_form_dict = payment_accounts_post200_response.from_dict(payment_accounts_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


