package assignment;

import java.util.Stack;
import java.util.*;

public class PalindromeTest {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        String input = scan.next();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }

        if (input.equals(reverseInput))
            System.out.println("That is a palindrome.");
        else
            System.out.println("That isn't a palindrome.");

    }
}