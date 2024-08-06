# coding: utf-8

"""
    Resources

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictStr, validator
from rafikigen.models.openapi_payout_create_response_amount import OpenapiPayoutCreateResponseAmount
from rafikigen.models.openapi_payout_create_response_sender import OpenapiPayoutCreateResponseSender
from rafikigen.models.openapi_payout_create_response_state import OpenapiPayoutCreateResponseState

class OpenapiPayoutGetResponse(BaseModel):
    """
    OpenapiPayoutGetResponse
    """
    amount: Optional[OpenapiPayoutCreateResponseAmount] = None
    created_at: Optional[StrictStr] = None
    custom_id: Optional[StrictStr] = None
    id: Optional[StrictStr] = Field(None, description="The payout unique identifier")
    payment_account_id: Optional[StrictStr] = Field(None, description="The recipient payment account receiving funds")
    purpose: Optional[StrictStr] = None
    receipt: Optional[StrictStr] = Field(None, description="The reference provided by the recipient account's actual bank or telco on a successful payout.  > ⚠️ > It's important to be aware that this information might not be accessible for every payout. If there's no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.")
    sender: Optional[OpenapiPayoutCreateResponseSender] = None
    state: Optional[OpenapiPayoutCreateResponseState] = None
    wallet_id: Optional[StrictStr] = Field(None, description="The wallet ID from which the money will disburse")
    __properties = ["amount", "created_at", "custom_id", "id", "payment_account_id", "purpose", "receipt", "sender", "state", "wallet_id"]

    @validator('purpose')
    def purpose_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('GOODS_PURCHASE', 'SERVICES_PAYMENT', 'INVOICE_PAYMENT', 'LOAN_REPAYMENT', 'BILLS_PAYMENT', 'SALARY_AND_WAGES', 'P2P_TRANSFER', 'REMITTANCE', 'DONATION', 'GRANTS_AND_SCHOLARSHIPS', 'TRAVEL_AND_ACCOMMODATION', 'TAX_PAYMENT', 'INSURANCE_PREMIUM'):
            raise ValueError("must be one of enum values ('GOODS_PURCHASE', 'SERVICES_PAYMENT', 'INVOICE_PAYMENT', 'LOAN_REPAYMENT', 'BILLS_PAYMENT', 'SALARY_AND_WAGES', 'P2P_TRANSFER', 'REMITTANCE', 'DONATION', 'GRANTS_AND_SCHOLARSHIPS', 'TRAVEL_AND_ACCOMMODATION', 'TAX_PAYMENT', 'INSURANCE_PREMIUM')")
        return value

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> OpenapiPayoutGetResponse:
        """Create an instance of OpenapiPayoutGetResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of amount
        if self.amount:
            _dict['amount'] = self.amount.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sender
        if self.sender:
            _dict['sender'] = self.sender.to_dict()
        # override the default output from pydantic by calling `to_dict()` of state
        if self.state:
            _dict['state'] = self.state.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiPayoutGetResponse:
        """Create an instance of OpenapiPayoutGetResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiPayoutGetResponse.parse_obj(obj)

        _obj = OpenapiPayoutGetResponse.parse_obj({
            "amount": OpenapiPayoutCreateResponseAmount.from_dict(obj.get("amount")) if obj.get("amount") is not None else None,
            "created_at": obj.get("created_at"),
            "custom_id": obj.get("custom_id"),
            "id": obj.get("id"),
            "payment_account_id": obj.get("payment_account_id"),
            "purpose": obj.get("purpose"),
            "receipt": obj.get("receipt"),
            "sender": OpenapiPayoutCreateResponseSender.from_dict(obj.get("sender")) if obj.get("sender") is not None else None,
            "state": OpenapiPayoutCreateResponseState.from_dict(obj.get("state")) if obj.get("state") is not None else None,
            "wallet_id": obj.get("wallet_id")
        })
        return _obj


