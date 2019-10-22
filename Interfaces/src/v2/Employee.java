package v2;


public class Employee implements Measurable, Ordered {
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
	public boolean precedes(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Measurable)) {
			return false;
		}
		Measurable m = (Measurable) other;
		return (getMeasure() < m.getMeasure());
	}

	@Override
	public boolean follows(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Measurable)) {
			return false;
		}
		Measurable m = (Measurable) other;
		return (getMeasure() > m.getMeasure());
	}

	@Override
	public String toString() {
		return "Employee with a salary of " + salary;
	}
}
