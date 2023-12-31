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

from rafikigen.models.openapi_payment_account_get_or_create_request_bank_account import OpenapiPaymentAccountGetOrCreateRequestBankAccount  # noqa: E501

class TestOpenapiPaymentAccountGetOrCreateRequestBankAccount(unittest.TestCase):
    """OpenapiPaymentAccountGetOrCreateRequestBankAccount unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiPaymentAccountGetOrCreateRequestBankAccount:
        """Test OpenapiPaymentAccountGetOrCreateRequestBankAccount
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiPaymentAccountGetOrCreateRequestBankAccount`
        """
        model = OpenapiPaymentAccountGetOrCreateRequestBankAccount()  # noqa: E501
        if include_optional:
            return OpenapiPaymentAccountGetOrCreateRequestBankAccount(
                bank_id = 'bnk-xxx',
                branch_id = 'brn-xxx',
                number = '12345678'
            )
        else:
            return OpenapiPaymentAccountGetOrCreateRequestBankAccount(
        )
        """

    def testOpenapiPaymentAccountGetOrCreateRequestBankAccount(self):
        """Test OpenapiPaymentAccountGetOrCreateRequestBankAccount"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
