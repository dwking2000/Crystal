package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * a Agents role (permissions for governance). This is distinct from the Group Roles and is debatable whether we need this. Is it a special case or can the general case of a Group provide everything we need.
 **/
@ApiModel(description = "a Agents role (permissions for governance). This is distinct from the Group Roles and is debatable whether we need this. Is it a special case or can the general case of a Group provide everything we need.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class AgentRole  {
  
  private String agentId = null;
  private String id = null;
  private String roleId = null;
  private Boolean status = false;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("roleId")
  public String getRoleId() {
    return roleId;
  }
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  /**
   * enabled / disabled (may not need this - perhaps redundant (agend should just be removed from the role)
   **/
  @ApiModelProperty(required = true, value = "enabled / disabled (may not need this - perhaps redundant (agend should just be removed from the role)")
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentRole agentRole = (AgentRole) o;
    return Objects.equals(agentId, agentRole.agentId) &&
        Objects.equals(id, agentRole.id) &&
        Objects.equals(roleId, agentRole.roleId) &&
        Objects.equals(status, agentRole.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, id, roleId, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRole {\n");
    
    sb.append("  agentId: ").append(agentId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  roleId: ").append(roleId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
