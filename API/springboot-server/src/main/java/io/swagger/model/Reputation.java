package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Reputation represented as a score, assigned to a person / agent or content
 **/
@ApiModel(description = "Reputation represented as a score, assigned to a person / agent or content")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Reputation  {
  
  private Integer defaultValue = null;
  private String description = null;
  private String id = null;
  private String name = null;
  private String valueType = null;

  /**
   * the default value assigned initially when this rep type is first created
   **/
  @ApiModelProperty(required = true, value = "the default value assigned initially when this rep type is first created")
  @JsonProperty("defaultValue")
  public Integer getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(Integer defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * hash - unique id for this reputation type
   **/
  @ApiModelProperty(required = true, value = "hash - unique id for this reputation type")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * the value type used for this Identity Reputation. Expected value types are: HasValue (boolean), Range (Any range), Unlimited(Any value)
   **/
  @ApiModelProperty(required = true, value = "the value type used for this Identity Reputation. Expected value types are: HasValue (boolean), Range (Any range), Unlimited(Any value)")
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reputation reputation = (Reputation) o;
    return Objects.equals(defaultValue, reputation.defaultValue) &&
        Objects.equals(description, reputation.description) &&
        Objects.equals(id, reputation.id) &&
        Objects.equals(name, reputation.name) &&
        Objects.equals(valueType, reputation.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, id, name, valueType);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reputation {\n");
    
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  valueType: ").append(valueType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
