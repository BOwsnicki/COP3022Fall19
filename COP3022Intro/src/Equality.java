
public class Equality {

	public static void main(String[] args) {
		Person p1 = new Person("Paul",33);
		// Person p2 = new Person("Paul",33);
		Person p2 = p1;
		
		// Equality 1
		System.out.println(p1 == p2);
		
		// Equality 2
		System.out.println(p1.equals(p2));
				
		System.out.println("p1: " + p1.getName());
		System.out.println("p2: " + p2.getName());
		
		p1.setName("Hubert");
		
		System.out.println("p1: " + p1.getName());
		System.out.println("p2: " + p2.getName());
		
	}
}
