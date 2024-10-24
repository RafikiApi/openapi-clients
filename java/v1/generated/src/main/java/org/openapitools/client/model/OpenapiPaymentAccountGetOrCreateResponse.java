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
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateResponseBankAccount;
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateResponseHolder;
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateResponseMobileMoney;

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
 * OpenapiPaymentAccountGetOrCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T12:18:08.434805Z[Etc/UTC]")
public class OpenapiPaymentAccountGetOrCreateResponse {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private OpenapiPaymentAccountGetOrCreateResponseBankAccount bankAccount;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private OpenapiPaymentAccountGetOrCreateResponseHolder holder;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MOBILE_MONEY = "mobile_money";
  @SerializedName(SERIALIZED_NAME_MOBILE_MONEY)
  private OpenapiPaymentAccountGetOrCreateResponseMobileMoney mobileMoney;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = "MOBILE_MONEY";

  public OpenapiPaymentAccountGetOrCreateResponse() {
  }

  public OpenapiPaymentAccountGetOrCreateResponse bankAccount(OpenapiPaymentAccountGetOrCreateResponseBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateResponseBankAccount getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(OpenapiPaymentAccountGetOrCreateResponseBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  public OpenapiPaymentAccountGetOrCreateResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public OpenapiPaymentAccountGetOrCreateResponse createdAt(String createdAt) {
    
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


  public OpenapiPaymentAccountGetOrCreateResponse holder(OpenapiPaymentAccountGetOrCreateResponseHolder holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateResponseHolder getHolder() {
    return holder;
  }


  public void setHolder(OpenapiPaymentAccountGetOrCreateResponseHolder holder) {
    this.holder = holder;
  }


  public OpenapiPaymentAccountGetOrCreateResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The newly created payment account unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OpenapiPaymentAccountGetOrCreateResponse mobileMoney(OpenapiPaymentAccountGetOrCreateResponseMobileMoney mobileMoney) {
    
    this.mobileMoney = mobileMoney;
    return this;
  }

   /**
   * Get mobileMoney
   * @return mobileMoney
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateResponseMobileMoney getMobileMoney() {
    return mobileMoney;
  }


  public void setMobileMoney(OpenapiPaymentAccountGetOrCreateResponseMobileMoney mobileMoney) {
    this.mobileMoney = mobileMoney;
  }


  public OpenapiPaymentAccountGetOrCreateResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiPaymentAccountGetOrCreateResponse openapiPaymentAccountGetOrCreateResponse = (OpenapiPaymentAccountGetOrCreateResponse) o;
    return Objects.equals(this.bankAccount, openapiPaymentAccountGetOrCreateResponse.bankAccount) &&
        Objects.equals(this.country, openapiPaymentAccountGetOrCreateResponse.country) &&
        Objects.equals(this.createdAt, openapiPaymentAccountGetOrCreateResponse.createdAt) &&
        Objects.equals(this.holder, openapiPaymentAccountGetOrCreateResponse.holder) &&
        Objects.equals(this.id, openapiPaymentAccountGetOrCreateResponse.id) &&
        Objects.equals(this.mobileMoney, openapiPaymentAccountGetOrCreateResponse.mobileMoney) &&
        Objects.equals(this.type, openapiPaymentAccountGetOrCreateResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, country, createdAt, holder, id, mobileMoney, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPaymentAccountGetOrCreateResponse {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobileMoney: ").append(toIndentedString(mobileMoney)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("bank_account");
    openapiFields.add("country");
    openapiFields.add("created_at");
    openapiFields.add("holder");
    openapiFields.add("id");
    openapiFields.add("mobile_money");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPaymentAccountGetOrCreateResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPaymentAccountGetOrCreateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPaymentAccountGetOrCreateResponse is not found in the empty JSON string", OpenapiPaymentAccountGetOrCreateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPaymentAccountGetOrCreateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPaymentAccountGetOrCreateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bank_account`
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateResponseBankAccount.validateJsonElement(jsonObj.get("bank_account"));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateResponseHolder.validateJsonElement(jsonObj.get("holder"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `mobile_money`
      if (jsonObj.get("mobile_money") != null && !jsonObj.get("mobile_money").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateResponseMobileMoney.validateJsonElement(jsonObj.get("mobile_money"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPaymentAccountGetOrCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPaymentAccountGetOrCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPaymentAccountGetOrCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPaymentAccountGetOrCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPaymentAccountGetOrCreateResponse>() {
           @Override
           public void write(JsonWriter out, OpenapiPaymentAccountGetOrCreateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPaymentAccountGetOrCreateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPaymentAccountGetOrCreateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPaymentAccountGetOrCreateResponse
  * @throws IOException if the JSON string is invalid with respect to OpenapiPaymentAccountGetOrCreateResponse
  */
  public static OpenapiPaymentAccountGetOrCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPaymentAccountGetOrCreateResponse.class);
  }

 /**
  * Convert an instance of OpenapiPaymentAccountGetOrCreateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

