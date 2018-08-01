package GET2018.com.metacube.SCF.Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created to check MarkSheet Class.
 * @author Chirag Jain
 * 
 */
public class MarkSheetTest {

	MarkSheet marksheet = new MarkSheet();
    
	//checkError function is called in every function
	@Test(expected = AssertionError.class)
    public void testErrors() {
        
		//null input
        double average = marksheet.averageMarks(null, 5);
        assertEquals(65.8, average, 0.001);
        
        //zero input
        average = marksheet.averageMarks(new double[]{ }, 5);
        assertEquals(65.8, average, 0.001);
        
        //unequal students and given marks
        average = marksheet.averageMarks(new double[]{80, 67, 57, 40, 85}, 6);
        assertEquals(65.8, average, 0.001);
        
        //negative marks
        average = marksheet.averageMarks(new double[]{80, -67, 57, 40, 85}, 6);
        assertEquals(65.8, average, 0.001);
        
        //marks more than 100
        average = marksheet.averageMarks(new double[]{80, 67, 57, 140, 85}, 6);
        assertEquals(65.8, average, 0.001);
    }
	
    @Test
    public void testAverage() {
        
        double average = marksheet.averageMarks(new double[]{80, 67, 57, 40, 85}, 5);
        assertEquals(65.8, average, 0.001);
    }
    
    @Test
    public void testMaxGrade() {
        
        double maxGrade = marksheet.maxMarks(new double[]{80, 67, 57, 40, 85}, 5);
        assertEquals(85, maxGrade, 0.001);
    }

    @Test
    public void testMinGrade() {
        
        double minGrade = marksheet.minMarks(new double[]{80, 67, 57, 40, 85}, 5);
        assertEquals(40, minGrade, 0.001);
    }
    
    @Test
    public void testStudentsPassedPercent() {
        
        double studentsPassed = marksheet.passedStudents(new double[]{80, 67, 37, 40, 85}, 5);
        assertEquals(80, studentsPassed, 0.001);
    }

}
