package GET2018.com.metacube.DSA.Assignment2.Part1;

import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements various functions of queue using circular array.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class QueueCircularArray<E> implements Queue<E> {
	
	private E[] circularArray;
	private int front, rear;
	private final int MAX;
	
	public QueueCircularArray(int MAX) {
		circularArray = (E[])new Object[MAX];
		this.MAX = MAX;
		front = -1;
		rear = -1;
	}

	@Override
	public boolean enqueueElement(E elementToEnqueue) {
		try {
			if(!isFull()) {
				if(front == -1 && rear == -1) {
					front = 0;
					rear = 0;
					circularArray[rear] = elementToEnqueue;
				} else {
					rear = (rear + 1) % MAX;
					circularArray[rear] = elementToEnqueue;
				}
			} else {
				throw new IndexOutOfBoundsException("Queue is full.");
			}
			return true;
		}
			
		catch(IndexOutOfBoundsException error)
        {
            return false;
        } 
		
	}

	@Override
	public E dequeueElement() {
		if(isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		E dequeuedElement;
		if(front == rear) {
			dequeuedElement = circularArray[front];
			front = -1;
			rear = -1;			
		} else {
			dequeuedElement = circularArray[front];
			front = (front + 1) % MAX;
		}
		return dequeuedElement;
	}

	@Override
	public E peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return circularArray[front];
	}

	@Override
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	@Override
	public boolean isFull() {
		return ((rear + 1) % MAX) == front;
	}

}
