/**
 * 
 */
package org.pjay.designpatterns.singleton;

/**
 * @author Vijay
 *
 */
public enum SingletonEnumDemo {
	MYINSTANCE;
	
	public void doStuff(){
		System.out.println("This is singleton class using ENUM and the hascode is: " + this.hashCode());
	}

}
