package GET2018.com.metacube.SCF.Assignment9;

import java.util.Date;

public class Square implements Shape
{
    double width;
    Date date;
    Point originPoint;
    
    public Square(double width, Date date, Point originPoint)
    {
        this.width = width;
        this.date = date;
        this.originPoint = originPoint;
    }
    
    public double getArea() {
        return width * width;
    }
    
    public double getPerimeter() {
        return 4 * width;
    }
    
    public Date getTimeStamp() {
    	return date;
    }
    
    public Point getOrigin() {
        return originPoint;
    }
    
    public boolean isPointEnclosed();
}
