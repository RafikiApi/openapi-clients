
# OpenapiPayoutCreateRequestSenderIndividualIdentityDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code indicating the issuing country of the document. |  [optional]
**expiresOn** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  Date formatted as yyyy-mm-dd |  [optional]
**issuedOn** | **kotlin.String** | Date formatted as yyyy-mm-dd |  [optional]
**number** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt; |  [optional]
**type** | [**inline**](#Type) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  One of &#x60;PASSPORT&#x60;, &#x60;DRIVING_LICENCE&#x60;, &#x60;NATIONAL_ID_CARD&#x60; |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | PASSPORT, DRIVING_LICENCE, NATIONAL_ID_CARD



