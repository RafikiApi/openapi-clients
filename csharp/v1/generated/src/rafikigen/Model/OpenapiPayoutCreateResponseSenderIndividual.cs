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
    /// OpenapiPayoutCreateResponseSenderIndividual
    /// </summary>
    [DataContract(Name = "openapi_PayoutCreateResponse_sender_individual")]
    public partial class OpenapiPayoutCreateResponseSenderIndividual : IEquatable<OpenapiPayoutCreateResponseSenderIndividual>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPayoutCreateResponseSenderIndividual" /> class.
        /// </summary>
        /// <param name="dob">Date of birth formatted as yyyy-mm-dd.</param>
        /// <param name="identityDocument">identityDocument.</param>
        public OpenapiPayoutCreateResponseSenderIndividual(string dob = default(string), OpenapiPayoutCreateResponseSenderIndividualIdentityDocument identityDocument = default(OpenapiPayoutCreateResponseSenderIndividualIdentityDocument))
        {
            this.Dob = dob;
            this.IdentityDocument = identityDocument;
        }

        /// <summary>
        /// Date of birth formatted as yyyy-mm-dd
        /// </summary>
        /// <value>Date of birth formatted as yyyy-mm-dd</value>
        /// <example>1970-01-01</example>
        [DataMember(Name = "dob", EmitDefaultValue = false)]
        public string Dob { get; set; }

        /// <summary>
        /// Gets or Sets IdentityDocument
        /// </summary>
        [DataMember(Name = "identity_document", EmitDefaultValue = false)]
        public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument IdentityDocument { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPayoutCreateResponseSenderIndividual {\n");
            sb.Append("  Dob: ").Append(Dob).Append("\n");
            sb.Append("  IdentityDocument: ").Append(IdentityDocument).Append("\n");
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
            return this.Equals(input as OpenapiPayoutCreateResponseSenderIndividual);
        }

        /// <summary>
        /// Returns true if OpenapiPayoutCreateResponseSenderIndividual instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPayoutCreateResponseSenderIndividual to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPayoutCreateResponseSenderIndividual input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Dob == input.Dob ||
                    (this.Dob != null &&
                    this.Dob.Equals(input.Dob))
                ) && 
                (
                    this.IdentityDocument == input.IdentityDocument ||
                    (this.IdentityDocument != null &&
                    this.IdentityDocument.Equals(input.IdentityDocument))
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
                if (this.Dob != null)
                {
                    hashCode = (hashCode * 59) + this.Dob.GetHashCode();
                }
                if (this.IdentityDocument != null)
                {
                    hashCode = (hashCode * 59) + this.IdentityDocument.GetHashCode();
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
