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

from rafikigen.models.payment_accounts_get200_response import PaymentAccountsGet200Response  # noqa: E501

class TestPaymentAccountsGet200Response(unittest.TestCase):
    """PaymentAccountsGet200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PaymentAccountsGet200Response:
        """Test PaymentAccountsGet200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PaymentAccountsGet200Response`
        """
        model = PaymentAccountsGet200Response()  # noqa: E501
        if include_optional:
            return PaymentAccountsGet200Response(
                data = [
                    rafikigen.models.openapi/payment_account_get_or_create_response.openapi.PaymentAccountGetOrCreateResponse(
                        bank_account = rafikigen.models.openapi_payment_account_get_or_create_response_bank_account.openapi_PaymentAccountGetOrCreateResponse_bank_account(
                            bank_id = 'bnk-xxx', 
                            branch_id = 'brn-xxx', 
                            number = '', ), 
                        country = 'KE', 
                        created_at = '2006-01-02T15:04:05Z07:00', 
                        holder = rafikigen.models.openapi_payment_account_get_or_create_response_holder.openapi_PaymentAccountGetOrCreateResponse_holder(
                            name = '', 
                            type = 'INDIVIDUAL', ), 
                        id = 'pac-xxx', 
                        mobile_money = rafikigen.models.openapi_payment_account_get_or_create_response_mobile_money.openapi_PaymentAccountGetOrCreateResponse_mobile_money(
                            number = '+254000000000', 
                            operator = 'SAFARICOM', ), 
                        type = 'MOBILE_MONEY', )
                    ],
                meta = rafikigen.models.openapi/payment_account_list_response_meta.openapi.PaymentAccountListResponseMeta(
                    paging = rafikigen.models.openapi_payment_account_list_response_meta_paging.openapi_PaymentAccountListResponseMeta_paging(
                        cursors = rafikigen.models.openapi_payment_account_list_response_meta_paging_cursors.openapi_PaymentAccountListResponseMeta_paging_cursors(
                            after = 'cGFjLTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw==', ), 
                        next = 'https://rest.sandbox.rafiki-api.com/v1/payment-accounts?paging_after=cGFjLTJXTFhiOGJQNnNTN1FSdkE2QUZHcDdOaEdzNw%3D%3D&paging_limit=15', ), )
            )
        else:
            return PaymentAccountsGet200Response(
        )
        """

    def testPaymentAccountsGet200Response(self):
        """Test PaymentAccountsGet200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
