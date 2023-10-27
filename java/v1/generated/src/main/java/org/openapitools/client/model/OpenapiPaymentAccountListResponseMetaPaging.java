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
import org.openapitools.client.model.OpenapiPaymentAccountListResponseMetaPagingCursors;

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
 * OpenapiPaymentAccountListResponseMetaPaging
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T13:57:01.660841Z[Etc/UTC]")
public class OpenapiPaymentAccountListResponseMetaPaging {
  public static final String SERIALIZED_NAME_CURSORS = "cursors";
  @SerializedName(SERIALIZED_NAME_CURSORS)
  private OpenapiPaymentAccountListResponseMetaPagingCursors cursors;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public OpenapiPaymentAccountListResponseMetaPaging() {
  }

  public OpenapiPaymentAccountListResponseMetaPaging cursors(OpenapiPaymentAccountListResponseMetaPagingCursors cursors) {
    
    this.cursors = cursors;
    return this;
  }

   /**
   * Get cursors
   * @return cursors
  **/
  @javax.annotation.Nullable
  public OpenapiPaymentAccountListResponseMetaPagingCursors getCursors() {
    return cursors;
  }


  public void setCursors(OpenapiPaymentAccountListResponseMetaPagingCursors cursors) {
    this.cursors = cursors;
  }


  public OpenapiPaymentAccountListResponseMetaPaging next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiPaymentAccountListResponseMetaPaging openapiPaymentAccountListResponseMetaPaging = (OpenapiPaymentAccountListResponseMetaPaging) o;
    return Objects.equals(this.cursors, openapiPaymentAccountListResponseMetaPaging.cursors) &&
        Objects.equals(this.next, openapiPaymentAccountListResponseMetaPaging.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursors, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPaymentAccountListResponseMetaPaging {\n");
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("cursors");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPaymentAccountListResponseMetaPaging
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPaymentAccountListResponseMetaPaging.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPaymentAccountListResponseMetaPaging is not found in the empty JSON string", OpenapiPaymentAccountListResponseMetaPaging.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPaymentAccountListResponseMetaPaging.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPaymentAccountListResponseMetaPaging` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cursors`
      if (jsonObj.get("cursors") != null && !jsonObj.get("cursors").isJsonNull()) {
        OpenapiPaymentAccountListResponseMetaPagingCursors.validateJsonElement(jsonObj.get("cursors"));
      }
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPaymentAccountListResponseMetaPaging.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPaymentAccountListResponseMetaPaging' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPaymentAccountListResponseMetaPaging> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPaymentAccountListResponseMetaPaging.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPaymentAccountListResponseMetaPaging>() {
           @Override
           public void write(JsonWriter out, OpenapiPaymentAccountListResponseMetaPaging value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPaymentAccountListResponseMetaPaging read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPaymentAccountListResponseMetaPaging given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPaymentAccountListResponseMetaPaging
  * @throws IOException if the JSON string is invalid with respect to OpenapiPaymentAccountListResponseMetaPaging
  */
  public static OpenapiPaymentAccountListResponseMetaPaging fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPaymentAccountListResponseMetaPaging.class);
  }

 /**
  * Convert an instance of OpenapiPaymentAccountListResponseMetaPaging to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

