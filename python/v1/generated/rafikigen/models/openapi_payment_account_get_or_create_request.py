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
from rafikigen.models.openapi_payment_account_get_or_create_request_bank_account import OpenapiPaymentAccountGetOrCreateRequestBankAccount
from rafikigen.models.openapi_payment_account_get_or_create_request_holder import OpenapiPaymentAccountGetOrCreateRequestHolder
from rafikigen.models.openapi_payment_account_get_or_create_request_mobile_money import OpenapiPaymentAccountGetOrCreateRequestMobileMoney

class OpenapiPaymentAccountGetOrCreateRequest(BaseModel):
    """
    OpenapiPaymentAccountGetOrCreateRequest
    """
    bank_account: Optional[OpenapiPaymentAccountGetOrCreateRequestBankAccount] = None
    country: Optional[StrictStr] = Field(None, description="<span style=\"color:#e95f6a;\">required</span>  The ISO 3166 alpha-2 country code in which the payment account is registered.")
    holder: Optional[OpenapiPaymentAccountGetOrCreateRequestHolder] = None
    mobile_money: Optional[OpenapiPaymentAccountGetOrCreateRequestMobileMoney] = None
    type: Optional[StrictStr] = Field(None, description="<span style=\"color:#e95f6a;\">required</span>  Either `MOBILE_MONEY` or `BANK_ACCOUNT`")
    __properties = ["bank_account", "country", "holder", "mobile_money", "type"]

    @validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('MOBILE_MONEY', 'BANK_ACCOUNT'):
            raise ValueError("must be one of enum values ('MOBILE_MONEY', 'BANK_ACCOUNT')")
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
    def from_json(cls, json_str: str) -> OpenapiPaymentAccountGetOrCreateRequest:
        """Create an instance of OpenapiPaymentAccountGetOrCreateRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of bank_account
        if self.bank_account:
            _dict['bank_account'] = self.bank_account.to_dict()
        # override the default output from pydantic by calling `to_dict()` of holder
        if self.holder:
            _dict['holder'] = self.holder.to_dict()
        # override the default output from pydantic by calling `to_dict()` of mobile_money
        if self.mobile_money:
            _dict['mobile_money'] = self.mobile_money.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiPaymentAccountGetOrCreateRequest:
        """Create an instance of OpenapiPaymentAccountGetOrCreateRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiPaymentAccountGetOrCreateRequest.parse_obj(obj)

        _obj = OpenapiPaymentAccountGetOrCreateRequest.parse_obj({
            "bank_account": OpenapiPaymentAccountGetOrCreateRequestBankAccount.from_dict(obj.get("bank_account")) if obj.get("bank_account") is not None else None,
            "country": obj.get("country"),
            "holder": OpenapiPaymentAccountGetOrCreateRequestHolder.from_dict(obj.get("holder")) if obj.get("holder") is not None else None,
            "mobile_money": OpenapiPaymentAccountGetOrCreateRequestMobileMoney.from_dict(obj.get("mobile_money")) if obj.get("mobile_money") is not None else None,
            "type": obj.get("type")
        })
        return _obj


