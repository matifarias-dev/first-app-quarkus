package org.acme;

import io.smallrye.common.constraint.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class ExampleResource {

    @ConfigProperty(name = "saludo")
    private String saludo;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("custom")
    public String customHello(@QueryParam("name") String name){
        return String.format("%s %s bienvenido", saludo ,name);
    }
}
