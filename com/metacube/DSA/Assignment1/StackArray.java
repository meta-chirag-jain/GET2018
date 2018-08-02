package GET2018.com.metacube.DSA.Assignment1;

import java.util.NoSuchElementException;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class implements various functions of stack using array.
 * Element is added and removed from same side of array.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class StackArray<E> implements Stack<E>
{

    private E[] stackArray;
    private int top;
    
    public StackArray(int MAX)
    {
        //@SuppressWarnings("unchecked")
        this.stackArray = (E[])new Object[MAX];
        this.top = -1;
    }
    
    @Override
    public void pushElement(E elementToPush)
    {
        if (top == stackArray.length - 1) {
            throw new IndexOutOfBoundsException("Overflow Exception");
        }
        
        if(elementToPush == "" || elementToPush == null) {
            throw new NullPointerException("Null value inserted");
        }
        
        stackArray[++top] = elementToPush;        
    }

    @Override
    public E popElement()
    {
        if (top < 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        
        return stackArray[top--];
    }

    @Override
    public E topElement()
    {
        if (top < 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        
        return stackArray[top];
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
