package GET2018.com.metacube.GETProgram;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * This class is created to implement various functions of stack using LinkedList.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class StackLinkList {

	private int max, top;
	LinkedList<Integer> stackList;
	
	StackLinkList(int max) {
		this.max = max;
		this.stackList = new LinkedList<Integer>();
		top = -1;
	}
	
	public void push(int pushedElement) {
		if (top == max - 1) {
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		top++;
		stackList.add(pushedElement);
	}
	
	public int pop() {
		if (top < 0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		top--;
		return stackList.removeLast();
	}
	
	public int top() {
		if (top < 0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return stackList.getLast();
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
