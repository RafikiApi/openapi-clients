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
pub struct OpenapiPayoutCreateResponseSenderAddress {
    #[serde(rename = "city", skip_serializing_if = "Option::is_none")]
    pub city: Option<String>,
    /// The ISO 3166 alpha-2 country code associated with the address.
    #[serde(rename = "country", skip_serializing_if = "Option::is_none")]
    pub country: Option<String>,
    #[serde(rename = "line_1", skip_serializing_if = "Option::is_none")]
    pub line_1: Option<String>,
    #[serde(rename = "line_2", skip_serializing_if = "Option::is_none")]
    pub line_2: Option<String>,
    #[serde(rename = "line_3", skip_serializing_if = "Option::is_none")]
    pub line_3: Option<String>,
    #[serde(rename = "postal_code", skip_serializing_if = "Option::is_none")]
    pub postal_code: Option<String>,
}

impl OpenapiPayoutCreateResponseSenderAddress {
    pub fn new() -> OpenapiPayoutCreateResponseSenderAddress {
        OpenapiPayoutCreateResponseSenderAddress {
            city: None,
            country: None,
            line_1: None,
            line_2: None,
            line_3: None,
            postal_code: None,
        }
    }
}


