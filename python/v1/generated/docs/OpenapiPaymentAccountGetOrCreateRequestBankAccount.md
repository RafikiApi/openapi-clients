# OpenapiPaymentAccountGetOrCreateRequestBankAccount


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_id** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The bank identifier representing the bank associated with the payment account | [optional] 
**number** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The actual bank account number (alphanum). | [optional] 

## Example

```python
from rafikigen.models.openapi_payment_account_get_or_create_request_bank_account import OpenapiPaymentAccountGetOrCreateRequestBankAccount

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPaymentAccountGetOrCreateRequestBankAccount from a JSON string
openapi_payment_account_get_or_create_request_bank_account_instance = OpenapiPaymentAccountGetOrCreateRequestBankAccount.from_json(json)
# print the JSON string representation of the object
print OpenapiPaymentAccountGetOrCreateRequestBankAccount.to_json()

# convert the object into a dict
openapi_payment_account_get_or_create_request_bank_account_dict = openapi_payment_account_get_or_create_request_bank_account_instance.to_dict()
# create an instance of OpenapiPaymentAccountGetOrCreateRequestBankAccount from a dict
openapi_payment_account_get_or_create_request_bank_account_form_dict = openapi_payment_account_get_or_create_request_bank_account.from_dict(openapi_payment_account_get_or_create_request_bank_account_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


