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
    /// OpenapiPaymentAccountListResponseMeta
    /// </summary>
    [DataContract(Name = "openapi.PaymentAccountListResponseMeta")]
    public partial class OpenapiPaymentAccountListResponseMeta : IEquatable<OpenapiPaymentAccountListResponseMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPaymentAccountListResponseMeta" /> class.
        /// </summary>
        /// <param name="paging">paging.</param>
        public OpenapiPaymentAccountListResponseMeta(OpenapiPaymentAccountListResponseMetaPaging paging = default(OpenapiPaymentAccountListResponseMetaPaging))
        {
            this.Paging = paging;
        }

        /// <summary>
        /// Gets or Sets Paging
        /// </summary>
        [DataMember(Name = "paging", EmitDefaultValue = false)]
        public OpenapiPaymentAccountListResponseMetaPaging Paging { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPaymentAccountListResponseMeta {\n");
            sb.Append("  Paging: ").Append(Paging).Append("\n");
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
            return this.Equals(input as OpenapiPaymentAccountListResponseMeta);
        }

        /// <summary>
        /// Returns true if OpenapiPaymentAccountListResponseMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPaymentAccountListResponseMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPaymentAccountListResponseMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Paging == input.Paging ||
                    (this.Paging != null &&
                    this.Paging.Equals(input.Paging))
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
                if (this.Paging != null)
                {
                    hashCode = (hashCode * 59) + this.Paging.GetHashCode();
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
