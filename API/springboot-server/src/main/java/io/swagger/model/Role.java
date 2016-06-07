package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Permission;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * a Role represents permissions to a UNC path for CRUD and Execute operations.
 **/
@ApiModel(description = "a Role represents permissions to a UNC path for CRUD and Execute operations.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Role  {
  
  private Integer id = null;
  private String name = null;
  private String path = null;
  private List<Permission> permissions = new ArrayList<Permission>();

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
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
   * rest endpoint or registered contract endpoint (allows for regex wildcards) to resource(s) that this role can access or execute
   **/
  @ApiModelProperty(required = true, value = "rest endpoint or registered contract endpoint (allows for regex wildcards) to resource(s) that this role can access or execute")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * list of permissions for the resources in the path. Agents assigned this role will be allowed to perform GET/POST/DELETE/PATCH (read/update/delete) on the resource.
   **/
  @ApiModelProperty(required = true, value = "list of permissions for the resources in the path. Agents assigned this role will be allowed to perform GET/POST/DELETE/PATCH (read/update/delete) on the resource.")
  @JsonProperty("permissions")
  public List<Permission> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(id, role.id) &&
        Objects.equals(name, role.name) &&
        Objects.equals(path, role.path) &&
        Objects.equals(permissions, role.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, path, permissions);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
