package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueLinkListTest {

	QueueLinkList<Integer> intQueueList = new QueueLinkList<Integer>(4); 
    
	QueueLinkList<Double> doubleQueueList = new QueueLinkList<Double>(4); 
    
	QueueLinkList<Character> charQueueList = new QueueLinkList<Character>(4); 
    
	QueueLinkList<String> stringQueueList = new QueueLinkList<String>(4); 

	@Test
	public void intQueueTest() {
		try {
			intQueueList.dequeueElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + intQueueList.isEmpty());
        
        try {
        	intQueueList.peek();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        intQueueList.enqueueElement(101);
        
        intQueueList.enqueueElement(102);
        
        System.out.println("top " + intQueueList.peek());
        
        intQueueList.enqueueElement(103);

        intQueueList.enqueueElement(104);

        try {
        	intQueueList.enqueueElement(105);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("pop " + intQueueList.dequeueElement());
        
        System.out.println("Empty " + intQueueList.isEmpty());

        System.out.println("top " + intQueueList.peek());
        
        System.out.println("pop " + intQueueList.dequeueElement());
        
        System.out.println("Empty " + intQueueList.isEmpty());
		
	}


}
