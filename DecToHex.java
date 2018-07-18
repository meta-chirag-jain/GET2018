package assignment17july;

public class DecToHex {
	/*
	 * private int dec;
	 * 
	 * public DecToHex(int dec) { this.dec = dec; }
	 */
	/***
	 * This method converts Decimal to Hexadecimal
	 * 
	 * @param dec
	 *            is decimal value
	 *            
	 * @return Hexadecimal number
	 */
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
