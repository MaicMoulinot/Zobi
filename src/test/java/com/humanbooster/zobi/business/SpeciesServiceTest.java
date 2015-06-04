/**
 * 
 */
package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.ejb.Stateless;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.humanbooster.zobi.dao.SpeciesDaoFixed;

/**
 * @author humanbooster
 *
 */
@Stateless
public class SpeciesServiceTest extends TestCase {
	
	private SpeciesService speciesService;
	private Species species;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		speciesService = new SpeciesService();
		speciesService.setSpeciesDao(new SpeciesDaoFixed());
    	species = new Species();
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
		species = null;
	}
	
	/**
	 * Test method for {@link com.humanbooster.zobi.business.SpeciesService#persist(Species))}.
	 */
	public final void testPersist() {
		try {
			speciesService.persist(species);
			assertEquals(species.getCommonName(), "Boa");
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
		Species species = speciesService.getFromId(6);
		assertNotNull(species);
	}

}
