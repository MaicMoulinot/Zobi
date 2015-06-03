package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.humanbooster.zobi.dao.AnimalDaoInterface;

/**
 * @author humanbooster
 *
 */
@Stateless
public class AnimalService implements AnimalServiceInterface {
	
	@Inject
	private AnimalDaoInterface animalDao;
	
	@Override
	public Animal createAnimal(String matricule, int age, String birthPlace, Species species, String enclosure) {
		// Construction of the Animal's instance
		Animal animal = new Animal();
		animal.setMatricule(matricule);
		animal.setAge(age);
		animal.setBirthPlace(birthPlace);
		animal.setSpecies(species);
		animal.setEnclosure(enclosure);
		// Call to Service and Save
		animalDao.persist(animal);
		return animal;
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ArrayList<Animal> getAllAnimals() {
		ArrayList<Animal> result = new ArrayList<>();
		for (Animal animal : animalDao.findAll()) {
			result.add(animal);
		}
		return result;
	}

	/**
	 * This method is used for Junit testing only.
	 * @param animalDao the animalDao to set
	 */
	void setAnimalDao(AnimalDaoInterface animalDao) {
		this.animalDao = animalDao;
	}
}
