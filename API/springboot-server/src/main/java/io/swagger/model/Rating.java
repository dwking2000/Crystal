package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Rating  {
  
  private String contentId = null;
  private String type = null;
  private String value = null;

  /**
   * the content being rated
   **/
  @ApiModelProperty(required = true, value = "the content being rated")
  @JsonProperty("contentId")
  public String getContentId() {
    return contentId;
  }
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  /**
   * rating type
   **/
  @ApiModelProperty(required = true, value = "rating type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * rating value TODO: what is data type - string, number?
   **/
  @ApiModelProperty(required = true, value = "rating value TODO: what is data type - string, number?")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(contentId, rating.contentId) &&
        Objects.equals(type, rating.type) &&
        Objects.equals(value, rating.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, type, value);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("  contentId: ").append(contentId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
