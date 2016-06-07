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
@RequestMapping(value = "/role", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/role", description = "the role API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class RoleApi {

  @ApiOperation(value = "", notes = "create a new role", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Object.class),
    @ApiResponse(code = 400, message = "Error 400", response = Object.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Object> createRole(

@ApiParam(value = ""  ) @RequestBody Role body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }

}
