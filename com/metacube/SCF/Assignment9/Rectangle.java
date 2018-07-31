package GET2018.com.metacube.SCF.Assignment9;

import java.util.Date;

public class Rectangle implements Shape
{
    double length, width;
    Date date;
    Point originPoint;
    
    public Rectangle(double length, double width, Date date, Point originPoint)
    {
        this.length = length;
        this.width = width;
        this.date = date;
        this.originPoint = originPoint;
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public Date getTimeStamp() {
    	return date;
    }
    
    public Point getOrigin() {
        return originPoint;
    }
    
    public boolean isPointEnclosed();
}
