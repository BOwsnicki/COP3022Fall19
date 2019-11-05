package comparable;


public class Employee implements Comparable<Employee> {
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
	public String toString() {
		return "Employee with a salary of " + getSalary();
	}

	@Override
	public int compareTo(Employee o) {
		if (o == null) {	// we still have to check for null
			throw new NullPointerException();
		}
		return (getSalary() - o.getSalary());
	}
}
