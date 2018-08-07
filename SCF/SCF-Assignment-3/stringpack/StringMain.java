package stringpack;

import java.util.Scanner;

/**
 * 
 * @author Chirag Jain
 * This class accepts string input from user and perform required operations.
 */
public class StringMain {
	public static void main(String[] args) {
		
		String userString1, userString2;
		int choice;
		Scanner scan = new Scanner(System.in);
		
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Compare if two strings are equal");
            System.out.println("2. Reverse the string");
            System.out.println("3. Change upper case to lower and vice versa");
            System.out.println("4. Find largest word of string");
            System.out.println("5. Exit");

            choice = scan.nextInt();
            switch (choice) {
            case 1 : 
                System.out.println("Enter two strings");
                userString1 = scan.nextLine();
                userString1 += scan.nextLine();
                userString2 = scan.nextLine();
                userString2 += scan.nextLine();
            	System.out.println("Result is: " + new StringOperations().compareEqual(userString1, userString2));
                break;
                
            case 2 :
                System.out.println("Enter string to reverse");
                userString1 = scan.nextLine();
                userString1 += scan.nextLine();
                System.out.println("Result is: " + new StringOperations().toReverse(userString1));
                break;
                
            case 3 :
            	System.out.println("Enter string to change cases");
                userString1 = scan.nextLine();
                userString1 += scan.nextLine();
                System.out.println("Result is: " + new StringOperations().changeCase(userString1));
                break;
                
            case 4 :
            	System.out.println("Enter string to find largest word");
                userString1 = scan.nextLine();
                userString1 += scan.nextLine();
                System.out.println("Result is: " + new StringOperations().largest(userString1));
                break;
                
            case 5 :
            	break;
           
            default :
                System.out.println("Wrong Entry \n ");
                break;
            }

        } while (choice != 5);
        scan.close();
	}

}
