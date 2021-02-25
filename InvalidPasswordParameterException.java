package com.wipro.optima.auth.utility;

public class InvalidPasswordParameterException extends RuntimeException
{	    
	public InvalidPasswordParameterException(String error) 
	{
	        super(error);
	}
}
