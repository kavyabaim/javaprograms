package practiceproblems;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginJUnitTest {

	@Test
	public void testCorrectTest() {
		LoginJUnit login = new LoginJUnit();
		login.setUsername("admin");
		login.setPassword("admin123");
		assertTrue(login.checkLogin());
	}
	
	@Test
	public void testWrongTest() {
		LoginJUnit login = new LoginJUnit();
		login.setUsername("admin1");
		login.setPassword("admin1231");
		assertFalse(login.checkLogin());
	}
	
	
}
