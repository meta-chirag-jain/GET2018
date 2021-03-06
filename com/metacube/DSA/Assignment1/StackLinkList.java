package GET2018.com.metacube.DSA.Assignment1;

import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements various functions of stack using Linked List.
 * Element is added and removed from front of Linked List.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class StackLinkList<E> implements Stack<E>
{

    private LinkList<E> stackList;
    private final int MAX;
    private int top;
    
    public StackLinkList(int MAX)
    {
        this.stackList = new LinkList<E>();
        this.MAX = MAX;
        this.top = -1;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
    public boolean pushElement(E elementToPush)
    {
    	boolean flag = true;
        if (top == MAX - 1) {
            flag = false;
        }
        if(flag) {
        	top++;
            stackList.insertAtFront(new LinkedListNode(elementToPush));
        }
        return flag;
    }

    @Override
    public E popElement()
    {
    	if (top < 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return stackList.removeFromFront();
    }

    @Override
    public E topElement()
    {
    	if (top < 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        return stackList.showFront();
    }

    @Override
    public boolean isEmpty()
    {
    	if(top == -1) {
            return true;
        }
        return false;
    }

}

