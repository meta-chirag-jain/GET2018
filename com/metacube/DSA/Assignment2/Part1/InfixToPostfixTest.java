package GET2018.com.metacube.DSA.Assignment2.Part1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This test class checks InfixToPostfix class.
 * @author Chirag Jain
 *
 */
public class InfixToPostfixTest {

	/**
     * test case for converting an infix expression without paranthesis to postfix
     */
    @Test
    public void infixToPostfixWithoutParanthesisTest() {
        
        String postfixExpression = InfixToPostfix.infixToPostfix("a + b * c");
        assertEquals("abc*+", postfixExpression);
    }
    
    
    /**
     * test case for converting an infix expression with paranthesis and multiple spaces to postfix
     */
    @Test
    public void infixToPostfixWithParanthesisTest() {
        
        String postfixExpression = InfixToPostfix.infixToPostfix("( a +    b )   *   c");
        assertEquals("ab+c*", postfixExpression);
    }

    
    /**
     * test case when input is null
     */
    @Test(expected = AssertionError.class)
    public void infixToPostfixNullTest() {
        
        InfixToPostfix.infixToPostfix(null);
    }
    
    /**
     * test case when input is empty string
     */
    @Test(expected = AssertionError.class)
    public void infixToPostfixEmptyStringTest() {
        
        InfixToPostfix.infixToPostfix("     ");
    }
}
