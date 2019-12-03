package interfaces;

import java.util.ArrayList;

public class ShapeDemo {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(1.0));
		shapes.add(new Square(1.0));
		
		double sum = 0;
		for (Shape s: shapes) {
			sum += s.circumference();
		}
		
		System.out.println(sum);
	}
}
