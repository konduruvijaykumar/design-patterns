/**
 * 
 */
package org.pjay.designpatterns.abstractfactory;

/**
 * @author vijayk
 *
 */
public class AppFactoryCreator {

	public VehicleFactory getVehicleFactory(VehicleType vehicleType) {
		/*
		 * if(VehicleType.AUDI == vehicleType) { return new AudiVehicleFactory(); }
		 * else if(VehicleType.BMW == vehicleType){ return new BMWVehicleFactory(); }
		 * return null;
		 */
		VehicleFactory vehicleFactory = null;
		switch (vehicleType) {
			case AUDI:
				vehicleFactory = new AudiVehicleFactory();
				break;
			case BMW:
				vehicleFactory = new BMWVehicleFactory();
				break;
			default:
				//vehicleFactory = null; // Do nothing vehicleFactory is already null
				break;
		}
		return vehicleFactory;
	}

}
