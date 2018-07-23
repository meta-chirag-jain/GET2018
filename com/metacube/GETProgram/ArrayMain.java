package GET2018.com.metacube.GETProgram;

import java.util.*;

/**
 * This class is created to implement various functions of stack using array.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class ArrayMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Integer Stack ");
		int max = scan.nextInt();
		
		int[] array = new int[max];
		int top = -1;

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
					if (top == max - 1) {
						throw new IndexOutOfBoundsException("Overflow Exception");
					}
					System.out.println("Enter integer element to push");
					top++;
					array[top] = scan.nextInt();
				}
				catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					if (top < 0) {
						throw new NoSuchElementException("Underflow Exception");
					}
					int poppedElement = array[top];
					top--;
					System.out.println("Popped Element = " + poppedElement);
				}
				catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 3:
				try {
					if (top < 0) {
						throw new NoSuchElementException("Underflow Exception");
					}
					System.out.println("Top Element = " + array[top]);
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
				
			case 4:
				if (top < 0) {
					System.out.println("Empty status = empty");
				}
				else {
					System.out.println("Empty status = not empty");
				}
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
