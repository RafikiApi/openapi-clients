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
pub struct OpenapiPeriodResponseBodySuccessCursorPaginated {
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<Vec<serde_json::Value>>,
    #[serde(rename = "meta", skip_serializing_if = "Option::is_none")]
    pub meta: Option<Box<crate::models::OpenapiResponseBodySuccessCursorPaginatedMeta>>,
}

impl OpenapiPeriodResponseBodySuccessCursorPaginated {
    pub fn new() -> OpenapiPeriodResponseBodySuccessCursorPaginated {
        OpenapiPeriodResponseBodySuccessCursorPaginated {
            data: None,
            meta: None,
        }
    }
}


