package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This tests Stack Implementation by Linked List.
 * @author Chirag Jain
 *
 */
public class StackLinkListTest {
	
	StackLinkList<Integer> stackList = new StackLinkList<Integer>(4); 
    
	@Test
    public void pushTest()
    {
    	assertTrue(stackList.pushElement(101));
    	assertTrue(stackList.pushElement(102));
    	assertTrue(stackList.pushElement(103));
    	assertTrue(stackList.pushElement(104));
    	assertFalse(stackList.pushElement(105));
    	assertFalse(stackList.pushElement(106));
    }
    
    @Test
    public void popTest()
    {
    	try {
    		stackList.popElement();
    	}
    	catch (NoSuchElementException error) {
    		assertEquals("Underflow Exception", error.getMessage());
    	}
    	assertTrue(stackList.pushElement(101));
    	assertTrue(stackList.pushElement(102));
    	assertTrue(stackList.pushElement(103));
    	
    	assertEquals((Integer)103, stackList.popElement());
    	assertEquals((Integer)102, stackList.popElement());
    	
    }
    
    @Test
    public void topTest()
    {
    	try {
    		stackList.topElement();
    	}
    	catch (NoSuchElementException error) {
    		assertEquals("Underflow Exception", error.getMessage());
    	}
    	assertTrue(stackList.pushElement(101));
    	assertTrue(stackList.pushElement(102));
    	assertTrue(stackList.pushElement(103));
    	
    	assertEquals((Integer)103, stackList.topElement());    	
    	assertEquals((Integer)103, stackList.popElement());
    	
    	assertEquals((Integer)102, stackList.topElement());
    	
    }
    
    @Test
    public void isEmptyTest()
    {
    	assertTrue(stackList.isEmpty());

    	assertTrue(stackList.pushElement(101));
    	
    	assertFalse(stackList.isEmpty());
    	
    }
}
