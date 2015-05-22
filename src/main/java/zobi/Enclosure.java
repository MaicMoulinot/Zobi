package zobi;

import java.util.ArrayList;

import javax.enterprise.inject.Model;

/**
 * @author humanbooster
 *
 */
@Model
public class Enclosure {
	
	private String id;
	private double lenght;
	private double width;
	private ArrayList<Animal> animalsList;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the lenght
	 */
	public double getLenght() {
		return lenght;
	}
	/**
	 * @param lenght the lenght to set
	 */
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the animalsList
	 */
	public ArrayList<Animal> getAnimalsList() {
		return animalsList;
	}
	/**
	 * @param animalsList the animalsList to set
	 */
	public void setAnimalsList(ArrayList<Animal> animalsList) {
		this.animalsList = animalsList;
	}

	
}
