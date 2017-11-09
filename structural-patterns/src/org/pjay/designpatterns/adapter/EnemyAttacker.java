/**
 * 
 */
package org.pjay.designpatterns.adapter;

/**
 * @author Vijay
 * @source http://www.newthinktank.com/2012/09/adapter-design-pattern-tutorial/
 *
 */
//This is the Target Interface : This is what the client
//expects to work with. It is the adapters job to make new 
//classes compatible with this one.

public interface EnemyAttacker {
	
	public void fireWeapon();
	
	public void driveForward();
	
	public void assignDriver(String driverName);
	
}
