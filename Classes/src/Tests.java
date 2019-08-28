import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void test() {
		Person p = new Person("Peter", 25);
		assertEquals("Peter", p.getName());
		assertEquals(25, p.getAge());
		
		p.setName("Paul");
		assertEquals("Paul", p.getName());
		assertEquals(25, p.getAge());
		
		p.setAge(16);
		assertEquals("Paul", p.getName());
		assertEquals(16, p.getAge());
		
		p.setAge(26);
		assertTrue(p.canVote());
		
		p.setAge(17);
		assertEquals(false,p.canVote());
		
		p.setAge(18);
		assertEquals(true,p.canVote());
		
		p.setAge(19);
		assertEquals(true,p.canVote());
	}
}
