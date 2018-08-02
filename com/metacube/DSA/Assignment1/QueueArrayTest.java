package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueArrayTest {

	QueueArray<Integer> intQueueArray = new QueueArray<Integer>(4); 
    
    QueueArray<Double> doubleQueueArray = new QueueArray<Double>(4); 
    
    QueueArray<Character> charQueueArray = new QueueArray<Character>(4); 
    
    QueueArray<String> stringQueueArray = new QueueArray<String>(4); 
    
	@Test
	public void intQueueArraytest() {

		try {
			intQueueArray.dequeueElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + intQueueArray.isEmpty());
        
        try {
        	intQueueArray.peek();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        intQueueArray.enqueueElement(101);
        
        intQueueArray.enqueueElement(102);
        
        System.out.println("top " + intQueueArray.peek());
        
        intQueueArray.enqueueElement(103);

        intQueueArray.enqueueElement(104);

        try {
        	intQueueArray.enqueueElement(105);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("pop " + intQueueArray.dequeueElement());
        
        System.out.println("Empty " + intQueueArray.isEmpty());

        System.out.println("top " + intQueueArray.peek());
        
        System.out.println("pop " + intQueueArray.dequeueElement());
        
        System.out.println("Empty " + intQueueArray.isEmpty());
        
	}

}
