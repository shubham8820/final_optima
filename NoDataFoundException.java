package com.wipro.optima.auth.utility;

public class NoDataFoundException extends RuntimeException {

    public NoDataFoundException(String var) 
    {
        super("No data found at "+var);
    }
}