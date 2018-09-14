package GET2018.com.metacube.DSA.Assignment3;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is to create custom exceptions.
 * @author Chirag Jain
 * 
 */
@SuppressWarnings("serial")
public class CustomException extends Exception
{

    private String message;
    
    public CustomException(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }
    
}
