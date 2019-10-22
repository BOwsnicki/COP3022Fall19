package v1;

public class OrderedDemo {

	public static Ordered min(Ordered[] o) {
		Ordered smallest = o[0]; // Unsafe! Why?
		for (int i = 1; i < o.length; i++) {
			if (o[i].precedes(smallest)) {
				smallest = o[i];
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		Ordered[] stuff = new Ordered[5];
		stuff[0] = new TV(1900);
		stuff[1] = new TV(1600);
		stuff[2] = new Employee(2000);
		stuff[3] = new TV(1500);
		stuff[4] = new Employee(1400);
		
		Ordered smallest = min(stuff);
		System.out.println(smallest);
	}
}
