
public class SalariedEmployee extends Employee {

	private double salary;
	
	public SalariedEmployee(String name) {
		super(name);
	}

	public SalariedEmployee(String name, double salary) {
		this(name);
		this.salary = salary;
	}
	
	@Override
	public double computeSalary() {
		return salary;
	}
	
	public String toString() {
		return super.toString() + " salary: " + salary;
	}
}
