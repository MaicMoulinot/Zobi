package com.humanbooster.zobi.business;

import java.util.ArrayList;


/**
 * @author humanbooster
 *
 */
public interface AnimalServiceInterface {
	
	/**
	 * @param matricule String the matricule.
	 * @param age int the age in days.
	 * @param birthPlace String the origin.
	 * @param species Species the species.
	 * @param enclosure String the enclosure name.
	 * @return an Animal.
	 * @see com.humanbooster.zobi.business.Animal
	 */
	public Animal createAnimal(String matricule, int age, String birthPlace, Species species, String enclosure);
	
	/**
	 * @return a list of all animals.
	 * @see com.humanbooster.zobi.business.Animal
	 */
	public ArrayList<Animal> getAllAnimals();
	
	/**
	 * @param idAnimal a long the animal's id.
	 * @return teh Animal
	 */
	public Animal getAnimal(long idAnimal);
}
