package v1;

public class Employee implements Ordered {
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
	public boolean precedes(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Employee)) {
			return false;
		}
		Employee emp = (Employee) other;
		return (getSalary() < emp.getSalary());
	}

	@Override
	public boolean follows(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Employee)) {
			return false;
		}
		Employee emp = (Employee) other;
		return (getSalary() > emp.getSalary());
	}
	
	@Override
	public String toString() {
		return "Employee with a salary of " + salary;
	}
}
