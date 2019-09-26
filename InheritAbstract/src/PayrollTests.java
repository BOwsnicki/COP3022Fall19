import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PayrollTests {
	private static Payroll p = new Payroll();
	
	@BeforeAll
	static void setup() {
	    // do nothing yet
	}
	 
	@Test
	void testEmpty() {
		assertEquals(0,p.getNumberEmployees());
		assertEquals(0,p.getPayrollTotal());
	}
	
	@Test
	void test1() {
		Employee e1 = new SalariedEmployee("e1",1500);
		p.addEmployee(e1);
		assertEquals(1,p.getNumberEmployees());
		assertEquals(1500,p.getPayrollTotal());
	}
	
	@Test
	void test2() {
		Employee e2 = new SalariedEmployee("e2",1850);
		p.addEmployee(e2);
		assertEquals(2,p.getNumberEmployees());
		assertEquals(3350,p.getPayrollTotal());
	}
	
	@Test
	void test3() {
		Employee e3 = new HourlyEmployee("e3",156,13); // 2028
		p.addEmployee(e3);
		assertEquals(3,p.getNumberEmployees());
		assertEquals(5378,p.getPayrollTotal());
	}
	
	@Test
	void test4() {
		Employee e4 = new Manager("e4",8500,500); // 9000
		p.addEmployee(e4);
		assertEquals(4,p.getNumberEmployees());
		assertEquals(14378,p.getPayrollTotal());
	}
}
