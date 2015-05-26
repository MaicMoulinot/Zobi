package com.humanbooster.zobi.business;

import static org.junit.Assert.assertEquals;

import javax.faces.validator.ValidatorException;

import org.junit.Test;

/**
 * @author humanbooster
 *
 */
public class AnimalTest {

	/**
	 * Test method for {@link zobi.Animal#validateBirthPlace()}.
	 */
	@Test
	public final void testValidateBirthPlace() {
		Animal animal = new Animal();
		try {
			animal.setBirthPlace("MOO");
			animal.validateBirthPlace(null, null, animal.getBirthPlace());
		} catch (ValidatorException exception) {
			assertEquals(true, true); // too small > unvalid
		}
		try {
			animal.setBirthPlace("WILD");
			animal.validateBirthPlace(null, null, animal.getBirthPlace());
		} catch (ValidatorException exception) {
			assertEquals(false, true); // WILD > valid
		}
		try {
			animal.setBirthPlace("ZOO_CHESSY");
			animal.validateBirthPlace(null, null, animal.getBirthPlace());
		} catch (ValidatorException exception) {
			assertEquals(false, true); // ZOO_something > valid
		}
	}

}
