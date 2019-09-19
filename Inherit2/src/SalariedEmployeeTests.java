import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalariedEmployeeTests {

	@Test
	public void standardTests() {
		SalariedEmployee kim = new SalariedEmployee("Kim",2100);
		assertEquals("Employee: Kim salary: 2100.0",kim.toString());
		assertEquals(2100.0,kim.computeSalary(),1e-4);
	}
}
