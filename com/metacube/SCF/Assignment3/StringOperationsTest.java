package GET2018.com.metacube.SCF.Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOperationsTest {

	StringOperations string = new StringOperations();
    
    /**
     * Test case to compare two equal strings
     */
    @Test
    public void compareStringTest1() {
       
        int result = string.compareEqual("Hello", "Hello");
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
    }
    
    
    /**
     * Test case to convert uppercase letters to lowercase letters and vice versa in a string
     */
    @Test
    public void convertStringTest() {
       
        String result = string.changeCase("ChiRag Jain");
        assertEquals("cHIrAG jAIN", result);
    }
    
    
    /**
     * Test case to find largest word in a string
     */
    @Test
    public void largestWordTest1() {
       
        String result = string.largest("My name is Prakalpa Rathore");
        assertEquals("Prakalpa", result);
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
