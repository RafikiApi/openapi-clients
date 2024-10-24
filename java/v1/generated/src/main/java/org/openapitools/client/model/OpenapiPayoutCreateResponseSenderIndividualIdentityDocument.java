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
 * OpenapiPayoutCreateResponseSenderIndividualIdentityDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T12:18:08.434805Z[Etc/UTC]")
public class OpenapiPayoutCreateResponseSenderIndividualIdentityDocument {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EXPIRES_ON = "expires_on";
  @SerializedName(SERIALIZED_NAME_EXPIRES_ON)
  private String expiresOn;

  public static final String SERIALIZED_NAME_ISSUED_ON = "issued_on";
  @SerializedName(SERIALIZED_NAME_ISSUED_ON)
  private String issuedOn;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PASSPORT("PASSPORT"),
    
    DRIVING_LICENCE("DRIVING_LICENCE"),
    
    NATIONAL_ID_CARD("NATIONAL_ID_CARD"),
    
    RESIDENCE_PERMIT("RESIDENCE_PERMIT");

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

  public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument() {
  }

  public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166 alpha-2 country code indicating the issuing country of the document.
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument expiresOn(String expiresOn) {
    
    this.expiresOn = expiresOn;
    return this;
  }

   /**
   * Date formatted as yyyy-mm-dd
   * @return expiresOn
  **/
  @javax.annotation.Nullable
  public String getExpiresOn() {
    return expiresOn;
  }


  public void setExpiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
  }


  public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument issuedOn(String issuedOn) {
    
    this.issuedOn = issuedOn;
    return this;
  }

   /**
   * Date formatted as yyyy-mm-dd
   * @return issuedOn
  **/
  @javax.annotation.Nullable
  public String getIssuedOn() {
    return issuedOn;
  }


  public void setIssuedOn(String issuedOn) {
    this.issuedOn = issuedOn;
  }


  public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
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
    OpenapiPayoutCreateResponseSenderIndividualIdentityDocument openapiPayoutCreateResponseSenderIndividualIdentityDocument = (OpenapiPayoutCreateResponseSenderIndividualIdentityDocument) o;
    return Objects.equals(this.country, openapiPayoutCreateResponseSenderIndividualIdentityDocument.country) &&
        Objects.equals(this.expiresOn, openapiPayoutCreateResponseSenderIndividualIdentityDocument.expiresOn) &&
        Objects.equals(this.issuedOn, openapiPayoutCreateResponseSenderIndividualIdentityDocument.issuedOn) &&
        Objects.equals(this.number, openapiPayoutCreateResponseSenderIndividualIdentityDocument.number) &&
        Objects.equals(this.type, openapiPayoutCreateResponseSenderIndividualIdentityDocument.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, expiresOn, issuedOn, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPayoutCreateResponseSenderIndividualIdentityDocument {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("expires_on");
    openapiFields.add("issued_on");
    openapiFields.add("number");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPayoutCreateResponseSenderIndividualIdentityDocument
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPayoutCreateResponseSenderIndividualIdentityDocument is not found in the empty JSON string", OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPayoutCreateResponseSenderIndividualIdentityDocument` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("expires_on") != null && !jsonObj.get("expires_on").isJsonNull()) && !jsonObj.get("expires_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_on").toString()));
      }
      if ((jsonObj.get("issued_on") != null && !jsonObj.get("issued_on").isJsonNull()) && !jsonObj.get("issued_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issued_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issued_on").toString()));
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPayoutCreateResponseSenderIndividualIdentityDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPayoutCreateResponseSenderIndividualIdentityDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPayoutCreateResponseSenderIndividualIdentityDocument>() {
           @Override
           public void write(JsonWriter out, OpenapiPayoutCreateResponseSenderIndividualIdentityDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPayoutCreateResponseSenderIndividualIdentityDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument
  * @throws IOException if the JSON string is invalid with respect to OpenapiPayoutCreateResponseSenderIndividualIdentityDocument
  */
  public static OpenapiPayoutCreateResponseSenderIndividualIdentityDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPayoutCreateResponseSenderIndividualIdentityDocument.class);
  }

 /**
  * Convert an instance of OpenapiPayoutCreateResponseSenderIndividualIdentityDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

