/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class AudiChasis implements Chasis {

	@Override
	public void createChasis() {
		System.out.println("Creating Audi Chasis... ");
	}

}
