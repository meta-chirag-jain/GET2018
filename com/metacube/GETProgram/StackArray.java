package GET2018.com.metacube.GETProgram;

import java.util.NoSuchElementException;

/**
 * This class is created to implement various functions of stack using array.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class StackArray {

	private int max, top;
	private int[] array;
	
	StackArray(int max) {
		this.max = max;
		this.array = new int[max];
		this.top = -1;
	}
	
	public void push(int pushedElement) {
		if (top == max - 1) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		top++;
		array[top] = pushedElement;
	}
	
	public int pop() {
		if (top < 0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return array[top--];
	}
	
	public int top() {
		if (top < 0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return array[top];
	}
	
	public String isEmpty() {
		if (top < 0) {
			return "Empty";
		}
		else {
			return "Not Empty";
		}
	}
	
}
