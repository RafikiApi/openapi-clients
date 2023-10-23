=begin
#Resources

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.1

=end

require 'cgi'

module OpenapiClient
  class PayoutApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # List
    # Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     
    # @param [Hash] opts the optional parameters
    # @option opts [String] :created_at_from Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information.
    # @option opts [String] :created_at_to Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information.
    # @option opts [Integer] :paging_limit The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
    # @option opts [String] :paging_after The base64 URL encoded cursor used to access the next set of paginated results
    # @return [PayoutsGet200Response]
    def payouts_get(opts = {})
      data, _status_code, _headers = payouts_get_with_http_info(opts)
      data
    end

    # List
    # Using this endpoint, you can list all your historical payouts with an optional dates filter. Considering that the returned data may contain thousands of records, the results will be paginated with a cursor [(see pagination docs)](pagination), allowing you to scroll through the data using multiple requests as necessary.     
    # @param [Hash] opts the optional parameters
    # @option opts [String] :created_at_from Filters for payouts created from the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 00:00:00 UTC or a valid RFC3339 string, including time and/or offset information.
    # @option opts [String] :created_at_to Filters for payouts created before the specified datetime. The expected format can be either a standard date (YYYY-MM-DD) that defaults to 23:59:59 UTC or a valid RFC3339 string, including time and/or offset information.
    # @option opts [Integer] :paging_limit The count of items returned as part of the pagination cursor iteration, minimum value is 1 and maximum 50
    # @option opts [String] :paging_after The base64 URL encoded cursor used to access the next set of paginated results
    # @return [Array<(PayoutsGet200Response, Integer, Hash)>] PayoutsGet200Response data, response status code and response headers
    def payouts_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PayoutApi.payouts_get ...'
      end
      # resource path
      local_var_path = '/payouts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'created_at_from'] = opts[:'created_at_from'] if !opts[:'created_at_from'].nil?
      query_params[:'created_at_to'] = opts[:'created_at_to'] if !opts[:'created_at_to'].nil?
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
      return_type = opts[:debug_return_type] || 'PayoutsGet200Response'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['Bearer']

      new_options = opts.merge(
        :operation => :"PayoutApi.payouts_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PayoutApi#payouts_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Query status
    # This endpoint enables the retrieval of a previously accepted payout using its unique ID (`pyt-xxx`). Its primary purpose is to periodically check for changes in the payout status. Currently, we do not provide webhooks, so this method serves as the only available option in such cases.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint.
    # @param id [String] The Payout ID (pyt-xxx)
    # @param [Hash] opts the optional parameters
    # @return [PayoutsIdGet200Response]
    def payouts_id_get(id, opts = {})
      data, _status_code, _headers = payouts_id_get_with_http_info(id, opts)
      data
    end

    # Query status
    # This endpoint enables the retrieval of a previously accepted payout using its unique ID (&#x60;pyt-xxx&#x60;). Its primary purpose is to periodically check for changes in the payout status. Currently, we do not provide webhooks, so this method serves as the only available option in such cases.  To learn more about the lifecycle of payouts, please refer to the dedicated section under the [Send Money](post_payouts) endpoint.
    # @param id [String] The Payout ID (pyt-xxx)
    # @param [Hash] opts the optional parameters
    # @return [Array<(PayoutsIdGet200Response, Integer, Hash)>] PayoutsIdGet200Response data, response status code and response headers
    def payouts_id_get_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PayoutApi.payouts_id_get ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling PayoutApi.payouts_id_get"
      end
      # resource path
      local_var_path = '/payouts/{id}'.sub('{' + 'id' + '}', CGI.escape(id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'PayoutsIdGet200Response'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['Bearer']

      new_options = opts.merge(
        :operation => :"PayoutApi.payouts_id_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PayoutApi#payouts_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Send money
    # The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  > ℹ️ Lifecycle > > If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. > <br> > Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. > <br> > <details> >  <summary>Payout States</summary> > <br> >  <table> >    <thead> >        <tr> >            <th>State</th> >            <th>Description</th> >        </tr> >    </thead> >    <tbody> >        <tr> >            <th>⏳<br>PENDING</th> >            <th>Your payout has been accepted, and it is currently awaiting processing.</th> >        </tr> >        <tr> >           <th>🎉<br>SENT</th> >           <th>The payout has been successfully processed, and the intended recipient should have received the funds.</th> >        </tr> >        <tr> >           <th>🔙<br>REVERSED</th> >           <th>Upon reaching the \"SENT\" state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.</th> >        </tr> >        <tr> >           <th>🙅<br>CANCELLED</th> >           <th>If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.</th> >        </tr> >        <tr> >           <th>💔<br>FAILED</th> >           <th> >               The funds did not reach the intended recipient due to a failure. If the \"context\" property does not provide specific information about the reason for the failure, please contact our customer support for assistance. >           </th> >        </tr> >    </tbody> >  </table> >  </details>  > ⚠️ Compliance requirements >  > Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. > <br> > We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process for you, the table below outlines the specific requirements for each country we offer payout support, streamlining the compliance process. > <br> > <details> <summary>Requirements</summary> <table>     <thead>         <tr>             <th>Field</th>             <th>KE 🇰🇪</th>         </tr>     </thead>     <tbody>         <tr>             <td>amount.value</td>             <td>                 <table>                     <thead>                          <tr>                             <th>Min</th>                             <th>Max</th>                         </tr>                     </thead>                     <tbody>                         <tr>                             <td>140 KES</td>                             <td>500,000 KES</td> <!-- Kenya -->                         </tr>                     </tbody>                 </table>             </td> <!-- Kenya -->         </tr>         <tr>             <td>sender.type</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.name</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line1</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line2</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.line3</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.city</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.postal_code</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.address.country</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.dob</td>             <td>Required with INDIVIDUAL sender's type</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.type</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.country</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.number</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.issued_on</td>             <td>-</td> <!-- Kenya -->         </tr>         <tr>             <td>sender.individual.identity_document.expires_on</td>             <td>-</td> <!-- Kenya -->         </tr>     </tbody> </table> </details>
    # @param x_idempotency_key [String] 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
    # @param openapi_payout_create_request [OpenapiPayoutCreateRequest] The payout
    # @param [Hash] opts the optional parameters
    # @return [PayoutsPost202Response]
    def payouts_post(x_idempotency_key, openapi_payout_create_request, opts = {})
      data, _status_code, _headers = payouts_post_with_http_info(x_idempotency_key, openapi_payout_create_request, opts)
      data
    end

    # Send money
    # The payout resource finds its application in various scenarios where funds need to be disbursed electronically; For example, but not limited to, money remittance services or businesses that need to disburse salaries to their employees.  Regardless of your specific use case, this endpoint has you covered, offering a versatile API to facilitate money disbursement from your [local wallets](get_wallets) to designated recipients (a.k.a [payment accounts](post_payment-accounts)).  &gt; ℹ️ Lifecycle &gt; &gt; If the request you submit meets our minimum validation standards for processing the payout, our server will accept the request. It will defer the execution to a background asynchronous process, and in response, send you an HTTP 202 status code, along with the payout unique identifier. &gt; &lt;br&gt; &gt; Upon acceptance, the payout is marked as pending. Your client program will need to poll at intervals to [query the payout state](get_payouts-id) and determine whether it has succeeded or not. &gt; &lt;br&gt; &gt; &lt;details&gt; &gt;  &lt;summary&gt;Payout States&lt;/summary&gt; &gt; &lt;br&gt; &gt;  &lt;table&gt; &gt;    &lt;thead&gt; &gt;        &lt;tr&gt; &gt;            &lt;th&gt;State&lt;/th&gt; &gt;            &lt;th&gt;Description&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;    &lt;/thead&gt; &gt;    &lt;tbody&gt; &gt;        &lt;tr&gt; &gt;            &lt;th&gt;⏳&lt;br&gt;PENDING&lt;/th&gt; &gt;            &lt;th&gt;Your payout has been accepted, and it is currently awaiting processing.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🎉&lt;br&gt;SENT&lt;/th&gt; &gt;           &lt;th&gt;The payout has been successfully processed, and the intended recipient should have received the funds.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🔙&lt;br&gt;REVERSED&lt;/th&gt; &gt;           &lt;th&gt;Upon reaching the \&quot;SENT\&quot; state, you can request a manual reversal (for instance, if funds were sent to the wrong recipient) by contacting our support team. Please be aware that there is no programmatic API available for this process yet. This state indicates a successful reversal.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;🙅&lt;br&gt;CANCELLED&lt;/th&gt; &gt;           &lt;th&gt;If the payout has not yet reached the intended recipient, you have the option to request manual cancellation by reaching out to our support team (please note that there is no programmatic API for this yet). This state signifies that the payout has been successfully canceled.&lt;/th&gt; &gt;        &lt;/tr&gt; &gt;        &lt;tr&gt; &gt;           &lt;th&gt;💔&lt;br&gt;FAILED&lt;/th&gt; &gt;           &lt;th&gt; &gt;               The funds did not reach the intended recipient due to a failure. If the \&quot;context\&quot; property does not provide specific information about the reason for the failure, please contact our customer support for assistance. &gt;           &lt;/th&gt; &gt;        &lt;/tr&gt; &gt;    &lt;/tbody&gt; &gt;  &lt;/table&gt; &gt;  &lt;/details&gt;  &gt; ⚠️ Compliance requirements &gt;  &gt; Depending on the country and/or bank you plan to disburse money to, there are specific compliance and regulatory requirements that must be adhered to. For example, some countries might necessitate more comprehensive sender details or impose limits on minimum/maximum payout amounts. &gt; &lt;br&gt; &gt; We understand that navigating these varying rules for different countries can be complex, considering the multitude of combinations possible. To simplify this process for you, the table below outlines the specific requirements for each country we offer payout support, streamlining the compliance process. &gt; &lt;br&gt; &gt; &lt;details&gt; &lt;summary&gt;Requirements&lt;/summary&gt; &lt;table&gt;     &lt;thead&gt;         &lt;tr&gt;             &lt;th&gt;Field&lt;/th&gt;             &lt;th&gt;KE 🇰🇪&lt;/th&gt;         &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;         &lt;tr&gt;             &lt;td&gt;amount.value&lt;/td&gt;             &lt;td&gt;                 &lt;table&gt;                     &lt;thead&gt;                          &lt;tr&gt;                             &lt;th&gt;Min&lt;/th&gt;                             &lt;th&gt;Max&lt;/th&gt;                         &lt;/tr&gt;                     &lt;/thead&gt;                     &lt;tbody&gt;                         &lt;tr&gt;                             &lt;td&gt;140 KES&lt;/td&gt;                             &lt;td&gt;500,000 KES&lt;/td&gt; &lt;!-- Kenya --&gt;                         &lt;/tr&gt;                     &lt;/tbody&gt;                 &lt;/table&gt;             &lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.type&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.name&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.line1&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.line2&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.line3&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.city&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.postal_code&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.address.country&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt;             &lt;td&gt;Required&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.dob&lt;/td&gt;             &lt;td&gt;Required with INDIVIDUAL sender&#39;s type&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.type&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.country&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.number&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.issued_on&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;         &lt;tr&gt;             &lt;td&gt;sender.individual.identity_document.expires_on&lt;/td&gt;             &lt;td&gt;-&lt;/td&gt; &lt;!-- Kenya --&gt;         &lt;/tr&gt;     &lt;/tbody&gt; &lt;/table&gt; &lt;/details&gt;
    # @param x_idempotency_key [String] 🚨️ Prevent duplicate payouts! See: [x-idempotency-key security scheme](idempotency)
    # @param openapi_payout_create_request [OpenapiPayoutCreateRequest] The payout
    # @param [Hash] opts the optional parameters
    # @return [Array<(PayoutsPost202Response, Integer, Hash)>] PayoutsPost202Response data, response status code and response headers
    def payouts_post_with_http_info(x_idempotency_key, openapi_payout_create_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PayoutApi.payouts_post ...'
      end
      # verify the required parameter 'x_idempotency_key' is set
      if @api_client.config.client_side_validation && x_idempotency_key.nil?
        fail ArgumentError, "Missing the required parameter 'x_idempotency_key' when calling PayoutApi.payouts_post"
      end
      # verify the required parameter 'openapi_payout_create_request' is set
      if @api_client.config.client_side_validation && openapi_payout_create_request.nil?
        fail ArgumentError, "Missing the required parameter 'openapi_payout_create_request' when calling PayoutApi.payouts_post"
      end
      # resource path
      local_var_path = '/payouts'

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
      header_params[:'X-Idempotency-Key'] = x_idempotency_key

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(openapi_payout_create_request)

      # return_type
      return_type = opts[:debug_return_type] || 'PayoutsPost202Response'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['Bearer']

      new_options = opts.merge(
        :operation => :"PayoutApi.payouts_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PayoutApi#payouts_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end