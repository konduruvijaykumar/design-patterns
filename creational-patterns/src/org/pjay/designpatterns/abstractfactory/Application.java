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
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = null;
		AppFactoryCreator appFactoryCreator = new AppFactoryCreator();
		System.out.println(" Audi ");
		vehicleFactory = appFactoryCreator.getVehicleFactory(VehicleType.AUDI);
		vehicleFactory.createVehile();
		System.out.println();
		System.out.println(" BMW ");
		vehicleFactory = appFactoryCreator.getVehicleFactory(VehicleType.BMW);
		vehicleFactory.createVehile();
	}

}
