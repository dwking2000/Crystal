package io.swagger.api;

import io.swagger.model.*;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/contract", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/contract", description = "the contract API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class ContractApi {

  @ApiOperation(value = "", notes = "update a value used as an input parameter to a deployed solidity contract. Meant to be used for governance setting or tuning economy.", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "", response = String.class) })
  @RequestMapping(value = "/{id}/{parameter}/{value}/{agentId}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<String> updateContractValue(
@ApiParam(value = "sha256 - the contract id",required=true ) @PathVariable("id") String id

,
    
@ApiParam(value = "sha256 - the parameter id",required=true ) @PathVariable("parameter") String parameter

,
    
@ApiParam(value = "the new value",required=true ) @PathVariable("value") String value

,
    
@ApiParam(value = "sha256 - updated by agent",required=true ) @PathVariable("agentId") String agentId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<String>(HttpStatus.OK);
  }

}
