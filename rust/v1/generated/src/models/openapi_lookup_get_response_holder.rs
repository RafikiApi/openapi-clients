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
pub struct OpenapiLookupGetResponseHolder {
    /// The payment account owner's registered full name at the banking entity
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
}

impl OpenapiLookupGetResponseHolder {
    pub fn new() -> OpenapiLookupGetResponseHolder {
        OpenapiLookupGetResponseHolder {
            name: None,
        }
    }
}


