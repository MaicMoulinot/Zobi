package com.humanbooster.zobi.web;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlInputHidden;
import javax.inject.Inject;

import com.humanbooster.zobi.business.Animal;
import com.humanbooster.zobi.business.AnimalServiceInterface;

@ManagedBean
@SessionScoped
public class ListAnimalsJsf {
	
	@Inject
	private AnimalServiceInterface animalService;
	
	private Animal animal;
	private HtmlDataTable dataTable;
	private HtmlInputHidden animalId;

	/**
	 * Constructor without parameters.
	 */
	public ListAnimalsJsf() {
		animalId = new HtmlInputHidden();
	}
	
    /**
     * @return "animal" (navigation). Set the animal and the hidden input field.
     */
    public String editAnimal() {
        // Get selected MyData item to be edited.
    	animal = (Animal) dataTable.getRowData();
        // Store the ID of the data item in hidden input element.
        animalId.setValue(animal.getAnimalId());
        return "animal"; // Navigation case.
    }
    
	/**
	 * @return a list of all animals.
	 */
	public ArrayList<Animal> getAllAnimals() {
		return animalService.getAllAnimals();
	}

	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return animal;
	}

	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Animal animal) {
		this.animal = animal;
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

	/**
	 * @return the animalId
	 */
	public HtmlInputHidden getAnimalId() {
		return animalId;
	}

	/**
	 * @param animalId the animalId to set
	 */
	public void setAnimalId(HtmlInputHidden dataItemId) {
		this.animalId = dataItemId;
	}
}
