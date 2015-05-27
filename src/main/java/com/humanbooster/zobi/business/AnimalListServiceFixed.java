/**
 * 
 */
package com.humanbooster.zobi.business;

import java.util.ArrayList;

/**
 * @author humanbooster
 *
 */
public class AnimalListServiceFixed implements AnimalListServiceInterface {

	@Override
	public ArrayList<Species> getAllSpecies() {
		ArrayList<Species> result = new ArrayList<>();
		Species boa = new Species();
		boa.setCommonName("Boa");
		boa.setLatinName("Boa constrictor");
		result.add(boa);
		
		Species bonobo = new Species();
		bonobo.setCommonName("Bonobo");
		bonobo.setLatinName("Pan paniscus");
		result.add(bonobo);
		
		Species elephant = new Species();
		elephant.setCommonName("Elephant");
		elephant.setLatinName("Loxodonta africana");
		result.add(elephant);
		
		Species kookaburra = new Species();
		kookaburra.setCommonName("Kookaburra");
		kookaburra.setLatinName("Dacelo novaeguineae");
		result.add(kookaburra);
		
		Species whale = new Species();
		whale.setCommonName("Whale");
		whale.setLatinName("Eubalaena glacialis");
		result.add(whale);
		
		return result;
	}

}
