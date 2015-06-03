package com.humanbooster.zobi.business;

import java.util.ArrayList;

/**
 * @author humanbooster
 *
 */
public interface SpeciesServiceInterface {

	/**
	 * @return a list of all species.
	 */
	public void persist(Species species);
	/**
	 * @return a list of all species.
	 */
	public ArrayList<Species> getAllSpecies();

	/**
	 * @param speciesId a String the species' Id.
	 * @return the Species.
	 */
	public Species getFromId(String speciesId);
}
