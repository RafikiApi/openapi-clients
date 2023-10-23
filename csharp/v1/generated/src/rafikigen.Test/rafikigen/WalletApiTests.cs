/*
 * Resources
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using rafikigen.Client;
using rafikigen.rafikigen;
// uncomment below to import models
//using rafikigen.Model;

namespace rafikigen.Test.Api
{
    /// <summary>
    ///  Class for testing WalletApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class WalletApiTests : IDisposable
    {
        private WalletApi instance;

        public WalletApiTests()
        {
            instance = new WalletApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of WalletApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' WalletApi
            //Assert.IsType<WalletApi>(instance);
        }

        /// <summary>
        /// Test WalletsGet
        /// </summary>
        [Fact]
        public void WalletsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.WalletsGet();
            //Assert.IsType<WalletsGet200Response>(response);
        }
    }
}
