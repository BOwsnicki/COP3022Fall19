package Unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceTests {
	
	private Invoice inv = new Invoice();
	
	@Test
	void test() {
		assertEquals(0, inv.getNumberOfPositions());
		assertEquals(0, inv.getTotal());
		
		
		inv.addPosition(new Position("Towels", 1350));
		assertEquals(1, inv.getNumberOfPositions());
		assertEquals(1350, inv.getTotal());
		
		inv.addPosition(new Position("Soap", 2255));
		assertEquals(2, inv.getNumberOfPositions());
		assertEquals((1350 + 2255), inv.getTotal());
		
		inv.addPosition(new Position("Shampoo Credit", -1120));
		assertEquals(3, inv.getNumberOfPositions());
		assertEquals((1350 + 2255 - 1120), inv.getTotal());
		
		inv.addPosition(new Position("", 0));
		assertEquals(4, inv.getNumberOfPositions());
		assertEquals((1350 + 2255 - 1120 + 0), inv.getTotal());
	}

}
