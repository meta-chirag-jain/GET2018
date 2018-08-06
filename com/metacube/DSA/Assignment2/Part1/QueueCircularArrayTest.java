package GET2018.com.metacube.DSA.Assignment2.Part1;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class QueueCircularArrayTest {

	/**
     * test case to enqueue a value in queue (return true when element is enqueueed and returns false when queue is full)
     */
    @Test
    public void circularQueueenqueueTest() {
        
        QueueCircularArray<Integer> queue = new QueueCircularArray<>(5);
        assertTrue(queue.enqueueElement(1));
        assertTrue(queue.enqueueElement(2));
        assertTrue(queue.enqueueElement(3));
        assertTrue(queue.enqueueElement(4));
        assertTrue(queue.enqueueElement(5));
        assertFalse(queue.enqueueElement(6));
    }
    
    
    /**
     * test case to dequeue a value from the queue
     */
    @Test
    public void circularQueuedequeueTest1() {
        
        QueueCircularArray<Integer> queue = new QueueCircularArray<>(5);
        queue.enqueueElement(1);
        queue.enqueueElement(2);
        queue.enqueueElement(3);
        int dequeuedValue = queue.dequeueElement();
        assertEquals(1, dequeuedValue);
    }
    
    
    /**
     * test case to dequeue a value from the queue when it is empty
     */
    @Test(expected = NoSuchElementException.class)
    public void circularQueuedequeueTest2() {
        
        QueueCircularArray<String> queue = new QueueCircularArray<>(5);
        queue.enqueueElement("hello");
        queue.dequeueElement();
        queue.dequeueElement();
    }
    
    
    /**
     * test case to check if the queue is empty when actually the queue is not empty
     */
    @Test
    public void circularQueueIsEmptyTest1() {
        
        QueueCircularArray<Integer> queue = new QueueCircularArray<>(5);
        queue.enqueueElement(2);
        assertFalse(queue.isEmpty());
    }
    
    
    /**
     * test case to check if the queue is empty when actually the queue is empty
     */
    @Test
    public void circularQueueIsEmptyTest2() {
        
        QueueCircularArray<Integer> queue = new QueueCircularArray<>(5);
        
        assertTrue(queue.isEmpty());
    }
    
    
    /**
     * test case to check if the queue is full when actually the queue is full
     */
    @Test
    public void circularQueueIsFullTest1() {
        
        QueueCircularArray<Integer> queue = new QueueCircularArray<>(5);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        assertTrue(queue.isFull());
    }
    
    
    /**
     * test case to check if the queue is full when actually the queue is not full
     */
    @Test
    public void circularQueueIsFullTest2() {
        
        QueueCircularArray<Integer> queue = new QueueCircularArray<>(5);
        assertFalse(queue.isFull());
        
        queue.enqueueElement(3);
        assertFalse(queue.isFull());
        
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.enqueueElement(2);
        queue.dequeueElement();
        queue.dequeueElement();
        assertFalse(queue.isFull());
    }

}
