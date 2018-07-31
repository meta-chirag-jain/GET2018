package GET2018.com.metacube.SCF.Assignment9;

import java.util.Date;

public interface Shape
{
    double getArea();
    
    double getPerimeter();
    
    Point getOrigin();
    
    boolean isPointEnclosed();
    
    Date getTimeStamp();
    
    enum ShapeType { SQUARE, RECTANGLE, CIRCLE, TRIANGLE }
}
