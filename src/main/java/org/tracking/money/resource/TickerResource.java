package org.tracking.money.resource;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.ClientProtocolException;
import org.tracking.money.model.Stock;
import org.tracking.money.service.TickerService;

@Path("/ticker")
public class TickerResource {

	TickerService tickerService = new TickerService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{name}")
	public Stock getTickerInfo(@PathParam("name") String tickerName) throws ClientProtocolException, IOException {
		return tickerService.getTickerInfo(tickerName);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllAds() {
		return "dfdsfds";
	}
	
	
	
}
