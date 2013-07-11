package il.co.moshavit.server;

import il.co.moshavit.model.CarPull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/msg")
public class MessageServer {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public CarPull getCarPull()
	{
		CarPull cp = new CarPull();
		cp.setIdUser(3);
		cp.setForm("From KF");
		cp.setDestination("Dest");
		
		return cp;
	}

}
