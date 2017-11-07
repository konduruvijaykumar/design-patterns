/**
 * 
 */
package org.pjay.designpatterns.builder.example2;

/**
 * @author vijayk
 *
 */
public class CivilEngineer {// Can call HouseDirector

	public House constructHouse(HouseBuilder builder) {
		House house = builder.createHouse();
		System.out.println(house.getInfo());
		house.setFloor(builder.createFloor());
		System.out.println(house.getFloor().getInfo());
		house.setWalls(builder.createWalls());
		System.out.println(house.getWalls().getInfo());
		house.setRoof(builder.createRoof());
		System.out.println(house.getRoof().getInfo());
		return house;
	}
	
}
