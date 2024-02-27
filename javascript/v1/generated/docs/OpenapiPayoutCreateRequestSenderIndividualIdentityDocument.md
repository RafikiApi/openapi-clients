# Resources.OpenapiPayoutCreateRequestSenderIndividualIdentityDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  The ISO 3166 alpha-2 country code indicating the issuing country of the document. | [optional] 
**expiresOn** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  Date formatted as yyyy-mm-dd | [optional] 
**issuedOn** | **String** | Date formatted as yyyy-mm-dd | [optional] 
**number** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt; | [optional] 
**type** | **String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if identity_document is provided&lt;/span&gt;  One of &#x60;PASSPORT&#x60;, &#x60;DRIVING_LICENCE&#x60;, &#x60;NATIONAL_ID_CARD&#x60;, &#x60;RESIDENCE_PERMIT&#x60; | [optional] 



## Enum: TypeEnum


* `PASSPORT` (value: `"PASSPORT"`)

* `DRIVING_LICENCE` (value: `"DRIVING_LICENCE"`)

* `NATIONAL_ID_CARD` (value: `"NATIONAL_ID_CARD"`)

* `RESIDENCE_PERMIT` (value: `"RESIDENCE_PERMIT"`)




