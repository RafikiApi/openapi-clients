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
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateRequestBankAccount;
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateRequestHolder;
import org.openapitools.client.model.OpenapiPaymentAccountGetOrCreateRequestMobileMoney;

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
 * OpenapiPaymentAccountGetOrCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T11:58:47.787462Z[Etc/UTC]")
public class OpenapiPaymentAccountGetOrCreateRequest {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private OpenapiPaymentAccountGetOrCreateRequestBankAccount bankAccount;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private OpenapiPaymentAccountGetOrCreateRequestHolder holder;

  public static final String SERIALIZED_NAME_MOBILE_MONEY = "mobile_money";
  @SerializedName(SERIALIZED_NAME_MOBILE_MONEY)
  private OpenapiPaymentAccountGetOrCreateRequestMobileMoney mobileMoney;

  /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MOBILE_MONEY("MOBILE_MONEY"),
    
    BANK_ACCOUNT("BANK_ACCOUNT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public OpenapiPaymentAccountGetOrCreateRequest() {
  }

  public OpenapiPaymentAccountGetOrCreateRequest bankAccount(OpenapiPaymentAccountGetOrCreateRequestBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateRequestBankAccount getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(OpenapiPaymentAccountGetOrCreateRequestBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  public OpenapiPaymentAccountGetOrCreateRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  The ISO 3166 alpha-2 country code in which the payment account is registered.
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public OpenapiPaymentAccountGetOrCreateRequest holder(OpenapiPaymentAccountGetOrCreateRequestHolder holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateRequestHolder getHolder() {
    return holder;
  }


  public void setHolder(OpenapiPaymentAccountGetOrCreateRequestHolder holder) {
    this.holder = holder;
  }


  public OpenapiPaymentAccountGetOrCreateRequest mobileMoney(OpenapiPaymentAccountGetOrCreateRequestMobileMoney mobileMoney) {
    
    this.mobileMoney = mobileMoney;
    return this;
  }

   /**
   * Get mobileMoney
   * @return mobileMoney
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountGetOrCreateRequestMobileMoney getMobileMoney() {
    return mobileMoney;
  }


  public void setMobileMoney(OpenapiPaymentAccountGetOrCreateRequestMobileMoney mobileMoney) {
    this.mobileMoney = mobileMoney;
  }


  public OpenapiPaymentAccountGetOrCreateRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required&lt;/span&gt;  Either &#x60;MOBILE_MONEY&#x60; or &#x60;BANK_ACCOUNT&#x60;
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
    OpenapiPaymentAccountGetOrCreateRequest openapiPaymentAccountGetOrCreateRequest = (OpenapiPaymentAccountGetOrCreateRequest) o;
    return Objects.equals(this.bankAccount, openapiPaymentAccountGetOrCreateRequest.bankAccount) &&
        Objects.equals(this.country, openapiPaymentAccountGetOrCreateRequest.country) &&
        Objects.equals(this.holder, openapiPaymentAccountGetOrCreateRequest.holder) &&
        Objects.equals(this.mobileMoney, openapiPaymentAccountGetOrCreateRequest.mobileMoney) &&
        Objects.equals(this.type, openapiPaymentAccountGetOrCreateRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccount, country, holder, mobileMoney, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPaymentAccountGetOrCreateRequest {\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
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
    openapiFields.add("holder");
    openapiFields.add("mobile_money");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPaymentAccountGetOrCreateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPaymentAccountGetOrCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPaymentAccountGetOrCreateRequest is not found in the empty JSON string", OpenapiPaymentAccountGetOrCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPaymentAccountGetOrCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPaymentAccountGetOrCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bank_account`
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateRequestBankAccount.validateJsonElement(jsonObj.get("bank_account"));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateRequestHolder.validateJsonElement(jsonObj.get("holder"));
      }
      // validate the optional field `mobile_money`
      if (jsonObj.get("mobile_money") != null && !jsonObj.get("mobile_money").isJsonNull()) {
        OpenapiPaymentAccountGetOrCreateRequestMobileMoney.validateJsonElement(jsonObj.get("mobile_money"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPaymentAccountGetOrCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPaymentAccountGetOrCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPaymentAccountGetOrCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPaymentAccountGetOrCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPaymentAccountGetOrCreateRequest>() {
           @Override
           public void write(JsonWriter out, OpenapiPaymentAccountGetOrCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPaymentAccountGetOrCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPaymentAccountGetOrCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPaymentAccountGetOrCreateRequest
  * @throws IOException if the JSON string is invalid with respect to OpenapiPaymentAccountGetOrCreateRequest
  */
  public static OpenapiPaymentAccountGetOrCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPaymentAccountGetOrCreateRequest.class);
  }

 /**
  * Convert an instance of OpenapiPaymentAccountGetOrCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

