package GET2018.com.metacube.SCF.Assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class is designed to test MathOperations class.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class MathOperationsTest {

	MathOperations operation = new MathOperations();

	/**
	 * this function tests hcf of two numbers.
	 */
	@Test
	public void testHcf() {
		int hcfResult = operation.hcf(24, 64);
		assertEquals("equals", 8, hcfResult);

		hcfResult = operation.hcf(84, 144);
		assertEquals("equals", 12, hcfResult);

		hcfResult = operation.hcf(120, 0);
		assertEquals("equals", 0, hcfResult);
	}

	/**
	 * this function tests lcm of two numbers.
	 */
	@Test
	public void testLcm() {
		int lcmResult = operation.lcm(12, 30);
		assertEquals("equals", 60, lcmResult);

		lcmResult = operation.lcm(4, 5);
		assertEquals("equals", 20, lcmResult);

		lcmResult = operation.lcm(12, 6);
		assertEquals("equals", 12, lcmResult);
	}

}
