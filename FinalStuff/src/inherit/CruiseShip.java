package inherit;

public class CruiseShip extends Ship {
	private int maxPassengers;
	
	public CruiseShip(String name, int maxPassengers) {
		super(name);
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public String toString() {
		return super.toString() + " max: " + maxPassengers;
	}
	
	public static void main(String[] args) {
		CruiseShip s = new CruiseShip("Titanic",1200);
		System.out.println(s);
	}
}
