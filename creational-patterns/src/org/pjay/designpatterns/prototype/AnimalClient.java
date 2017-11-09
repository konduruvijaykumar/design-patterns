/**
 * 
 */
package org.pjay.designpatterns.prototype;

/**
 * @author vijayk
 *
 */
public class AnimalClient {

	public static void main(String[] args) {
		AnimalCreator animalCreator = new AnimalCreator();
		animalCreator.setAnimalData("Sparky Chiken", 2, "I can Fly and have feathers", "chiken");
		animalCreator.setAnimalData("Sally Sheep", 4, "I am a Domestic Animal and have wool", "sheep");
		
		System.out.println("Original Animal");
		System.out.println(animalCreator.getChiken().toString());
		System.out.println(animalCreator.getSheep().toString());
		System.out.println("Cloned Animal");
		Animal chikenClone = animalCreator.getCloneAnimal("Chiken");
		Animal sheepClone = animalCreator.getCloneAnimal("Sheep");
		System.out.println(chikenClone.toString());
		System.out.println(sheepClone.toString());
		
		System.out.println();
		// You might see a different behavior due to strings immutability. when changing value different object from string pool gets assigned or created 
		System.out.println("Testing data after colned animals are modified");
		chikenClone.setName("Sparky Chiken Clone");
		sheepClone.setName("Sally Sheep Clone");
		
		System.out.println("Original Animal");
		System.out.println(animalCreator.getChiken().toString());
		System.out.println(animalCreator.getSheep().toString());
		System.out.println("Cloned Animal");
		System.out.println(chikenClone.toString());
		System.out.println(sheepClone.toString());
		
	}

}
