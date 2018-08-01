package GET2018.com.metacube.SCF.Assignment9;

import java.util.Date;

public class Triangle implements Shape
{
    double side1;
    double side2;
    double side3;
    double height;
    Date date;
    Point originPoint;
    
    public Triangle(double side1, double side2, double side3, double height, Date date, Point originPoint)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
        this.date = date;
        this.originPoint = originPoint;
    }
    
	@Override
    public double getArea() {
        return Double.parseDouble(decimalFormat.format( (side2 * height) / 2)); //heron's required
    }
    
	@Override
    public double getPerimeter() {
        return Double.parseDouble(decimalFormat.format(side1 + side2 + side3));
    }
    
	@Override
    public Date getTimeStamp() {
    	return date;
    }

	@Override
    public Point getOrigin() {
        return originPoint;
    }

	@Override
	public boolean isPointEnclosed(Point givenPoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getShapeType() {
		return "TRIANGLE";
	}
	
	@Override
	public double getOriginDistance() {		
		return Math.sqrt((originPoint.x - 0) * (originPoint.x - 0) + (originPoint.y - 0) * (originPoint.y - 0));
	}
}
