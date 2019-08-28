import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InvoiceTests {

	private Invoice inv = new Invoice();
	
	@Test
	void test() {
		inv.addAmount(10);
		assertEquals(10,inv.getTotal());
		inv.addAmount(10.25);
		assertEquals(1035,inv.getTotal());
		inv.addAmount(-100);
		assertEquals(935,inv.getTotal());
		inv.addAmount(-5.55);
		assertEquals(380,inv.getTotal());
		inv.addAmount(0);
		assertEquals(380,inv.getTotal());
		inv.addAmount(0.0);
		assertEquals(380,inv.getTotal());
	}

}
