/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
// The Director who constructs object through Builder's interface
public class ComputerEngineer {

	ComputerBuilder builder;

	public ComputerEngineer(ComputerBuilder builder) {
		this.builder = builder;
	}

	public Computer buildComputer() {
		builder.buildBody();
		builder.buildMotherBoard();
		builder.buildProcessor();
		builder.buildRam();
		builder.buildHardDisk();
		return builder.getComputer();
	}

}
