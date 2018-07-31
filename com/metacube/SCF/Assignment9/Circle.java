package GET2018.com.metacube.SCF.Assignment9;

import java.util.Date;

public class Circle implements Shape
{
    final double PI = 3.14;
    
    double radius;
    Date date;
    Point originPoint;
    
    public Circle(double radius, Date date,Point originPoint)
    {
        this.radius = radius;
        this.date = date;
        this.originPoint = originPoint;
        System.out.println("circle created at " + date.toString());
    }
    
    public double getArea() {
        return PI * radius* radius;
    }
    
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    
    public Point getOrigin() {
        return originPoint;
    }
    
    public boolean isPointEnclosed() {
        
    }
    
    public Date getTimeStamp() {
    	return date;
    }
}
