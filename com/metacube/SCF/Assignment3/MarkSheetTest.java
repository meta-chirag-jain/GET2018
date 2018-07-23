package GET2018.com.metacube.SCF.Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkSheetTest {

	MarkSheet marksheet = new MarkSheet();
    
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
