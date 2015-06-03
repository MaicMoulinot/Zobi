package com.humanbooster.zobi.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.humanbooster.zobi.utils.XMLTools;

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

	
    public static void main(String[] args) {
        try {
        	// Construction of object Species
        	Species species = new Species();
        	species.setSpeciesId(12051981);
        	species.setCommonName("Boa");
        	species.setLatinName("Boa constrictor");
        	species.setDiet("Bird");
        	// Encode to XML
            XMLTools.encodeToFile(species, "species.xml");
            System.out.println("encode XML ok : commonname=" + species.getCommonName());
            // Decode from XML
            Species speciesFromXml = (Species) XMLTools.decodeFromFile("species.xml");
            System.out.println("decode XML ok : commonname=" + speciesFromXml.getCommonName());
        } catch(Exception e) {
        	System.out.println("FOIRAGE XML" + e.getMessage());
        }
    }
}
