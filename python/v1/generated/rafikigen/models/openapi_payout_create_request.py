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
from pydantic import BaseModel, Field, StrictStr
from rafikigen.models.openapi_payment_account_get_or_create_request import OpenapiPaymentAccountGetOrCreateRequest
from rafikigen.models.openapi_payout_create_request_amount import OpenapiPayoutCreateRequestAmount
from rafikigen.models.openapi_payout_create_request_sender import OpenapiPayoutCreateRequestSender

class OpenapiPayoutCreateRequest(BaseModel):
    """
    OpenapiPayoutCreateRequest
    """
    amount: Optional[OpenapiPayoutCreateRequestAmount] = None
    custom_id: Optional[StrictStr] = Field(None, description="An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \"-\" and \"_\".")
    payment_account: Optional[OpenapiPaymentAccountGetOrCreateRequest] = None
    payment_account_id: Optional[StrictStr] = Field(None, description="<span style=\"color:#e95f6a;\">required if payment_account is empty</span>  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.")
    sender: Optional[OpenapiPayoutCreateRequestSender] = None
    wallet_id: Optional[StrictStr] = Field(None, description="The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.")
    __properties = ["amount", "custom_id", "payment_account", "payment_account_id", "sender", "wallet_id"]

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
    def from_json(cls, json_str: str) -> OpenapiPayoutCreateRequest:
        """Create an instance of OpenapiPayoutCreateRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of payment_account
        if self.payment_account:
            _dict['payment_account'] = self.payment_account.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sender
        if self.sender:
            _dict['sender'] = self.sender.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiPayoutCreateRequest:
        """Create an instance of OpenapiPayoutCreateRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiPayoutCreateRequest.parse_obj(obj)

        _obj = OpenapiPayoutCreateRequest.parse_obj({
            "amount": OpenapiPayoutCreateRequestAmount.from_dict(obj.get("amount")) if obj.get("amount") is not None else None,
            "custom_id": obj.get("custom_id"),
            "payment_account": OpenapiPaymentAccountGetOrCreateRequest.from_dict(obj.get("payment_account")) if obj.get("payment_account") is not None else None,
            "payment_account_id": obj.get("payment_account_id"),
            "sender": OpenapiPayoutCreateRequestSender.from_dict(obj.get("sender")) if obj.get("sender") is not None else None,
            "wallet_id": obj.get("wallet_id")
        })
        return _obj


