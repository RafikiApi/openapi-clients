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
    /// OpenapiPaymentAccountListResponseMetaPagingCursors
    /// </summary>
    [DataContract(Name = "openapi_PaymentAccountListResponseMeta_paging_cursors")]
    public partial class OpenapiPaymentAccountListResponseMetaPagingCursors : IEquatable<OpenapiPaymentAccountListResponseMetaPagingCursors>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPaymentAccountListResponseMetaPagingCursors" /> class.
        /// </summary>
        /// <param name="after">after.</param>
        public OpenapiPaymentAccountListResponseMetaPagingCursors(string after = default(string))
        {
            this.After = after;
        }

        /// <summary>
        /// Gets or Sets After
        /// </summary>
        /// <example>cGFjLTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw&#x3D;&#x3D;</example>
        [DataMember(Name = "after", EmitDefaultValue = false)]
        public string After { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPaymentAccountListResponseMetaPagingCursors {\n");
            sb.Append("  After: ").Append(After).Append("\n");
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
            return this.Equals(input as OpenapiPaymentAccountListResponseMetaPagingCursors);
        }

        /// <summary>
        /// Returns true if OpenapiPaymentAccountListResponseMetaPagingCursors instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPaymentAccountListResponseMetaPagingCursors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPaymentAccountListResponseMetaPagingCursors input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.After == input.After ||
                    (this.After != null &&
                    this.After.Equals(input.After))
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
                if (this.After != null)
                {
                    hashCode = (hashCode * 59) + this.After.GetHashCode();
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
