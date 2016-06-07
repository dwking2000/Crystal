package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Agent;
import io.swagger.model.Content;
import io.swagger.model.ContestType;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Contest  {
  
  private List<Content> content = new ArrayList<Content>();
  private ContestType contestType = null;
  private Agent creator = null;
  private String description = null;
  private String id = null;
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("content")
  public List<Content> getContent() {
    return content;
  }
  public void setContent(List<Content> content) {
    this.content = content;
  }

  /**
   * the types of contests
   **/
  @ApiModelProperty(required = true, value = "the types of contests")
  @JsonProperty("contestType")
  public ContestType getContestType() {
    return contestType;
  }
  public void setContestType(ContestType contestType) {
    this.contestType = contestType;
  }

  /**
   * contest creator
   **/
  @ApiModelProperty(required = true, value = "contest creator")
  @JsonProperty("creator")
  public Agent getCreator() {
    return creator;
  }
  public void setCreator(Agent creator) {
    this.creator = creator;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * hash for this contest
   **/
  @ApiModelProperty(required = true, value = "hash for this contest")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contest contest = (Contest) o;
    return Objects.equals(content, contest.content) &&
        Objects.equals(contestType, contest.contestType) &&
        Objects.equals(creator, contest.creator) &&
        Objects.equals(description, contest.description) &&
        Objects.equals(id, contest.id) &&
        Objects.equals(name, contest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contestType, creator, description, id, name);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contest {\n");
    
    sb.append("  content: ").append(content).append("\n");
    sb.append("  contestType: ").append(contestType).append("\n");
    sb.append("  creator: ").append(creator).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
