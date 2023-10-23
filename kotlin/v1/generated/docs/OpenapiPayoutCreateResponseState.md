
# OpenapiPayoutCreateResponseState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**inline**](#Code) | The state code signifies the overall status of a payout. For detailed information about the meaning of each state, please consult the lifecycle section above. |  [optional]
**context** | **kotlin.String** | Together with the \&quot;code\&quot; property, the \&quot;context\&quot; property offers additional context and information, whenever possible, about the specific state. For instance, if a payout fails, there are numerous reasons why this might occur. The \&quot;context\&quot; property will provide more detailed information in such cases. |  [optional]


<a id="Code"></a>
## Enum: code
Name | Value
---- | -----
code | PENDING, REVERSED, SENT, CANCELLED, FAILED



