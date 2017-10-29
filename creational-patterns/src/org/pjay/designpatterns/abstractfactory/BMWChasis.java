/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class BMWChasis implements Chasis {

	@Override
	public void createChasis() {
		System.out.println("Creating BMW Chasis... ");
	}

}
