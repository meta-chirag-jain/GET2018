package GET2018.com.metacube.SCF.Assignment3;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created and perform given operation on marks to get desired value by user.
 * @author Chirag Jain
 * 
 */
public class MarkSheet {
	
	/**
	 * This function throws if
	 * 1. marks array is null.
	 * 2. marks array is of 0 length.
	 * 3. students and given number of marks are not equal.
	 * 4. marks are not in range 0 to 100.
	 */
	public void checkError(double[] marks, int totalStudents) {
		if(marks == null) {
			throw new AssertionError("Array cant be null");
		}
		if(marks.length == 0) {
			throw new AssertionError("no input");
		}
		if(marks.length != totalStudents) {
			throw new AssertionError("wrong input");
		}
		
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] < 0.00 || marks[i] > 100.00) {
				throw new AssertionError("Marks not between 0 to 100");
			}
		}
	}
	
	/**
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return average marks of students
	 * @throws ArithmeticException
	 */
	public double averageMarks(double[] marks, int totalStudents) throws ArithmeticException {
		checkError(marks, totalStudents);
		double totalMarks = 0.00;
		double avgMarks;
		for(int i=0; i<totalStudents; i++) {
			totalMarks += marks[i];
		}
		avgMarks = totalMarks / totalStudents;
		return avgMarks;
	}
	
	/**
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return maximum marks of students
	 * @throws ArithmeticException
	 */
	public double maxMarks(double[] marks, int totalStudents) throws ArithmeticException {
		checkError(marks, totalStudents);
		double maximum = marks[0];
		for(int i=0; i<totalStudents; i++) {
			if(marks[i] > maximum) {
				maximum = marks[i];
			}
		}
		return maximum;
	}
	
	/**
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return minimum marks of students
	 * @throws ArithmeticException
	 */
	public double minMarks(double[] marks, int totalStudents) throws ArithmeticException {
		checkError(marks, totalStudents);
		double minimum = marks[0];
		for(int i=0; i<totalStudents; i++) {
			if(marks[i] < minimum) {
				minimum = marks[i];
			}
		}
		return minimum;
	}
	
	/**
	 * @param marks is marks of all students
	 * @param totalStudents is total number of students
	 * @return passed number of students
	 * @throws ArithmeticException
	 */
	public double passedStudents(double[] marks, int totalStudents) throws ArithmeticException {
		checkError(marks, totalStudents);
		int passed = 0;
		for(int i=0; i<totalStudents; i++) {
			if(marks[i] >= 40.00) {
				passed++;
			}
		}
		double percent = (double)passed / (double)totalStudents;
		return percent * 100;
	}
}
