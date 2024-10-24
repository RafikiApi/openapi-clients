# OpenapiPayoutGetResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**OpenapiPayoutCreateResponseAmount**](OpenapiPayoutCreateResponseAmount.md) |  | [optional] 
**created_at** | **str** |  | [optional] 
**custom_id** | **str** |  | [optional] 
**id** | **str** | The payout unique identifier | [optional] 
**on_behalf_of** | **List[str]** |  | [optional] 
**payment_account_id** | **str** | The recipient payment account receiving funds | [optional] 
**purpose** | **str** |  | [optional] 
**receipt** | **str** | The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property. | [optional] 
**sender** | [**OpenapiPayoutCreateResponseSender**](OpenapiPayoutCreateResponseSender.md) |  | [optional] 
**state** | [**OpenapiPayoutCreateResponseState**](OpenapiPayoutCreateResponseState.md) |  | [optional] 
**wallet_id** | **str** | The wallet ID from which the money will disburse | [optional] 

## Example

```python
from rafikigen.models.openapi_payout_get_response import OpenapiPayoutGetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of OpenapiPayoutGetResponse from a JSON string
openapi_payout_get_response_instance = OpenapiPayoutGetResponse.from_json(json)
# print the JSON string representation of the object
print OpenapiPayoutGetResponse.to_json()

# convert the object into a dict
openapi_payout_get_response_dict = openapi_payout_get_response_instance.to_dict()
# create an instance of OpenapiPayoutGetResponse from a dict
openapi_payout_get_response_form_dict = openapi_payout_get_response.from_dict(openapi_payout_get_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


