
# OpenapiPaymentAccountGetOrCreateRequestMobileMoney

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The actual phone number formatted as E.164 |  [optional]
**&#x60;operator&#x60;** | [**inline**](#&#x60;Operator&#x60;) | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type MOBILE_MONEY&lt;/span&gt;  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money). |  [optional]


<a id="`Operator`"></a>
## Enum: operator
Name | Value
---- | -----
&#x60;operator&#x60; | SAFARICOM, AIRTEL



