package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Agent currently represents only users (persons that create logins). In the future will also represent code-agents (contracts, bots, etc.)
 **/
@ApiModel(description = "Agent currently represents only users (persons that create logins). In the future will also represent code-agents (contracts, bots, etc.)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Agent  {
  
  private String email = null;
  private String firstName = null;
  private Integer id = null;
  private String lastName = null;
  private String password = null;
  private Integer userStatus = null;
  private String userlogin = null;

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
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
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * User Status - active, inactive, banned
   **/
  @ApiModelProperty(value = "User Status - active, inactive, banned")
  @JsonProperty("userStatus")
  public Integer getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("userlogin")
  public String getUserlogin() {
    return userlogin;
  }
  public void setUserlogin(String userlogin) {
    this.userlogin = userlogin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(email, agent.email) &&
        Objects.equals(firstName, agent.firstName) &&
        Objects.equals(id, agent.id) &&
        Objects.equals(lastName, agent.lastName) &&
        Objects.equals(password, agent.password) &&
        Objects.equals(userStatus, agent.userStatus) &&
        Objects.equals(userlogin, agent.userlogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, password, userStatus, userlogin);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  userStatus: ").append(userStatus).append("\n");
    sb.append("  userlogin: ").append(userlogin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
