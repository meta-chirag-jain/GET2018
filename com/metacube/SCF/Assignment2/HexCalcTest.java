package GET2018.com.metacube.SCF.Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a test class for HexCalc class.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class HexCalcTest {

	HexCalc operation = new HexCalc();
	String answer;
	int result;
	
	@Test
	public void convertTest() {
		answer = operation.convertDecToHex(10);
		assertEquals("A", answer);
		
		answer = operation.convertDecToHex(289);
		assertEquals("121", answer);
		
		result = operation.convertHexToDec("121");
		assertEquals(289, result);
		
		result = operation.convertHexToDec("A");
		assertEquals(10, result);

	}
	
	@Test
	public void computeTest() {
		answer = operation.addHex("A", "5");
		assertEquals("F", answer);
		
		answer = operation.subHex("a12b4", "2b87c4");
		assertEquals("-217510", answer);
		
		answer = operation.subHex("2b87c4", "a12b4");
		assertEquals("217510", answer);
		
		answer = operation.mulHex("A", "5");
		assertEquals("32", answer);
		
		answer = operation.divHex("A", "5");
		assertEquals("2", answer);
	}
	
	@Test(expected = AssertionError.class)
    public void divideByZeroTest() {        
        answer = operation.divHex("2b87c4", "0");
    }
	
	@Test(expected = AssertionError.class)
    public void nullStringTest() {        
		result = operation.convertHexToDec(" ");
		assertEquals(" ", result);
    }
	
    @Test
    public void testIsEqual() {
        
        boolean result = operation.isEqual("00a12b4", "a12b4");
        assertTrue(result);
        
        result = operation.isEqual("2b87c4", "a12b4");
        assertFalse(result);
    }
    
    @Test
    public void testIsGreaterThan() {
        
        boolean result = operation.isGreater("2b87c4", "a12b4");
        assertTrue(result);
        
        result = operation.isGreater("a12b4", "2b87c4");
        assertFalse(result);
    }
    
    @Test
    public void testIsLessThan() {
        
        boolean result = operation.isSmaller("2b87c4", "a12b4");
        assertFalse(result);
        
        result = operation.isSmaller("a12b4", "2b87c4");
        assertTrue(result);
    }

}
