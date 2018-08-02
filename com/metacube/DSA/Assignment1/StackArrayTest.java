package GET2018.com.metacube.DSA.Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackArrayTest
{

    StackArray<Integer> intStackArray = new StackArray<Integer>(4); 
    
    StackArray<Double> doubleStackArray = new StackArray<Double>(4); 
    
    StackArray<Character> charStackArray = new StackArray<Character>(4); 
    
    StackArray<String> stringStackArray = new StackArray<String>(4); 

    /*@Test
    public void intStackArraytest()
    {
        try {
            intStackArray.popElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + intStackArray.isEmpty());
        
        try {
            intStackArray.topElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        intStackArray.pushElement(101);
        
        intStackArray.pushElement(102);
        
        System.out.println("top " + intStackArray.topElement());
        
        intStackArray.pushElement(103);

        intStackArray.pushElement(104);

        try {
            intStackArray.pushElement(105);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("pop " + intStackArray.popElement());
        
        System.out.println("Empty " + intStackArray.isEmpty());

        System.out.println("top " + intStackArray.topElement());
        
        System.out.println("pop " + intStackArray.popElement());
        
        System.out.println("Empty " + intStackArray.isEmpty());

    }*/
    
    /*@Test
    public void doubleStackArraytest()
    {
        try {
            doubleStackArray.popElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + doubleStackArray.isEmpty());
        
        try {
            doubleStackArray.topElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        doubleStackArray.pushElement(101.00);
        
        doubleStackArray.pushElement(102.00);
        
        System.out.println("top " + doubleStackArray.topElement());
        
        doubleStackArray.pushElement(103.00);

        doubleStackArray.pushElement(104.00);

        try {
            doubleStackArray.pushElement(105.00);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("pop " + doubleStackArray.popElement());
        
        System.out.println("Empty " + doubleStackArray.isEmpty());

        System.out.println("top " + doubleStackArray.topElement());
        
        System.out.println("pop " + doubleStackArray.popElement());
        
        System.out.println("Empty " + doubleStackArray.isEmpty());

    }*/

    /*@Test
    public void charStackArraytest()
    {
        try {
            charStackArray.popElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + charStackArray.isEmpty());
        
        try {
            charStackArray.topElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        charStackArray.pushElement('a');
        
        charStackArray.pushElement('b');
        
        System.out.println("top " + charStackArray.topElement());
        
        charStackArray.pushElement('c');

        charStackArray.pushElement('d');

        try {
            charStackArray.pushElement('e');
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        

        System.out.println("pop " + charStackArray.popElement());
        
        System.out.println("Empty " + charStackArray.isEmpty());

        System.out.println("top " + charStackArray.topElement());
        
        System.out.println("pop " + charStackArray.popElement());
        
        System.out.println("Empty " + charStackArray.isEmpty());

    }*/
    
    @Test
    public void stringStackArraytest()
    {
        try {
            stringStackArray.popElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Empty " + stringStackArray.isEmpty());
        
        try {
            stringStackArray.topElement();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        stringStackArray.pushElement("Hey101");
        
        stringStackArray.pushElement("Hey102");
        
        System.out.println("top " + stringStackArray.topElement());
        
        stringStackArray.pushElement("Hey103");

        //stringStackArray.pushElement("Hey104");

        try {
            stringStackArray.pushElement(null);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        stringStackArray.pushElement("Hey104");
        
        System.out.println("pop " + stringStackArray.popElement());
        
        System.out.println("Empty " + stringStackArray.isEmpty());

        System.out.println("top " + stringStackArray.topElement());
        
        System.out.println("pop " + stringStackArray.popElement());
        
        System.out.println("Empty " + stringStackArray.isEmpty());
        
    }
}
