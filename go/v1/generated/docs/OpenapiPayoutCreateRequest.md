# OpenapiPayoutCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to [**OpenapiPayoutCreateRequestAmount**](OpenapiPayoutCreateRequestAmount.md) |  | [optional] 
**CustomId** | Pointer to **string** | An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \&quot;-\&quot; and \&quot;_\&quot;. | [optional] 
**PaymentAccount** | Pointer to [**OpenapiPaymentAccountGetOrCreateRequest**](OpenapiPaymentAccountGetOrCreateRequest.md) |  | [optional] 
**PaymentAccountId** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout. | [optional] 
**Purpose** | Pointer to **string** | &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account country is GH,UG,EG,CI,SN or CM&lt;/span&gt;  The purpose of the payout is a mandatory property that must be provided for compliance and reporting purposes. Choose one of the following predefined values that best describes the nature of the payout:  &lt;ul&gt; &lt;li&gt;&lt;code&gt;GOODS_PURCHASE&lt;/code&gt;: Payments made for buying physical or digital goods.&lt;/li&gt; &lt;li&gt;&lt;code&gt;SERVICES_PAYMENT&lt;/code&gt;: Payments made for services rendered, including professional services, consulting, and freelance work.&lt;/li&gt; &lt;li&gt;&lt;code&gt;INVOICE_PAYMENT&lt;/code&gt;: Payments made to settle invoices issued for goods or services.&lt;/li&gt; &lt;li&gt;&lt;code&gt;LOAN_REPAYMENT&lt;/code&gt;: Payments made towards repaying loans, including personal, auto, mortgage, and business loans.&lt;/li&gt; &lt;li&gt;&lt;code&gt;BILLS_PAYMENT&lt;/code&gt;: Payments for recurring bills such as utilities, rent, insurance, and telecommunications.&lt;/li&gt; &lt;li&gt;&lt;code&gt;SALARY_AND_WAGES&lt;/code&gt;: Disbursements made to employees for their salaries and wages.&lt;/li&gt; &lt;li&gt;&lt;code&gt;P2P_TRANSFER&lt;/code&gt;: Domestic person-to-person transfers for sending money to friends, family, or acquaintances.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMITTANCE&lt;/code&gt;: Cross-border person-to-person transfers for sending money to friends, family, or acquaintances.&lt;/li&gt; &lt;li&gt;&lt;code&gt;DONATION&lt;/code&gt;: Payments made to charitable organizations or causes.&lt;/li&gt; &lt;li&gt;&lt;code&gt;GRANTS_AND_SCHOLARSHIPS&lt;/code&gt;: Payments distributed as grants, scholarships, or other forms of financial aid.&lt;/li&gt; &lt;li&gt;&lt;code&gt;TRAVEL_AND_ACCOMMODATION&lt;/code&gt;: Payments made for travel-related expenses, including flight bookings, hotel reservations, and car rentals.&lt;/li&gt; &lt;li&gt;&lt;code&gt;TAX_PAYMENT&lt;/code&gt;: Payments made for settling taxes and duties.&lt;/li&gt; &lt;li&gt;&lt;code&gt;INSURANCE_PREMIUM&lt;/code&gt;: Payments made towards insurance policies, including health, auto, and life insurance.&lt;/li&gt; &lt;/ul&gt; | [optional] 
**Sender** | Pointer to [**OpenapiPayoutCreateRequestSender**](OpenapiPayoutCreateRequestSender.md) |  | [optional] 
**WalletId** | Pointer to **string** | The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount. | [optional] 

## Methods

### NewOpenapiPayoutCreateRequest

`func NewOpenapiPayoutCreateRequest() *OpenapiPayoutCreateRequest`

NewOpenapiPayoutCreateRequest instantiates a new OpenapiPayoutCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOpenapiPayoutCreateRequestWithDefaults

`func NewOpenapiPayoutCreateRequestWithDefaults() *OpenapiPayoutCreateRequest`

NewOpenapiPayoutCreateRequestWithDefaults instantiates a new OpenapiPayoutCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *OpenapiPayoutCreateRequest) GetAmount() OpenapiPayoutCreateRequestAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *OpenapiPayoutCreateRequest) GetAmountOk() (*OpenapiPayoutCreateRequestAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *OpenapiPayoutCreateRequest) SetAmount(v OpenapiPayoutCreateRequestAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *OpenapiPayoutCreateRequest) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCustomId

`func (o *OpenapiPayoutCreateRequest) GetCustomId() string`

GetCustomId returns the CustomId field if non-nil, zero value otherwise.

### GetCustomIdOk

`func (o *OpenapiPayoutCreateRequest) GetCustomIdOk() (*string, bool)`

GetCustomIdOk returns a tuple with the CustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomId

`func (o *OpenapiPayoutCreateRequest) SetCustomId(v string)`

SetCustomId sets CustomId field to given value.

### HasCustomId

`func (o *OpenapiPayoutCreateRequest) HasCustomId() bool`

HasCustomId returns a boolean if a field has been set.

### GetPaymentAccount

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccount() OpenapiPaymentAccountGetOrCreateRequest`

GetPaymentAccount returns the PaymentAccount field if non-nil, zero value otherwise.

### GetPaymentAccountOk

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccountOk() (*OpenapiPaymentAccountGetOrCreateRequest, bool)`

GetPaymentAccountOk returns a tuple with the PaymentAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentAccount

`func (o *OpenapiPayoutCreateRequest) SetPaymentAccount(v OpenapiPaymentAccountGetOrCreateRequest)`

SetPaymentAccount sets PaymentAccount field to given value.

### HasPaymentAccount

`func (o *OpenapiPayoutCreateRequest) HasPaymentAccount() bool`

HasPaymentAccount returns a boolean if a field has been set.

### GetPaymentAccountId

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccountId() string`

GetPaymentAccountId returns the PaymentAccountId field if non-nil, zero value otherwise.

### GetPaymentAccountIdOk

`func (o *OpenapiPayoutCreateRequest) GetPaymentAccountIdOk() (*string, bool)`

GetPaymentAccountIdOk returns a tuple with the PaymentAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentAccountId

`func (o *OpenapiPayoutCreateRequest) SetPaymentAccountId(v string)`

SetPaymentAccountId sets PaymentAccountId field to given value.

### HasPaymentAccountId

`func (o *OpenapiPayoutCreateRequest) HasPaymentAccountId() bool`

HasPaymentAccountId returns a boolean if a field has been set.

### GetPurpose

`func (o *OpenapiPayoutCreateRequest) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *OpenapiPayoutCreateRequest) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *OpenapiPayoutCreateRequest) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *OpenapiPayoutCreateRequest) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetSender

`func (o *OpenapiPayoutCreateRequest) GetSender() OpenapiPayoutCreateRequestSender`

GetSender returns the Sender field if non-nil, zero value otherwise.

### GetSenderOk

`func (o *OpenapiPayoutCreateRequest) GetSenderOk() (*OpenapiPayoutCreateRequestSender, bool)`

GetSenderOk returns a tuple with the Sender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSender

`func (o *OpenapiPayoutCreateRequest) SetSender(v OpenapiPayoutCreateRequestSender)`

SetSender sets Sender field to given value.

### HasSender

`func (o *OpenapiPayoutCreateRequest) HasSender() bool`

HasSender returns a boolean if a field has been set.

### GetWalletId

`func (o *OpenapiPayoutCreateRequest) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *OpenapiPayoutCreateRequest) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *OpenapiPayoutCreateRequest) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.

### HasWalletId

`func (o *OpenapiPayoutCreateRequest) HasWalletId() bool`

HasWalletId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


