package il.co.moshavit.service;

import java.util.List;

import il.co.moshavit.model.User;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersService {
	
	@GET
	public List<User>  getUser()
	{
		return null;		
	}
	
	@POST
	public User AddUser(User user)
	{
		return user;
	}
}
