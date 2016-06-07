package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Group;

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
@RequestMapping(value = "/group", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/group", description = "the group API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class GroupApi {

  @ApiOperation(value = "", notes = "", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "", response = String.class) })
  @RequestMapping(value = "/{groupId}/{roleId}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<String> createAssignRoleToGroup(
@ApiParam(value = "",required=true ) @PathVariable("groupId") String groupId

,
    
@ApiParam(value = "",required=true ) @PathVariable("roleId") String roleId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<String>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "", response = String.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<String> createGroup(

@ApiParam(value = "" ,required=true ) @RequestBody Group body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<String>(HttpStatus.OK);
  }

}
