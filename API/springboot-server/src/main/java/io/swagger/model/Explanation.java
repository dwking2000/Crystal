package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * content rating as text
 **/
@ApiModel(description = "content rating as text")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Explanation  {
  
  private String contentId = null;
  private String description = null;
  private String explainedBy = null;
  private String name = null;

  /**
   * link to content being explained
   **/
  @ApiModelProperty(required = true, value = "link to content being explained")
  @JsonProperty("contentId")
  public String getContentId() {
    return contentId;
  }
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  /**
   * explanation description
   **/
  @ApiModelProperty(required = true, value = "explanation description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * explainer id
   **/
  @ApiModelProperty(value = "explainer id")
  @JsonProperty("explainedBy")
  public String getExplainedBy() {
    return explainedBy;
  }
  public void setExplainedBy(String explainedBy) {
    this.explainedBy = explainedBy;
  }

  /**
   * explanation name
   **/
  @ApiModelProperty(required = true, value = "explanation name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Explanation explanation = (Explanation) o;
    return Objects.equals(contentId, explanation.contentId) &&
        Objects.equals(description, explanation.description) &&
        Objects.equals(explainedBy, explanation.explainedBy) &&
        Objects.equals(name, explanation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, description, explainedBy, name);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Explanation {\n");
    
    sb.append("  contentId: ").append(contentId).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  explainedBy: ").append(explainedBy).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
