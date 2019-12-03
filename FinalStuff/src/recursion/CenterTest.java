package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CenterTest {

	@Test
	void testCenter() {
	    assertEquals("za",StringUtils.center("hazard"), "Simple even test");
	    assertEquals("i",StringUtils.center("Strings"), "Simple odd test");
	    assertEquals("",StringUtils.center(""), "Test with empty string");
	    assertEquals("X",StringUtils.center("X"), "Test with one char string");
	}

}
