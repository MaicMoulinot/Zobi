package com.humanbooster.zobi.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * @author humanbooster
 *
 */
@Entity(name="species")
@NamedQuery(name="Species.findAll", query="SELECT s FROM species s")
public class Species {
	 
	@Id
	@GeneratedValue
	private long SpeciesId;
	@Column(unique=true)
	private String latinName;
	private String commonName;
	private String diet;
	
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
	/**
	 * @return the id
	 */
	public long getSpeciesId() {
		return SpeciesId;
	}
	/**
	 * @param id the id to set
	 */
	public void setSpeciesId(long id) {
		this.SpeciesId = id;
	}

}
