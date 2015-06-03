/**
 * 
 */
package com.humanbooster.zobi.business;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author humanbooster
 *
 */
public class SpeciesServiceTest {
	
	private SpeciesService speciesService;
	private Species species;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		speciesService = new SpeciesService();
    	species = new Species();
    	species.setSpeciesId(12051981);
    	species.setCommonName("Boa");
    	species.setLatinName("Boa constrictor");
    	species.setDiet("Bird");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		speciesService = null;
	}
	
	/**
	 * Test method for {@link com.humanbooster.zobi.business.SpeciesService#persist(Species))}.
	 */
	public final void testPersist() {
		try {
			speciesService.persist(species);
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(false);
		}
	}
	
	/**
	 * Test method for {@link com.humanbooster.zobi.business.SpeciesService#getAllSpecies()}.
	 */
	@Test
	public final void testGetAllSpecies() {
		ArrayList<Species> listSpecies = speciesService.getAllSpecies();
		assertNotNull(listSpecies);
	}

	/**
	 * Test method for {@link com.humanbooster.zobi.business.SpeciesService#getFromId(java.lang.String)}.
	 */
	@Test
	public final void testGetFromId() {
		Species species = speciesService.getFromId("12051981");
		assertNotNull(species);
	}

}
