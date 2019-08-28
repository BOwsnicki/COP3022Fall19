package comparable;

public class CrowdTester {
	public static void main(String[] args) {
		Crowd c = new Crowd();
		c.add(new Person("John", 26));
		c.add(new Person("Paul", 27));
		c.add(new Person("George", 28));
		c.add(new Person("Ringo", 29));
		
		System.out.println(c.getMemberCount());
		
		System.out.println(c.isIn(new Person("George", 28)));
		System.out.println(c.isIn("George"));
	}
}
