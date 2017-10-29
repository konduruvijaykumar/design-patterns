/**
 * 
 */
package org.pjay.designpatterns.factory.example2;

/**
 * @author Vijay
 * Factory pattern is used when you want to return one of the several possible classes that share a common super class
 * This pattern gives the ability to choose class at runtime 
 *
 */
public class GunFactory {

	public Gun getGun(String selectedGun) {
		Gun gun = null;
		if("AK47".equalsIgnoreCase(selectedGun)){
			gun = new Ak47();
		}else if("Sniper".equalsIgnoreCase(selectedGun)){
			gun = new Sniper();
		}else if("SawOff".equalsIgnoreCase(selectedGun)){
			gun = new SawOffGun();
		}else if("Pistol".equalsIgnoreCase(selectedGun)){
			gun = new Pistol();
		}
		return gun;
	}

}
