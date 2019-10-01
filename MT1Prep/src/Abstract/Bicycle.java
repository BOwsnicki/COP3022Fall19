package Abstract;

public class Bicycle extends Vehicle {
	
	public Bicycle(String description) {
		super(description);
	}

	@Override
	public int maxSpeed() {
		return 30;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " [Bicycle " + maxSpeed() + "mph]";
	}

}
