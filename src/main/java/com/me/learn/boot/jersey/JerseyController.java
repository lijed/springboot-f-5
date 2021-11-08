package com.me.learn.boot.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Classname JerseyController
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 22:20
 * Version 1.0
 */
@Path("/jersey/")
public class JerseyController {

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(@PathParam("id") Long id) {
        return "hello wy";
    }
}
