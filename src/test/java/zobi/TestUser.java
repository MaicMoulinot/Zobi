package zobi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUser {

	@Test
	public void test() {
		User tester = new User();

		assertEquals("en cours de developpement", "nok", tester.validate());
	}

}