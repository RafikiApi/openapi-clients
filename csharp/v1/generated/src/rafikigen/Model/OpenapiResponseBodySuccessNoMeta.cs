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
    /// OpenapiResponseBodySuccessNoMeta
    /// </summary>
    [DataContract(Name = "openapi.ResponseBodySuccessNoMeta")]
    public partial class OpenapiResponseBodySuccessNoMeta : IEquatable<OpenapiResponseBodySuccessNoMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiResponseBodySuccessNoMeta" /> class.
        /// </summary>
        /// <param name="data">data.</param>
        public OpenapiResponseBodySuccessNoMeta(Object data = default(Object))
        {
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", EmitDefaultValue = true)]
        public Object Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiResponseBodySuccessNoMeta {\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as OpenapiResponseBodySuccessNoMeta);
        }

        /// <summary>
        /// Returns true if OpenapiResponseBodySuccessNoMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiResponseBodySuccessNoMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiResponseBodySuccessNoMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
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
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
