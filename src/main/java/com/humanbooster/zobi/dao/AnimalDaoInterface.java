/**
 * 
 */
package com.humanbooster.zobi.dao;

import java.util.ArrayList;

import com.humanbooster.zobi.business.Animal;

/**
 * @author humanbooster
 *
 */
public interface AnimalDaoInterface extends Dao<Integer, Animal> {

	
	/**
	 * @return a list of all animals' matricule.
	 */
	public ArrayList<String> getAllAnimalsMatricules();
}
