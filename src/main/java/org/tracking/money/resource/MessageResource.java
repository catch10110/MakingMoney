package org.tracking.money.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.tracking.money.model.Stock;

@Path("/message")
public class MessageResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public String getMessage(@PathParam("{id}") String messageId) {
		return "";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String createMessage(Stock s) {
		return "";
	}
}
