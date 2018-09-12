package GET2018.com.metacube.DSA.Assignment1;

import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements various functions of queue using array.
 * Element is added at the back of array and removed from front of array.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class QueueArray<E> implements Queue<E> {

	private E[] queueArray;
    private int front, rear, queueLength;
    private final int MAX;
    
    @SuppressWarnings("unchecked")
	public QueueArray(int MAX)
    {
        this.queueArray = (E[])new Object[MAX];
        this.queueLength = 0;
        this.MAX = MAX;
        this.front = -1;
        this.rear = -1;
    }
    
	@Override
	public boolean enqueueElement(E elementToEnqueue) {

		boolean flag = false;
		if (rear == -1) {
            front = 0;
            rear = 0;
            queueArray[rear] = elementToEnqueue;
            flag = true;
        } else if ( rear + 1 < MAX) {
        	queueArray[++rear] = elementToEnqueue;    
        	flag = true;
        }
		if(flag) {
			queueLength++;
		}		
		return flag;
	}

	@Override
	public E dequeueElement() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		
		queueLength-- ;
		
	    E dequeuedElement = queueArray[front];
	    if ( front == rear) {
	    	front = -1;
	        rear = -1;
	    }
	    else {
	       	front++;
	    }                
	    return dequeuedElement;	            
	}

	@Override
	public E peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}	           
	    return queueArray[front];
	}

	@Override
	public boolean isEmpty() {
		return front == -1;
	}

	@Override
	public boolean isFull() {
		return front==0 && rear == queueLength -1;
	}

}
