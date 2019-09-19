import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTests {

	@Test
	public void standardTests() {
		Employee ron = new Employee("Ron");
		assertEquals("Employee: Ron",ron.toString());
		assertEquals(0.0,ron.computeSalary(),1e-4);
	}
}
