package zobi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLogin {

	@Test
	public void test() {

		Login tester = new Login();

		tester.setLogin("joe");
		tester.setPassword("dalton");
		assertEquals("joe dalton is on admin index.xhtml", "admin", tester.validate());

		tester.setLogin("spider");
		tester.setPassword("man");
		assertEquals("joe dalton is on veto index.xhtml", "veto", tester.validate());

		tester.setLogin("luke");
		tester.setPassword("skywalker");
		assertEquals("joe dalton is on soigneur index.xhtml", "soigneur", tester.validate());

		tester.setLogin("john");
		tester.setPassword("doe");
		assertEquals("john doe is on forbidden.xhtml", "nok", tester.validate());
	}

}
