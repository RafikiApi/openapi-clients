

# OpenapiPayoutCreateResponseState


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | The state code signifies the overall status of a payout. For detailed information about the meaning of each state, please consult the lifecycle section above. |  [optional] |
|**context** | **String** | Together with the \&quot;code\&quot; property, the \&quot;context\&quot; property offers additional context and information, whenever possible, about the specific state. For instance, if a payout fails, there are numerous reasons why this might occur. The \&quot;context\&quot; property will provide more detailed information in such cases. |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| REVERSED | &quot;REVERSED&quot; |
| SENT | &quot;SENT&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| FAILED | &quot;FAILED&quot; |



