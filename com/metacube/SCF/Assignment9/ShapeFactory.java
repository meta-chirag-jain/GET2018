package GET2018.com.metacube.SCF.Assignment9;

import java.util.ArrayList;
import java.util.Date;

import GET2018.com.metacube.SCF.Assignment9.Shape.ShapeType;

public class ShapeFactory
{

    public static Shape createShape(ShapeType shape, Point originPoint, ArrayList<Double> parameters) {
        
    	Date date = new Date();
    	Shape shapeObject = null;
    	
        switch(shape) {
        case SQUARE:
        	shapeObject = new Square(parameters.get(0), date, originPoint);
        	break;
        
        case RECTANGLE:
        	shapeObject = new Rectangle(parameters.get(0), parameters.get(1), date, originPoint);
        	break;
        	
        case CIRCLE:
        	shapeObject = new Circle(parameters.get(0), date, originPoint);
        	break;
        	
        case TRIANGLE:
        	shapeObject = new Triangle(parameters.get(0), date, originPoint);
        	break;
        	
        default:
            System.out.println("Wrong shape passed");
            break;
        }
        
        return shapeObject;
    }
}
