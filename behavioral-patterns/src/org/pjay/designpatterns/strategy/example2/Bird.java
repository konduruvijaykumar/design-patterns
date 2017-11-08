/**
 * 
 */
package org.pjay.designpatterns.strategy.example2;

/**
 * @author Vijay
 *
 */
public class Bird extends Animal{

	public Bird() {
		super();
		this.setFlyingType(new CanFly());
	}

}
