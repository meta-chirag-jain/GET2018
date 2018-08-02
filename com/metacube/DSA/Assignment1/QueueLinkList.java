package GET2018.com.metacube.DSA.Assignment1;

import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements various functions of queue using Linked List.
 * Element is added to last of Linked List and removed from front of Linked List.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class QueueLinkList<E> implements Queue<E> {

	private LinkList<E> queueList;
    private int queueLength;
    private final int MAX;
    
    public QueueLinkList(int MAX) {
    	this.queueList = new LinkList<E>();
        this.queueLength = -1;
        this.MAX = MAX;
	}
	
	@Override
	public void enqueueElement(E elementToEnqueue) {
 
		if (isFull()) {
        	throw new IndexOutOfBoundsException("Overflow Exception");
        }        
		queueList.addToLast(new LinkedListNode(elementToEnqueue));		
		queueLength++;		
	}

	@Override
	public E dequeueElement() {

		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}		
		queueLength-- ;		
		return queueList.removeFromFront();
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return queueList.showFront();
	}

	@Override
	public boolean isEmpty() {
		return queueLength == -1;
	}

	@Override
	public boolean isFull() {
		return queueLength == MAX - 1;
	}

}
