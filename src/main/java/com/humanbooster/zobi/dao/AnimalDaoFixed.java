/**
 * 
 */
package com.humanbooster.zobi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import com.humanbooster.zobi.business.Animal;

/**
 * @author humanbooster
 *
 */
@Stateless
@Alternative
public class AnimalDaoFixed extends DaoFixed <Long, Animal> implements AnimalDaoInterface {

	private static HashMap<Long, Animal> listAnimals;

	public AnimalDaoFixed() {
		if (listAnimals == null) {
			listAnimals = new HashMap<Long, Animal>();
		}
	}

	@Override
	public void remove(Animal entity) {
		listAnimals.remove(entity);
	}

	@Override
	public Animal findById(Long id) {
		return listAnimals.get(id);
	}

	@Override
	public Collection<Animal> findAll() {
		return listAnimals.values();
	}

	@Override
	public void persist(Animal entity) {
		listAnimals.put(entity.getAnimalId(), entity);
	}

	@Override
	public ArrayList<String> getAllAnimalsMatricules() {
		ArrayList<String> listMatricules = new ArrayList<>();
		for (Animal animal : findAll()) {
			listMatricules.add(animal.getMatricule());
		}
		return listMatricules;
	}

}
