package GET2018.com.metacube.DSA.Assignment2.Part1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluatePostfixTest {

	
	@Test
	public void evaluatePostfixtest() {		
		double result = EvaluatePostfix.evaluate("12 3 1 * + 9 -");
		assertEquals(6.0, result, 0.01);
	}
	
	@Test
	public void MultipleSpacestest() {		
		double result = EvaluatePostfix.evaluate("   12   3          1 * + 9 -   ");
		assertEquals(6.0, result, 0.01);
	}

	@Test(expected = AssertionError.class)
	public void MoreOperandtest() {
			double result = EvaluatePostfix.evaluate("12 3 1 * + 9");
			assertEquals(6.0, result, 0.01);		
	}
}
