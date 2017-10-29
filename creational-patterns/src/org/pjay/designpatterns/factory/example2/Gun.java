/**
 * 
 */
package org.pjay.designpatterns.factory.example2;

/**
 * @author Vijay
 *
 */
public abstract class Gun {
	
	private String gunName;
	private Integer numberOfBulletsLoaded;
	private String amountOfDamage;
	private String attackDistance;
	
	public String getGunName() {
		return gunName;
	}
	public void setGunName(String gunName) {
		this.gunName = gunName;
	}
	public Integer getNumberOfBulletsLoaded() {
		return numberOfBulletsLoaded;
	}
	public void setNumberOfBulletsLoaded(Integer numberOfBulletsLoaded) {
		this.numberOfBulletsLoaded = numberOfBulletsLoaded;
	}
	public String getAmountOfDamage() {
		return amountOfDamage;
	}
	public void setAmountOfDamage(String amountOfDamage) {
		this.amountOfDamage = amountOfDamage;
	}
	public String getAttackDistance() {
		return attackDistance;
	}
	public void setAttackDistance(String attackDistance) {
		this.attackDistance = attackDistance;
	}
	
	public String fireGun(){
		return getGunName() + " has caused " + getAmountOfDamage() + " damage to enemy";
	}
	
	public String loadBullets(){
		return getGunName() + " is loaded with " + getNumberOfBulletsLoaded() + " bullets";
	}
	
	public String gunCapability(){
		return getGunName() + ": "
				+ "\nHas attack distance of " + getAttackDistance()
				+ "\nBullets loading capacity of " + getNumberOfBulletsLoaded()
				+ "\nCan cause " + getAmountOfDamage() + " damage to enemy";
	}

}
