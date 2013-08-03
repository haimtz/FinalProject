package il.co.moshavit.service;


import il.co.moshavit.model.User;
import il.co.moshavit.repository.UserRepository;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.client.ClientResponse.Status;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersService {
	
	@GET
	public User getUser()
	{
		User user = new User();
		
		user.setPrivatetName("user 1");
		user.setLastName("family 1");
		user.setIdentityCard("12345");
		user.setPassword("1234");
		
		return user;
	}
	
	@POST
	@Path("/add")
	public Response getUser(User user)
	{
		try{
			UserRepository addUser = new UserRepository();
			addUser.insertToData(user);
			
			return Response.ok(user).status(200).build();
		}
		catch(Exception ex)
		{
			return Response.status(Status.UNAUTHORIZED).entity(ex.getMessage()).build();
		}
	}
	
	@POST
	@Path("/login/{identity}/{pass}")
	public User login(@PathParam("identity")String identity, @PathParam("pass")String pass) throws Exception
	{
		UserRepository user = new UserRepository();
		
		return user.getUser(identity, pass);
	}
}
