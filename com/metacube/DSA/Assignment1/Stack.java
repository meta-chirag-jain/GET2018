package GET2018.com.metacube.DSA.Assignment1;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This Interface declares various functions of stack.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public interface Stack<E>
{   
	/**
	 * Push element to stack
	 * @param elementToPush is generic type
	 */
    public boolean pushElement(E elementToPush);

    /**
     * Pop element form stack 
     * @return popped element
     */
    public E popElement();   
    
    /**
     * peek top element
     * @return top element of stack
     */
    public E topElement();
    
    /**
     * Checks if stack is empty
     * @return true if stack is empty else false
     */
    public boolean isEmpty();
    
}
