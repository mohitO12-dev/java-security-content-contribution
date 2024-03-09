import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class Router {

    @GET
    @Path("/secure-route")
    public Response secureRoute() {
        // Implement secure logic for this route
        return Response.ok("This is a secure route").build();
    }
}
