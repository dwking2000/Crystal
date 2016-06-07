package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * a permission for read, write or execute on some unique URI that represents a function or resource. These resources will be the components of the governance scheme, e.g. they will be data or functions that in aggregate comprise a particular governance model.
 **/
@ApiModel(description = "a permission for read, write or execute on some unique URI that represents a function or resource. These resources will be the components of the governance scheme, e.g. they will be data or functions that in aggregate comprise a particular governance model.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Permission  {
  
  private String flags = null;
  private Integer id = null;
  private String name = null;

  /**
   * create, read, write, execute / or GET/POST
   **/
  @ApiModelProperty(required = true, value = "create, read, write, execute / or GET/POST")
  @JsonProperty("flags")
  public String getFlags() {
    return flags;
  }
  public void setFlags(String flags) {
    this.flags = flags;
  }

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(flags, permission.flags) &&
        Objects.equals(id, permission.id) &&
        Objects.equals(name, permission.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flags, id, name);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("  flags: ").append(flags).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
