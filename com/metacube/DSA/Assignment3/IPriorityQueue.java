package GET2018.com.metacube.DSA.Assignment3;

import GET2018.com.metacube.DSA.Assignment3.PriorityQueue.Job;

public interface IPriorityQueue<E> {
	
	/**
	 * 
	 * @param value is value in job.
	 * @param priority is priority of job.
	 * @return true if element is enqueued else false.
	 */
	public boolean enqueueElement(E value, int priority);
		

	/**
	 * 
	 * @return Job with highest priority after removing it from array.
	 */
	public Job<E> dequeueElement();

	/**
	 * 
	 * @return Job with highest priority.
	 */
	public Job<E> peek();

	/**
	 * 
	 * @return true if queue is empty else false.
	 */
	public boolean isEmpty();

	/**
	 * 
	 * @return true if queue is full else false.
	 */
	public boolean isFull();

}
