package com.humanbooster.zobi.business;

import java.util.ArrayList;

import javax.ejb.Stateless;
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
	public ArrayList<Species> getAllSpecies() {
		return (ArrayList<Species>) speciesDao.findAll();
	}

	@Override
	public Species getFromId(String speciesId) {
		return speciesDao.findById(Long.getLong(speciesId));
	}
}
