

# OpenapiPayoutCreateRequestSenderIndividualIdentityDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code indicating the issuing country of the document. |  [optional] |
|**expiresOn** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  Date formatted as yyyy-mm-dd |  [optional] |
|**issuedOn** | **String** | Date formatted as yyyy-mm-dd |  [optional] |
|**number** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt; |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  One of &#x60;PASSPORT&#x60;, &#x60;DRIVING_LICENCE&#x60;, &#x60;NATIONAL_ID_CARD&#x60; |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PASSPORT | &quot;PASSPORT&quot; |
| DRIVING_LICENCE | &quot;DRIVING_LICENCE&quot; |
| NATIONAL_ID_CARD | &quot;NATIONAL_ID_CARD&quot; |



