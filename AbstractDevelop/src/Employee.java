
public abstract class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Employee: " + name;
	}
	
	public abstract double computeSalary();
}
