/**
 * 
 */
package org.pjay.designpatterns.strategy.example2;

/**
 * @author Vijay
 *
 */
public interface Fly {
	String fly();
}

class CanFly implements Fly{

	public String fly() {
		return "I am flying high";
	}
	
}

class CannotFly implements Fly{

	public String fly() {
		return "I cannot fly";
	}
	
}