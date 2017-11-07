/**
 * 
 */
package org.pjay.designpatterns.builder.example2;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CivilEngineer civilEngineer = new CivilEngineer();
		System.out.println("=================== Wood House ===================");
		civilEngineer.constructHouse(new WoodHouseBuilder());
		System.out.println("=================== Brick House ===================");
		civilEngineer.constructHouse(new BrickHouseBuilder());
	}

}
