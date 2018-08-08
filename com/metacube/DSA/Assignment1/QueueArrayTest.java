package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This tests Queue Implementation by array.
 * @author Chirag Jain
 *
 */
public class QueueArrayTest {

	QueueArray<Integer> intQueueArray = new QueueArray<Integer>(4); 

	@Test
	public void enqueueTest() {
		
		assertTrue(intQueueArray.enqueueElement(101));
		assertTrue(intQueueArray.enqueueElement(102));
		assertTrue(intQueueArray.enqueueElement(103));
		assertTrue(intQueueArray.enqueueElement(104));
		assertFalse(intQueueArray.enqueueElement(105));
		assertFalse(intQueueArray.enqueueElement(106));
		
	}
	
	@Test
	public void dequeueTest() {
		
		try {
			intQueueArray.dequeueElement();
		}
		catch(NoSuchElementException error) {
			assertEquals("Underflow Exception", error.getMessage());
		}
		
		assertTrue(intQueueArray.enqueueElement(101));
		assertTrue(intQueueArray.enqueueElement(102));
		assertTrue(intQueueArray.enqueueElement(103));
		
		assertEquals((Integer)101, intQueueArray.dequeueElement());
		assertEquals((Integer)102, intQueueArray.dequeueElement());
		
	}
	
	@Test
	public void peekTest() {
		
		try {
			intQueueArray.peek();
		}
		catch(NoSuchElementException error) {
			assertEquals("Underflow Exception", error.getMessage());
		}
		
		assertTrue(intQueueArray.enqueueElement(101));
		assertTrue(intQueueArray.enqueueElement(102));
		assertTrue(intQueueArray.enqueueElement(103));
		
		assertEquals((Integer)101, intQueueArray.peek());		
		assertEquals((Integer)101, intQueueArray.dequeueElement());
		
		assertEquals((Integer)102, intQueueArray.peek());
		
	}

	@Test
	public void isEmptyTest() {

		assertTrue(intQueueArray.isEmpty());
		
		assertTrue(intQueueArray.enqueueElement(101));
		
		assertFalse(intQueueArray.isEmpty());
	}
	
	@Test
	public void isFullTest() {

		assertFalse(intQueueArray.isFull());
		
		assertTrue(intQueueArray.enqueueElement(101));
		assertTrue(intQueueArray.enqueueElement(102));
		assertTrue(intQueueArray.enqueueElement(103));
		assertTrue(intQueueArray.enqueueElement(104));
		
		assertTrue(intQueueArray.isFull());
	}
}
