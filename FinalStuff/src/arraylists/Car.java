package arraylists;

public class Car {
	private String make;
	private String model;
	private int hp;

	public Car(String make, String model, int hp) {
		this.make = make;
		this.model = model;
		this.hp = hp;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	  public String toString()
	  {
	    return "make = " + make + " model = " + model + " hp = " + hp;
	  }
}
