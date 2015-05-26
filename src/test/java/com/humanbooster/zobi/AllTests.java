package com.humanbooster.zobi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.humanbooster.zobi.business.AnimalTest;
import com.humanbooster.zobi.business.EnclosureTest;
import com.humanbooster.zobi.business.LoginTest;
import com.humanbooster.zobi.business.SpeciesTest;
import com.humanbooster.zobi.business.UserTest;

@RunWith(Suite.class)
@SuiteClasses({ AnimalTest.class, LoginTest.class, UserTest.class, EnclosureTest.class, SpeciesTest.class })
public class AllTests {

}