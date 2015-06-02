package com.humanbooster.zobi.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import com.humanbooster.zobi.business.AnimalServiceInterface;
import com.humanbooster.zobi.business.Species;
import com.humanbooster.zobi.business.SpeciesServiceInterface;

@ManagedBean
@SessionScoped
public class AnimalJsf {

	@Inject
	private AnimalServiceInterface animalService;
	@Inject
	private SpeciesServiceInterface speciesService;

	private String matricule;
	private int age;
	private String birthPlace;
	private String speciesId;
	private String enclosure;

	/**
	 * @param context a FacesContext.
	 * @param component a UIComponent.
	 * @param value an Object the birthPlace to validate.
	 * @throws ValidatorException
	 */
	public void validateBirthPlace(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String birthPlace = (String) value;
		String errorMessage = null;
		if (birthPlace.length() < 4) {
			errorMessage = "The birth place must be at least 4 characters long.";
		}
		if (errorMessage == null && !birthPlace.startsWith("ZOO_") && !birthPlace.matches("WILD")) {
			errorMessage = "The birth place must be on format 'WILD' or 'ZOO_something'.";
		}
		if (errorMessage != null) {
			FacesMessage facesMessage = new FacesMessage(errorMessage);
			facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(facesMessage);
		}
	}

	public String create() {
		Species speciesFromDao = speciesService.getFromId(speciesId);
		animalService.createAnimal(matricule, age, birthPlace, speciesFromDao, enclosure);
		return "create";
	}

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
	public String getSpeciesId() {
		return speciesId;
	}

	/**
	 * @param species
	 *            the species to set
	 */
	public void setSpeciesId(String speciesId) {
		this.speciesId = speciesId;
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

}
