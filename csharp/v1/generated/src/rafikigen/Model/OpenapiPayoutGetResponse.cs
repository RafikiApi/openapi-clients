/*
 * Resources
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = rafikigen.Client.OpenAPIDateConverter;

namespace rafikigen.Model
{
    /// <summary>
    /// OpenapiPayoutGetResponse
    /// </summary>
    [DataContract(Name = "openapi.PayoutGetResponse")]
    public partial class OpenapiPayoutGetResponse : IEquatable<OpenapiPayoutGetResponse>, IValidatableObject
    {
        /// <summary>
        /// Defines Purpose
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PurposeEnum
        {
            /// <summary>
            /// Enum GOODSPURCHASE for value: GOODS_PURCHASE
            /// </summary>
            [EnumMember(Value = "GOODS_PURCHASE")]
            GOODSPURCHASE = 1,

            /// <summary>
            /// Enum SERVICESPAYMENT for value: SERVICES_PAYMENT
            /// </summary>
            [EnumMember(Value = "SERVICES_PAYMENT")]
            SERVICESPAYMENT = 2,

            /// <summary>
            /// Enum INVOICEPAYMENT for value: INVOICE_PAYMENT
            /// </summary>
            [EnumMember(Value = "INVOICE_PAYMENT")]
            INVOICEPAYMENT = 3,

            /// <summary>
            /// Enum LOANREPAYMENT for value: LOAN_REPAYMENT
            /// </summary>
            [EnumMember(Value = "LOAN_REPAYMENT")]
            LOANREPAYMENT = 4,

            /// <summary>
            /// Enum BILLSPAYMENT for value: BILLS_PAYMENT
            /// </summary>
            [EnumMember(Value = "BILLS_PAYMENT")]
            BILLSPAYMENT = 5,

            /// <summary>
            /// Enum SALARYANDWAGES for value: SALARY_AND_WAGES
            /// </summary>
            [EnumMember(Value = "SALARY_AND_WAGES")]
            SALARYANDWAGES = 6,

            /// <summary>
            /// Enum P2PTRANSFER for value: P2P_TRANSFER
            /// </summary>
            [EnumMember(Value = "P2P_TRANSFER")]
            P2PTRANSFER = 7,

            /// <summary>
            /// Enum REMITTANCE for value: REMITTANCE
            /// </summary>
            [EnumMember(Value = "REMITTANCE")]
            REMITTANCE = 8,

            /// <summary>
            /// Enum DONATION for value: DONATION
            /// </summary>
            [EnumMember(Value = "DONATION")]
            DONATION = 9,

            /// <summary>
            /// Enum GRANTSANDSCHOLARSHIPS for value: GRANTS_AND_SCHOLARSHIPS
            /// </summary>
            [EnumMember(Value = "GRANTS_AND_SCHOLARSHIPS")]
            GRANTSANDSCHOLARSHIPS = 10,

            /// <summary>
            /// Enum TRAVELANDACCOMMODATION for value: TRAVEL_AND_ACCOMMODATION
            /// </summary>
            [EnumMember(Value = "TRAVEL_AND_ACCOMMODATION")]
            TRAVELANDACCOMMODATION = 11,

            /// <summary>
            /// Enum TAXPAYMENT for value: TAX_PAYMENT
            /// </summary>
            [EnumMember(Value = "TAX_PAYMENT")]
            TAXPAYMENT = 12,

            /// <summary>
            /// Enum INSURANCEPREMIUM for value: INSURANCE_PREMIUM
            /// </summary>
            [EnumMember(Value = "INSURANCE_PREMIUM")]
            INSURANCEPREMIUM = 13
        }


        /// <summary>
        /// Gets or Sets Purpose
        /// </summary>
        /// <example>REMITTANCE</example>
        [DataMember(Name = "purpose", EmitDefaultValue = false)]
        public PurposeEnum? Purpose { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPayoutGetResponse" /> class.
        /// </summary>
        /// <param name="amount">amount.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="customId">customId.</param>
        /// <param name="id">The payout unique identifier.</param>
        /// <param name="onBehalfOf">onBehalfOf.</param>
        /// <param name="paymentAccountId">The recipient payment account receiving funds.</param>
        /// <param name="purpose">purpose.</param>
        /// <param name="receipt">The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property..</param>
        /// <param name="sender">sender.</param>
        /// <param name="state">state.</param>
        /// <param name="walletId">The wallet ID from which the money will disburse.</param>
        public OpenapiPayoutGetResponse(OpenapiPayoutCreateResponseAmount amount = default(OpenapiPayoutCreateResponseAmount), string createdAt = default(string), string customId = default(string), string id = default(string), List<string> onBehalfOf = default(List<string>), string paymentAccountId = default(string), PurposeEnum? purpose = default(PurposeEnum?), string receipt = default(string), OpenapiPayoutCreateResponseSender sender = default(OpenapiPayoutCreateResponseSender), OpenapiPayoutCreateResponseState state = default(OpenapiPayoutCreateResponseState), string walletId = default(string))
        {
            this.Amount = amount;
            this.CreatedAt = createdAt;
            this.CustomId = customId;
            this.Id = id;
            this.OnBehalfOf = onBehalfOf;
            this.PaymentAccountId = paymentAccountId;
            this.Purpose = purpose;
            this.Receipt = receipt;
            this.Sender = sender;
            this.State = state;
            this.WalletId = walletId;
        }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public OpenapiPayoutCreateResponseAmount Amount { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        /// <example>2006-01-02T15:04:05Z07:00</example>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets CustomId
        /// </summary>
        /// <example>custom-id-xxx</example>
        [DataMember(Name = "custom_id", EmitDefaultValue = false)]
        public string CustomId { get; set; }

        /// <summary>
        /// The payout unique identifier
        /// </summary>
        /// <value>The payout unique identifier</value>
        /// <example>pyt-xxx</example>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets OnBehalfOf
        /// </summary>
        /// <example>[&quot;[\&quot;org-xxx\&quot;]&quot;]</example>
        [DataMember(Name = "on_behalf_of", EmitDefaultValue = false)]
        public List<string> OnBehalfOf { get; set; }

        /// <summary>
        /// The recipient payment account receiving funds
        /// </summary>
        /// <value>The recipient payment account receiving funds</value>
        /// <example>pac-xxx</example>
        [DataMember(Name = "payment_account_id", EmitDefaultValue = false)]
        public string PaymentAccountId { get; set; }

        /// <summary>
        /// The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.
        /// </summary>
        /// <value>The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.</value>
        /// <example>ref-xxx (format changes depending on the telco/bank)</example>
        [DataMember(Name = "receipt", EmitDefaultValue = false)]
        public string Receipt { get; set; }

        /// <summary>
        /// Gets or Sets Sender
        /// </summary>
        [DataMember(Name = "sender", EmitDefaultValue = false)]
        public OpenapiPayoutCreateResponseSender Sender { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public OpenapiPayoutCreateResponseState State { get; set; }

        /// <summary>
        /// The wallet ID from which the money will disburse
        /// </summary>
        /// <value>The wallet ID from which the money will disburse</value>
        /// <example>wlt-xxx</example>
        [DataMember(Name = "wallet_id", EmitDefaultValue = false)]
        public string WalletId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPayoutGetResponse {\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CustomId: ").Append(CustomId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  OnBehalfOf: ").Append(OnBehalfOf).Append("\n");
            sb.Append("  PaymentAccountId: ").Append(PaymentAccountId).Append("\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  Receipt: ").Append(Receipt).Append("\n");
            sb.Append("  Sender: ").Append(Sender).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  WalletId: ").Append(WalletId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OpenapiPayoutGetResponse);
        }

        /// <summary>
        /// Returns true if OpenapiPayoutGetResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPayoutGetResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPayoutGetResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.CustomId == input.CustomId ||
                    (this.CustomId != null &&
                    this.CustomId.Equals(input.CustomId))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.OnBehalfOf == input.OnBehalfOf ||
                    this.OnBehalfOf != null &&
                    input.OnBehalfOf != null &&
                    this.OnBehalfOf.SequenceEqual(input.OnBehalfOf)
                ) && 
                (
                    this.PaymentAccountId == input.PaymentAccountId ||
                    (this.PaymentAccountId != null &&
                    this.PaymentAccountId.Equals(input.PaymentAccountId))
                ) && 
                (
                    this.Purpose == input.Purpose ||
                    this.Purpose.Equals(input.Purpose)
                ) && 
                (
                    this.Receipt == input.Receipt ||
                    (this.Receipt != null &&
                    this.Receipt.Equals(input.Receipt))
                ) && 
                (
                    this.Sender == input.Sender ||
                    (this.Sender != null &&
                    this.Sender.Equals(input.Sender))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.WalletId == input.WalletId ||
                    (this.WalletId != null &&
                    this.WalletId.Equals(input.WalletId))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Amount != null)
                {
                    hashCode = (hashCode * 59) + this.Amount.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.CustomId != null)
                {
                    hashCode = (hashCode * 59) + this.CustomId.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.OnBehalfOf != null)
                {
                    hashCode = (hashCode * 59) + this.OnBehalfOf.GetHashCode();
                }
                if (this.PaymentAccountId != null)
                {
                    hashCode = (hashCode * 59) + this.PaymentAccountId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Purpose.GetHashCode();
                if (this.Receipt != null)
                {
                    hashCode = (hashCode * 59) + this.Receipt.GetHashCode();
                }
                if (this.Sender != null)
                {
                    hashCode = (hashCode * 59) + this.Sender.GetHashCode();
                }
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.WalletId != null)
                {
                    hashCode = (hashCode * 59) + this.WalletId.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
