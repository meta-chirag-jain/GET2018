package GET2018.com.metacube.SCF.Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This is a test class for HexCalc class.
 * @author Chirag Jain
 */
public class HexCalcTest {

	HexCalc operation = new HexCalc();
	String answer;
	int result;
	
	//convert
	@Test
	public void convertTest() {
		answer = operation.convertDecToHex(10);
		assertEquals("A", answer);
		
		answer = operation.convertDecToHex(289);
		assertEquals("121", answer);
		
		//decimal value 0
		answer = operation.convertDecToHex(0);
		assertEquals("0", answer);
		
		result = operation.convertHexToDec("121");
		assertEquals(289, result);
		
		result = operation.convertHexToDec("A");
		assertEquals(10, result);

	}
	
	//compute
	@Test
	public void computeTest() {
		answer = operation.addHexadecimal("A", "5");
		assertEquals("F", answer);
		
		//negative subtraction result test
		answer = operation.subtractHexadecimal("a12b4", "2b87c4");
		assertEquals("-217510", answer);
		
		answer = operation.subtractHexadecimal("2b87c4", "a12b4");
		assertEquals("217510", answer);
		
		answer = operation.multiplyHexadecimal("A", "5");
		assertEquals("32", answer);
		
		answer = operation.divideHexadecimal("A", "5");
		assertEquals("2", answer);
	}
	
	@Test(expected = AssertionError.class)
    public void divideByZeroTest() {        
        answer = operation.divideHexadecimal("2b87c4", "0");
    }
	
	@Test(expected = AssertionError.class)
    public void emptyStringTest() {        
		result = operation.convertHexToDec(" ");
		assertEquals(" ", result);
    }
	
	@Test(expected = AssertionError.class)
    public void nullStringTest() {        
		result = operation.convertHexToDec(null);
		assertEquals(" ", result);
    }
	
	//compare equal
    @Test
    public void testIsEqual() {
        
        boolean result = operation.isEqual("00a12b4", "a12b4");
        assertTrue(result);
        
        result = operation.isEqual("2b87c4", "a12b4");
        assertFalse(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isEqualNullTest1() {
        
        boolean result = operation.isEqual(null, "a12b4");
        assertTrue(result);
        
        result = operation.isEqual("2b87c4", "a12b4");
        assertFalse(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isEqualNullTest2() {
        
        boolean result = operation.isEqual("a12b4", null);
        assertTrue(result);
        
        result = operation.isEqual("2b87c4", "a12b4");
        assertFalse(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isEqualNullTest3() {
        
        boolean result = operation.isEqual(null, null);
        assertTrue(result);
        
        result = operation.isEqual("2b87c4", "a12b4");
        assertFalse(result);
    }
    
    //compare greater than
    @Test
    public void testIsGreaterThan() {
        
        boolean result = operation.isGreater("2b87c4", "a12b4");
        assertTrue(result);
        
        result = operation.isGreater("a12b4", "2b87c4");
        assertFalse(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isGreaterThanTestNull1() {
        
        boolean result = operation.isGreater(null, "a12b4");
        assertTrue(result);
        
        result = operation.isGreater("a12b4", "2b87c4");
        assertFalse(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isGreaterThanTestNull2() {
        
        boolean result = operation.isGreater("2b87c4", null);
        assertTrue(result);
        
        result = operation.isGreater("a12b4", "2b87c4");
        assertFalse(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isGreaterThanTestNull3() {
        
        boolean result = operation.isGreater(null, null);
        assertTrue(result);
        
        result = operation.isGreater("a12b4", "2b87c4");
        assertFalse(result);
    }
    
    //compare less than
    @Test
    public void testIsLessThan() {
        
        boolean result = operation.isSmaller("2b87c4", "a12b4");
        assertFalse(result);
        
        result = operation.isSmaller("a12b4", "2b87c4");
        assertTrue(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isLessThanNullTest1() {
        
        boolean result = operation.isSmaller(null, "a12b4");
        assertFalse(result);
        
        result = operation.isSmaller("a12b4", "2b87c4");
        assertTrue(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isLessThanNullTest2() {
        
        boolean result = operation.isSmaller("2b87c4", null);
        assertFalse(result);
        
        result = operation.isSmaller("a12b4", "2b87c4");
        assertTrue(result);
    }
    
    @Test(expected = AssertionError.class)
    public void isLessThanNullTest3() {
        
        boolean result = operation.isSmaller(null, null);
        assertFalse(result);
        
        result = operation.isSmaller("a12b4", "2b87c4");
        assertTrue(result);
    }
    
    

}
