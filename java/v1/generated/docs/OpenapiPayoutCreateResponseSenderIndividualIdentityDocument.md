

# OpenapiPayoutCreateResponseSenderIndividualIdentityDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **String** | The ISO 3166 alpha-2 country code indicating the issuing country of the document. |  [optional] |
|**expiresOn** | **String** | Date formatted as yyyy-mm-dd |  [optional] |
|**issuedOn** | **String** | Date formatted as yyyy-mm-dd |  [optional] |
|**number** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PASSPORT | &quot;PASSPORT&quot; |
| DRIVING_LICENCE | &quot;DRIVING_LICENCE&quot; |
| NATIONAL_ID_CARD | &quot;NATIONAL_ID_CARD&quot; |
| RESIDENCE_PERMIT | &quot;RESIDENCE_PERMIT&quot; |



