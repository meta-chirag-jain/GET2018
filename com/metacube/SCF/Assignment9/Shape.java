package GET2018.com.metacube.SCF.Assignment9;

import java.text.DecimalFormat;
import java.util.Date;

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
    
    enum ShapeType { SQUARE, RECTANGLE, CIRCLE, TRIANGLE }
}
