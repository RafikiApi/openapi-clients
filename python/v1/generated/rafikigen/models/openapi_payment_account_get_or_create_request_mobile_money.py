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

class OpenapiPaymentAccountGetOrCreateRequestMobileMoney(BaseModel):
    """
    OpenapiPaymentAccountGetOrCreateRequestMobileMoney
    """
    number: Optional[StrictStr] = Field(None, description="<span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The actual phone number formatted as E.164")
    operator: Optional[StrictStr] = Field(None, description="<span style=\"color:#e95f6a;\">required with type MOBILE_MONEY</span>  The telco network associated with the phone number. Each country allows only a subset of operators, this is documented [here](post_payment-accounts#mobile-money).")
    __properties = ["number", "operator"]

    @validator('operator')
    def operator_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('SAFARICOM', 'AIRTEL', 'VODACOM', 'TIGO', 'HALOTEL', 'TTCL', 'MTN', 'VODAFONE', 'MOOV', 'ORANGE', 'FREE', 'EXPRESSO'):
            raise ValueError("must be one of enum values ('SAFARICOM', 'AIRTEL', 'VODACOM', 'TIGO', 'HALOTEL', 'TTCL', 'MTN', 'VODAFONE', 'MOOV', 'ORANGE', 'FREE', 'EXPRESSO')")
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
    def from_json(cls, json_str: str) -> OpenapiPaymentAccountGetOrCreateRequestMobileMoney:
        """Create an instance of OpenapiPaymentAccountGetOrCreateRequestMobileMoney from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiPaymentAccountGetOrCreateRequestMobileMoney:
        """Create an instance of OpenapiPaymentAccountGetOrCreateRequestMobileMoney from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiPaymentAccountGetOrCreateRequestMobileMoney.parse_obj(obj)

        _obj = OpenapiPaymentAccountGetOrCreateRequestMobileMoney.parse_obj({
            "number": obj.get("number"),
            "operator": obj.get("operator")
        })
        return _obj


