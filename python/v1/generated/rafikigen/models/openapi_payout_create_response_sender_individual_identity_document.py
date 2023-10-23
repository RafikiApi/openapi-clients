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

class OpenapiPayoutCreateResponseSenderIndividualIdentityDocument(BaseModel):
    """
    OpenapiPayoutCreateResponseSenderIndividualIdentityDocument
    """
    country: Optional[StrictStr] = Field(None, description="The ISO 3166 alpha-2 country code indicating the issuing country of the document.")
    expires_on: Optional[StrictStr] = Field(None, description="Date formatted as yyyy-mm-dd")
    issued_on: Optional[StrictStr] = Field(None, description="Date formatted as yyyy-mm-dd")
    number: Optional[StrictStr] = None
    type: Optional[StrictStr] = None
    __properties = ["country", "expires_on", "issued_on", "number", "type"]

    @validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('PASSPORT', 'DRIVING_LICENCE', 'NATIONAL_ID_CARD'):
            raise ValueError("must be one of enum values ('PASSPORT', 'DRIVING_LICENCE', 'NATIONAL_ID_CARD')")
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
    def from_json(cls, json_str: str) -> OpenapiPayoutCreateResponseSenderIndividualIdentityDocument:
        """Create an instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OpenapiPayoutCreateResponseSenderIndividualIdentityDocument:
        """Create an instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.parse_obj(obj)

        _obj = OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.parse_obj({
            "country": obj.get("country"),
            "expires_on": obj.get("expires_on"),
            "issued_on": obj.get("issued_on"),
            "number": obj.get("number"),
            "type": obj.get("type")
        })
        return _obj

