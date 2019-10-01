package Equality;

public class Person {
	
	// 1. Define instance variables
	
	private String name;
	private int age;
	

	// 1b. Write constructor
	public Person(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	// 2. Define setters and getters
	
	// setter for "name"
	
	public void setName(String newName) {
		name = newName;
	}
	
	// setter for "age"
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	// getter for "name"
	
	public String getName() {
		return name;
	}
	
	// getter for "age"
	public int getAge() {
		return age;
	}
	
	// Can this person vote?
	public boolean canVote() {
		return (age >= 18);
	}
}
