package GET2018.com.metacube.SCF.Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class tests StringOperations class.
 * @author Chirag Jain
 */
public class StringOperationsTest {

	StringOperations string = new StringOperations();
	
	/**
	 * test cases when input is null
	 */
	@Test(expected = AssertionError.class)
    public void testErrors() {
		int answer = string.compareEqual(null, "Hello");
        assertEquals(1, answer);
        
        String result = string.toReverse(null);
        assertEquals("garihC", result);
        
        result = string.largest(null);
        assertEquals("World", result);
        
        result = string.changeCase(null);
        assertEquals("cHIrAG jAIN", result);
             
	}
    
    /**
     * Test case to compare two equal strings
     */
    @Test
    public void compareStringTest1() {
       
        int result = string.compareEqual("Hello", "Hello");
        assertEquals(1, result);
        
        //with special characters
        result = string.compareEqual("He!!o", "He!!o");
        assertEquals(1, result);
    }
    
    
    /**
     * Test case to compare two unequal strings
     */
    @Test
    public void compareStringTest2() {
       
        int result = string.compareEqual("Hello", "hello");
        assertEquals(0, result);
    }
    
    
    /**
     * Test case to reverse a string
     */
    @Test
    public void reverseStringTest() {
       
        String result = string.toReverse("Chirag");
        assertEquals("garihC", result);
        
        //with special character
        result = string.toReverse("Chirag J@in");
        assertEquals("ni@J garihC", result);
        
        //with number
        result = string.toReverse("Chirag J4in");
        assertEquals("ni4J garihC", result);
    }
    
    
    /**
     * Test case to convert uppercase letters to lowercase letters and vice versa in a string
     */
    @Test
    public void convertStringTest() {
       
        String result = string.changeCase("ChiRag Jain");
        assertEquals("cHIrAG jAIN", result);
        
        //special character
        result = string.changeCase("Ch!Rag J@in");
        assertEquals("cH!rAG j@IN", result);
        
        //with number
        result = string.changeCase("Ch!Rag J@1n");
        assertEquals("cH!rAG j@1N", result);
    }
    
    
    /**
     * Test case to find largest word in a string with special case
     */
    @Test
    public void largestWordTest1() {
       
    	//largest with special case.
        String result = string.largest("My name is Ch!r@g Jain");
        assertEquals("Ch!r@g", result);
    }
    
    
    /**
     * Test case to find largest word in a string when two words of equal length
     */
    @Test
    public void largestWordTest2() {
       
        String result = string.largest("Hello World");
        assertEquals("World", result);
    }

}
