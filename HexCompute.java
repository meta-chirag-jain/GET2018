package assignment17july;

/**
 * This class takes user given values and use called functions to compute result
 * 
 * @param hex1 is first hexadecimal value
 * @param hex2 is second hexadecimal value
 */

public class HexCompute {
	private int answer;
	private String result;
	int val1, val2;

	public HexCompute(String hex1, String hex2) {
		this.val1 = new HexToDec().convertHexToDec(hex1);
		this.val2 = new HexToDec().convertHexToDec(hex2);
	}

	public String add() {
		answer = val1 + val2;
		result = new DecToHex().convertDecToHex(answer);
		return result;
	}

	public String sub() {
		answer = val1 - val2;
		result = new DecToHex().convertDecToHex(answer);
		return result;
	}

	public String mul() {
		answer = val1 * val2;
		result = new DecToHex().convertDecToHex(answer);
		return result;
	}

	public String div() {
		answer = val1 / val2;
		result = new DecToHex().convertDecToHex(answer);
		return result;
	}
}
