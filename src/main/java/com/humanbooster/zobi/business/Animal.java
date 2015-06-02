package com.humanbooster.zobi.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity(name="animal")
@NamedQuery(name="Animal.findAll", query="SELECT a FROM animal a")
public class Animal {

	@Id
	@GeneratedValue
	private long AnimalId;
	@Column(unique=true)
	private String matricule;
	private int age;
	private String birthPlace;
	private String enclosure;
	@ManyToOne
	private Species species;

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the birthPlace
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * @param birthPlace
	 *            the birthPlace to set
	 */
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	/**
	 * @return the species
	 */
	public Species getSpecies() {
		return species;
	}

	/**
	 * @param species
	 *            the species to set
	 */
	public void setSpecies(Species species) {
		this.species = species;
	}

	/**
	 * @return the enclosure
	 */
	public String getEnclosure() {
		return enclosure;
	}

	/**
	 * @param enclosure the enclosure to set
	 */
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	/**
	 * @return the id
	 */
	public long getAnimalId() {
		return AnimalId;
	}

	/**
	 * @param id the id to set
	 */
	public void setAnimalId(long id) {
		this.AnimalId = id;
	}

}
