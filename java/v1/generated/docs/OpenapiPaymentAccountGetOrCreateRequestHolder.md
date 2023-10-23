

# OpenapiPaymentAccountGetOrCreateRequestHolder

<span style=\"color:#e95f6a;\">required</span>  The individual (or business) in whose name the bank account is registered

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either the INDIVIDUAL full name or the BUSINESS registered legal name |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The holder legal entity type, whether an INDIVIDUAL person or a BUSINESS |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |



