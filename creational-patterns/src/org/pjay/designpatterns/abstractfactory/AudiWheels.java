/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class AudiWheels implements Wheels {

	@Override
	public void createWheels() {
		System.out.println("Creating Audi Wheels... ");
	}

}
