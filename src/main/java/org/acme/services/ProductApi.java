package org.acme.services;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.entities.Product;
import org.acme.repositories.ProductRepository;

import java.util.List;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductApi {

    @Inject
    ProductRepository pr;

//    @GET
//    public List<Product> getProducts(){
//        return pr.list();
//    }

    @GET
    public Response getProducts(){
        return Response.ok(pr.list()).build();
    }

    @POST
    public Response addProduct(Product product){
        pr.create(product);
        return Response.ok().build();
    }

    @DELETE
    public Response deleteProduct(Product product){
        pr.delete(product);
        return Response.ok().build();
    }

}
