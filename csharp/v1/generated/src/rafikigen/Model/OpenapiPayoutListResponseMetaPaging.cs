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
    /// OpenapiPayoutListResponseMetaPaging
    /// </summary>
    [DataContract(Name = "openapi_PayoutListResponseMeta_paging")]
    public partial class OpenapiPayoutListResponseMetaPaging : IEquatable<OpenapiPayoutListResponseMetaPaging>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiPayoutListResponseMetaPaging" /> class.
        /// </summary>
        /// <param name="cursors">cursors.</param>
        /// <param name="next">next.</param>
        public OpenapiPayoutListResponseMetaPaging(OpenapiPayoutListResponseMetaPagingCursors cursors = default(OpenapiPayoutListResponseMetaPagingCursors), string next = default(string))
        {
            this.Cursors = cursors;
            this.Next = next;
        }

        /// <summary>
        /// Gets or Sets Cursors
        /// </summary>
        [DataMember(Name = "cursors", EmitDefaultValue = false)]
        public OpenapiPayoutListResponseMetaPagingCursors Cursors { get; set; }

        /// <summary>
        /// Gets or Sets Next
        /// </summary>
        /// <example>https://rest.sandbox.rafiki-api.com/v1/payouts?paging_after&#x3D;dHJ4LTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw%3D%3D&amp;paging_limit&#x3D;10</example>
        [DataMember(Name = "next", EmitDefaultValue = false)]
        public string Next { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiPayoutListResponseMetaPaging {\n");
            sb.Append("  Cursors: ").Append(Cursors).Append("\n");
            sb.Append("  Next: ").Append(Next).Append("\n");
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
            return this.Equals(input as OpenapiPayoutListResponseMetaPaging);
        }

        /// <summary>
        /// Returns true if OpenapiPayoutListResponseMetaPaging instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiPayoutListResponseMetaPaging to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiPayoutListResponseMetaPaging input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Cursors == input.Cursors ||
                    (this.Cursors != null &&
                    this.Cursors.Equals(input.Cursors))
                ) && 
                (
                    this.Next == input.Next ||
                    (this.Next != null &&
                    this.Next.Equals(input.Next))
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
                if (this.Cursors != null)
                {
                    hashCode = (hashCode * 59) + this.Cursors.GetHashCode();
                }
                if (this.Next != null)
                {
                    hashCode = (hashCode * 59) + this.Next.GetHashCode();
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
