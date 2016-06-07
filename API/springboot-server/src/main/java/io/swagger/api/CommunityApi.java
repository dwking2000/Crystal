package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Community;

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
@RequestMapping(value = "/community", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/community", description = "the community API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class CommunityApi {

  @ApiOperation(value = "", notes = "", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK", response = Object.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Object> createCommunity()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "", response = Community.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Community.class) })
  @RequestMapping(value = "/{id}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<Community> getCommunityById(
@ApiParam(value = "community id",required=true ) @PathVariable("id") String id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Community>(HttpStatus.OK);
  }

}
