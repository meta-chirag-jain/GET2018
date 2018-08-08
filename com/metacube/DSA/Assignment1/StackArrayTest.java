package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This tests Stack Implementation by array.
 * @author Chirag Jain
 *
 */
public class StackArrayTest
{

    StackArray<Integer> stackArray = new StackArray<Integer>(4); 

    @Test
    public void pushTest()
    {
    	assertTrue(stackArray.pushElement(101));
    	assertTrue(stackArray.pushElement(102));
    	assertTrue(stackArray.pushElement(103));
    	assertTrue(stackArray.pushElement(104));
    	assertFalse(stackArray.pushElement(105));
    	assertFalse(stackArray.pushElement(106));
    }
    
    @Test
    public void popTest()
    {
    	try {
    		stackArray.popElement();
    	}
    	catch (NoSuchElementException error) {
    		assertEquals("Underflow Exception", error.getMessage());
    	}
    	assertTrue(stackArray.pushElement(101));
    	assertTrue(stackArray.pushElement(102));
    	assertTrue(stackArray.pushElement(103));
    	
    	assertEquals((Integer)103, stackArray.popElement());
    	assertEquals((Integer)102, stackArray.popElement());
    	
    }
    
    @Test
    public void topTest()
    {
    	try {
    		stackArray.topElement();
    	}
    	catch (NoSuchElementException error) {
    		assertEquals("Underflow Exception", error.getMessage());
    	}
    	assertTrue(stackArray.pushElement(101));
    	assertTrue(stackArray.pushElement(102));
    	assertTrue(stackArray.pushElement(103));
    	
    	assertEquals((Integer)103, stackArray.topElement());    	
    	assertEquals((Integer)103, stackArray.popElement());
    	
    	assertEquals((Integer)102, stackArray.topElement());
    	
    }
    
    @Test
    public void isEmptyTest()
    {
    	assertTrue(stackArray.isEmpty());

    	assertTrue(stackArray.pushElement(101));
    	
    	assertFalse(stackArray.isEmpty());
    	
    }

}
