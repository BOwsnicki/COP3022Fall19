
public class PersonDemo {
	public static void main(String[] args) {
		// 1. Create a Person instance
		// Person p1 = new Person();
		Person p1 = new Person("Jane",23);
					
		// 3. Call getters
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		// Create another person
		
		Person p2 = new Person("John",24);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		if (p1.canVote()) {
			System.out.println(p1.getName() + " can vote");
		} else {
			System.out.println(p1.getName() + " cannot vote");
		}
	}
}
