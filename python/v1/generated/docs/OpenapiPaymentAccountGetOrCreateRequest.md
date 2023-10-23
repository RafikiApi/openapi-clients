# OpenapiPaymentAccountGetOrCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bank_account** | [**OpenapiPaymentAccountGetOrCreateRequestBankAccount**](OpenapiPaymentAccountGetOrCreateRequestBankAccount.md) |  | [optional] 
**country** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered. | [optional] 
**holder** | [**OpenapiPaymentAccountGetOrCreateRequestHolder**](OpenapiPaymentAccountGetOrCreateRequestHolder.md) |  | [optional] 
**mobile_money** | [**OpenapiPaymentAccountGetOrCreateRequestMobileMoney**](OpenapiPaymentAccountGetOrCreateRequestMobileMoney.md) |  | [optional] 
**type** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60; | [optional] 

## Example

```python
from rafikigen.models.openapi_payment_account_get_or_create_request import OpenapiPaymentAccountGetOrCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPaymentAccountGetOrCreateRequest from a JSON string
openapi_payment_account_get_or_create_request_instance = OpenapiPaymentAccountGetOrCreateRequest.from_json(json)
# print the JSON string representation of the object
print OpenapiPaymentAccountGetOrCreateRequest.to_json()

# convert the object into a dict
openapi_payment_account_get_or_create_request_dict = openapi_payment_account_get_or_create_request_instance.to_dict()
# create an instance of OpenapiPaymentAccountGetOrCreateRequest from a dict
openapi_payment_account_get_or_create_request_form_dict = openapi_payment_account_get_or_create_request.from_dict(openapi_payment_account_get_or_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


