package markSheet;

import java.util.Scanner;

/**
 * 
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 * This class is created to take marks of students and perform given operation by user.
 */
public class MarkSheet {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int noOfStudents = scan.nextInt();
			
		double[] marks = new double[noOfStudents];
		
		System.out.println("Enter marks");
		for(int i=0; i<noOfStudents; i++) {
			marks[i] = scan.nextDouble();
			while(marks[i]<0 || marks[i]>100) {
				System.out.println("Mark incorrect. Please enter mark between 0 to 100.");
				marks[i] = scan.nextDouble();
			}
		}
		
		int choice;
		
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Print Average Marks");
            System.out.println("2. Print Maximum Marks");
            System.out.println("3. Print Minimum Marks");
            System.out.println("4. Print number of passed students");
            System.out.println("5. Exit");

            choice = scan.nextInt();
            switch (choice) {
            case 1 : 
                try {
                	double avgMarks = new MarkCalculator().averageMarks(marks, noOfStudents);
            		System.out.println(String.format("%.2f", avgMarks));
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }                    
                break;
                
            case 2 : 
                try {
                	double maximumMarks = new MarkCalculator().maxMarks(marks, noOfStudents);
            		System.out.println(String.format("%.2f", maximumMarks));
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;
                
            case 3 :         
                try {
                	double minimumMarks = new MarkCalculator().minMarks(marks, noOfStudents);
            		System.out.println(String.format("%.2f", minimumMarks));
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
                
            case 4 : 
            	try {
            		int passedStudents = new MarkCalculator().passedStudents(marks, noOfStudents);
            		System.out.println(passedStudents);
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
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
