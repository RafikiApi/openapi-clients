# Resources.OpenapiPayoutCreateRequestSender

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**OpenapiPayoutCreateRequestSenderAddress**](OpenapiPayoutCreateRequestSenderAddress.md) |  | [optional] 
**individual** | [**OpenapiPayoutCreateRequestSenderIndividual**](OpenapiPayoutCreateRequestSenderIndividual.md) |  | [optional] 
**name** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  The individual full name or registered business legal name | [optional] 
**type** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  Either &#x60;INDIVIDUAL&#x60; or &#x60;BUSINESS&#x60; | [optional] 



## Enum: TypeEnum


* `INDIVIDUAL` (value: `"INDIVIDUAL"`)

* `BUSINESS` (value: `"BUSINESS"`)




