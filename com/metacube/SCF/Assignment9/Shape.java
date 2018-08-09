package GET2018.com.metacube.SCF.Assignment9;

import java.text.DecimalFormat;
import java.util.Date;

/**
* Copyright (c) 2018 Metacube.com. All rights reserved.
* This interface declares function of various shape.
* @author Chirag Jain
* 
*/
public interface Shape
{
	DecimalFormat decimalFormat = new DecimalFormat(".###");
	
    double getArea();
    
    double getPerimeter();
    
    Point getOrigin();
    
    boolean isPointEnclosed(Point givenPoint);
    
    Date getTimeStamp();
    
    String getShapeType();
    
    double getOriginDistance();
    
    static enum ShapeType { SQUARE, RECTANGLE, CIRCLE, TRIANGLE, POLYGON }
}
