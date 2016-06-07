package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * metadata about solidity contract parameters
 **/
@ApiModel(description = "metadata about solidity contract parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class ContractParameter  {
  
  private String contractId = null;
  private String parameterName = null;
  private String valueType = null;
  private String parameterId = null;
  private String defaultValue = null;
  private String validationRegex = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contractId")
  public String getContractId() {
    return contractId;
  }
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  /**
   * human readable parameter name. TODO: remove - may not need human readable
   **/
  @ApiModelProperty(required = true, value = "human readable parameter name. TODO: remove - may not need human readable")
  @JsonProperty("parameterName")
  public String getParameterName() {
    return parameterName;
  }
  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  /**
   * string, int, boolean, etc.
   **/
  @ApiModelProperty(required = true, value = "string, int, boolean, etc.")
  @JsonProperty("valueType")
  public String getValueType() {
    return valueType;
  }
  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /**
   * unique hash representing this instance of a contract parameter
   **/
  @ApiModelProperty(required = true, value = "unique hash representing this instance of a contract parameter")
  @JsonProperty("parameterId")
  public String getParameterId() {
    return parameterId;
  }
  public void setParameterId(String parameterId) {
    this.parameterId = parameterId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * regex to enforce input validation
   **/
  @ApiModelProperty(required = true, value = "regex to enforce input validation")
  @JsonProperty("validationRegex")
  public String getValidationRegex() {
    return validationRegex;
  }
  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractParameter contractParameter = (ContractParameter) o;
    return Objects.equals(contractId, contractParameter.contractId) &&
        Objects.equals(parameterName, contractParameter.parameterName) &&
        Objects.equals(valueType, contractParameter.valueType) &&
        Objects.equals(parameterId, contractParameter.parameterId) &&
        Objects.equals(defaultValue, contractParameter.defaultValue) &&
        Objects.equals(validationRegex, contractParameter.validationRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, parameterName, valueType, parameterId, defaultValue, validationRegex);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractParameter {\n");
    
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  parameterName: ").append(parameterName).append("\n");
    sb.append("  valueType: ").append(valueType).append("\n");
    sb.append("  parameterId: ").append(parameterId).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  validationRegex: ").append(validationRegex).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
