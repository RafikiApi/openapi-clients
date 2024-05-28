/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package rafikigen

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import rafikigen.models.LookupsAccountNumberGet200Response
import rafikigen.models.OpenapiResponseBodyInternalServerError
import rafikigen.models.OpenapiResponseBodyLookupAccountNotFound
import rafikigen.models.OpenapiResponseBodyValidationFailed

import com.squareup.moshi.Json

import rafikigen.infrastructure.ApiClient
import rafikigen.infrastructure.ApiResponse
import rafikigen.infrastructure.ClientException
import rafikigen.infrastructure.ClientError
import rafikigen.infrastructure.ServerException
import rafikigen.infrastructure.ServerError
import rafikigen.infrastructure.MultiValueMap
import rafikigen.infrastructure.PartConfig
import rafikigen.infrastructure.RequestConfig
import rafikigen.infrastructure.RequestMethod
import rafikigen.infrastructure.ResponseType
import rafikigen.infrastructure.Success
import rafikigen.infrastructure.toMultiValue

class LookupApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://rest.sandbox.rafiki-api.com/v1")
        }
    }

    /**
     * enum for parameter paymentAccountType
     */
     enum class PaymentAccountTypeLookupsAccountNumberGet(val value: kotlin.String) {
         @Json(name = "MOBILE_MONEY") mOBILEMONEY("MOBILE_MONEY"),
         @Json(name = "BANK_ACCOUNT") bANKACCOUNT("BANK_ACCOUNT")
     }

    /**
     * Get
     * The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 
     * @param accountNumber The account number, that is either the mobile money number or bank account number
     * @param paymentAccountType The payment account type to lookup for
     * @param bankId If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to (optional)
     * @return LookupsAccountNumberGet200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun lookupsAccountNumberGet(accountNumber: kotlin.String, paymentAccountType: PaymentAccountTypeLookupsAccountNumberGet, bankId: kotlin.String? = null) : LookupsAccountNumberGet200Response {
        val localVarResponse = lookupsAccountNumberGetWithHttpInfo(accountNumber = accountNumber, paymentAccountType = paymentAccountType, bankId = bankId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as LookupsAccountNumberGet200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get
     * The lookup resource facilitates the retrieval of metadata associated with mobile money or bank accounts. For instance, prior to creating payment accounts, you can utilize this endpoint to validate whether an account number corresponds to a specific business or individual.  This functionality proves especially valuable in ensuring that only validated payment accounts are utilized; for example, when integrated with other processes, such as payouts, it helps mitigate the risk of costly reversals or refunds resulting from funds being sent to an incorrect recipient.  ### Account not found  While we strive to ensure that our lookup sources are always up to date with the most recent data, we must consider instances when we cannot retrieve metadata for a requested payment account.  In such cases, our API will respond with the error code [LOOKUP_ACCOUNT_NOT_FOUND](error-codes#lookup_account_not_found-http-404), providing a way to programmatically determine whether the account lookup was unsuccessful.  ### Supported countries/account types  |  Country  | Mobile Money | Bank Account | |:---------:|:------------:|:------------:| |🇳🇬 Nigeria |      ❌      |      ✅      | 
     * @param accountNumber The account number, that is either the mobile money number or bank account number
     * @param paymentAccountType The payment account type to lookup for
     * @param bankId If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to (optional)
     * @return ApiResponse<LookupsAccountNumberGet200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun lookupsAccountNumberGetWithHttpInfo(accountNumber: kotlin.String, paymentAccountType: PaymentAccountTypeLookupsAccountNumberGet, bankId: kotlin.String?) : ApiResponse<LookupsAccountNumberGet200Response?> {
        val localVariableConfig = lookupsAccountNumberGetRequestConfig(accountNumber = accountNumber, paymentAccountType = paymentAccountType, bankId = bankId)

        return request<Unit, LookupsAccountNumberGet200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation lookupsAccountNumberGet
     *
     * @param accountNumber The account number, that is either the mobile money number or bank account number
     * @param paymentAccountType The payment account type to lookup for
     * @param bankId If payment_account_type is BANK_ACCOUNT, this will be a mandatory field representing the bank id (bnk-xxx) used to identify which bank the account number belongs to (optional)
     * @return RequestConfig
     */
    fun lookupsAccountNumberGetRequestConfig(accountNumber: kotlin.String, paymentAccountType: PaymentAccountTypeLookupsAccountNumberGet, bankId: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("payment_account_type", listOf(paymentAccountType.value))
                if (bankId != null) {
                    put("bank_id", listOf(bankId.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/lookups/{accountNumber}".replace("{"+"accountNumber"+"}", encodeURIComponent(accountNumber.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}