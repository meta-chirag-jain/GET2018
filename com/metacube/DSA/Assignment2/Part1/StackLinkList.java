package GET2018.com.metacube.DSA.Assignment2.Part1;

import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements various functions of stack using Linked List.
 * Element is added and removed from front of Linked List.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class StackLinkList<E>
{

    private LinkList<E> stackList;
    //private final int MAX;
    private int top;
    
    public StackLinkList()
    {
        this.stackList = new LinkList<E>();
        //this.MAX = MAX;
        this.top = -1;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void pushElement(E elementToPush)
    {
        /*if (top == MAX - 1) {
            throw new IndexOutOfBoundsException("Overflow Exception");
        }*/
        top++;
        stackList.insertAtFront(new LinkedListNode(elementToPush));
    }

    public E popElement()
    {
    	if (top < 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
    	top--;
        return stackList.removeFromFront();
    }

    public E topElement()
    {
        return stackList.showFront();
    }

    public boolean isEmpty()
    {
    	if(top == -1) {
            return true;
        }
        return false;
    }

}

