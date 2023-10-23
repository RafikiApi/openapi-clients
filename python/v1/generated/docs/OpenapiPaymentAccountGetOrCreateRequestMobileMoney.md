# OpenapiPaymentAccountGetOrCreateRequestMobileMoney


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The actual phone number formatted as E.164 | [optional] 
**operator** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money). | [optional] 

## Example

```python
from rafikigen.models.openapi_payment_account_get_or_create_request_mobile_money import OpenapiPaymentAccountGetOrCreateRequestMobileMoney

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPaymentAccountGetOrCreateRequestMobileMoney from a JSON string
openapi_payment_account_get_or_create_request_mobile_money_instance = OpenapiPaymentAccountGetOrCreateRequestMobileMoney.from_json(json)
# print the JSON string representation of the object
print OpenapiPaymentAccountGetOrCreateRequestMobileMoney.to_json()

# convert the object into a dict
openapi_payment_account_get_or_create_request_mobile_money_dict = openapi_payment_account_get_or_create_request_mobile_money_instance.to_dict()
# create an instance of OpenapiPaymentAccountGetOrCreateRequestMobileMoney from a dict
openapi_payment_account_get_or_create_request_mobile_money_form_dict = openapi_payment_account_get_or_create_request_mobile_money.from_dict(openapi_payment_account_get_or_create_request_mobile_money_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


