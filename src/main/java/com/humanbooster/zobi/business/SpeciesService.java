package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.humanbooster.zobi.dao.SpeciesDaoInterface;

/**
 * @author humanbooster
 *
 */
@Stateless
public class SpeciesService implements SpeciesServiceInterface {

	@Inject
	private SpeciesDaoInterface speciesDao;

	@Override
	public void persist(Species species) {
		speciesDao.persist(species);
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ArrayList<Species> getAllSpecies() {
		return (ArrayList<Species>) speciesDao.findAll();
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Species getFromId(String speciesId) {
		return speciesDao.findById(Long.valueOf(speciesId));
	}
	
	/**
	 * This method is used for Junit testing only.
	 * @param speciesDao the SpeciesDao to set
	 */
	void setSpeciesDao(SpeciesDaoInterface speciesDao) {
		this.speciesDao = speciesDao;
	}
}
