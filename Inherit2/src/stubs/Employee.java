package stubs;

public class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Employee: " + name;
	}
	
	public double computeSalary() {
		return 0.0;
	}
}
