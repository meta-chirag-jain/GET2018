package GET2018.com.metacube.DSA.Assignment3;

import static org.junit.Assert.*;

import GET2018.com.metacube.DSA.Assignment3.PriorityQueue.Job;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class tests priority queue class.
 * @author Chirag Jain
 * 
 */
public class PriorityQueueTest {

	
	
	PriorityQueue<Integer> priorityDeEnqueue = new PriorityQueue<Integer>(5);
	
	@Test
	public void enqueueTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);
		
		assertTrue(priorityQueue.enqueueElement(15,5));
		assertTrue(priorityQueue.enqueueElement(13,3));
		assertTrue(priorityQueue.enqueueElement(14,4));
		assertTrue(priorityQueue.enqueueElement(11,1));
		assertTrue(priorityQueue.enqueueElement(12,2));
		assertFalse(priorityQueue.enqueueElement(17,7));
	}

	@Test
	public void dequeueTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);

		assertTrue(priorityQueue.enqueueElement(13,3));
		assertTrue(priorityQueue.enqueueElement(14,4));
		assertTrue(priorityQueue.enqueueElement(11,1));
		assertTrue(priorityQueue.enqueueElement(10,1));
		assertTrue(priorityQueue.enqueueElement(23,3));
		
		Job<Integer> dequeuedJob = priorityQueue.dequeueElement();		
		assertEquals((Integer)14, dequeuedJob.value);
		
		dequeuedJob = priorityQueue.dequeueElement();
		assertEquals((Integer)13, dequeuedJob.value);
		
	}
	
	@Test(expected = AssertionError.class)
	public void dequeueEmptyTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);

		Job<Integer> nextJob = priorityQueue.dequeueElement();
		
		assertEquals((Integer)14, nextJob.value);
		
	}
	
	@Test
	public void peekTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);

		assertTrue(priorityQueue.enqueueElement(13,3));
		assertTrue(priorityQueue.enqueueElement(14,4));
		assertTrue(priorityQueue.enqueueElement(11,1));
		assertTrue(priorityQueue.enqueueElement(10,1));
		assertTrue(priorityQueue.enqueueElement(23,3));
		
		Job<Integer> nextJob = priorityQueue.peek();		
		assertEquals((Integer)14, nextJob.value);
		
	}
	
	@Test(expected = AssertionError.class)
	public void peekEmptyTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);

		Job<Integer> nextJob = priorityQueue.peek();
		
		assertEquals((Integer)14, nextJob.value);
		
	}
	
	@Test
	public void isFullTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);

		assertTrue(priorityQueue.enqueueElement(13,3));
		assertTrue(priorityQueue.enqueueElement(14,4));
		assertTrue(priorityQueue.enqueueElement(11,1));
		
		assertFalse(priorityQueue.isFull());	
		
		assertTrue(priorityQueue.enqueueElement(10,1));
		assertTrue(priorityQueue.enqueueElement(23,3));
		
		assertTrue(priorityQueue.isFull());		
	}
	
	@Test
	public void isEmptyTest() {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(5);

		assertTrue(priorityQueue.isEmpty());
		
		assertTrue(priorityQueue.enqueueElement(13,3));
		assertTrue(priorityQueue.enqueueElement(14,4));
		assertTrue(priorityQueue.enqueueElement(11,1));
		
		assertFalse(priorityQueue.isEmpty());	
	}
}
