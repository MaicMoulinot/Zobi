package com.humanbooster.zobi.web;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.humanbooster.zobi.business.Animal;
import com.humanbooster.zobi.business.AnimalServiceInterface;

@ManagedBean
@SessionScoped
public class ListAnimalsJsf {
	
	@Inject
	private AnimalServiceInterface animalService;
	
	public ArrayList<Animal> getAllAnimals() {
		return animalService.getAllAnimals();
	}

}
