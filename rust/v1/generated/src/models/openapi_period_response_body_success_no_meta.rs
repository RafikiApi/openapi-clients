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
pub struct OpenapiPeriodResponseBodySuccessNoMeta {
    #[serde(rename = "data", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub data: Option<Option<serde_json::Value>>,
}

impl OpenapiPeriodResponseBodySuccessNoMeta {
    pub fn new() -> OpenapiPeriodResponseBodySuccessNoMeta {
        OpenapiPeriodResponseBodySuccessNoMeta {
            data: None,
        }
    }
}


