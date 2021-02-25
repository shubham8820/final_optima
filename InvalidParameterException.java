package com.wipro.optima.auth.utility;

public class InvalidParameterException extends RuntimeException
{	    
	public InvalidParameterException(String error) 
	{
	        super(error);
	}
}