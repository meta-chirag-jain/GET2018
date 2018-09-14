package com.metacube;

public class TriangleArea {

	public static double getArea(double side1, double side2, double side3) {
		
		double s = (side1 + side2 + side3) / 2;
		
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
}
