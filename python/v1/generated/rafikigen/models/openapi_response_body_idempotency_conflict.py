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

class OpenapiResponseBodyIdempotencyConflict(BaseModel):
    """
    OpenapiResponseBodyIdempotencyConflict
    """
    code: Optional[StrictStr] = Field(None, description="Can be either `IDEMPOTENCY_RACE` or `IDEMPOTENCY_KEY_ALREADY_USED`")
    message: Optional[StrictStr] = Field(None, description="E.g. \"Idempotency key already in use\"")
    __properties = ["code", "message"]

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
    def from_json(cls, json_str: str) -> OpenapiResponseBodyIdempotencyConflict:
        """Create an instance of OpenapiResponseBodyIdempotencyConflict from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiResponseBodyIdempotencyConflict:
        """Create an instance of OpenapiResponseBodyIdempotencyConflict from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiResponseBodyIdempotencyConflict.parse_obj(obj)

        _obj = OpenapiResponseBodyIdempotencyConflict.parse_obj({
            "code": obj.get("code"),
            "message": obj.get("message")
        })
        return _obj

