=begin
#Resources

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.1

=end

require 'cgi'

module OpenapiClient
  class PaymentAccountApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # List
    # Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary. 
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :paging_limit The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
    # @option opts [String] :paging_after The base64 URL encoded cursor used to access the next set of paginated results
    # @return [PaymentAccountsGet200Response]
    def payment_accounts_get(opts = {})
      data, _status_code, _headers = payment_accounts_get_with_http_info(opts)
      data
    end

    # List
    # Using this endpoint, you can list all your payment accounts ordered by their creation date in descending order. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary. 
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :paging_limit The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
    # @option opts [String] :paging_after The base64 URL encoded cursor used to access the next set of paginated results
    # @return [Array<(PaymentAccountsGet200Response, Integer, Hash)>] PaymentAccountsGet200Response data, response status code and response headers
    def payment_accounts_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PaymentAccountApi.payment_accounts_get ...'
      end
      # resource path
      local_var_path = '/payment-accounts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'paging_limit'] = opts[:'paging_limit'] if !opts[:'paging_limit'].nil?
      query_params[:'paging_after'] = opts[:'paging_after'] if !opts[:'paging_after'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'PaymentAccountsGet200Response'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['Bearer']

      new_options = opts.merge(
        :operation => :"PaymentAccountApi.payment_accounts_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PaymentAccountApi#payment_accounts_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get or create
    # A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  > 💁 > > Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a `200 OK` status. Otherwise, we proceed to create a new one and respond with a `201 Created` status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \"mobile money\" type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.  | Country | Operators                            | |---------|--------------------------------------| | KE      | SAFARICOM, AIRTEL                    | | TZ      | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | RW      | AIRTEL, MTN                          |  ### Bank account  The \"bank account\" type is designated for conventional accounts registered with bank institutions, such as \"Equity Bank.\" It comprises an account number and the associated bank ID, where accounts are registered. Additionally, for banks with multiple branches in a country, a branch ID may be required to accurately identify and route payments.  We provide support for numerous banks and branches in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks along with their branches. 
    # @param openapi_payment_account_get_or_create_request [OpenapiPaymentAccountGetOrCreateRequest] The payment account
    # @param [Hash] opts the optional parameters
    # @return [PaymentAccountsPost200Response]
    def payment_accounts_post(openapi_payment_account_get_or_create_request, opts = {})
      data, _status_code, _headers = payment_accounts_post_with_http_info(openapi_payment_account_get_or_create_request, opts)
      data
    end

    # Get or create
    # A payment account is a uniquely identifiable entity that serves the purpose of a recipient to send money to (e.g. a remittance recipient).  This endpoint allows you to create payment accounts of both **Mobile Money** and **Bank Account** types, which can subsequently serve as recipient accounts for making [payouts](post_payouts).  &gt; 💁 &gt; &gt; Although HTTP POST is not inherently idempotent, with this endpoint, you can confidently retry the same request without inadvertently creating duplicate records. Our process involves checking the existence of the payment account first. If it exists, we promptly respond with a &#x60;200 OK&#x60; status. Otherwise, we proceed to create a new one and respond with a &#x60;201 Created&#x60; status. In both scenarios, the structure of the response body will remain identical.  ### Mobile Money  The \&quot;mobile money\&quot; type refers to accounts registered with telecom companies (a.k.a operators) like SAFARICOM in Kenya, and it necessitates a valid mobile number for identification of the payment account within that telecom provider.  The following table outlines the operators supported by our API for each specific country.  | Country | Operators                            | |---------|--------------------------------------| | KE      | SAFARICOM, AIRTEL                    | | TZ      | VODACOM, AIRTEL, TIGO, HALOTEL, TTCL | | RW      | AIRTEL, MTN                          |  ### Bank account  The \&quot;bank account\&quot; type is designated for conventional accounts registered with bank institutions, such as \&quot;Equity Bank.\&quot; It comprises an account number and the associated bank ID, where accounts are registered. Additionally, for banks with multiple branches in a country, a branch ID may be required to accurately identify and route payments.  We provide support for numerous banks and branches in each country. Documenting each of them here would be impractical. Therefore, we recommend utilizing the dedicated [/v1/banks](get_banks) endpoint to access the most current and accurate list of banks along with their branches. 
    # @param openapi_payment_account_get_or_create_request [OpenapiPaymentAccountGetOrCreateRequest] The payment account
    # @param [Hash] opts the optional parameters
    # @return [Array<(PaymentAccountsPost200Response, Integer, Hash)>] PaymentAccountsPost200Response data, response status code and response headers
    def payment_accounts_post_with_http_info(openapi_payment_account_get_or_create_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PaymentAccountApi.payment_accounts_post ...'
      end
      # verify the required parameter 'openapi_payment_account_get_or_create_request' is set
      if @api_client.config.client_side_validation && openapi_payment_account_get_or_create_request.nil?
        fail ArgumentError, "Missing the required parameter 'openapi_payment_account_get_or_create_request' when calling PaymentAccountApi.payment_accounts_post"
      end
      # resource path
      local_var_path = '/payment-accounts'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(openapi_payment_account_get_or_create_request)

      # return_type
      return_type = opts[:debug_return_type] || 'PaymentAccountsPost200Response'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['Bearer']

      new_options = opts.merge(
        :operation => :"PaymentAccountApi.payment_accounts_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PaymentAccountApi#payment_accounts_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
