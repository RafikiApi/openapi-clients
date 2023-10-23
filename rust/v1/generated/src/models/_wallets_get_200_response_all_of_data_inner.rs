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
pub struct WalletsGet200ResponseAllOfDataInner {
    /// The actual available balance
    #[serde(rename = "available", skip_serializing_if = "Option::is_none")]
    pub available: Option<String>,
    /// The total balance yet to settle
    #[serde(rename = "balance", skip_serializing_if = "Option::is_none")]
    pub balance: Option<String>,
    /// The ISO 4217 currency code associated with the wallet
    #[serde(rename = "currency", skip_serializing_if = "Option::is_none")]
    pub currency: Option<String>,
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
}

impl WalletsGet200ResponseAllOfDataInner {
    pub fn new() -> WalletsGet200ResponseAllOfDataInner {
        WalletsGet200ResponseAllOfDataInner {
            available: None,
            balance: None,
            currency: None,
            id: None,
        }
    }
}

