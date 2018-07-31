package GET2018.com.metacube.GETProgram;

import java.util.*;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created to implement various functions of stack using array.
 * @author Chirag Jain
 */
public class ArrayMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Integer Stack ");
		int max = scan.nextInt();

		StackArray operation = new StackArray(max);
		
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
					operation.push(scan.nextInt());
				}
				catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					int poppedElement = operation.pop();
					System.out.println("Popped Element = " + poppedElement);
				}
				catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 3:
				try {
					int topElement = operation.top();
					System.out.println("Top Element = " + topElement);
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 4:
				System.out.println("Empty status = " + operation.isEmpty());
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
