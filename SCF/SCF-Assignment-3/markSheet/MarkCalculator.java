package markSheet;

/**
 * 
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * 
 * This class is created and perform given operation on marks to get desired value by user.
 */
public class MarkCalculator {
	
	/**
	 * 
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return average marks of students
	 * @throws ArithmeticException
	 */
	double averageMarks(double[] marks, int totalStudents) throws ArithmeticException {
		double totalMarks = 0.00;
		double avgMarks;
		for(int i=0; i<totalStudents; i++) {
			totalMarks += marks[i];
		}
		avgMarks = totalMarks / totalStudents;
		return avgMarks;
	}
	
	/**
	 * 
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return maximum marks of students
	 * @throws ArithmeticException
	 */
	double maxMarks(double[] marks, int totalStudents) throws ArithmeticException {
		double maximum = marks[0];
		for(int i=0; i<totalStudents; i++) {
			if(marks[i] > maximum) {
				maximum = marks[i];
			}
		}
		return maximum;
	}
	
	/**
	 * 
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return minimum marks of students
	 * @throws ArithmeticException
	 */
	double minMarks(double[] marks, int totalStudents) throws ArithmeticException {
		double minimum = marks[0];
		for(int i=0; i<totalStudents; i++) {
			if(marks[i] < minimum) {
				minimum = marks[i];
			}
		}
		return minimum;
	}
	
	/**
	 * 
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return passed number of students
	 * @throws ArithmeticException
	 */
	int passedStudents(double[] marks, int totalStudents) throws ArithmeticException {
		int passed = 0;
		for(int i=0; i<totalStudents; i++) {
			if(marks[i] > 40.00) {
				passed++;
			}
		}
		return passed;
	}
}
