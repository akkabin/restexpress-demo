package com.strategicgains.restexpress.scaffold.minimal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.strategicgains.hyperexpress.domain.LinkableCollection;
import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;


public class SampleControllerImpl implements SampleController
{
	private static final Logger LOG = LoggerFactory.getLogger(SampleControllerImpl.class);
	public SampleControllerImpl()
	{
		super();
	}

	
	public Object create(Request request, Response response)
	{
		//TODO: Your 'create' logic here...
		//Sample order = request.getBodyAs(Sample.class, "Sample details not provided");
		return null;
	}

	public Object read(Request request, Response response)
	{
		//TODO: Your 'read' logic here...
		Map<String, String> queryMap = request.getQueryStringMap();
		String id = request.getHeader("sampleId", "No Sample ID supplied");
		LOG.debug("URL para: " + id);
		LOG.debug("Query map: " + queryMap.toString());
		
		return queryMap;
	}

	public LinkableCollection<Object> readAll(Request request, Response response)
	{
		//TODO: Your 'readAll' logic here...
		System.out.println("Are you readAll of me");
		List<Object> res = new ArrayList<Object>();
		res.add("First");
		res.add("Second");
		res.add(new Date());
		
		
		
		return new LinkableCollection(res);
	}

	public void update(Request request, Response response)
	{
		//TODO: Your 'update' logic here...
		//String id = request.getHeader(Constants.Url.SAMPLE_ID, "No Sample ID supplied");
		response.setResponseNoContent();
	}

	public void delete(Request request, Response response)
	{
		//TODO: Your 'delete' logic here...
		//String id = request.getHeader(Constants.Url.SAMPLE_ID, "No Sample ID supplied");
		response.setResponseNoContent();
	}



	public String readAsString(Request request, Response response) {
		// TODO Auto-generated method stub
		return "I give you string only!!!";
	}
}
