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

from rafikigen.models.openapi_payout_get_response import OpenapiPayoutGetResponse  # noqa: E501

class TestOpenapiPayoutGetResponse(unittest.TestCase):
    """OpenapiPayoutGetResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiPayoutGetResponse:
        """Test OpenapiPayoutGetResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiPayoutGetResponse`
        """
        model = OpenapiPayoutGetResponse()  # noqa: E501
        if include_optional:
            return OpenapiPayoutGetResponse(
                amount = rafikigen.models.openapi_payout_create_response_amount.openapi_PayoutCreateResponse_amount(
                    currency = 'KES', 
                    value = '2000.99', ),
                bank_reference = 'ref-xxx',
                created_at = '2006-01-02T15:04:05Z07:00',
                id = 'pyt-xxx',
                payment_account_id = 'pac-xxx',
                sender = rafikigen.models.openapi_payout_create_response_sender.openapi_PayoutCreateResponse_sender(
                    address = rafikigen.models.openapi_payout_create_response_sender_address.openapi_PayoutCreateResponse_sender_address(
                        city = 'Roma', 
                        country = 'IT', 
                        line_1 = 'Piazza del Colosseo', 
                        line_2 = '1', 
                        line_3 = '', 
                        postal_code = '00184', ), 
                    individual = rafikigen.models.openapi_payout_create_response_sender_individual.openapi_PayoutCreateResponse_sender_individual(
                        dob = '1970-01-01', 
                        identity_document = rafikigen.models.openapi_payout_create_response_sender_individual_identity_document.openapi_PayoutCreateResponse_sender_individual_identity_document(
                            country = 'IT', 
                            expires_on = '2030-01-01', 
                            issued_on = '2020-01-01', 
                            number = 'YA0000000', 
                            type = 'PASSPORT', ), ), 
                    name = 'Mario Rossi', 
                    type = 'INDIVIDUAL', ),
                state = rafikigen.models.openapi_payout_create_response_state.openapi_PayoutCreateResponse_state(
                    code = 'PENDING', 
                    context = '', ),
                wallet_id = 'wlt-xxx'
            )
        else:
            return OpenapiPayoutGetResponse(
        )
        """

    def testOpenapiPayoutGetResponse(self):
        """Test OpenapiPayoutGetResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
