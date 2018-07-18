package assignment17july;
/**
 * This class is used to compare two hexadecimal values given
 * @return boolean result of query
 *
 */
public class HexCompare {
	private String hex1, hex2;
	private String digits = "0123456789ABCDEF";
	/**
	 * 
	 * @param hex1 first hexadecimal value
	 * @param hex2 second hexadecimal value
	 * This constructor is used to initialize and remove leading zeros from given values
	 */
	public HexCompare(String hex1, String hex2)
	{
		this.hex1 = hex1.replaceFirst ("^0*", "");
		this.hex2 = hex2.replaceFirst ("^0*", "");
	}
	
	/**
	 * @requires two hexadecimal values from constructor
	 * @return true if value 1 is greater else false
	 */
	boolean isGreater() {
		if(hex1.length() != hex2.length()) {
			return (hex1.length() > hex2.length()) ? true : false;
		}
		else {
			for (int i = 0; i < hex1.length(); i++) {
				if(digits.indexOf(hex1.charAt(i)) > digits.indexOf(hex2.charAt(i)) ) {
					return true;
				}
				else if(digits.indexOf(hex1.charAt(i)) < digits.indexOf(hex2.charAt(i)) ) {
					return false;
				}
			}
		}
		return false;
	}
	
	/**
	 * @requires two hexadecimal values from constructor
	 * @return true if value 1 is smaller else false
	 */
	boolean isSmaller() {
		if(hex1.length() != hex2.length()) {
			return (hex1.length() < hex2.length()) ? true : false;
		}
		else {
			for (int i = 0; i < hex1.length(); i++) {
				if(digits.indexOf(hex1.charAt(i)) < digits.indexOf(hex2.charAt(i)) ) {
					return true;
				}
				else if(digits.indexOf(hex1.charAt(i)) > digits.indexOf(hex2.charAt(i)) ) {
					return false;
				}
			}
		}
		return false;
	}
	
	/**
	 * @requires two hexadecimal values from constructor
	 * @return true if values are equal else false
	 */
	boolean isEqual() {
		return hex1.equals(hex2);
	}	
}
