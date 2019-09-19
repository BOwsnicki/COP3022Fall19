import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class EmployeeTests {
	   private Payroll Payroll = new Payroll();
	   private Employee employee = new Employee();

	   //test to check appraisal
	   @Test
	   public void testCalculateBonus() {
	      employee.setName("Paul");
	      employee.setAge(25);
	      employee.setMonthlySalary(3000);
			
	      double bonus = Payroll.calculateBonus(employee);
	      assertEquals(500, bonus, 0.0);
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("George");
	      employee.setAge(29);
	      employee.setMonthlySalary(4000);
			
	      double salary = Payroll.calculateYearlySalary(employee);
	      assertEquals(48000, salary, 0.0);
	   }

}
