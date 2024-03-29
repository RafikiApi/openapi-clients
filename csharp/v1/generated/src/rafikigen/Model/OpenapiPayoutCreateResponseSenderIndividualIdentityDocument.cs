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
    /// OpenapiPayoutCreateResponseSenderIndividualIdentityDocument
    /// </summary>
    [DataContract(Name = "openapi_PayoutCreateResponse_sender_individual_identity_document")]
    public partial class OpenapiPayoutCreateResponseSenderIndividualIdentityDocument : IEquatable<OpenapiPayoutCreateResponseSenderIndividualIdentityDocument>, IValidatableObject
    {
        /// <summary>
        /// Defines Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum PASSPORT for value: PASSPORT
            /// </summary>
            [EnumMember(Value = "PASSPORT")]
            PASSPORT = 1,

            /// <summary>
            /// Enum DRIVINGLICENCE for value: DRIVING_LICENCE
            /// </summary>
            [EnumMember(Value = "DRIVING_LICENCE")]
            DRIVINGLICENCE = 2,

            /// <summary>
            /// Enum NATIONALIDCARD for value: NATIONAL_ID_CARD
            /// </summary>
            [EnumMember(Value = "NATIONAL_ID_CARD")]
            NATIONALIDCARD = 3,

            /// <summary>
            /// Enum RESIDENCEPERMIT for value: RESIDENCE_PERMIT
            /// </summary>
            [EnumMember(Value = "RESIDENCE_PERMIT")]
            RESIDENCEPERMIT = 4
        }


        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPayoutCreateResponseSenderIndividualIdentityDocument" /> class.
        /// </summary>
        /// <param name="country">The ISO 3166 alpha-2 country code indicating the issuing country of the document..</param>
        /// <param name="expiresOn">Date formatted as yyyy-mm-dd.</param>
        /// <param name="issuedOn">Date formatted as yyyy-mm-dd.</param>
        /// <param name="number">number.</param>
        /// <param name="type">type.</param>
        public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument(string country = default(string), string expiresOn = default(string), string issuedOn = default(string), string number = default(string), TypeEnum? type = default(TypeEnum?))
        {
            this.Country = country;
            this.ExpiresOn = expiresOn;
            this.IssuedOn = issuedOn;
            this.Number = number;
            this.Type = type;
        }

        /// <summary>
        /// The ISO 3166 alpha-2 country code indicating the issuing country of the document.
        /// </summary>
        /// <value>The ISO 3166 alpha-2 country code indicating the issuing country of the document.</value>
        /// <example>IT</example>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Date formatted as yyyy-mm-dd
        /// </summary>
        /// <value>Date formatted as yyyy-mm-dd</value>
        /// <example>2030-01-01</example>
        [DataMember(Name = "expires_on", EmitDefaultValue = false)]
        public string ExpiresOn { get; set; }

        /// <summary>
        /// Date formatted as yyyy-mm-dd
        /// </summary>
        /// <value>Date formatted as yyyy-mm-dd</value>
        /// <example>2020-01-01</example>
        [DataMember(Name = "issued_on", EmitDefaultValue = false)]
        public string IssuedOn { get; set; }

        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        /// <example>YA0000000</example>
        [DataMember(Name = "number", EmitDefaultValue = false)]
        public string Number { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPayoutCreateResponseSenderIndividualIdentityDocument {\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  ExpiresOn: ").Append(ExpiresOn).Append("\n");
            sb.Append("  IssuedOn: ").Append(IssuedOn).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
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
            return this.Equals(input as OpenapiPayoutCreateResponseSenderIndividualIdentityDocument);
        }

        /// <summary>
        /// Returns true if OpenapiPayoutCreateResponseSenderIndividualIdentityDocument instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPayoutCreateResponseSenderIndividualIdentityDocument input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.ExpiresOn == input.ExpiresOn ||
                    (this.ExpiresOn != null &&
                    this.ExpiresOn.Equals(input.ExpiresOn))
                ) && 
                (
                    this.IssuedOn == input.IssuedOn ||
                    (this.IssuedOn != null &&
                    this.IssuedOn.Equals(input.IssuedOn))
                ) && 
                (
                    this.Number == input.Number ||
                    (this.Number != null &&
                    this.Number.Equals(input.Number))
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
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.ExpiresOn != null)
                {
                    hashCode = (hashCode * 59) + this.ExpiresOn.GetHashCode();
                }
                if (this.IssuedOn != null)
                {
                    hashCode = (hashCode * 59) + this.IssuedOn.GetHashCode();
                }
                if (this.Number != null)
                {
                    hashCode = (hashCode * 59) + this.Number.GetHashCode();
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
