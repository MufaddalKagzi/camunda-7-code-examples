/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;

/**
 * MultiFormVariableBinaryDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class MultiFormVariableBinaryDto {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private File data;

  /**
   * The name of the variable type. Either Bytes for a byte array variable or File for a file variable.
   */
  @JsonAdapter(ValueTypeEnum.Adapter.class)
  public enum ValueTypeEnum {
    BYTES("Bytes"),
    
    FILE("File");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueTypeEnum fromValue(String value) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValueTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private ValueTypeEnum valueType;


  public MultiFormVariableBinaryDto data(File data) {
    
    this.data = data;
    return this;
  }

   /**
   * The binary data to be set. For File variables, this multipart can contain the filename, binary value and MIME type of the file variable to be set Only the filename is mandatory.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The binary data to be set. For File variables, this multipart can contain the filename, binary value and MIME type of the file variable to be set Only the filename is mandatory.")

  public File getData() {
    return data;
  }


  public void setData(File data) {
    this.data = data;
  }


  public MultiFormVariableBinaryDto valueType(ValueTypeEnum valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * The name of the variable type. Either Bytes for a byte array variable or File for a file variable.
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the variable type. Either Bytes for a byte array variable or File for a file variable.")

  public ValueTypeEnum getValueType() {
    return valueType;
  }


  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiFormVariableBinaryDto multiFormVariableBinaryDto = (MultiFormVariableBinaryDto) o;
    return Objects.equals(this.data, multiFormVariableBinaryDto.data) &&
        Objects.equals(this.valueType, multiFormVariableBinaryDto.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiFormVariableBinaryDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
