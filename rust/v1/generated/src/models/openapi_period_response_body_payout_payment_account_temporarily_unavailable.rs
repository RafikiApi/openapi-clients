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
pub struct OpenapiPeriodResponseBodyPayoutPaymentAccountTemporarilyUnavailable {
    /// `PAYOUT_BANK_TEMPORARILY_UNAVAILABLE`
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<String>,
    /// E.g. \"Payout to this bank is not available.\"
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
}

impl OpenapiPeriodResponseBodyPayoutPaymentAccountTemporarilyUnavailable {
    pub fn new() -> OpenapiPeriodResponseBodyPayoutPaymentAccountTemporarilyUnavailable {
        OpenapiPeriodResponseBodyPayoutPaymentAccountTemporarilyUnavailable {
            code: None,
            message: None,
        }
    }
}

