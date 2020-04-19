package solid.principles.ocp;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	public static double calculateArea(List<Shape> shapes) {
		
		double area = 0;
		
		for(Shape shape: shapes) {
			double a = shape.area();
			System.out.println("Area of " + shape.gatName() + " is: " + a);
			area += a;
		}
		
		return area;
	}
	
	public static void main(String[] args) {
	
		Shape rectangle = new Rectangle(2.3, 4.7);
		Shape circle = new Circle(5.2);
		Shape square = new Square(3.6);
		List<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(square);
		
		System.out.println("Total area is : " + calculateArea(shapes));
	}
}
