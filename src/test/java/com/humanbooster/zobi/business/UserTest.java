package zobi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.humanbooster.zobi.business.User;

public class UserTest {

	@Test
	public void test() {
		User tester = new User();

		assertEquals("en cours de developpement", "nok", tester.validate());
	}

}
