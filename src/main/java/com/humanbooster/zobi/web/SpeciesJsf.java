package com.humanbooster.zobi.web;

import java.util.ArrayList;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.humanbooster.zobi.business.Species;
import com.humanbooster.zobi.business.SpeciesServiceInterface;

@Model
public class SpeciesJsf {
	
	@Inject
	private SpeciesServiceInterface speciesService;
	private String latinName;
	private String commonName;
	private String diet;
	
	/**
	 * @return a list of all Species
	 */
	public ArrayList<Species> getAllSpecies() {
		return speciesService.getAllSpecies();
	}
	
	/**
	 * @return the latinName
	 */
	public String getLatinName() {
		return latinName;
	}
	/**
	 * @param latinName the latinName to set
	 */
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	/**
	 * @return the commonName
	 */
	public String getCommonName() {
		return commonName;
	}
	/**
	 * @param commonName the commonName to set
	 */
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	/**
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}
	/**
	 * @param diet the diet to set
	 */
	public void setDiet(String diet) {
		this.diet = diet;
	}

}
