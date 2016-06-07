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
@RequestMapping(value = "/governance", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/governance", description = "the governance API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class GovernanceApi {

  @ApiOperation(value = "", notes = "", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "", response = String.class) })
  @RequestMapping(value = "/distribute/{token}/{group}/{formula}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<String> createDistributeTokens(
@ApiParam(value = "",required=true ) @PathVariable("token") String token

,
    
@ApiParam(value = "",required=true ) @PathVariable("group") String group

,
    
@ApiParam(value = "",required=true ) @PathVariable("formula") String formula

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<String>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK", response = Object.class) })
  @RequestMapping(value = "/send/{fromAddress}/{toAddress}/{token}/{denomination}/{amount}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Object> createSendTokens(
@ApiParam(value = "the sender address",required=true ) @PathVariable("fromAddress") String fromAddress

,
    
@ApiParam(value = "the recipient address",required=true ) @PathVariable("toAddress") String toAddress

,
    
@ApiParam(value = "the amount (TODO: settle on the correct data type)",required=true ) @PathVariable("amount") Long amount

,
    
@ApiParam(value = "eth, crystal, etc.",required=true ) @PathVariable("token") String token

,
    
@ApiParam(value = "wei, szabo, etc.",required=true ) @PathVariable("denomination") String denomination

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }

}
