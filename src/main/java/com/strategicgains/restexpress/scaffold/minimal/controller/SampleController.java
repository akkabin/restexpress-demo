package com.strategicgains.restexpress.scaffold.minimal.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.strategicgains.hyperexpress.domain.LinkableCollection;
import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;

@Path("/sample")
public interface SampleController
{
		
	@Path("/your/collection/route/here.{format}")
	@POST
	public Object create(Request request, Response response);
	

	@Path("/your/route/here/{sampleId}.{format}")
	@GET
	public Object read(Request request, Response response);
	

	@Path("/your/collection/route/here.{format}")
	@GET
	public LinkableCollection<Object> readAll(Request request, Response response);
	

	@Path("/your/route/here/{sampleId}.{format}")
	@PUT
	public void update(Request request, Response response);
	

	@Path("/your/route/here/{sampleId}.{format}")
	@DELETE
	public void delete(Request request, Response response);
	
	@Path("/your/route/string/abc.{format}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String readAsString(Request request, Response response);
	
}
