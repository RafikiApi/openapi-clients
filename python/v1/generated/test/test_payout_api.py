# coding: utf-8

"""
    Resources

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from rafikigen.payout_api import PayoutApi  # noqa: E501


class TestPayoutApi(unittest.TestCase):
    """PayoutApi unit test stubs"""

    def setUp(self) -> None:
        self.api = PayoutApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_payouts_get(self) -> None:
        """Test case for payouts_get

        List  # noqa: E501
        """
        pass

    def test_payouts_id_get(self) -> None:
        """Test case for payouts_id_get

        Query status  # noqa: E501
        """
        pass

    def test_payouts_post(self) -> None:
        """Test case for payouts_post

        Send money  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()