/**
 * 
 */
package com.humanbooster.zobi.dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import com.humanbooster.zobi.business.Animal;

/**
 * @author humanbooster
 *
 */
@Stateless
@Alternative
public class AnimalDaoFixed extends DaoFixed <Integer, Animal> implements AnimalDaoInterface {

	private static ArrayList<Animal> listAnimals;

	public AnimalDaoFixed() {
		if (listAnimals == null) {
			listAnimals = new ArrayList<>();
		}
	}

	@Override
	public void remove(Animal entity) {
		listAnimals.remove(entity);
	}

	@Override
	public Animal findById(Integer id) {
		return listAnimals.get(id);
	}

	@Override
	public Collection<Animal> findAll() {
		return listAnimals;
	}

	@Override
	public void persist(Animal entity) {
		if (entity.getAnimalId() == 0) {
			System.out.println("je suis dans un setID c'est moche");
			entity.setAnimalId(listAnimals.size());
		}
		listAnimals.add(entity);
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
