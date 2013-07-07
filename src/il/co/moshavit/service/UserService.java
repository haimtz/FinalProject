package il.co.moshavit.service;

import il.co.moshavit.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/user")
public class UserService {

	@GET
	@Path("/{id}")
	public User getUser(@PathParam("{id}") int id)
	{
		User u = new User();
		u.setUserName("name");
		u.setFamily("family");
		u.setPassword("1234");
		u.setIdUser(id);
		
		
		return u;
	}
}
