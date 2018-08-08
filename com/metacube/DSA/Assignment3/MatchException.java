package GET2018.com.metacube.DSA.Assignment3;

/**
 * Exception typing of Match Class
 * @author Chirag Jain
 * 
 */
@SuppressWarnings("serial")
public class MatchException extends Exception {
	String exception;
	
	public MatchException(String exception) {
		this.exception = exception;
	}
	
	public String getMessage() {
		return exception;
	} 
}
