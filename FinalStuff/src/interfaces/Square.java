package interfaces;

public class Square implements Shape {
	private double a;
	
	public Square(double a) {
		this.a = a;
	}

	@Override
	public double circumference() {
		return 4.0*a;
	}
}
