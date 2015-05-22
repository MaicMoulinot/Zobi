/**
 * 
 */
package zobi;

import java.util.ArrayList;

import javax.enterprise.inject.Model;

/**
 * @author humanbooster
 *
 */
@Model
public class Species {
	
	private String latinName;
	private String commonName;
	private ArrayList<String> diet;
	
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
	public ArrayList<String> getDiet() {
		return diet;
	}
	/**
	 * @param diet the diet to set
	 */
	public void setDiet(ArrayList<String> diet) {
		this.diet = diet;
	}
	

}
