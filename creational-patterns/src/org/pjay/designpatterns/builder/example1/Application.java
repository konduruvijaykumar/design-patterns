/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
public class Application {
	
	public static void main(String[] args) {
		ComputerBuilder computerBuilder = new DesktopPCBuilder();
		ComputerEngineer computerEngineer = new ComputerEngineer(computerBuilder);
		System.out.println(computerEngineer.buildComputer());
	}

}
