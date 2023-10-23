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
import org.openapitools.client.model.OpenapiPayoutCreateRequestSenderAddress;
import org.openapitools.client.model.OpenapiPayoutCreateRequestSenderIndividual;

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
 * An optional property for incorporating sender details. Please refer to the \&quot;💡 **Compliance requirements**\&quot; documentation above.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-23T12:05:31.906423Z[Etc/UTC]")
public class OpenapiPayoutCreateRequestSender {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private OpenapiPayoutCreateRequestSenderAddress address;

  public static final String SERIALIZED_NAME_INDIVIDUAL = "individual";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL)
  private OpenapiPayoutCreateRequestSenderIndividual individual;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  Either &#x60;INDIVIDUAL&#x60; or &#x60;BUSINESS&#x60;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INDIVIDUAL("INDIVIDUAL"),
    
    BUSINESS("BUSINESS");

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

  public OpenapiPayoutCreateRequestSender() {
  }

  public OpenapiPayoutCreateRequestSender address(OpenapiPayoutCreateRequestSenderAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateRequestSenderAddress getAddress() {
    return address;
  }


  public void setAddress(OpenapiPayoutCreateRequestSenderAddress address) {
    this.address = address;
  }


  public OpenapiPayoutCreateRequestSender individual(OpenapiPayoutCreateRequestSenderIndividual individual) {
    
    this.individual = individual;
    return this;
  }

   /**
   * Get individual
   * @return individual
  **/
  @javax.annotation.Nullable
  public OpenapiPayoutCreateRequestSenderIndividual getIndividual() {
    return individual;
  }


  public void setIndividual(OpenapiPayoutCreateRequestSenderIndividual individual) {
    this.individual = individual;
  }


  public OpenapiPayoutCreateRequestSender name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  The individual full name or registered business legal name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OpenapiPayoutCreateRequestSender type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &lt;span style&#x3D;\&quot;color:#e95f6a;\&quot;&gt;required if sender is provided&lt;/span&gt;  Either &#x60;INDIVIDUAL&#x60; or &#x60;BUSINESS&#x60;
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
    OpenapiPayoutCreateRequestSender openapiPayoutCreateRequestSender = (OpenapiPayoutCreateRequestSender) o;
    return Objects.equals(this.address, openapiPayoutCreateRequestSender.address) &&
        Objects.equals(this.individual, openapiPayoutCreateRequestSender.individual) &&
        Objects.equals(this.name, openapiPayoutCreateRequestSender.name) &&
        Objects.equals(this.type, openapiPayoutCreateRequestSender.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, individual, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiPayoutCreateRequestSender {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("individual");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpenapiPayoutCreateRequestSender
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenapiPayoutCreateRequestSender.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenapiPayoutCreateRequestSender is not found in the empty JSON string", OpenapiPayoutCreateRequestSender.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenapiPayoutCreateRequestSender.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenapiPayoutCreateRequestSender` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        OpenapiPayoutCreateRequestSenderAddress.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `individual`
      if (jsonObj.get("individual") != null && !jsonObj.get("individual").isJsonNull()) {
        OpenapiPayoutCreateRequestSenderIndividual.validateJsonElement(jsonObj.get("individual"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenapiPayoutCreateRequestSender.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenapiPayoutCreateRequestSender' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenapiPayoutCreateRequestSender> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenapiPayoutCreateRequestSender.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenapiPayoutCreateRequestSender>() {
           @Override
           public void write(JsonWriter out, OpenapiPayoutCreateRequestSender value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenapiPayoutCreateRequestSender read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenapiPayoutCreateRequestSender given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenapiPayoutCreateRequestSender
  * @throws IOException if the JSON string is invalid with respect to OpenapiPayoutCreateRequestSender
  */
  public static OpenapiPayoutCreateRequestSender fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenapiPayoutCreateRequestSender.class);
  }

 /**
  * Convert an instance of OpenapiPayoutCreateRequestSender to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
