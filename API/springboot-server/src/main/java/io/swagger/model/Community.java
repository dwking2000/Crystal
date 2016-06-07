package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Agent;
import io.swagger.model.Group;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Community  {
  
  private String description = null;
  private List<Group> groups = new ArrayList<Group>();
  private String id = null;
  private List<Agent> members = new ArrayList<Agent>();
  private String name = null;

  /**
   * community description
   **/
  @ApiModelProperty(required = true, value = "community description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * list of groups (governance access list for this community)
   **/
  @ApiModelProperty(required = true, value = "list of groups (governance access list for this community)")
  @JsonProperty("groups")
  public List<Group> getGroups() {
    return groups;
  }
  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  /**
   * hash
   **/
  @ApiModelProperty(required = true, value = "hash")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * list of agents belonging to this community
   **/
  @ApiModelProperty(required = true, value = "list of agents belonging to this community")
  @JsonProperty("members")
  public List<Agent> getMembers() {
    return members;
  }
  public void setMembers(List<Agent> members) {
    this.members = members;
  }

  /**
   * community name
   **/
  @ApiModelProperty(required = true, value = "community name")
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
    Community community = (Community) o;
    return Objects.equals(description, community.description) &&
        Objects.equals(groups, community.groups) &&
        Objects.equals(id, community.id) &&
        Objects.equals(members, community.members) &&
        Objects.equals(name, community.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groups, id, members, name);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Community {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  groups: ").append(groups).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  members: ").append(members).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
