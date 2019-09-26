package done2;
public class Payroll {
	private static final int MAX_EMP = 10;

	private Employee[] list;
	private int numberEmployees;

	public Payroll() {
		list = new Employee[MAX_EMP];
		numberEmployees = 0;
	}

	public void addEmployee(Employee e) {
		if (numberEmployees < MAX_EMP) {
			list[numberEmployees++] = e;
		} else {
		}
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public int getPayrollTotal() {
		int total = 0;
		for (int i = 0; i < numberEmployees; i++) {
			total += list[i].computeSalary();
		}
		return total;
	}

	public String toString() {
		// todo
		return ("");
	}
}