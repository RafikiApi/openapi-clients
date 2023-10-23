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
    /// OpenapiPayoutCreateRequest
    /// </summary>
    [DataContract(Name = "openapi.PayoutCreateRequest")]
    public partial class OpenapiPayoutCreateRequest : IEquatable<OpenapiPayoutCreateRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPayoutCreateRequest" /> class.
        /// </summary>
        /// <param name="amount">amount.</param>
        /// <param name="paymentAccount">paymentAccount.</param>
        /// <param name="paymentAccountId">&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout..</param>
        /// <param name="sender">sender.</param>
        /// <param name="walletId">The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount..</param>
        public OpenapiPayoutCreateRequest(OpenapiPayoutCreateRequestAmount amount = default(OpenapiPayoutCreateRequestAmount), OpenapiPaymentAccountGetOrCreateRequest paymentAccount = default(OpenapiPaymentAccountGetOrCreateRequest), string paymentAccountId = default(string), OpenapiPayoutCreateRequestSender sender = default(OpenapiPayoutCreateRequestSender), string walletId = default(string))
        {
            this.Amount = amount;
            this.PaymentAccount = paymentAccount;
            this.PaymentAccountId = paymentAccountId;
            this.Sender = sender;
            this.WalletId = walletId;
        }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public OpenapiPayoutCreateRequestAmount Amount { get; set; }

        /// <summary>
        /// Gets or Sets PaymentAccount
        /// </summary>
        [DataMember(Name = "payment_account", EmitDefaultValue = false)]
        public OpenapiPaymentAccountGetOrCreateRequest PaymentAccount { get; set; }

        /// <summary>
        /// &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.
        /// </summary>
        /// <value>&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.</value>
        /// <example>pac-xxx</example>
        [DataMember(Name = "payment_account_id", EmitDefaultValue = false)]
        public string PaymentAccountId { get; set; }

        /// <summary>
        /// Gets or Sets Sender
        /// </summary>
        [DataMember(Name = "sender", EmitDefaultValue = false)]
        public OpenapiPayoutCreateRequestSender Sender { get; set; }

        /// <summary>
        /// The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.
        /// </summary>
        /// <value>The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.</value>
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
            sb.Append("class OpenapiPayoutCreateRequest {\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  PaymentAccount: ").Append(PaymentAccount).Append("\n");
            sb.Append("  PaymentAccountId: ").Append(PaymentAccountId).Append("\n");
            sb.Append("  Sender: ").Append(Sender).Append("\n");
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
            return this.Equals(input as OpenapiPayoutCreateRequest);
        }

        /// <summary>
        /// Returns true if OpenapiPayoutCreateRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPayoutCreateRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPayoutCreateRequest input)
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
                    this.PaymentAccount == input.PaymentAccount ||
                    (this.PaymentAccount != null &&
                    this.PaymentAccount.Equals(input.PaymentAccount))
                ) && 
                (
                    this.PaymentAccountId == input.PaymentAccountId ||
                    (this.PaymentAccountId != null &&
                    this.PaymentAccountId.Equals(input.PaymentAccountId))
                ) && 
                (
                    this.Sender == input.Sender ||
                    (this.Sender != null &&
                    this.Sender.Equals(input.Sender))
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
                if (this.PaymentAccount != null)
                {
                    hashCode = (hashCode * 59) + this.PaymentAccount.GetHashCode();
                }
                if (this.PaymentAccountId != null)
                {
                    hashCode = (hashCode * 59) + this.PaymentAccountId.GetHashCode();
                }
                if (this.Sender != null)
                {
                    hashCode = (hashCode * 59) + this.Sender.GetHashCode();
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
