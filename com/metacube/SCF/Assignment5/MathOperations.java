package GET2018.com.metacube.SCF.Assignment5;

/**
 * This class is designed to find LCM and HCF of two numbers
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class MathOperations {

	int multiple = 1;
	
	/**
	 * This method gives HCF of given numbers.
	 * @param a is first number.
	 * @param b is second number.
	 * @return HCF of given numbers.
	 */
	int hcf(int a, int b) {
		int result;
		if (a < b) {
			result = hcf(b, a);
		}
		if (b == 0 || a == 0) {
			return 0;
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
	int lcm(int a, int b) {
		int hcfValue = hcf(a, b);
		int result = (a * b) / hcfValue;		
		return result;
	}
}