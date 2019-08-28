
public class PersonTester {
	public static void main(String[] args) {
		Person p = new Person("Peter", 25);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		p.setName("Paul");
		System.out.println(p.getName());
		System.out.println(p.getAge());

		p.setAge(16);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		System.out.println(p.canVote());
		p.setAge(26);
		System.out.println(p.canVote());
		
		// Border cases: 17, 18, 19
		p.setAge(17);
		System.out.println("17: " + p.canVote());

		p.setAge(18);
		System.out.println("18: " + p.canVote());
		
		p.setAge(19);
		System.out.println("19: " + p.canVote());

		// Illegal cases?
		p.setName("");
		p.setName(null);
		p.setAge(5000);
		p.setAge(-42);
		
		
	}
}
