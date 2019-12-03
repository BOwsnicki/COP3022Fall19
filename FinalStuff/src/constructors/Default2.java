package constructors;

public class Default2 {
	private int count;
	
	public Default2(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Default2 d = new Default2();
		System.out.println(d.getCount());
	}
}
