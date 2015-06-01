package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
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
	@Inject
	private SpeciesServiceInterface speciesService;
	
	@Override
	public Animal createAnimal(String matricule, int age, String birthPlace, String speciesId, String enclosure) {
		Animal animal = new Animal();
		animal.setMatricule(matricule);
		animal.setAge(age);
		animal.setBirthPlace(birthPlace);
		Species speciesFromDao = speciesService.getFromId(speciesId);
		animal.setSpecies(speciesFromDao);
		animal.setEnclosure(enclosure);
		animalDao.persist(animal);
		return animal;
	}

	@Override
	public ArrayList<Animal> getAllAnimals() {
		return (ArrayList<Animal>) animalDao.findAll();
	}
}
