package polymorph;

public class Employee {
	private int salary;
	
	public Employee() {
		this.salary = 1000;
	}
	
	@Override
	public String toString() {
		return "I got " + salary + "!";
	}
}
