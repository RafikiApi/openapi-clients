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
pub struct OpenapiPeriodPayoutListResponseMeta {
    #[serde(rename = "paging", skip_serializing_if = "Option::is_none")]
    pub paging: Option<Box<crate::models::OpenapiPayoutListResponseMetaPaging>>,
}

impl OpenapiPeriodPayoutListResponseMeta {
    pub fn new() -> OpenapiPeriodPayoutListResponseMeta {
        OpenapiPeriodPayoutListResponseMeta {
            paging: None,
        }
    }
}

