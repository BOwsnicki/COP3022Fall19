import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests2 {

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
	
	@Test
	void testCalcMultiplication() {
	    assertEquals(10,Calculator.multiply(2,5), "Simple multiplication test");
	    assertEquals(0,Calculator.multiply(2,0), "Multiplication by 0");
	    assertEquals(0,Calculator.multiply(0,2), "Multiplication by 0");
	    assertEquals(16,Calculator.multiply(4,4), "Multiplying equal numbers");
	    assertEquals(-6,Calculator.multiply(2,-3), "Multiplying one positive one negative");
	    assertEquals(-6,Calculator.multiply(-2,3), "Multiplying one positive one negative");
	    assertEquals(6,Calculator.multiply(-2,-3), "Multiplying two negative");
	}
}
