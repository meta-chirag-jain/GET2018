package GET2018.com.metacube.DSA.Assignment3;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements priority queue.
 * @author Chirag Jain
 * 
 * @param <E> is Generic type
 */
public class PriorityQueue<E> implements IPriorityQueue<E> {

	/**
	 * This class creates a job to pass in queue.
	 */
	public static class Job<E> {
		E value;
		int priority;

		public Job(E value, int priority) {
			this.value = value;
			this.priority = priority;
		}

	}

	@SuppressWarnings("rawtypes")
	private Job[] queueArray;
	private int queueLength;
	private final int SIZE;

	public PriorityQueue(int SIZE) {
		this.queueLength = -1;
		this.queueArray = new Job[SIZE];
		this.SIZE = SIZE;
	}

	/**
	 * 
	 * @param value is value in job.
	 * @param priority is priority of job.
	 * @return true if element is enqueued else false.
	 */
	public boolean enqueueElement(E value, int priority) {
		Job<E> elementToEnqueue = new Job<E>(value, priority);
		boolean flag;
		try {
			if (!isFull()) {
				queueArray[++queueLength] = elementToEnqueue;
				flag = true;
			} else {
				throw new IndexOutOfBoundsException("Queue Array is full");
			}
		}
		
		catch(IndexOutOfBoundsException error) {
			flag = false;
		}
		return flag;
	}

	/**
	 * 
	 * @return Job with highest priority after removing it from array.
	 */
	@SuppressWarnings("unchecked")
	public Job<E> dequeueElement() {
		if(isEmpty()) {
			throw new AssertionError("Queue is empty");
		}
		
		Job<E> element =  queueArray[getHighestPriority()];
		for(int i = getHighestPriority(); i < queueLength; i++) {
			queueArray[i] = queueArray[i+1];
		}
		queueArray[queueLength] = null;
		queueLength--;
		return element;
	}

	/**
	 * 
	 * @return Job with highest priority.
	 */
	@SuppressWarnings("unchecked")
	public Job<E> peek() {
		if(isEmpty()) {
			throw new AssertionError("Queue is empty");
		}
		return queueArray[getHighestPriority()];
	}

	/**
	 * 
	 * @return true if queue is empty else false.
	 */
	public boolean isEmpty() {
		if (queueLength == -1) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return true if queue is full else false.
	 */
	public boolean isFull() {
		if (queueLength == SIZE-1) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return index of element with highest priority.
	 */
	private int getHighestPriority() {

		int maxPriority = queueArray[0].priority;
		int indexOfHighestPriority = 0;
		
		for (int i = 0; i < queueLength+1; i++) {
			if (queueArray[i].priority > maxPriority) {
				indexOfHighestPriority = i;
				maxPriority = queueArray[i].priority;
			}
		}
		return indexOfHighestPriority;

	}

	

}
