package com.strategicgains.restexpress.scaffold.minimal.exception;

import com.strategicgains.restexpress.RestExpress;
import com.strategicgains.restexpress.exception.BadRequestException;
import com.strategicgains.restexpress.scaffold.minimal.config.REExceptionMapper;
import com.strategicgains.syntaxe.ValidationException;

public class ExceptionMapperImpl implements REExceptionMapper{
	public void mapExceptions(RestExpress server)
    {
    	server
	    	.mapException(ValidationException.class, BadRequestException.class);
    }
}
