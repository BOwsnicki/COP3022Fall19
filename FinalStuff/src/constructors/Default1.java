package constructors;

public class Default1 {
	private int count;
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Default1 d = new Default1();
		System.out.println(d.getCount());
	}
}
