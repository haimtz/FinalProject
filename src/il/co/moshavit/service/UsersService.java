package il.co.moshavit.service;


import il.co.moshavit.model.User;
import il.co.moshavit.modul.Settings;
import il.co.moshavit.repository.UserRepository;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersService {
	
	@POST
	@Path("/add")
	public User getUser() throws Exception
	{	
		
	}
}
