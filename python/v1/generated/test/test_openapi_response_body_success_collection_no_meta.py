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

from rafikigen.models.openapi_response_body_success_collection_no_meta import OpenapiResponseBodySuccessCollectionNoMeta  # noqa: E501

class TestOpenapiResponseBodySuccessCollectionNoMeta(unittest.TestCase):
    """OpenapiResponseBodySuccessCollectionNoMeta unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OpenapiResponseBodySuccessCollectionNoMeta:
        """Test OpenapiResponseBodySuccessCollectionNoMeta
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OpenapiResponseBodySuccessCollectionNoMeta`
        """
        model = OpenapiResponseBodySuccessCollectionNoMeta()  # noqa: E501
        if include_optional:
            return OpenapiResponseBodySuccessCollectionNoMeta(
                data = [
                    null
                    ]
            )
        else:
            return OpenapiResponseBodySuccessCollectionNoMeta(
        )
        """

    def testOpenapiResponseBodySuccessCollectionNoMeta(self):
        """Test OpenapiResponseBodySuccessCollectionNoMeta"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()