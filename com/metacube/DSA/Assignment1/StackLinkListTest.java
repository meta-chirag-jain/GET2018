package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackLinkListTest {
	
	StackLinkList<Integer> intStackList = new StackLinkList<Integer>(4); 
    
	StackLinkList<Double> doubleStackList = new StackLinkList<Double>(4); 
    
	StackLinkList<Character> charStackList = new StackLinkList<Character>(4); 
    
	StackLinkList<String> stringStackList = new StackLinkList<String>(4); 

	@Test
	public void intStackTest() {
		try {
            intStackList.popElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + intStackList.isEmpty());
        
        try {
            intStackList.topElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        intStackList.pushElement(101);
        
        intStackList.pushElement(102);
        
        System.out.println("top " + intStackList.topElement());
        
        intStackList.pushElement(103);

        intStackList.pushElement(104);

        try {
            intStackList.pushElement(105);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("pop " + intStackList.popElement());
        
        System.out.println("Empty " + intStackList.isEmpty());

        System.out.println("top " + intStackList.topElement());
        
        System.out.println("pop " + intStackList.popElement());
        
        System.out.println("Empty " + intStackList.isEmpty());
		
	}

}
