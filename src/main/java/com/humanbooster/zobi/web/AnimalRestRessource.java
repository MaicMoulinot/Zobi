package com.humanbooster.zobi.web;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.humanbooster.zobi.business.Animal;
import com.humanbooster.zobi.business.AnimalServiceInterface;

@Path("/animal")
public class AnimalRestRessource {
	
	@Inject
	private AnimalServiceInterface animalService;
	
	// This method is called if XML or JSON is requested MediaType.APPLICATION_JSON, 
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public List<Animal> getListAnimals() {
		return animalService.getAllAnimals();
	}
}
