/**
 * Resources
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.Resources);
  }
}(this, function(expect, Resources) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OpenapiPaymentAccountGetOrCreateRequest', function() {
    it('should create an instance of OpenapiPaymentAccountGetOrCreateRequest', function() {
      // uncomment below and update the code to test OpenapiPaymentAccountGetOrCreateRequest
      //var instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
      //expect(instance).to.be.a(Resources.OpenapiPaymentAccountGetOrCreateRequest);
    });

    it('should have the property bankAccount (base name: "bank_account")', function() {
      // uncomment below and update the code to test the property bankAccount
      //var instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
      //expect(instance).to.be();
    });

    it('should have the property country (base name: "country")', function() {
      // uncomment below and update the code to test the property country
      //var instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
      //expect(instance).to.be();
    });

    it('should have the property holder (base name: "holder")', function() {
      // uncomment below and update the code to test the property holder
      //var instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
      //expect(instance).to.be();
    });

    it('should have the property mobileMoney (base name: "mobile_money")', function() {
      // uncomment below and update the code to test the property mobileMoney
      //var instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new Resources.OpenapiPaymentAccountGetOrCreateRequest();
      //expect(instance).to.be();
    });

  });

}));
