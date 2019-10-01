package Abstract;

public class Ferrari extends Vehicle {
	
	public Ferrari(String description) {
		super(description);
	}

	@Override
	public int maxSpeed() {
		return 300;
	}
	
	@Override
	public String toString() {
		return super.toString() + " [Ferrari " + maxSpeed() + "mph]";
	}
}
