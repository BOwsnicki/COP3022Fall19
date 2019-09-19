import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HourlyEmployeeTests {

	@Test
	public void standardTests() {
		HourlyEmployee jim = new HourlyEmployee("Jim",150,12);
		assertEquals("Employee: Jim hours: 150.0 pay/h: 12.0",jim.toString());
		assertEquals(1800.0,jim.computeSalary(),1e-4);
	}
}
