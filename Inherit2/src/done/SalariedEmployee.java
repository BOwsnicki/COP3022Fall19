package done;

public class SalariedEmployee extends Employee {

	private double salary;
	
	public SalariedEmployee(String name, double salary) {
		super(name);
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
