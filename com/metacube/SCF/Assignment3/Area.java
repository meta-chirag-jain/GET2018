package GET2018.com.metacube.SCF.Assignment3;

/**
 * This class is created to calculate area of required shape.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class Area {
	
	/**
	 * @param width is width of triangle
	 * @param height  is height of triangle
	 * @return area of triangle
	 * @throws ArithmeticException
	 */
	double triangleArea(double width, double height) throws ArithmeticException {
		double area = 0.5 * width * height;
		return area;
	}
	
	/**
	 * @param width is width of rectangle
	 * @param height is height of rectangle
	 * @return area of rectangle
	 * @throws ArithmeticException
	 */
	double rectangleArea(double width, double height) throws ArithmeticException {
		double area = width * height;
		return area;
	}
	
	/**
	 * @param width is width of square
	 * @return area of square
	 * @throws ArithmeticException
	 */
	double squareArea(double width) throws ArithmeticException {
		double area = width * width;
		return area;
	}
	
	/**
	 * @param radius is radius of circle
	 * @return area of circle
	 * @throws ArithmeticException
	 */
	double circleArea(double radius) throws ArithmeticException {
		double area = 3.14 * radius * radius;
		return area;
	}
}
