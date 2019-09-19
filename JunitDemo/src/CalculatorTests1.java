import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests1 {

	@Test
	void testCalcAddition() {
	    assertEquals(7,Calculator.add(2,5), "Simple addition test");
	    assertEquals(2,Calculator.add(2,0), "Addition of 0");
	    assertEquals(2,Calculator.add(0,2), "Addition of 0");
	    assertEquals(8,Calculator.add(4,4), "Adding equal numbers");
	    assertEquals(-1,Calculator.add(2,-3), "Adding one positive one negative");
	    assertEquals(1,Calculator.add(-2,3), "Adding one positive one negative");
	    assertEquals(-5,Calculator.add(-2,-3), "Adding two negative");
	}
}
