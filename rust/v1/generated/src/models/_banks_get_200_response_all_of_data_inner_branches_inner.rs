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
pub struct BanksGet200ResponseAllOfDataInnerBranchesInner {
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
}

impl BanksGet200ResponseAllOfDataInnerBranchesInner {
    pub fn new() -> BanksGet200ResponseAllOfDataInnerBranchesInner {
        BanksGet200ResponseAllOfDataInnerBranchesInner {
            id: None,
            name: None,
        }
    }
}

