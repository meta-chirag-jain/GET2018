package GET2018.com.metacube.DSA.Assignment5;

@SuppressWarnings("serial")
public class CustomException extends Exception{
	
	private String message;

	public String getMessage() {
		return message;
	}
	
	public CustomException(String message) {
		this.message = message;
	}

}
