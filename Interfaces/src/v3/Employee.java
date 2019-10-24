package v3;


public class Employee extends ComparableMeasurable {
	private int salary;

	public Employee(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int getMeasure() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee with a salary of " + salary;
	}
}
