package GET2018.com.metacube.DSA.Assignment4;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class defines custom exception.
 * @author Chirag Jain
 *
 */
@SuppressWarnings("serial")
public class CustomException extends Exception{

	private String message;
	
	/**
	 * sets exception message.
	 * @param message is the message sent.
	 */
	public CustomException(String message) {
		this.message = message;
	}

	/**
	 * return message thrown by exception.
	 */
	public String getMessage() {
		return message;
	}
	
}
