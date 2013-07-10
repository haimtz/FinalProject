package il.co.moshavit.server;


import il.co.moshavit.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UsersServer {
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id")int id)
	{
		User user = new User();
		user.setUserName("Haim");
		user.setFamily("user family");
		user.setIdUser(id);
		user.setEmail("email@host.com");
		
		return user;
		
	}

}
