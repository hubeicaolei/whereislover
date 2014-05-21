package com.cao.whereislover.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.cao.whereislover.domain.Lover;

@Path("/")
public class LoverPosition {
	
	@GET
	@Path("/lover/{sessionID}")
	public Lover calculateLoverPosition(@PathParam(value="sessionID") String sessionID)
	{
		System.out.println("session is " + sessionID);
		return new Lover(sessionID);
	}
	
	@GET
	@Path("/")
	public String hello()
	{
		return "hello rest";
	}

}
