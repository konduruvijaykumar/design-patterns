/**
 * 
 */
package org.pjay.designpatterns.prototype;

/**
 * @author vijayk
 *
 */
public class AnimalCreator {
	
	Chiken chiken;
	Sheep sheep;
	
	public AnimalCreator() {
		chiken = new Chiken();
		sheep = new Sheep();
	}
	
	public Chiken getChiken() {
		return chiken;
	}
	
	public Sheep getSheep() {
		return sheep;
	}
	
	public void setAnimalData(String name, int numberOfLegs, String description, String animalType) {
		if("chiken".equalsIgnoreCase(animalType)) {
			setAnimalData(name, numberOfLegs, description, chiken);
		}else if("sheep".equalsIgnoreCase(animalType)) {
			setAnimalData(name, numberOfLegs, description, sheep);
		}
	}
	
	private void setAnimalData(String name, int numberOfLegs, String description, Animal animal) {
		animal.setName(name);
		animal.setNumberOfLegs(numberOfLegs);
		animal.setDescription(description);
	}
	
	public Animal getCloneAnimal(String animalType) {
		if("chiken".equalsIgnoreCase(animalType)) {
			return chiken.clone();
		}else if("sheep".equalsIgnoreCase(animalType)) {
			return sheep.clone();
		}
		return null;
	}

}
