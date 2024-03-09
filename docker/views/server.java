import jakarta.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;

public class Server extends ResourceConfig {

    public Server() {
        // Configure server with Jakarta EE security features
        register(Router.class);
    }

    public static void main(String[] args) {
        // Start the server
        new Server().startServer();
    }

    private void startServer() {
       
    }
}
