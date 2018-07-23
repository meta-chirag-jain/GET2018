package GET2018.com.metacube.GETProgram;

import java.util.Stack;
import java.util.*;

/**
 * This class is created to check whether a string is Palindrome.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 */
public class Palindrome {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter String: ");
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

        scan.close();
    }
}