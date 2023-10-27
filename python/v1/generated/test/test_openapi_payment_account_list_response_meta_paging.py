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

from rafikigen.models.openapi_payment_account_list_response_meta_paging import OpenapiPaymentAccountListResponseMetaPaging  # noqa: E501

class TestOpenapiPaymentAccountListResponseMetaPaging(unittest.TestCase):
    """OpenapiPaymentAccountListResponseMetaPaging unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiPaymentAccountListResponseMetaPaging:
        """Test OpenapiPaymentAccountListResponseMetaPaging
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiPaymentAccountListResponseMetaPaging`
        """
        model = OpenapiPaymentAccountListResponseMetaPaging()  # noqa: E501
        if include_optional:
            return OpenapiPaymentAccountListResponseMetaPaging(
                cursors = rafikigen.models.openapi_payment_account_list_response_meta_paging_cursors.openapi_PaymentAccountListResponseMeta_paging_cursors(
                    after = 'cGFjLTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw==', ),
                next = 'https://rest.sandbox.rafiki-api.com/v1/payment-accounts?paging_after=cGFjLTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw%3D%3D&paging_limit=15'
            )
        else:
            return OpenapiPaymentAccountListResponseMetaPaging(
        )
        """

    def testOpenapiPaymentAccountListResponseMetaPaging(self):
        """Test OpenapiPaymentAccountListResponseMetaPaging"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
