package stringpack;

/**
 * 
 * @author Chirag Jain
 * This class accepts string input and perform required operations.
 */
public class StringOperations {
	/**
	 * This method reverse given string
	 * @param str is string passed by user
	 * @return string after reversing it
	 */
	String toReverse(String str) {	
		String rev = "";
		for(int i = 0; i < str.length() ; i++) {
		 rev = str.charAt(i) + rev;
		}
		return rev;
	}
	
	/**
	 * This method finds largest word of a string, if two words are of same length then it return last word
	 * @param str is string passed by user
	 * @return last largest string
	 */
	String largest(String str) {
		String largestString = "";
		String checklarge;
		int len = str.length();
		for(int i=0; i < len; i++) {
			checklarge = "";
			if(str.charAt(i) == ' ') {
				for(int temp=i-1; temp>=0 && str.charAt(temp)!=' ';temp--) {
					checklarge = str.charAt(temp) + checklarge;
				}
				if(checklarge.length() >= largestString.length()) {
					largestString = checklarge;
				}
			}
			
			if(i+1 == len) {
				for(int temp=i; temp>=0 && str.charAt(temp)!=' ';temp--) {
					checklarge = str.charAt(temp) + checklarge;
				}
				if(checklarge.length() >= largestString.length()) {
					largestString = checklarge;
				}
			}
	    }
		return largestString;
	}
	 
	/**
	 * This method changes upper case to lower case and vice versa
	 * @param str is string passed by user
	 * @return string by changing case
	 */
	String changeCase(String str) {
		String smallLetters = "abcdefghijklmnopqrstuvwxyz ";
		String bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		int indexSmall, indexBig;
		String changedString = "";
		
		for(int i = 0; i < str.length(); i++) {
			indexSmall  = smallLetters.indexOf(str.charAt(i));
			indexBig = bigLetters.indexOf(str.charAt(i));
			
			if(indexSmall >= 0) {
				changedString += bigLetters.charAt(indexSmall);
			} else if(indexBig >= 0) {
				changedString += smallLetters.charAt(indexBig);
			}
		}
		str = changedString;
		return str;
	}
	
	/**
	 * This method checks if given strings are equal
	 * @param str1 is first string passed by user
	 * @param str2 is second string passed by user
	 * @return 1 if equal strings else 0
	 */
	int compareEqual(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return 0;
		}
		else {
			for(int i =0 ; i<str1.length(); i++) {
				if(str1.charAt(i) != str2.charAt(i)) {
					return 0;
				}
			}
		}
		return 1;
	}
}