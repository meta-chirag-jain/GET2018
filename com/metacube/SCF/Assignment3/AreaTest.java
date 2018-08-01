package GET2018.com.metacube.SCF.Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * This class is created to test Area class.
 * @author Chirag Jain
 * 
 */
public class AreaTest {

Area area = new Area();

	@Test(expected = AssertionError.class)
	public void testErrors() {
		
		//Negative triangle side
		double areaOfTriangle = area.triangleArea(10, -6);
        assertEquals(30, areaOfTriangle, 0.001);
        
        //zero triangle side
        areaOfTriangle = area.triangleArea(0, 6);
        assertEquals(30, areaOfTriangle, 0.001);
		
        //Negative Rectangle side
        double areaOfRectangle = area.rectangleArea(10, -6);
        assertEquals(60, areaOfRectangle, 0.001);
        
        //zero Rectangle side
        areaOfRectangle = area.rectangleArea(0, 6);
        assertEquals(60, areaOfRectangle, 0.001);
        
        //Negative square side
        double areaOfSquare = area.squareArea(-6);
        assertEquals(36, areaOfSquare, 0.001);
        
        //zero square side
        areaOfSquare = area.squareArea(0);
        assertEquals(36, areaOfSquare, 0.001);
        
        //Negative circle side
        double areaOfCircle = area.circleArea(-6);
        assertEquals(113.04, areaOfCircle, 0.001);
	}
    
    @Test
    public void testAreaOfTriangle() {        
        double areaOfTriangle = area.triangleArea(10, 6);
        assertEquals(30, areaOfTriangle, 0.001);
    }

    @Test
    public void testAreaOfRectangle() {      
        double areaOfRectangle = area.rectangleArea(10, 6);
        assertEquals(60, areaOfRectangle, 0.001);
    }
    
    @Test
    public void testAreaOfSquare() {        
        double areaOfSquare = area.squareArea(6);
        assertEquals(36, areaOfSquare, 0.001);
    }
    
    @Test
    public void testAreaOfCircle() {        
        double areaOfCircle = area.circleArea(6);
        assertEquals(113.04, areaOfCircle, 0.001);
        
        //zero circle side
        areaOfCircle = area.circleArea(0);
        assertEquals(0, areaOfCircle, 0.001);
    }

}
