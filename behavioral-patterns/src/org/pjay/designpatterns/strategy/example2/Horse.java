/**
 * 
 */
package org.pjay.designpatterns.strategy.example2;

/**
 * @author Vijay
 *
 */
public class Horse extends Animal{

	public Horse() {
		super();
		this.setFlyingType(new CannotFly());
	}

}
