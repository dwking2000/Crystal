package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Agent;
import java.util.List;
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
@RequestMapping(value = "/agent", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/agent", description = "the agent API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-02T23:12:20.340Z")
public class AgentApi {

  @ApiOperation(value = "", notes = "Create agent", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Object.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Object> createAgent(

@ApiParam(value = ""  ) @RequestBody Agent body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Creates list of agents with given list input", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Object.class) })
  @RequestMapping(value = "/createWithList",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Object> createAgentsWithListInput(

@ApiParam(value = ""  ) @RequestBody List<Agent> body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Deletes an agent", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Void.class),
    @ApiResponse(code = 400, message = "Error 400", response = Void.class) })
  @RequestMapping(value = "/{agentId}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> deleteAgent(
@ApiParam(value = "hash ID of agent that needs to be fetched",required=true ) @PathVariable("agentId") String agentId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Delete agent", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Void.class),
    @ApiResponse(code = 400, message = "Error 400", response = Void.class),
    @ApiResponse(code = 404, message = "Error 404", response = Void.class) })
  @RequestMapping(value = "/{agentlogin}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> deleteUser(
@ApiParam(value = "name that need to be deleted",required=true ) @PathVariable("agentlogin") String agentlogin

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Find agent by ID", response = Agent.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Agent.class),
    @ApiResponse(code = 400, message = "Error 400", response = Agent.class),
    @ApiResponse(code = 404, message = "Error 404", response = Agent.class) })
  @RequestMapping(value = "/{agentId}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<Agent> getAgentById(
@ApiParam(value = "hash ID of agent that needs to be fetched",required=true ) @PathVariable("agentId") String agentId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Agent>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Get agent by login name", response = Agent.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "return agent on success", response = Agent.class),
    @ApiResponse(code = 400, message = "Error 400", response = Agent.class),
    @ApiResponse(code = 404, message = "Error 404", response = Agent.class) })
  @RequestMapping(value = "/{agentlogin}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<Agent> getAgentByName(
@ApiParam(value = "",required=true ) @PathVariable("agentlogin") String agentlogin

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Agent>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "", response = Role.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Role.class),
    @ApiResponse(code = 400, message = "Error 400", response = Role.class) })
  @RequestMapping(value = "/{agentId}/roles",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Role>> getAgentRolesByAgentId(
@ApiParam(value = "",required=true ) @PathVariable("agentId") String agentId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Role>>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "GetAgentsByReputation", response = Agent.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Agent.class),
    @ApiResponse(code = 400, message = "Error 400", response = Agent.class) })
  @RequestMapping(value = "/{reputationId}/{min}/{max}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Agent>> getAgentsByReputationRange(
@ApiParam(value = "",required=true ) @PathVariable("reputationId") String reputationId

,
    
@ApiParam(value = "",required=true ) @PathVariable("min") Integer min

,
    
@ApiParam(value = "",required=true ) @PathVariable("max") Integer max

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Agent>>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Updates an agent by post of form data", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Object.class),
    @ApiResponse(code = 405, message = "Error 405", response = Object.class) })
  @RequestMapping(value = "/{agentId}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Object> updateAgentWithForm(
@ApiParam(value = "hash ID of agent that needs to be fetched",required=true ) @PathVariable("agentId") String agentId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }


  @ApiOperation(value = "", notes = "Updated agent", response = Object.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Success", response = Object.class),
    @ApiResponse(code = 400, message = "Error 400", response = Object.class),
    @ApiResponse(code = 404, message = "Error 404", response = Object.class) })
  @RequestMapping(value = "/{agentlogin}",
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<Object> updateUser(
@ApiParam(value = "name that need to be deleted",required=true ) @PathVariable("agentlogin") String agentlogin

,
    

@ApiParam(value = ""  ) @RequestBody Agent body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Object>(HttpStatus.OK);
  }

}
