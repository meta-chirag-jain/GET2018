package area;

import java.util.Scanner;

/**
 * 
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 * This class is created to take user input and calculate area of required shape.
 */
public class AreaMain {

	public static void main(String[] args) {
		double height, width, radius;
		int choice;
		
		Scanner scan = new Scanner(System.in);
		
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Calculate area of triangle");
            System.out.println("2. Calculate area of rectangle");
            System.out.println("3. Calculate area of square");
            System.out.println("4. Calculate area of circle");
            System.out.println("5. Exit");
            
            choice = scan.nextInt();
            switch (choice) {
            case 1 : 
                try {
                	System.out.println("Enter height and width");
                	height = scan.nextDouble();
                	width = scan.nextDouble();
            		System.out.println("Area of triangle is: " + new AreaCalculate().triangleArea(width, height));
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }                         
                break;
                
            case 2 :
                try {
                	System.out.println("Enter height and width");
                	height = scan.nextDouble();
                	width = scan.nextDouble();
            		System.out.println("Area of rectangle is: " + new AreaCalculate().rectangleArea(width, height));
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;
                
            case 3 :
                try {
                	System.out.println("Enter width");
                	width = scan.nextDouble();
            		System.out.println("Area of square is: " + new AreaCalculate().squareArea(width));
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
                
            case 4 :
            	try {
            		System.out.println("Enter width");
                	radius = scan.nextDouble();
            		System.out.println("Area of square is: " + new AreaCalculate().squareArea(radius));
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
