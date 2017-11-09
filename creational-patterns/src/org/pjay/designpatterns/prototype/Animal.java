/**
 * 
 */
package org.pjay.designpatterns.prototype;

/**
 * @author vijayk
 *
 */
public abstract class Animal implements Cloneable{

	private String name;
	private int numberOfLegs;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Animal clone() {
		Animal clonedAnimal = null;
		try {
			clonedAnimal = (Animal) super.clone();
			clonedAnimal.setName(name);// Shallow copy, but string being immutable can have a different behavior
			//clonedAnimal.setName(new String(name));// Deep copy
			clonedAnimal.setNumberOfLegs(numberOfLegs);// primitive data types only copy of data is passed. So nothing to worry about Shallow or Deep copy
			clonedAnimal.setDescription(description);// Shallow copy
			//clonedAnimal.setDescription(new String(description));// Deep copy
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedAnimal;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", numberOfLegs=" + numberOfLegs + ", description=" + description + "]";
	}

}
