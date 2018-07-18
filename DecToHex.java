package assignment17july;
/***
* This method converts Decimal to Hexadecimal
* 
* @param dec is decimal value
*            
* @return Hexadecimal number
*/
public class DecToHex {
		
	public String convertDecToHex(int dec) {
	String hex = "";
	String digits = "0123456789ABCDEF";
	int rem;
	while (dec > 0) {
		rem = dec % 16;
		hex = digits.charAt(rem) + hex;
		dec = dec / 16;
		}
	return hex;
	}
}
