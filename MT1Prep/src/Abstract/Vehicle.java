package Abstract;

public abstract class Vehicle {
	public String description;
	
	public Vehicle(String description) {
		this.description = description;
	}
	
	public abstract int maxSpeed();
	
	public String toString() {
		return "Vehicle: " + description;
	}

}
