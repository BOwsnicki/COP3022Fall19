
public class Account {
	private int total;
	
	public Account() {
		total = 0;
	}

	public int getTotal() {
		return total;
	}
	
	public void addAmount(int intAmount) {
		total += intAmount;
	}
	
	public void addAmount(double doubleAmount) { // overloading!
		total += (int)(doubleAmount*100.0);
	}
}
