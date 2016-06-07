package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Agent;
import io.swagger.model.Explanation;
import io.swagger.model.Rating;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * the content for output based contests
 **/
@ApiModel(description = "the content for output based contests")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Content  {
  
  private String contentName = null;
  private List<Explanation> explainations = new ArrayList<Explanation>();
  private String id = null;
  private List<Rating> ratings = new ArrayList<Rating>();
  private Agent submitter = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("explainations")
  public List<Explanation> getExplainations() {
    return explainations;
  }
  public void setExplainations(List<Explanation> explainations) {
    this.explainations = explainations;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ratings")
  public List<Rating> getRatings() {
    return ratings;
  }
  public void setRatings(List<Rating> ratings) {
    this.ratings = ratings;
  }

  /**
   * the creator or owner of the content
   **/
  @ApiModelProperty(required = true, value = "the creator or owner of the content")
  @JsonProperty("submitter")
  public Agent getSubmitter() {
    return submitter;
  }
  public void setSubmitter(Agent submitter) {
    this.submitter = submitter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Content content = (Content) o;
    return Objects.equals(contentName, content.contentName) &&
        Objects.equals(explainations, content.explainations) &&
        Objects.equals(id, content.id) &&
        Objects.equals(ratings, content.ratings) &&
        Objects.equals(submitter, content.submitter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentName, explainations, id, ratings, submitter);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Content {\n");
    
    sb.append("  contentName: ").append(contentName).append("\n");
    sb.append("  explainations: ").append(explainations).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ratings: ").append(ratings).append("\n");
    sb.append("  submitter: ").append(submitter).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
