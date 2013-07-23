package il.co.moshavit.controller;


import il.co.moshavit.model.User;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersServer {
	
	@GET
	@Path("/add")
	public void getUser()
	{
		User user = new User();
		
		user.setIdentityCard("324324");
		user.setFirstName("AAA");
		user.setLastName("BBBB");
		user.setEmail("mail@mail.com");
		user.setPhone("0988888");
		
		try{
			user.inserToDataBase();
		}
		catch(Exception ex)
		{
			user = null;
			System.out.println("ERROR!!!! \n"+ ex.getMessage() + "\n" );
		}
	}

}
