package com.humanbooster.zobi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.humanbooster.zobi.business.AnimalServiceTest;
import com.humanbooster.zobi.business.LoginTest;
import com.humanbooster.zobi.business.SpeciesServiceTest;
import com.humanbooster.zobi.business.UserTest;

@RunWith(Suite.class)
@SuiteClasses({ LoginTest.class, UserTest.class, AnimalServiceTest.class, SpeciesServiceTest.class })
public class AllTests {

}