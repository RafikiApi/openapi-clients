# OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | &#x60;PAYOUT_BANK_TEMPORARILY_UNAVAILABLE&#x60; | [optional] 
**message** | **str** | E.g. \&quot;Payout to this bank is not available.\&quot; | [optional] 

## Example

```python
from rafikigen.models.openapi_response_body_payout_payment_account_temporarily_unavailable import OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable from a JSON string
openapi_response_body_payout_payment_account_temporarily_unavailable_instance = OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable.from_json(json)
# print the JSON string representation of the object
print OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable.to_json()

# convert the object into a dict
openapi_response_body_payout_payment_account_temporarily_unavailable_dict = openapi_response_body_payout_payment_account_temporarily_unavailable_instance.to_dict()
# create an instance of OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable from a dict
openapi_response_body_payout_payment_account_temporarily_unavailable_form_dict = openapi_response_body_payout_payment_account_temporarily_unavailable.from_dict(openapi_response_body_payout_payment_account_temporarily_unavailable_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


