package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContractParameter;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Container for contract parameters
 **/
@ApiModel(description = "Container for contract parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class Contract  {
  
  private String name = null;
  private String description = null;
  private List<ContractParameter> parameters = new ArrayList<ContractParameter>();
  private String contractId = null;

  /**
   * contract name
   **/
  @ApiModelProperty(required = true, value = "contract name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * contract description
   **/
  @ApiModelProperty(required = true, value = "contract description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * array of parameters
   **/
  @ApiModelProperty(value = "array of parameters")
  @JsonProperty("parameters")
  public List<ContractParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<ContractParameter> parameters) {
    this.parameters = parameters;
  }

  /**
   * sha256
   **/
  @ApiModelProperty(required = true, value = "sha256")
  @JsonProperty("contractId")
  public String getContractId() {
    return contractId;
  }
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(name, contract.name) &&
        Objects.equals(description, contract.description) &&
        Objects.equals(parameters, contract.parameters) &&
        Objects.equals(contractId, contract.contractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, parameters, contractId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  parameters: ").append(parameters).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
