package ka.gws.barchr.common.rest.api.service;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ka.gws.barchr.common.to.UserTO;

@Path("users")
public interface UserService extends BaseService {

  @POST
  @Produces({BaseService.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({BaseService.APPLICATION_XML, MediaType.APPLICATION_JSON})
  Response create(@NotNull UserTO userTO);
}
