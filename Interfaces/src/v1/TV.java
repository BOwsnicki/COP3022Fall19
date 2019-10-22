package v1;

public class TV implements Ordered {
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
	public boolean precedes(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof TV)) {
			return false;
		}
		TV tv = (TV) other;
		return (getPrice() < tv.getPrice());
	}

	@Override
	public boolean follows(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof TV)) {
			return false;
		}
		TV tv = (TV) other;
		return (getPrice() > tv.getPrice());
	}
	
	@Override
	public String toString() {
		return "TV with a price of " + price;
	}
}
