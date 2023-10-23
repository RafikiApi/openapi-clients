# OpenapiPayoutCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional] 
**payment_account** | [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional] 
**payment_account_id** | **str** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional] 
**sender** | [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional] 
**wallet_id** | **str** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_create_request import OpenapiPayoutCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutCreateRequest from a JSON string
openapi_payout_create_request_instance = OpenapiPayoutCreateRequest.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutCreateRequest.to_json()

# convert the object into a dict
openapi_payout_create_request_dict = openapi_payout_create_request_instance.to_dict()
# create an instance of OpenapiPayoutCreateRequest from a dict
openapi_payout_create_request_form_dict = openapi_payout_create_request.from_dict(openapi_payout_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


