package arraylists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
	ArrayList<Car> cars;
	
	public Garage() {
		cars = new ArrayList<>();
	}
	
	public Garage(String fileName) {
		this();
		Scanner fInput = null;
		try {
			fInput = new Scanner(new FileInputStream(fileName));
			while (fInput.hasNextLine()) {
				String make = fInput.next();
				String model = fInput.next();
				int hp = fInput.nextInt();
				cars.add(new Car(make,model,hp));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { fInput.close(); }
		
	}
	
	public void addCar(Car c) {
		cars.add(c);
	}
	
	@Override
	public String toString() {
		String result = "";
		for (Car c: cars) {
			result += c + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Garage g = new Garage("in.txt");
		System.out.println(g);
	}
}
