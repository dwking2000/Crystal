package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Agent;
import io.swagger.model.Role;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * container for agents and roles. Groups allow the assignment of agents to roles
 **/
@ApiModel(description = "container for agents and roles. Groups allow the assignment of agents to roles")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Group  {
  
  private String id = null;
  private List<Agent> agents = new ArrayList<Agent>();
  private String groupName = null;
  private List<Role> roles = new ArrayList<Role>();

  /**
   * hash
   **/
  @ApiModelProperty(required = true, value = "hash")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * list of agents in this group
   **/
  @ApiModelProperty(required = true, value = "list of agents in this group")
  @JsonProperty("agents")
  public List<Agent> getAgents() {
    return agents;
  }
  public void setAgents(List<Agent> agents) {
    this.agents = agents;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * list of roles allowed for agents in this group
   **/
  @ApiModelProperty(value = "list of roles allowed for agents in this group")
  @JsonProperty("roles")
  public List<Role> getRoles() {
    return roles;
  }
  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(id, group.id) &&
        Objects.equals(agents, group.agents) &&
        Objects.equals(groupName, group.groupName) &&
        Objects.equals(roles, group.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agents, groupName, roles);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  agents: ").append(agents).append("\n");
    sb.append("  groupName: ").append(groupName).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
