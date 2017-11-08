/**
 * 
 */
package org.pjay.designpatterns.strategy.example2;

/**
 * @author Vijay
 *
 */
public class AnimalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal sparky = new Horse();
		Animal tweety = new Bird();
		
		sparky.setName("Sparky");
		tweety.setName("Tweety");
		
		System.out.println("Horse: " + sparky.getName() + " is my name");
		System.out.println("Bird: " + tweety.getName() + " is my name");
		
		System.out.println("Horse: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());
		
		// tomorrow when you encounter birds like kiwi, ostrich, emu etc. which cannot fly.
		// we can dynamically change the behaviour dynamically by changing flyingType instance variable with the help of setter(aka mutator)
		
		Animal kiwi = new Bird();
		kiwi.setName("Kiwi");
		
		System.out.println();
		System.out.println("Bird: " + kiwi.getName() + " is my name");
		System.out.println("Bird: " + kiwi.tryToFly());
		
		kiwi.setFlyingType(new CannotFly());
		
		System.out.println("Bird: " + kiwi.getName() + " is my name");
		System.out.println("Bird: " + kiwi.tryToFly());
		
	}

}
