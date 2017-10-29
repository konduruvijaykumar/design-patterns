/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class BMWWheels implements Wheels {

	@Override
	public void createWheels() {
		System.out.println("Creating BMW Wheels... ");
	}

}
