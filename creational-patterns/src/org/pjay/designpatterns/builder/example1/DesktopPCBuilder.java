/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
public class DesktopPCBuilder implements ComputerBuilder{
	
	//ComputerPlan computer;
	Computer computer;
	
	public DesktopPCBuilder() {
		computer = new Computer();
	}

	@Override
	public void buildBody() {
		computer.setBody("Desktop is build using OptiPlex Cabinet");
	}

	@Override
	public void buildMotherBoard() {
		computer.setMotherBoard("Desktop is configured with intel Motherboard");
	}

	@Override
	public void buildProcessor() {
		computer.setProcessor("Desktop is configured with intel i7 Processor");
	}

	@Override
	public void buildRam() {
		computer.setRam("Desktop is configured with 8 GB of RAM");
	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("Desktop is configured with 1 TB HardDisk");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
