package il.co.moshavit.controller;


import il.co.moshavit.model.User;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UsersServer {
	
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public void getUser(User user)
	{
		
	}

}
