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
    /// OpenapiPaymentAccountGetOrCreateRequest
    /// </summary>
    [DataContract(Name = "openapi.PaymentAccountGetOrCreateRequest")]
    public partial class OpenapiPaymentAccountGetOrCreateRequest : IEquatable<OpenapiPaymentAccountGetOrCreateRequest>, IValidatableObject
    {
        /// <summary>
        /// &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;
        /// </summary>
        /// <value>&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum MOBILEMONEY for value: MOBILE_MONEY
            /// </summary>
            [EnumMember(Value = "MOBILE_MONEY")]
            MOBILEMONEY = 1,

            /// <summary>
            /// Enum BANKACCOUNT for value: BANK_ACCOUNT
            /// </summary>
            [EnumMember(Value = "BANK_ACCOUNT")]
            BANKACCOUNT = 2
        }


        /// <summary>
        /// &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;
        /// </summary>
        /// <value>&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPaymentAccountGetOrCreateRequest" /> class.
        /// </summary>
        /// <param name="bankAccount">bankAccount.</param>
        /// <param name="country">&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered..</param>
        /// <param name="holder">holder.</param>
        /// <param name="mobileMoney">mobileMoney.</param>
        /// <param name="type">&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;.</param>
        public OpenapiPaymentAccountGetOrCreateRequest(OpenapiPaymentAccountGetOrCreateRequestBankAccount bankAccount = default(OpenapiPaymentAccountGetOrCreateRequestBankAccount), string country = default(string), OpenapiPaymentAccountGetOrCreateRequestHolder holder = default(OpenapiPaymentAccountGetOrCreateRequestHolder), OpenapiPaymentAccountGetOrCreateRequestMobileMoney mobileMoney = default(OpenapiPaymentAccountGetOrCreateRequestMobileMoney), TypeEnum? type = default(TypeEnum?))
        {
            this.BankAccount = bankAccount;
            this.Country = country;
            this.Holder = holder;
            this.MobileMoney = mobileMoney;
            this.Type = type;
        }

        /// <summary>
        /// Gets or Sets BankAccount
        /// </summary>
        [DataMember(Name = "bank_account", EmitDefaultValue = false)]
        public OpenapiPaymentAccountGetOrCreateRequestBankAccount BankAccount { get; set; }

        /// <summary>
        /// &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered.
        /// </summary>
        /// <value>&lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered.</value>
        /// <example>KE</example>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets Holder
        /// </summary>
        [DataMember(Name = "holder", EmitDefaultValue = false)]
        public OpenapiPaymentAccountGetOrCreateRequestHolder Holder { get; set; }

        /// <summary>
        /// Gets or Sets MobileMoney
        /// </summary>
        [DataMember(Name = "mobile_money", EmitDefaultValue = false)]
        public OpenapiPaymentAccountGetOrCreateRequestMobileMoney MobileMoney { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPaymentAccountGetOrCreateRequest {\n");
            sb.Append("  BankAccount: ").Append(BankAccount).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Holder: ").Append(Holder).Append("\n");
            sb.Append("  MobileMoney: ").Append(MobileMoney).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as OpenapiPaymentAccountGetOrCreateRequest);
        }

        /// <summary>
        /// Returns true if OpenapiPaymentAccountGetOrCreateRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPaymentAccountGetOrCreateRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPaymentAccountGetOrCreateRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BankAccount == input.BankAccount ||
                    (this.BankAccount != null &&
                    this.BankAccount.Equals(input.BankAccount))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.Holder == input.Holder ||
                    (this.Holder != null &&
                    this.Holder.Equals(input.Holder))
                ) && 
                (
                    this.MobileMoney == input.MobileMoney ||
                    (this.MobileMoney != null &&
                    this.MobileMoney.Equals(input.MobileMoney))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.BankAccount != null)
                {
                    hashCode = (hashCode * 59) + this.BankAccount.GetHashCode();
                }
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.Holder != null)
                {
                    hashCode = (hashCode * 59) + this.Holder.GetHashCode();
                }
                if (this.MobileMoney != null)
                {
                    hashCode = (hashCode * 59) + this.MobileMoney.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
