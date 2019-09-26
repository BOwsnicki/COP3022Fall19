package done1;
public class Payroll {
	private static final int MAX_EMP = 10;

	private Employee[] list;
	private int numberEmployees;
	private int payrollTotal;

	public Payroll() {
		list = new Employee[MAX_EMP];
		numberEmployees = 0;
		payrollTotal = 0;
	}

	public void addEmployee(Employee e) {
		if (numberEmployees < MAX_EMP) {
			payrollTotal += e.computeSalary();
			list[numberEmployees++] = e;
		} else {
		}
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public int getPayrollTotal() {
		return payrollTotal;
	}

	public String toString() {
		// todo
		return ("");
	}
}