package assignment;

import java.util.*; 

class StackArray 
{  
	int[] arr;
	int top,MAX;
	
    StackArray(int n)								//constructor
	{
		MAX = n;
		arr = new int[MAX];							//creating arraylist  
		top = -1;
	}
	
	boolean isEmpty()								//check empty
	{
		return (top<0);
	}
	
	void push(int x)								//push
	{
		if (top == MAX-1)
		{
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		else
		{
			top++;
			arr[top] = x;
		}
	}
	
 	int pop()										//pop
	{
		if (top < 0)
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		else
		{
			int x = arr[top];
			top--;
			return x;
		}
	}
	
	int top()										//top
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return arr[top];
    }
}
	

public class ArrayMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
		
        /* Creating object of class arrayStack */
        StackArray stk = new StackArray(n);
        /* Perform Stack Operations */
        
		char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. top");
            System.out.println("4. check empty");

            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
                try 
                {
                    stk.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = " + stk.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    System.out.println("Top Element = " + stk.top());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = " + stk.isEmpty());
                break;                
           
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
			
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}