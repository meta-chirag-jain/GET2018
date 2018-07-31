package GET2018.com.metacube.SCF.Assignment5;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is designed to find LCM and HCF of two numbers
 * @author Chirag Jain
 * 
 */
public class MathOperations {
	
	/**
	 * This method gives HCF of given numbers.
	 * @param a is first number.
	 * @param b is second number.
	 * @return HCF of given numbers.
	 */
	public int hcf(int a, int b) {
		int result;
		if (a < b) {
			result = hcf(b, a);
		}
		if (b == 0 || a == 0) {
			return 0;
		}
		if (b < 0 || a < 0) {
			throw new AssertionError("negative value");
		}
		
		if (a % b == 0) {
			result = b;
		} else {
			result = hcf(b, a % b);
		}
		return result;
	}

	/**
	 * This method gives LCM of given numbers.
	 * @param a is first number.
	 * @param b is second number.
	 * @return LCM of given numbers.
	 */
	public int lcm(int a, int b) {
		if(a == 0 || b == 0) {
			return 0;
		}
		if (b < 0 || a < 0) {
			throw new AssertionError("negative value");
		}
		int hcfValue = hcf(a, b);
		int result = (a * b) / hcfValue;		
		return result;
	}
}