package assignment17july;

public class HexToDec {

	// private String hex;

	/*
	 * public HexToDec(String hex) { this.hex = hex; }
	 */
	/**
	 * This method converts Hexadecimal to Decimal
	 * 
	 * @param hex
	 *            is hexadecimal value
	 * @return decimal number
	 */
	public int convertHexToDec(String hex) {
		int dec = 0;
		String digits = "0123456789ABCDEF";
		int val;
		hex = hex.toUpperCase();

		for (int i = 0; i < hex.length(); i++) {
			val = digits.indexOf(hex.charAt(i));
			dec = (16 * dec) + val;
		}

		return dec;
	}
}
