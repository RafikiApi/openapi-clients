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
 * OpenapiPayoutCreateResponseSenderAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-06T15:34:03.279613Z[Etc/UTC]")
public class OpenapiPayoutCreateResponseSenderAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LINE1 = "line_1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line_2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_LINE3 = "line_3";
  @SerializedName(SERIALIZED_NAME_LINE3)
  private String line3;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public OpenapiPayoutCreateResponseSenderAddress() {
  }

  public OpenapiPayoutCreateResponseSenderAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public OpenapiPayoutCreateResponseSenderAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166 alpha-2 country code associated with the address.
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public OpenapiPayoutCreateResponseSenderAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @javax.annotation.Nullable
  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public OpenapiPayoutCreateResponseSenderAddress line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * Get line2
   * @return line2
  **/
  @javax.annotation.Nullable
  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public OpenapiPayoutCreateResponseSenderAddress line3(String line3) {
    
    this.line3 = line3;
    return this;
  }

   /**
   * Get line3
   * @return line3
  **/
  @javax.annotation.Nullable
  public String getLine3() {
    return line3;
  }


  public void setLine3(String line3) {
    this.line3 = line3;
  }


  public OpenapiPayoutCreateResponseSenderAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiPayoutCreateResponseSenderAddress openapiPayoutCreateResponseSenderAddress = (OpenapiPayoutCreateResponseSenderAddress) o;
    return Objects.equals(this.city, openapiPayoutCreateResponseSenderAddress.city) &&
        Objects.equals(this.country, openapiPayoutCreateResponseSenderAddress.country) &&
        Objects.equals(this.line1, openapiPayoutCreateResponseSenderAddress.line1) &&
        Objects.equals(this.line2, openapiPayoutCreateResponseSenderAddress.line2) &&
        Objects.equals(this.line3, openapiPayoutCreateResponseSenderAddress.line3) &&
        Objects.equals(this.postalCode, openapiPayoutCreateResponseSenderAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, line1, line2, line3, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPayoutCreateResponseSenderAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("line_1");
    openapiFields.add("line_2");
    openapiFields.add("line_3");
    openapiFields.add("postal_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPayoutCreateResponseSenderAddress
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPayoutCreateResponseSenderAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPayoutCreateResponseSenderAddress is not found in the empty JSON string", OpenapiPayoutCreateResponseSenderAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPayoutCreateResponseSenderAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPayoutCreateResponseSenderAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("line_1") != null && !jsonObj.get("line_1").isJsonNull()) && !jsonObj.get("line_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_1").toString()));
      }
      if ((jsonObj.get("line_2") != null && !jsonObj.get("line_2").isJsonNull()) && !jsonObj.get("line_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_2").toString()));
      }
      if ((jsonObj.get("line_3") != null && !jsonObj.get("line_3").isJsonNull()) && !jsonObj.get("line_3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_3").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPayoutCreateResponseSenderAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPayoutCreateResponseSenderAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPayoutCreateResponseSenderAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPayoutCreateResponseSenderAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPayoutCreateResponseSenderAddress>() {
           @Override
           public void write(JsonWriter out, OpenapiPayoutCreateResponseSenderAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPayoutCreateResponseSenderAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPayoutCreateResponseSenderAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPayoutCreateResponseSenderAddress
  * @throws IOException if the JSON string is invalid with respect to OpenapiPayoutCreateResponseSenderAddress
  */
  public static OpenapiPayoutCreateResponseSenderAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPayoutCreateResponseSenderAddress.class);
  }

 /**
  * Convert an instance of OpenapiPayoutCreateResponseSenderAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

