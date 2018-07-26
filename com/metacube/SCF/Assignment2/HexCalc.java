package GET2018.com.metacube.SCF.Assignment2;

/**
 * This class is a calculator for performing operations on HexaDecimal Values.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class HexCalc {
	
	private String digits  = "0123456789ABCDEF";

	/**
	 * A utility function to check if errors in input.
	 * @param job is array of arrival time and burst time of process.
	 * @param size is number of process.
	 */
	void checkError(int[][] job, int size) {
		if(size == 0) {
			throw new AssertionError("No jobs to show result");
		}
		for(int i=0; i<size; i++) {
			if(job[i][0] < 0 || job[i][1] < 0) {
					throw new AssertionError("Negative value found.");
			}		
		}
	}
	
	/**
	 * This function converts hexadecimal value to decimal value.
	 * @param hexValue is given hexadecimal value.
	 * @return decimal value of given hexadecimal value.
	 */
	int convertHexToDec(String hexValue) {
		if(hexValue == null || hexValue == " ") {
			throw new AssertionError("Empty String.");
		}
		int decValue = 0;
		int index;
		hexValue = hexValue.toUpperCase();

		for (int i = 0; i < hexValue.length(); i++) {
			index = digits.indexOf(hexValue.charAt(i));
			decValue = (16 * decValue) + index;
		}
		return decValue;
	}
	
	/**
	 * This function converts decimal value to hexadecimal value.
	 * @param decValue is given decimal value.
	 * @return Hexadecimal value of given decimal value.
	 */
	String convertDecToHex(int decValue) {
		String hexValue = "";
		int remainder;

		while (decValue > 0) {
			remainder = decValue % 16;
			hexValue = digits.charAt(remainder) + hexValue;
			decValue = decValue / 16;
		}
		return hexValue;
	}
	
	/**
	 * @requires two hexadecimal values from constructor
	 * @return hexadecimal value after addition
	 */
	String addHex(String hexValue1, String hexValue2) {
		int decValue1 = convertHexToDec(hexValue1);
		int decValue2 = convertHexToDec(hexValue2);
		int answer = decValue1 + decValue2;
		String result = convertDecToHex(answer);
		return result;
	}

	/**
	 * @requires two hexadecimal values from constructor
	 * @return hexadecimal value after subtraction
	 */
	String subHex(String hexValue1, String hexValue2) {
		int decValue1 = convertHexToDec(hexValue1);
		int decValue2 = convertHexToDec(hexValue2);
		int answer = decValue1 - decValue2;
		String result;
		if(answer < 0) {
			answer = Math.abs(answer);
			result = "-" + convertDecToHex(answer);
			return result;
		}
		result = convertDecToHex(answer);
		return result;
	}

	/**
	 * @requires two hexadecimal values from constructor
	 * @return hexadecimal value after multiplication
	 */
	String mulHex(String hexValue1, String hexValue2) {
		int decValue1 = convertHexToDec(hexValue1);
		int decValue2 = convertHexToDec(hexValue2);
		int answer = decValue1 * decValue2;
		String result = convertDecToHex(answer);
		return result;
	}

	/**
	 * @requires two hexadecimal values from constructor
	 * @return hexadecimal value after division
	 */
	String divHex(String hexValue1, String hexValue2) {
		int decValue1 = convertHexToDec(hexValue1);
		int decValue2 = convertHexToDec(hexValue2);
		if(decValue2 == 0) {
			throw new AssertionError("Cant divide by zero");
		}
		int answer = decValue1 / decValue2;
		String result = convertDecToHex(answer);
		return result;
	}
	
	/**
	 * @requires two hexadecimal values from constructor
	 * @return true if value 1 is greater else false
	 */
	boolean isGreater(String hexValue1, String hexValue2) {
		hexValue1 = hexValue1.replaceFirst ("^0*", "");
		hexValue2 = hexValue2.replaceFirst ("^0*", "");
		if(hexValue1.length() != hexValue2.length()) {
			return (hexValue1.length() > hexValue2.length()) ? true : false;
		}
		else {
			for (int i = 0; i < hexValue1.length(); i++) {
				if(digits.indexOf(hexValue1.charAt(i)) > digits.indexOf(hexValue2.charAt(i)) ) {
					return true;
				}
				else if(digits.indexOf(hexValue1.charAt(i)) < digits.indexOf(hexValue2.charAt(i)) ) {
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
	boolean isSmaller(String hexValue1, String hexValue2) {
		hexValue1 = hexValue1.replaceFirst ("^0*", "");
		hexValue2 = hexValue2.replaceFirst ("^0*", "");
		if(hexValue1.length() != hexValue2.length()) {
			return (hexValue1.length() < hexValue2.length()) ? true : false;
		}
		else {
			for (int i = 0; i < hexValue1.length(); i++) {
				if(digits.indexOf(hexValue1.charAt(i)) < digits.indexOf(hexValue2.charAt(i)) ) {
					return true;
				}
				else if(digits.indexOf(hexValue1.charAt(i)) > digits.indexOf(hexValue2.charAt(i)) ) {
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
	boolean isEqual(String hexValue1, String hexValue2) {
		hexValue1 = hexValue1.replaceFirst ("^0*", "");
		hexValue2 = hexValue2.replaceFirst ("^0*", "");
		return hexValue1.equals(hexValue2);
	}
}
