package GET2018.com.metacube.SCF.Assignment3;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created to calculate area of required shape.
 * @author Chirag Jain
 * 
 */
public class Area {
	
	/**
	 * @param width is width of triangle
	 * @param height  is height of triangle
	 * @return area of triangle
	 * @throws ArithmeticException
	 */
	public double triangleArea(double width, double height) throws ArithmeticException {
		if(width <= 0 || height <= 0) {
			throw new AssertionError("Size Invalid.");
		}
		
		return 0.5 * width * height;
	}
	
	/**
	 * @param width is width of rectangle
	 * @param height is height of rectangle
	 * @return area of rectangle
	 * @throws ArithmeticException
	 */
	public double rectangleArea(double width, double height) throws ArithmeticException {
		if(width <= 0 || height <= 0) {
			throw new AssertionError("Size Invalid.");
		}
		
		return width * height;
	}
	
	/**
	 * @param width is width of square
	 * @return area of square
	 * @throws ArithmeticException
	 */
	public double squareArea(double width) throws ArithmeticException {
		if(width <= 0) {
			throw new AssertionError("Size Invalid.");
		}

		return width * width;
	}
	
	/**
	 * @param radius is radius of circle
	 * @return area of circle
	 * @throws ArithmeticException
	 */
	public double circleArea(double radius) throws ArithmeticException {
		if(radius < 0) {														//circle with radius zero is dot.
			throw new AssertionError("Size Invalid.");
		}
		
		return 3.14 * radius * radius;
	}
}
