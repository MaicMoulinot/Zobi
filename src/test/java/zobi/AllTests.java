package zobi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AnimalTest.class, LoginTest.class, UserTest.class, EnclosureTest.class, SpeciesTest.class })
public class AllTests {

}
