/*
 * Resources
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateRequest;
import org.openapitools.client.model.OpenapiPayoutCreateRequestAmount;
import org.openapitools.client.model.OpenapiPayoutCreateRequestSender;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import invalidPackageName.JSON;

/**
 * OpenapiPayoutCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-27T15:32:35.482757Z[Etc/UTC]")
public class OpenapiPayoutCreateRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OpenapiPayoutCreateRequestAmount amount;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "custom_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  private String customId;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT = "payment_account";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT)
  private OpenapiPaymentAccountGetOrCreateRequest paymentAccount;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_ID = "payment_account_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_ID)
  private String paymentAccountId;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private OpenapiPayoutCreateRequestSender sender;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public OpenapiPayoutCreateRequest() {
  }

  public OpenapiPayoutCreateRequest amount(OpenapiPayoutCreateRequestAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateRequestAmount getAmount() {
    return amount;
  }


  public void setAmount(OpenapiPayoutCreateRequestAmount amount) {
    this.amount = amount;
  }


  public OpenapiPayoutCreateRequest customId(String customId) {
    
    this.customId = customId;
    return this;
  }

   /**
   * An optional unique custom id that can be used to reconcile payouts with your own internal systems, this is particularly useful in the event of network failures.  The accepted format can include up to 64 characters, which may consist of both letters, digits, and the symbols \&quot;-\&quot; and \&quot;_\&quot;.
   * @return customId
  **/
  @javax.annotation.Nullable
  public String getCustomId() {
    return customId;
  }


  public void setCustomId(String customId) {
    this.customId = customId;
  }


  public OpenapiPayoutCreateRequest paymentAccount(OpenapiPaymentAccountGetOrCreateRequest paymentAccount) {
    
    this.paymentAccount = paymentAccount;
    return this;
  }

   /**
   * Get paymentAccount
   * @return paymentAccount
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateRequest getPaymentAccount() {
    return paymentAccount;
  }


  public void setPaymentAccount(OpenapiPaymentAccountGetOrCreateRequest paymentAccount) {
    this.paymentAccount = paymentAccount;
  }


  public OpenapiPayoutCreateRequest paymentAccountId(String paymentAccountId) {
    
    this.paymentAccountId = paymentAccountId;
    return this;
  }

   /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if payment_account is empty&lt;/span&gt;  The payment account ID represents a pre-existing payment account that acts as the recipient for the payout.
   * @return paymentAccountId
  **/
  @javax.annotation.Nullable
  public String getPaymentAccountId() {
    return paymentAccountId;
  }


  public void setPaymentAccountId(String paymentAccountId) {
    this.paymentAccountId = paymentAccountId;
  }


  public OpenapiPayoutCreateRequest sender(OpenapiPayoutCreateRequestSender sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateRequestSender getSender() {
    return sender;
  }


  public void setSender(OpenapiPayoutCreateRequestSender sender) {
    this.sender = sender;
  }


  public OpenapiPayoutCreateRequest walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet ID from which to disburse money, if not provided, we will attempt to use the one that matches the provided currency amount.
   * @return walletId
  **/
  @javax.annotation.Nullable
  public String getWalletId() {
    return walletId;
  }


  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiPayoutCreateRequest openapiPayoutCreateRequest = (OpenapiPayoutCreateRequest) o;
    return Objects.equals(this.amount, openapiPayoutCreateRequest.amount) &&
        Objects.equals(this.customId, openapiPayoutCreateRequest.customId) &&
        Objects.equals(this.paymentAccount, openapiPayoutCreateRequest.paymentAccount) &&
        Objects.equals(this.paymentAccountId, openapiPayoutCreateRequest.paymentAccountId) &&
        Objects.equals(this.sender, openapiPayoutCreateRequest.sender) &&
        Objects.equals(this.walletId, openapiPayoutCreateRequest.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customId, paymentAccount, paymentAccountId, sender, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPayoutCreateRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    paymentAccount: ").append(toIndentedString(paymentAccount)).append("\n");
    sb.append("    paymentAccountId: ").append(toIndentedString(paymentAccountId)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("amount");
    openapiFields.add("custom_id");
    openapiFields.add("payment_account");
    openapiFields.add("payment_account_id");
    openapiFields.add("sender");
    openapiFields.add("wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPayoutCreateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPayoutCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPayoutCreateRequest is not found in the empty JSON string", OpenapiPayoutCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPayoutCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPayoutCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        OpenapiPayoutCreateRequestAmount.validateJsonElement(jsonObj.get("amount"));
      }
      if ((jsonObj.get("custom_id") != null && !jsonObj.get("custom_id").isJsonNull()) && !jsonObj.get("custom_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_id").toString()));
      }
      // validate the optional field `payment_account`
      if (jsonObj.get("payment_account") != null && !jsonObj.get("payment_account").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateRequest.validateJsonElement(jsonObj.get("payment_account"));
      }
      if ((jsonObj.get("payment_account_id") != null && !jsonObj.get("payment_account_id").isJsonNull()) && !jsonObj.get("payment_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_account_id").toString()));
      }
      // validate the optional field `sender`
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) {
        OpenapiPayoutCreateRequestSender.validateJsonElement(jsonObj.get("sender"));
      }
      if ((jsonObj.get("wallet_id") != null && !jsonObj.get("wallet_id").isJsonNull()) && !jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPayoutCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPayoutCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPayoutCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPayoutCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPayoutCreateRequest>() {
           @Override
           public void write(JsonWriter out, OpenapiPayoutCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPayoutCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPayoutCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPayoutCreateRequest
  * @throws IOException if the JSON string is invalid with respect to OpenapiPayoutCreateRequest
  */
  public static OpenapiPayoutCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPayoutCreateRequest.class);
  }

 /**
  * Convert an instance of OpenapiPayoutCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

