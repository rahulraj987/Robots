package org.rahul.home.Robots.Robot;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rahul.home.Robots.Model.RobotModel;
import org.rahul.home.Robots.Service.RobotService;

@Path("/RobotsList")
public class Robot {

	
	RobotService service = new RobotService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<RobotModel> getRobo(){
		//return "HelloWorld";
		return service.GetRobotDetails();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public int addRobo() {
		
		//add to db
		
		return 202;
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public int editRobo() {
		
		return 201;
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public int deleteRobo() {
		
		return 200;
	}
	
	
}
