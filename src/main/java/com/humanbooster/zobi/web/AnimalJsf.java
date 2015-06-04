package com.humanbooster.zobi.web;

import java.util.ArrayList;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import com.humanbooster.zobi.business.Animal;
import com.humanbooster.zobi.business.AnimalServiceInterface;
import com.humanbooster.zobi.business.Species;
import com.humanbooster.zobi.business.SpeciesServiceInterface;

@Model
public class AnimalJsf {

	@Inject
	private AnimalServiceInterface animalService;
	@Inject
	private SpeciesServiceInterface speciesService;

	private String matricule;
	private int age;
	private String birthPlace;
	private long speciesId;
	private String enclosure;
	
	// Managed Backing Bean
	private HtmlDataTable dataTable;
	
    /**
     * @return "animal" (navigation). Set the animal and the hidden input field.
     */
    public String editAnimal() {
        // Get selected animal to be displayed.
    	Animal animalFromList = (Animal) dataTable.getRowData();
    	if (animalFromList != null) {
    		// Set animal's properties to be displayed.
    		setMatricule(animalFromList.getMatricule());
    		setAge(animalFromList.getAge());
    		setBirthPlace(animalFromList.getBirthPlace());
    		setEnclosure(animalFromList.getEnclosure());
    		setSpeciesId(animalFromList.getSpecies().getSpeciesId());
    	}
    	// Navigation case.
        return "animal";
    }
    
	/**
	 * @return a list of all animals.
	 */
	public ArrayList<Animal> getAllAnimals() {
		return animalService.getAllAnimals();
	}
    
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
	public long getSpeciesId() {
		return speciesId;
	}

	/**
	 * @param species
	 *            the species to set
	 */
	public void setSpeciesId(long speciesId) {
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

	/**
	 * @return the dataTable
	 */
	public HtmlDataTable getDataTable() {
		return dataTable;
	}

	/**
	 * @param dataTable the dataTable to set
	 */
	public void setDataTable(HtmlDataTable dataTable) {
		this.dataTable = dataTable;
	}

}
