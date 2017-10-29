/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class AudiVehicleFactory extends VehicleFactory{

	@Override
	Chasis createVehicleChasis() {
		return new AudiChasis();
	}

	@Override
	Engine createVehicleEngine() {
		return new AudiEngine();
	}

	@Override
	Wheels createVehicleWheels() {
		return new AudiWheels();
	}

}
