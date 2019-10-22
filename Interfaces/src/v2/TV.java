package v2;


public class TV implements Measurable, Ordered {
	private int price;

	public TV(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getMeasure() {
		return price;
	}

	
	@Override
	public boolean precedes(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Measurable)) {
			return false;
		}
		Measurable m = (Measurable) other;
		return (getMeasure() < m.getMeasure());
	}

	@Override
	public boolean follows(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Measurable)) {
			return false;
		}
		Measurable m = (Measurable) other;
		return (getMeasure() > m.getMeasure());
	}

	@Override
	public String toString() {
		return "TV with a price of " + price;
	}
}
