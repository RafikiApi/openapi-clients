# OpenapiPayoutCreateRequestAmount

<span style=\"color:#e95f6a;\">required</span>  The intended amount to send to either the payment_account_id or payment_account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The currency associated with the amount value, formatted according to ISO 4217 | [optional] 
**value** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt; | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_request_amount import OpenapiPayoutCreateRequestAmount

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateRequestAmount from a JSON string
openapi_payout_create_request_amount_instance = OpenapiPayoutCreateRequestAmount.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateRequestAmount.to_json()

# convert the object into a dict
openapi_payout_create_request_amount_dict = openapi_payout_create_request_amount_instance.to_dict()
# create an instance of OpenapiPayoutCreateRequestAmount from a dict
openapi_payout_create_request_amount_form_dict = openapi_payout_create_request_amount.from_dict(openapi_payout_create_request_amount_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


