package GET2018.com.metacube.SCF.Assignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import GET2018.com.metacube.SCF.Assignment9.Shape.ShapeType;

public class Screen {
	
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void addShape() {
		
		Shape shape1 = ShapeFactory.createShape(ShapeType.CIRCLE, new Point(2.00, 2.00), new ArrayList<Double>(Arrays.asList(4.24)) );
		shapes.add(shape1);
		
		Shape shape2 = ShapeFactory.createShape(ShapeType.SQUARE, new Point(3.00, 4.00), new ArrayList<Double>(Arrays.asList(4.00)) );
		shapes.add(shape2);

		Shape shape3 = ShapeFactory.createShape(ShapeType.RECTANGLE, new Point(3.00, 3.00), new ArrayList<Double>(Arrays.asList(4.00, 5.00)) );
		shapes.add(shape3);
		
		Shape shape4 = ShapeFactory.createShape(ShapeType.SQUARE, new Point(5.00, 4.00), new ArrayList<Double>(Arrays.asList(3.00)) );
		shapes.add(shape4);
	}
	
	/**
	 * remove all occurrences of given shape type
	 * @param type is the Shape Type
	 * @return List after removing all occurrences of that shape type
	 */
	public void removeAllShapeOfType(ShapeType type) {
		for(int i = 0; i < shapes.size(); i++) {
			if(shapes.get(i).getShapeType() == type.toString()) {
				shapes.remove(i);
				i--;
			}
		}
	}
	
	public void removeShapeObject(Shape shapeObjectName) {
		shapes.remove(shapeObjectName);
	}
	
	
	public static Comparator<Shape> sortByArea = new Comparator<Shape>() {
		public int compare(Shape s1, Shape s2) {

			return (s1.getArea() < s2.getArea() ? -1 :                     
	              (s1.getArea() == s2.getArea() ? 0 : 1));      
		}
	};
	
	public static Comparator<Shape> sortByPerimeter = new Comparator<Shape>() {
		public int compare(Shape s1, Shape s2) {

			return (s1.getPerimeter() < s2.getPerimeter() ? -1 :                     
	              (s1.getPerimeter() == s2.getPerimeter() ? 0 : 1));      
		}
	};
	
	/*public static Comparator<Shape> sortByTimestamp = new Comparator<Shape>() {
		public int compare(Shape s1, Shape s2) {

			return (s1.getTimeStamp().getTime() < s2.getTimeStamp().getTime() ? -1 :                     
	              (s1.getTimeStamp().getTime() == s2.getTimeStamp().getTime() ? 0 : 1));      
		}
	};*/
	
	public static Comparator<Shape> sortByTimestamp = new Comparator<Shape>() {
		public int compare(Shape s1, Shape s2) {

			return (s1.getTimeStamp().before(s2.getTimeStamp()) ? -1 :                     
	              (s1.getTimeStamp().getTime() == s2.getTimeStamp().getTime() ? 0 : 1));      
		}
	};
	
	public static Comparator<Shape> sortByOriginDistance = new Comparator<Shape>() {
		public int compare(Shape s1, Shape s2) {

			return (s1.getOriginDistance() < s2.getOriginDistance() ? -1 :                     
	              (s1.getOriginDistance() == s2.getOriginDistance() ? 0 : 1));      
		}
	};

	
	public static void main(String args[]) {
		
		Screen screenObject = new Screen();
		
		screenObject.addShape();
		
		System.out.println("\nInitally");
		
		for(Shape s : screenObject.shapes) {
			System.out.println(s.getShapeType() + "\tarea: " + s.getArea() + "\tperi: " + s.getPerimeter() + "\tTimeStamp: " + s.getTimeStamp());
		}
		
		System.out.println("\nchanged by area");
		
		Collections.sort(screenObject.shapes, sortByArea);
		for(Shape s : screenObject.shapes) {
			System.out.println(s.getShapeType() + "\tarea: " + s.getArea() + "\tperi: " + s.getPerimeter() + "\tTimeStamp: " + s.getTimeStamp());
		}
		
		System.out.println("\nchanged by perimeter");
		
		Collections.sort(screenObject.shapes, sortByPerimeter);
		for(Shape s : screenObject.shapes) {
			System.out.println(s.getShapeType() + "\tarea: " + s.getArea() + "\tperi: " + s.getPerimeter() + "\tTimeStamp: " + s.getTimeStamp());
		}
		
		System.out.println("\nchanged by timestamp");
		
		Collections.sort(screenObject.shapes, sortByTimestamp);
		for(Shape s : screenObject.shapes) {
			System.out.println(s.getShapeType() + "\tarea: " + s.getArea() + "\tperi: " + s.getPerimeter() + "\tTimeStamp: " + s.getTimeStamp());
		}
		
		System.out.println("\nchanged by origin distance");
		
		Collections.sort(screenObject.shapes, sortByOriginDistance);
		for(Shape s : screenObject.shapes) {
			System.out.println(s.getShapeType() + "\tarea: " + s.getArea() + "\tperi: " + s.getPerimeter() + "\tTimeStamp: " + s.getTimeStamp());
		}
		
				
		System.out.println("\nAfter removing all squares");
		
		screenObject.removeAllShapeOfType(ShapeType.SQUARE);
		for(Shape s : screenObject.shapes) {
			System.out.println(s.getShapeType() + "\tarea: " + s.getArea() + "\tperi: " + s.getPerimeter() + "\tTimeStamp: " + s.getTimeStamp());
		}
	}
	
	
}
