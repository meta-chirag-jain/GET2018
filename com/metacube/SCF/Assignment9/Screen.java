package GET2018.com.metacube.SCF.Assignment9;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import GET2018.com.metacube.SCF.Assignment9.Shape.ShapeType;

public class Screen {
	
	public static void main(String args[]) {
		
		
		List<Shape> shapes = new ArrayList<Shape>();
		Point pt1 = new Point(4.00,5.00);
		
		Point pt2 = new Point(4.00,3.00);
		
		ArrayList<Double> param1 = new ArrayList<Double>();
		param1.add(5.00);
		
		ArrayList<Double> param2 = new ArrayList<Double>();
		param2.add(4.00);
		
		shapes.add(ShapeFactory.createShape(ShapeType.CIRCLE, pt1, param1));
		
		shapes.add(ShapeFactory.createShape(ShapeType.CIRCLE, pt2, param2));
		
		//System.out.println(shapereturn.getTimeStamp().toString());
		
		System.out.println(shapes.get(0).getTimeStamp());
		System.out.println(shapes.get(1).getArea());
		
		Timestamp ts1 = new Timestamp(shapes.get(0).getTimeStamp().getTime());  
		Timestamp ts2 = new Timestamp(shapes.get(1).getTimeStamp().getTime());  
		System.out.println("timestamp1 " + ts1);
		System.out.println("timestamp2 " + ts2);
		if(ts1.after(ts2)) {
			System.out.println("after");
		}

	}
	
	
}
