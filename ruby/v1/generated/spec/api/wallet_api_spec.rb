=begin
#Resources

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::WalletApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'WalletApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::WalletApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of WalletApi' do
    it 'should create an instance of WalletApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::WalletApi)
    end
  end

  # unit tests for wallets_get
  # List
  # Wallets serve as repositories for your funds in a specific currency and are employed in tandem with payouts as the origin from which funds will be disbursed.  This particular endpoint will return a comprehensive list of your active wallets, showcasing their associated currencies and the most recent updates on available balances.
  # @param [Hash] opts the optional parameters
  # @return [WalletsGet200Response]
  describe 'wallets_get test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
