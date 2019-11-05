package v4;


public class TV implements ComparableMeasurable {
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
	public String toString() {
		return "TV with a price of " + price;
	}
}