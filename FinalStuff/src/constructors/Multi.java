package constructors;

public class Multi {
	private int number;
	
	public Multi(int number) {
		this.number = number;
	}
	
	public Multi() {
		// preferred over this.number = 100
		this(100);
	}
}
