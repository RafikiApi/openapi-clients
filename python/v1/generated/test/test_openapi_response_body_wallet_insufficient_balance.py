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

from rafikigen.models.openapi_response_body_wallet_insufficient_balance import OpenapiResponseBodyWalletInsufficientBalance  # noqa: E501

class TestOpenapiResponseBodyWalletInsufficientBalance(unittest.TestCase):
    """OpenapiResponseBodyWalletInsufficientBalance unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiResponseBodyWalletInsufficientBalance:
        """Test OpenapiResponseBodyWalletInsufficientBalance
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiResponseBodyWalletInsufficientBalance`
        """
        model = OpenapiResponseBodyWalletInsufficientBalance()  # noqa: E501
        if include_optional:
            return OpenapiResponseBodyWalletInsufficientBalance(
                code = 'WALLET_INSUFFICIENT_BALANCE',
                message = 'wallet '{wlt-xxx}' doesn't have enough balance'
            )
        else:
            return OpenapiResponseBodyWalletInsufficientBalance(
        )
        """

    def testOpenapiResponseBodyWalletInsufficientBalance(self):
        """Test OpenapiResponseBodyWalletInsufficientBalance"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
