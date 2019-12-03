package inherit;

public class Ship {
	private String name;
	
	public Ship(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[Ship] " + name;
	}
}
