package GET2018.com.metacube.GETProgram;

import java.util.*;

/**
 * This class is created to implement various functions of stack using LinkedList.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class LinkListMain {
	
	public static void main(String[] args) {

		System.out.println("Enter Size of Integer Stack ");
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		
		StackLinkList listOperation = new StackLinkList(max);
		
		int choice;
		
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Top");
			System.out.println("4. Check empty");
			System.out.println("5. Exit");

			choice = scan.nextInt();
			switch (choice) {
			case 1:	
				try {
					System.out.println("Enter integer element to push");
					listOperation.push(scan.nextInt());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					int poppedElement = listOperation.pop();
					System.out.println("Popped Element = " + poppedElement);
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 3:
				try {
					System.out.println("Top Element = " + listOperation.top());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 4:
				System.out.println("Empty status = " + listOperation.isEmpty());
				break;
				
			case 5:
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

		} while (choice != 5);
		scan.close();
	}
}
