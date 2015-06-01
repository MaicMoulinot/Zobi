/**
 * 
 */
package com.humanbooster.zobi.dao;

import java.util.ArrayList;

import javax.ejb.Stateless;

import com.humanbooster.zobi.business.Animal;

/**
 * @author humanbooster
 *
 */
@Stateless
public class AnimalDaoJpa extends DaoJpa<Long, Animal> implements AnimalDaoInterface {

	@Override
	public ArrayList<String> getAllAnimalsMatricules() {
		ArrayList<String> listMatricules = new ArrayList<>();
		for (Animal animal : findAll()) {
			listMatricules.add(animal.getMatricule());
		}
		return listMatricules;
	}

}
