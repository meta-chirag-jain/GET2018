package GET2018.com.metacube.GETProgram;

import java.util.*;
import java.util.LinkedList;

public class LinkListMain {
	public static void main(String[] args) {

		LinkedList<Integer> sList = new LinkedList<Integer>();

		int top = -1;
		final int MAX = 10;
		char ch;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("\nStack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. top");
			System.out.println("4. check empty");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				try {
					if (top == MAX - 1) {
						throw new IndexOutOfBoundsException(
								"Overflow Exception");
					}
					sList.add(scan.nextInt());
					top++;
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2:
				try {
					if (top < 0) {
						throw new NoSuchElementException("Underflow Exception");
					}
					System.out
							.println("Popped Element = " + sList.removeLast());
					top--;
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				try {
					if (top < 0) {
						throw new NoSuchElementException("Underflow Exception");
					}
					System.out.println("Top Element = " + sList.getLast());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 4:
				if (top < 0)
					System.out.println("Empty status = empty");
				System.out.println("Empty status = not empty");
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

	}

}
