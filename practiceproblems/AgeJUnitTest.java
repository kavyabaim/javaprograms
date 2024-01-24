package practiceproblems;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeJUnitTest {

	@Test
	public void testCorrectTest() {
		AgeJUnit age = new AgeJUnit();
		age.setAge(20);
		assertTrue(age.checkAge());
	}
	
	@Test
	public void testWrongTest() {
		AgeJUnit age = new AgeJUnit();
		age.setAge(15);
		assertFalse(age.checkAge());
	}

}
