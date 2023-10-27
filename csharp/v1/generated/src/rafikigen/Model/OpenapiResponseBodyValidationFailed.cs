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
    /// OpenapiResponseBodyValidationFailed
    /// </summary>
    [DataContract(Name = "openapi.ResponseBodyValidationFailed")]
    public partial class OpenapiResponseBodyValidationFailed : IEquatable<OpenapiResponseBodyValidationFailed>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenapiResponseBodyValidationFailed" /> class.
        /// </summary>
        /// <param name="code">&#x60;VALIDATION_FAILED&#x60;.</param>
        /// <param name="errors">errors.</param>
        /// <param name="message">E.g. \&quot;Validation failed.\&quot;.</param>
        public OpenapiResponseBodyValidationFailed(string code = default(string), OpenapiResponseBodyValidationFailedErrors errors = default(OpenapiResponseBodyValidationFailedErrors), string message = default(string))
        {
            this.Code = code;
            this.Errors = errors;
            this.Message = message;
        }

        /// <summary>
        /// &#x60;VALIDATION_FAILED&#x60;
        /// </summary>
        /// <value>&#x60;VALIDATION_FAILED&#x60;</value>
        /// <example>VALIDATION_FAILED</example>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Errors
        /// </summary>
        [DataMember(Name = "errors", EmitDefaultValue = false)]
        public OpenapiResponseBodyValidationFailedErrors Errors { get; set; }

        /// <summary>
        /// E.g. \&quot;Validation failed.\&quot;
        /// </summary>
        /// <value>E.g. \&quot;Validation failed.\&quot;</value>
        /// <example>Validation failed.</example>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenapiResponseBodyValidationFailed {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
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
            return this.Equals(input as OpenapiResponseBodyValidationFailed);
        }

        /// <summary>
        /// Returns true if OpenapiResponseBodyValidationFailed instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenapiResponseBodyValidationFailed to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenapiResponseBodyValidationFailed input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Errors == input.Errors ||
                    (this.Errors != null &&
                    this.Errors.Equals(input.Errors))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Errors != null)
                {
                    hashCode = (hashCode * 59) + this.Errors.GetHashCode();
                }
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
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
