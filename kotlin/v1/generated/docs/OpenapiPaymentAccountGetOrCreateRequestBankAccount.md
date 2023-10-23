
# OpenapiPaymentAccountGetOrCreateRequestBankAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The bank identifier representing the bank associated with the payment account |  [optional]
**branchId** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt; &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if the bank spans across multiple branches&lt;/span&gt;  The branch identifier representing the branch associated with the payment account |  [optional]
**number** | **kotlin.String** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required with type BANK_ACCOUNT&lt;/span&gt;  The actual bank account number (alphanum). |  [optional]



