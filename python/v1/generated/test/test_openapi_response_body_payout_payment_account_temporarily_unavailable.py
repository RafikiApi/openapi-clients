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

from rafikigen.models.openapi_response_body_payout_payment_account_temporarily_unavailable import OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable  # noqa: E501

class TestOpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable(unittest.TestCase):
    """OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable:
        """Test OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable`
        """
        model = OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable()  # noqa: E501
        if include_optional:
            return OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable(
                code = 'PAYOUT_BANK_TEMPORARILY_UNAVAILABLE',
                message = 'Payout to this bank is not available.'
            )
        else:
            return OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable(
        )
        """

    def testOpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable(self):
        """Test OpenapiResponseBodyPayoutPaymentAccountTemporarilyUnavailable"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
