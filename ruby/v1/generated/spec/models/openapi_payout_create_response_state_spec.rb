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

# Unit tests for OpenapiClient::OpenapiPayoutCreateResponseState
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::OpenapiPayoutCreateResponseState do
  let(:instance) { OpenapiClient::OpenapiPayoutCreateResponseState.new }

  describe 'test an instance of OpenapiPayoutCreateResponseState' do
    it 'should create an instance of OpenapiPayoutCreateResponseState' do
      expect(instance).to be_instance_of(OpenapiClient::OpenapiPayoutCreateResponseState)
    end
  end
  describe 'test attribute "code"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["PENDING", "REVERSED", "SENT", "CANCELLED", "FAILED"])
      # validator.allowable_values.each do |value|
      #   expect { instance.code = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "context"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
