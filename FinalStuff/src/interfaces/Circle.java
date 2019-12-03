package interfaces;

public class Circle implements Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double circumference() {
		return 2.0*Math.PI*r;
	}
}
