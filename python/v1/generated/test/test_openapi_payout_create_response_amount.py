# coding: utf-8

"""
    Resources

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from rafikigen.models.openapi_payout_create_response_amount import OpenapiPayoutCreateResponseAmount  # noqa: E501

class TestOpenapiPayoutCreateResponseAmount(unittest.TestCase):
    """OpenapiPayoutCreateResponseAmount unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiPayoutCreateResponseAmount:
        """Test OpenapiPayoutCreateResponseAmount
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiPayoutCreateResponseAmount`
        """
        model = OpenapiPayoutCreateResponseAmount()  # noqa: E501
        if include_optional:
            return OpenapiPayoutCreateResponseAmount(
                currency = 'KES',
                value = '2000.99'
            )
        else:
            return OpenapiPayoutCreateResponseAmount(
        )
        """

    def testOpenapiPayoutCreateResponseAmount(self):
        """Test OpenapiPayoutCreateResponseAmount"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
