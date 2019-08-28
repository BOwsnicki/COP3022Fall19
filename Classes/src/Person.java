
public class Person {
	// 1. Instance fields
	// 1. Instance variables
	private String name;
	private int age;
	
	
	
	// 2. Constructor
	// A Constructor initializes ALL instance fields
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3. get/set methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	// 4. derived methods
	public boolean canVote() {
		return (age >= 18);
	}
}
