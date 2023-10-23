

# OpenapiPayoutCreateRequestSender

An optional property for incorporating sender details. Please refer to the \"💡 **Compliance requirements**\" documentation above.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | [**OpenapiPayoutCreateRequestSenderAddress**](OpenapiPayoutCreateRequestSenderAddress.md) |  |  [optional] |
|**individual** | [**OpenapiPayoutCreateRequestSenderIndividual**](OpenapiPayoutCreateRequestSenderIndividual.md) |  |  [optional] |
|**name** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  The individual full name or registered business legal name |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  Either &#x60;INDIVIDUAL&#x60; or &#x60;BUSINESS&#x60; |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |



