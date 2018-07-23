package GET2018.com.metacube.SCF.Assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

Area area = new Area();
    
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
    }

}
