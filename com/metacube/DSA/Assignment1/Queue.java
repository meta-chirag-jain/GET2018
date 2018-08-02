package GET2018.com.metacube.DSA.Assignment1;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This Interface declares various functions of queue.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public interface Queue<E> {

	/**
	 * Adds element at end of queue
	 * @param elementToEnqueue is given value
	 */
	public void enqueueElement(E elementToEnqueue);

	/**
	 * remove front element from queue
	 * @return dequeued element
	 */
    public E dequeueElement();   
    
    /**
     * Shows front element
     * @return front element of queue
     */
    public E peek();
    
    /**
     * checks is queue is empty
     * @return true if queue is empty else false
     */
    public boolean isEmpty();
    
    /**
     * checks is queue is full
     * @return true if queue is full else false
     */
    public boolean isFull();
	
}
