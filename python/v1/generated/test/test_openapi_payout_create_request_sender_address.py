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

from rafikigen.models.openapi_payout_create_request_sender_address import OpenapiPayoutCreateRequestSenderAddress  # noqa: E501

class TestOpenapiPayoutCreateRequestSenderAddress(unittest.TestCase):
    """OpenapiPayoutCreateRequestSenderAddress unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiPayoutCreateRequestSenderAddress:
        """Test OpenapiPayoutCreateRequestSenderAddress
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiPayoutCreateRequestSenderAddress`
        """
        model = OpenapiPayoutCreateRequestSenderAddress()  # noqa: E501
        if include_optional:
            return OpenapiPayoutCreateRequestSenderAddress(
                city = 'Roma',
                country = 'IT',
                line_1 = 'Piazza del Colosseo',
                line_2 = '1',
                line_3 = '',
                postal_code = '00184'
            )
        else:
            return OpenapiPayoutCreateRequestSenderAddress(
        )
        """

    def testOpenapiPayoutCreateRequestSenderAddress(self):
        """Test OpenapiPayoutCreateRequestSenderAddress"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
