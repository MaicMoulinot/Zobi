/**
 * 
 */
package com.humanbooster.zobi.business;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.humanbooster.zobi.dao.AnimalDaoFixed;

/**
 * @author humanbooster
 *
 */
public class AnimalServiceTest extends TestCase {
	
	AnimalService animalService;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		animalService = new AnimalService();
		animalService.setAnimalDao(new AnimalDaoFixed());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		animalService = null;
	}

	/**
	 * Test method for {@link com.humanbooster.zobi.business.AnimalService#createAnimal(java.lang.String, int, java.lang.String, com.humanbooster.zobi.business.Species, java.lang.String)}.
	 */
	@Test
	public final void testCreateAnimal() {
		Species boa = new Species();
		boa.setSpeciesId(3);
		boa.setCommonName("Boa");
		Animal babar = animalService.createAnimal("babar", 197, "WILD", boa, "POOL");
		assertNotNull(babar);
	}

	/**
	 * Test method for {@link com.humanbooster.zobi.business.AnimalService#getAllAnimals()}.
	 */
	@Test
	public final void testGetAllAnimals() {
		ArrayList<Animal> listAnimal = animalService.getAllAnimals();
		assertNotNull(listAnimal);
		boolean babarExists = false;
		for (Animal animal : listAnimal) {
			if (animal.getMatricule() == "babar") {
				assertTrue(true);
				babarExists = true;
				break;
			}
		}
		if (!babarExists) {
			assertTrue(false);
		}
	}
}
