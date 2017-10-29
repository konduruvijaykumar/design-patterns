/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class BMWVehicleFactory extends VehicleFactory{

	@Override
	Chasis createVehicleChasis() {
		return new BMWChasis();
	}

	@Override
	Engine createVehicleEngine() {
		return new BMWEngine();
	}

	@Override
	Wheels createVehicleWheels() {
		return new BMWWheels();
	}

}
