
public class EmployeeTester {
	public static void main(String[] args) {
		SalariedEmployee kim = new SalariedEmployee("Kim",2100);
		System.out.println(kim);
		System.out.println(kim.computeSalary());

		HourlyEmployee jim = new HourlyEmployee("Jim",150,12);
		System.out.println(jim);
		System.out.println(jim.computeSalary());
		
		Employee ron = new HourlyEmployee("Ron",130,14);
		System.out.println(ron);
		System.out.println(ron.computeSalary());		
	}
}
