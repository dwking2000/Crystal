package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Role;

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
@RequestMapping(value = "/roles", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/roles", description = "the roles API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class RolesApi {

  @ApiOperation(value = "", notes = "", response = Role.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "return role list on success", response = Role.class) })
  @RequestMapping(value = "/{agentId}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Role>> getRolesByAgentId(
@ApiParam(value = "",required=true ) @PathVariable("agentId") String agentId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Role>>(HttpStatus.OK);
  }

}
