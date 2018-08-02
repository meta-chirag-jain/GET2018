package GET2018.com.metacube.DSA.Assignment1;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class creates generic node for Linked List.
 * @author Chirag Jain
 *
 * @param <E> is generic type.
 */
public class LinkedListNode<E>
{
    private E value;
    private LinkedListNode<E> next;

    public LinkedListNode(E value) {
        this.value = value;
        this.next = null;
    }
    
    /**
     * Set next node of current node as passed node.
     */
    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }

    /**
     * @return next node of current node.
     */
    public LinkedListNode<E> getNext() {
        return next;
    }

    /**
     * Gets value of node.
     * @return value of node.
     */
    public E getValue() {
        return value;
    }
    
}