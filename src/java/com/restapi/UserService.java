package com.restapi;

import com.restapi.bd.UserBd;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUser() throws Exception {
        System.out.println("inside UserService class");
        UserBd userbd = new UserBd();

        return userbd.getUserDetails();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public User addUser(User user) throws Exception {
        System.out.println("inside addUser method of UserService class and "
                + "user info: " + user.toString());
        UserBd userbd = new UserBd();
        userbd.addUser(user);

        return user;
    }

}
