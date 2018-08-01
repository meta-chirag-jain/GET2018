package GET2018.com.metacube.SCF.Assignment9;

import java.util.Date;

public class Circle implements Shape
{
    final double PI = 3.14;
    
    double radius;
    Date date;
    Point originPoint;
    Point center;

    public Circle(double radius, Date date,Point originPoint)
    {
        this.radius = radius;
        this.date = date;
        this.originPoint = originPoint;
        this.center = getCenterCoordinates();
        //System.out.println("circle created at " + date.toString());
    }
    
    @Override
    public double getArea() {
        return Double.parseDouble(decimalFormat.format(PI * radius* radius));
    }
    
    @Override
    public double getPerimeter() {
        return Double.parseDouble(decimalFormat.format(2 * PI * radius));
    }
    
    @Override
    public Point getOrigin() {
        return originPoint;
    }
    
    @Override
    public boolean isPointEnclosed(Point givenPoint) {
        //Point center = getCenterCoordinates();
        //System.out.println("center x: " + center.x + " center y: " + center.y);
        if(getDistance(center, givenPoint) < radius) {
        	return true;
        }
        return false;
    }
    
    @Override
    public Date getTimeStamp() {
    	return date;
    }
    
    @Override
    public String getShapeType() {
    	return "CIRCLE";
    }
    
    private double getDistance(Point center, Point givenPoint) {
    	//distance = square root of ((x2-x1)^2 + (y2-y1)^2)
    	return Math.sqrt((center.x - givenPoint.x) * (center.x - givenPoint.x) + (center.y - givenPoint.y) * (center.y - givenPoint.y));
    }
    
    private Point getCenterCoordinates() {
    	double xAxis, yAxis;
    	double theta = Math.atan(originPoint.y / originPoint.x);			//tan inverse of slope
    	
    	xAxis = radius * Math.sin(theta);
    	yAxis = radius * Math.cos(theta);
    	
    	return new Point(originPoint.x + xAxis, originPoint.y + yAxis);   	
    }

	@Override
	public double getOriginDistance() {
		
		return Math.sqrt((originPoint.x - 0) * (originPoint.x - 0) + (originPoint.y - 0) * (originPoint.y - 0));
	}

}
