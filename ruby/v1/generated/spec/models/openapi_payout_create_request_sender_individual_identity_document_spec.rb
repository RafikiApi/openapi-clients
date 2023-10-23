=begin
#Resources

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenapiClient::OpenapiPayoutCreateRequestSenderIndividualIdentityDocument
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::OpenapiPayoutCreateRequestSenderIndividualIdentityDocument do
  let(:instance) { OpenapiClient::OpenapiPayoutCreateRequestSenderIndividualIdentityDocument.new }

  describe 'test an instance of OpenapiPayoutCreateRequestSenderIndividualIdentityDocument' do
    it 'should create an instance of OpenapiPayoutCreateRequestSenderIndividualIdentityDocument' do
      expect(instance).to be_instance_of(OpenapiClient::OpenapiPayoutCreateRequestSenderIndividualIdentityDocument)
    end
  end
  describe 'test attribute "country"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "expires_on"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "issued_on"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "number"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "type"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["PASSPORT", "DRIVING_LICENCE", "NATIONAL_ID_CARD"])
      # validator.allowable_values.each do |value|
      #   expect { instance.type = value }.not_to raise_error
      # end
    end
  end

end
