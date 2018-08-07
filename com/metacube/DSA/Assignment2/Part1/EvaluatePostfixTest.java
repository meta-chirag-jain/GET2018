package GET2018.com.metacube.DSA.Assignment2.Part1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class test EvaluatesPostfix class.
 * @author Chirag Jain
 *
 */
public class EvaluatePostfixTest {

	/**
	 * checks result after evaluation
	 */
	@Test
	public void evaluatePostfixTest() {		
		double result = EvaluatePostfix.evaluate("12 3 1 * + 9 -");
		assertEquals(6.0, result, 0.01);
	}
	
	/**
	 * checks result when multiple spaces are passed in between and either ends.
	 */
	@Test
	public void MultipleSpacesTest() {		
		double result = EvaluatePostfix.evaluate("   12   3          1 * + 9 -   ");
		assertEquals(6.0, result, 0.01);
	}

	/**
	 * checks when more operands are passed.
	 */
	@Test(expected = AssertionError.class)
	public void MoreOperandTest() {
			double result = EvaluatePostfix.evaluate("12 3 1 * + 9");
			assertEquals(6.0, result, 0.01);		
	}
	
	/**
	 * checks when more operators are passed.
	 */
	@Test(expected = AssertionError.class)
	public void MoreOperatorTest() {
			double result = EvaluatePostfix.evaluate("12 3 1 * + 9 - /");
			assertEquals(6.0, result, 0.01);		
	}
	
	/**
	 * checks when more operands are passed.
	 */
	@Test(expected = AssertionError.class)
	public void NullExpressionTest() {
			double result = EvaluatePostfix.evaluate(null);
			assertEquals(6.0, result, 0.01);		
	}
	
	/**
	 * checks when more operands are passed.
	 */
	@Test(expected = AssertionError.class)
	public void EmptyExpressionTest() {
			double result = EvaluatePostfix.evaluate("          ");
			assertEquals(6.0, result, 0.01);		
	}
	
	/**
	 * checks when more operands are passed.
	 */
	@Test(expected = AssertionError.class)
	public void WrongOperatorPassedTest() {
			double result = EvaluatePostfix.evaluate("12 3 1 # + 9");
			assertEquals(6.0, result, 0.01);		
	}
}
