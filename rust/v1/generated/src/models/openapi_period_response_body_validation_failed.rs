/*
 * Resources
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct OpenapiPeriodResponseBodyValidationFailed {
    /// `VALIDATION_FAILED`
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<String>,
    #[serde(rename = "errors", skip_serializing_if = "Option::is_none")]
    pub errors: Option<Box<crate::models::OpenapiResponseBodyValidationFailedErrors>>,
    /// E.g. \"Validation failed.\"
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
}

impl OpenapiPeriodResponseBodyValidationFailed {
    pub fn new() -> OpenapiPeriodResponseBodyValidationFailed {
        OpenapiPeriodResponseBodyValidationFailed {
            code: None,
            errors: None,
            message: None,
        }
    }
}


