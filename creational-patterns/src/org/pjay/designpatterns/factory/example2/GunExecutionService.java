/**
 * 
 */
package org.pjay.designpatterns.factory.example2;

import java.util.Scanner;

/**
 * @author Vijay
 *
 */
public class GunExecutionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gun gun = null;
		String selectedGun = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the gun you are looking for (AK47 / Sniper / SawOff / Pistol): ");
		if(scn.hasNextLine()){
			selectedGun = scn.nextLine();
		}
		scn.close();
		
		// Factory pattern is all about moving the below code logic to new class. This encapsulates objects creation logic
		if(null != selectedGun){
/*			if("AK47".equalsIgnoreCase(selectedGun)){
				gun = new Ak47();
			}else if("Sniper".equalsIgnoreCase(selectedGun)){
				gun = new Sniper();
			}else if("SawOff".equalsIgnoreCase(selectedGun)){
				gun = new SawOffGun();
			}else if("Pistol".equalsIgnoreCase(selectedGun)){
				gun = new Pistol();
			}else{
				System.out.println("oops you selected a wrong gun from repository");
			}*/
			gun = (new GunFactory()).getGun(selectedGun);
		}else{ // This will not get executed as scanner will return empty string if nothing is entered and hit enter. Added as a safety measure
			System.out.println("oops you have not selected any gun from repository");
		}
		
		if(null != gun){
			executeGun(gun);
		}else{
			System.out.println("oops you selected a wrong gun from repository");
		}
	}

	private static void executeGun(Gun gun) {
		System.out.println("\n");
		System.out.println(gun.gunCapability());
		System.out.println("\n");
		System.out.println(gun.loadBullets());
		System.out.println("\n");
		System.out.println(gun.fireGun());
	}

}
