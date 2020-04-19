package solid.principles.ocp;

public class Square implements Shape {

	private double edge;
	
	public Square(double edge) {
		this.edge = edge;
	}
	
	public double area() {
		return edge * edge;
	}

	public String gatName() {
		return "Square";
	}

}
