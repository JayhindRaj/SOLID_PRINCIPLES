package solid.principles.ocp;

public class Circle implements Shape{
	private double radius;
	private static double PI = 3.141723856;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return PI*radius*radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String gatName() {
		return "Circle";
	}
}
