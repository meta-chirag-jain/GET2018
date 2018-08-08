package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This tests Queue Implementation by Linked List.
 * @author Chirag Jain
 *
 */
public class QueueLinkListTest {

	QueueLinkList<Integer> queueList = new QueueLinkList<Integer>(4); 

	@Test
	public void enqueueTest() {
		
		assertTrue(queueList.enqueueElement(101));
		assertTrue(queueList.enqueueElement(102));
		assertTrue(queueList.enqueueElement(103));
		assertTrue(queueList.enqueueElement(104));
		assertFalse(queueList.enqueueElement(105));
		assertFalse(queueList.enqueueElement(106));
		
	}
	
	@Test
	public void dequeueTest() {
		
		try {
			queueList.dequeueElement();
		}
		catch(NoSuchElementException error) {
			assertEquals("Underflow Exception", error.getMessage());
		}
		
		assertTrue(queueList.enqueueElement(101));
		assertTrue(queueList.enqueueElement(102));
		assertTrue(queueList.enqueueElement(103));
		
		assertEquals((Integer)101, queueList.dequeueElement());
		assertEquals((Integer)102, queueList.dequeueElement());
		
	}
	
	@Test
	public void peekTest() {
		
		try {
			queueList.peek();
		}
		catch(NoSuchElementException error) {
			assertEquals("Underflow Exception", error.getMessage());
		}
		
		assertTrue(queueList.enqueueElement(101));
		assertTrue(queueList.enqueueElement(102));
		assertTrue(queueList.enqueueElement(103));
		
		assertEquals((Integer)101, queueList.peek());		
		assertEquals((Integer)101, queueList.dequeueElement());
		
		assertEquals((Integer)102, queueList.peek());
		
	}

	@Test
	public void isEmptyTest() {

		assertTrue(queueList.isEmpty());
		
		assertTrue(queueList.enqueueElement(101));
		
		assertFalse(queueList.isEmpty());
	}
	
	@Test
	public void isFullTest() {

		assertFalse(queueList.isFull());
		
		assertTrue(queueList.enqueueElement(101));
		assertTrue(queueList.enqueueElement(102));
		assertTrue(queueList.enqueueElement(103));
		assertTrue(queueList.enqueueElement(104));
		
		assertTrue(queueList.isFull());
	}
}
