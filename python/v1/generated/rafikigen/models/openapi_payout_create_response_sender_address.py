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

class OpenapiPayoutCreateResponseSenderAddress(BaseModel):
    """
    OpenapiPayoutCreateResponseSenderAddress
    """
    city: Optional[StrictStr] = None
    country: Optional[StrictStr] = Field(None, description="The ISO 3166 alpha-2 country code associated with the address.")
    line_1: Optional[StrictStr] = None
    line_2: Optional[StrictStr] = None
    line_3: Optional[StrictStr] = None
    postal_code: Optional[StrictStr] = None
    __properties = ["city", "country", "line_1", "line_2", "line_3", "postal_code"]

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
    def from_json(cls, json_str: str) -> OpenapiPayoutCreateResponseSenderAddress:
        """Create an instance of OpenapiPayoutCreateResponseSenderAddress from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiPayoutCreateResponseSenderAddress:
        """Create an instance of OpenapiPayoutCreateResponseSenderAddress from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiPayoutCreateResponseSenderAddress.parse_obj(obj)

        _obj = OpenapiPayoutCreateResponseSenderAddress.parse_obj({
            "city": obj.get("city"),
            "country": obj.get("country"),
            "line_1": obj.get("line_1"),
            "line_2": obj.get("line_2"),
            "line_3": obj.get("line_3"),
            "postal_code": obj.get("postal_code")
        })
        return _obj


