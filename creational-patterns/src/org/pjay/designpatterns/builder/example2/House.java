/**
 * 
 */
package org.pjay.designpatterns.builder.example2;

/**
 * @author vijayk
 *
 */
public abstract class House {

	private Floor floor;
	private Walls walls;
	private Roof roof;

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public Walls getWalls() {
		return walls;
	}

	public void setWalls(Walls walls) {
		this.walls = walls;
	}

	public Roof getRoof() {
		return roof;
	}

	public void setRoof(Roof roof) {
		this.roof = roof;
	}

	public abstract String getInfo();

}
