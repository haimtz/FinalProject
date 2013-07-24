package il.co.moshavit.service;


import il.co.moshavit.model.User;
import il.co.moshavit.modul.Settings;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersService {
	
	@GET
	@Path("/add")
	public void getUser()
	{	
		try{
				String str = Settings.getData("driver");
				System.out.println("OUTPUT: " + str);
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
	}
}
