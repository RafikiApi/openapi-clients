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
import org.openapitools.client.model.OpenapiPayoutCreateResponseAmount;
import org.openapitools.client.model.OpenapiPayoutCreateResponseSender;
import org.openapitools.client.model.OpenapiPayoutCreateResponseState;

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
 * OpenapiPayoutGetResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T13:57:01.660841Z[Etc/UTC]")
public class OpenapiPayoutGetResponse {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OpenapiPayoutCreateResponseAmount amount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_ID = "payment_account_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_ID)
  private String paymentAccountId;

  public static final String SERIALIZED_NAME_RECEIPT = "receipt";
  @SerializedName(SERIALIZED_NAME_RECEIPT)
  private String receipt;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private OpenapiPayoutCreateResponseSender sender;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private OpenapiPayoutCreateResponseState state;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public OpenapiPayoutGetResponse() {
  }

  public OpenapiPayoutGetResponse amount(OpenapiPayoutCreateResponseAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateResponseAmount getAmount() {
    return amount;
  }


  public void setAmount(OpenapiPayoutCreateResponseAmount amount) {
    this.amount = amount;
  }


  public OpenapiPayoutGetResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public OpenapiPayoutGetResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The payout unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OpenapiPayoutGetResponse paymentAccountId(String paymentAccountId) {
    
    this.paymentAccountId = paymentAccountId;
    return this;
  }

   /**
   * The recipient payment account receiving funds
   * @return paymentAccountId
  **/
  @javax.annotation.Nullable
  public String getPaymentAccountId() {
    return paymentAccountId;
  }


  public void setPaymentAccountId(String paymentAccountId) {
    this.paymentAccountId = paymentAccountId;
  }


  public OpenapiPayoutGetResponse receipt(String receipt) {
    
    this.receipt = receipt;
    return this;
  }

   /**
   * The reference provided by the recipient account&#39;s actual bank or telco on a successful payout.  &gt; ⚠️ &gt; It&#39;s important to be aware that this information might not be accessible for every payout. If there&#39;s no way for us to obtain it, this property will be omitted entirely. Hence, we highly recommend implementing conditional checks to confirm the presence of this property.
   * @return receipt
  **/
  @javax.annotation.Nullable
  public String getReceipt() {
    return receipt;
  }


  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }


  public OpenapiPayoutGetResponse sender(OpenapiPayoutCreateResponseSender sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateResponseSender getSender() {
    return sender;
  }


  public void setSender(OpenapiPayoutCreateResponseSender sender) {
    this.sender = sender;
  }


  public OpenapiPayoutGetResponse state(OpenapiPayoutCreateResponseState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateResponseState getState() {
    return state;
  }


  public void setState(OpenapiPayoutCreateResponseState state) {
    this.state = state;
  }


  public OpenapiPayoutGetResponse walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet ID from which the money will disburse
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
    OpenapiPayoutGetResponse openapiPayoutGetResponse = (OpenapiPayoutGetResponse) o;
    return Objects.equals(this.amount, openapiPayoutGetResponse.amount) &&
        Objects.equals(this.createdAt, openapiPayoutGetResponse.createdAt) &&
        Objects.equals(this.id, openapiPayoutGetResponse.id) &&
        Objects.equals(this.paymentAccountId, openapiPayoutGetResponse.paymentAccountId) &&
        Objects.equals(this.receipt, openapiPayoutGetResponse.receipt) &&
        Objects.equals(this.sender, openapiPayoutGetResponse.sender) &&
        Objects.equals(this.state, openapiPayoutGetResponse.state) &&
        Objects.equals(this.walletId, openapiPayoutGetResponse.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdAt, id, paymentAccountId, receipt, sender, state, walletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPayoutGetResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentAccountId: ").append(toIndentedString(paymentAccountId)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("payment_account_id");
    openapiFields.add("receipt");
    openapiFields.add("sender");
    openapiFields.add("state");
    openapiFields.add("wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPayoutGetResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPayoutGetResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPayoutGetResponse is not found in the empty JSON string", OpenapiPayoutGetResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPayoutGetResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPayoutGetResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        OpenapiPayoutCreateResponseAmount.validateJsonElement(jsonObj.get("amount"));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("payment_account_id") != null && !jsonObj.get("payment_account_id").isJsonNull()) && !jsonObj.get("payment_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_account_id").toString()));
      }
      if ((jsonObj.get("receipt") != null && !jsonObj.get("receipt").isJsonNull()) && !jsonObj.get("receipt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receipt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receipt").toString()));
      }
      // validate the optional field `sender`
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) {
        OpenapiPayoutCreateResponseSender.validateJsonElement(jsonObj.get("sender"));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        OpenapiPayoutCreateResponseState.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("wallet_id") != null && !jsonObj.get("wallet_id").isJsonNull()) && !jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPayoutGetResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPayoutGetResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPayoutGetResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPayoutGetResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPayoutGetResponse>() {
           @Override
           public void write(JsonWriter out, OpenapiPayoutGetResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPayoutGetResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPayoutGetResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPayoutGetResponse
  * @throws IOException if the JSON string is invalid with respect to OpenapiPayoutGetResponse
  */
  public static OpenapiPayoutGetResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPayoutGetResponse.class);
  }

 /**
  * Convert an instance of OpenapiPayoutGetResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

