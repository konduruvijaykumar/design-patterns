/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 * 
 * https://refactoring.guru/design-patterns/abstract-factory/java/example
 * https://github.com/iluwatar/java-design-patterns/tree/master/abstract-factory/src/main/java/com/iluwatar/abstractfactory
 * http://www.oodesign.com/abstract-factory-pattern.html
 * 
 */
// Trying to use template method pattern
public abstract class VehicleFactory { // public interface VehicleFactory {

	abstract Chasis createVehicleChasis();

	abstract Engine createVehicleEngine();

	abstract Wheels createVehicleWheels();
	
	void createVehile() {
		System.out.println("====================== Creating Vehicle =======================");
		createVehicleWheels().createWheels();
		createVehicleChasis().createChasis();
		createVehicleEngine().createEngine();
		System.out.println("===================== Assembling Vehicle ======================");
	}

}
