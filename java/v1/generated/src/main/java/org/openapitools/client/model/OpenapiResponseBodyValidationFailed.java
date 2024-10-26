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
import org.openapitools.client.model.OpenapiResponseBodyValidationFailedErrors;

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
 * OpenapiResponseBodyValidationFailed
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T12:18:08.434805Z[Etc/UTC]")
public class OpenapiResponseBodyValidationFailed {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private OpenapiResponseBodyValidationFailedErrors errors;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public OpenapiResponseBodyValidationFailed() {
  }

  public OpenapiResponseBodyValidationFailed code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * &#x60;VALIDATION_FAILED&#x60;
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public OpenapiResponseBodyValidationFailed errors(OpenapiResponseBodyValidationFailedErrors errors) {
    
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public OpenapiResponseBodyValidationFailedErrors getErrors() {
    return errors;
  }


  public void setErrors(OpenapiResponseBodyValidationFailedErrors errors) {
    this.errors = errors;
  }


  public OpenapiResponseBodyValidationFailed message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * E.g. \&quot;Validation failed.\&quot;
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiResponseBodyValidationFailed openapiResponseBodyValidationFailed = (OpenapiResponseBodyValidationFailed) o;
    return Objects.equals(this.code, openapiResponseBodyValidationFailed.code) &&
        Objects.equals(this.errors, openapiResponseBodyValidationFailed.errors) &&
        Objects.equals(this.message, openapiResponseBodyValidationFailed.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, errors, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiResponseBodyValidationFailed {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("errors");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiResponseBodyValidationFailed
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiResponseBodyValidationFailed.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiResponseBodyValidationFailed is not found in the empty JSON string", OpenapiResponseBodyValidationFailed.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiResponseBodyValidationFailed.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiResponseBodyValidationFailed` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `errors`
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        OpenapiResponseBodyValidationFailedErrors.validateJsonElement(jsonObj.get("errors"));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiResponseBodyValidationFailed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiResponseBodyValidationFailed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiResponseBodyValidationFailed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiResponseBodyValidationFailed.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiResponseBodyValidationFailed>() {
           @Override
           public void write(JsonWriter out, OpenapiResponseBodyValidationFailed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiResponseBodyValidationFailed read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiResponseBodyValidationFailed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiResponseBodyValidationFailed
  * @throws IOException if the JSON string is invalid with respect to OpenapiResponseBodyValidationFailed
  */
  public static OpenapiResponseBodyValidationFailed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiResponseBodyValidationFailed.class);
  }

 /**
  * Convert an instance of OpenapiResponseBodyValidationFailed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

