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
from pydantic import BaseModel
from rafikigen.models.openapi_response_body_success_cursor_paginated_meta_paging import OpenapiResponseBodySuccessCursorPaginatedMetaPaging

class OpenapiResponseBodySuccessCursorPaginatedMeta(BaseModel):
    """
    OpenapiResponseBodySuccessCursorPaginatedMeta
    """
    paging: Optional[OpenapiResponseBodySuccessCursorPaginatedMetaPaging] = None
    __properties = ["paging"]

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
    def from_json(cls, json_str: str) -> OpenapiResponseBodySuccessCursorPaginatedMeta:
        """Create an instance of OpenapiResponseBodySuccessCursorPaginatedMeta from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of paging
        if self.paging:
            _dict['paging'] = self.paging.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiResponseBodySuccessCursorPaginatedMeta:
        """Create an instance of OpenapiResponseBodySuccessCursorPaginatedMeta from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiResponseBodySuccessCursorPaginatedMeta.parse_obj(obj)

        _obj = OpenapiResponseBodySuccessCursorPaginatedMeta.parse_obj({
            "paging": OpenapiResponseBodySuccessCursorPaginatedMetaPaging.from_dict(obj.get("paging")) if obj.get("paging") is not None else None
        })
        return _obj


