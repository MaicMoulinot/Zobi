/**
 * 
 */
package com.humanbooster.zobi.dao;

import java.util.ArrayList;
import java.util.HashMap;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import com.humanbooster.zobi.business.Species;

/**
 * @author humanbooster
 *
 */
@Stateless
@Alternative
public class SpeciesDaoFixed extends DaoFixed<Integer, Species> implements SpeciesDaoInterface {
	
	private static HashMap<Integer, Species> listSpecies;
	
	public SpeciesDaoFixed() {
		if (listSpecies == null) {
			listSpecies = new HashMap<Integer, Species>();
			Species boa = new Species();
			boa.setCommonName("Boa");
			boa.setLatinName("Boa constrictor");
			boa.setDiet("Meat");
			boa.setSpeciesId(0);
			listSpecies.put(0, boa);
			
			Species bonobo = new Species();
			bonobo.setCommonName("Bonobo");
			bonobo.setLatinName("Pan paniscus");
			bonobo.setDiet("Bananas");
			bonobo.setSpeciesId(1);
			listSpecies.put(1, bonobo);
			
			Species elephant = new Species();
			elephant.setCommonName("Elephant");
			elephant.setLatinName("Loxodonta africana");
			elephant.setDiet("Grass");
			elephant.setSpeciesId(2);
			listSpecies.put(2, elephant);
			
			Species kookaburra = new Species();
			kookaburra.setCommonName("Kookaburra");
			kookaburra.setLatinName("Dacelo novaeguineae");
			kookaburra.setDiet("Insects");
			kookaburra.setSpeciesId(3);
			listSpecies.put(3, kookaburra);
			
			Species whale = new Species();
			whale.setCommonName("Whale");
			whale.setLatinName("Eubalaena glacialis");
			whale.setDiet("Krill");
			whale.setSpeciesId(4);
			listSpecies.put(4, whale);
		}
	}

	@Override
	public ArrayList<Species> findAll() {		
		return (ArrayList<Species>) listSpecies.values();
	}

	@Override
	public void persist(Species entity) {
		listSpecies.put(listSpecies.size(), entity);
	}

	@Override
	public void remove(Species entity) {
		listSpecies.remove(entity);
	}

	@Override
	public Species findById(Integer id) {
		return listSpecies.get(id);
	}

}
