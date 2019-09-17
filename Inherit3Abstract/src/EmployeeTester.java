
public class EmployeeTester {
	
	public static void showEmployee(Employee e) {
		System.out.println(e);
		System.out.println(e.computeSalary());
	}
	
	public static void main(String[] args) {
		Employee tim = new Employee("Tim");
		SalariedEmployee kim = new SalariedEmployee("Kim",2100);
		HourlyEmployee jim = new HourlyEmployee("Jim",150,12);
		Manager dim = new Manager("Dim",3200,1200);

		showEmployee(tim);
		showEmployee(kim);
		showEmployee(jim);
		showEmployee(dim);
		
		Employee zim = (Employee)dim;
		showEmployee(zim);
	}
}
