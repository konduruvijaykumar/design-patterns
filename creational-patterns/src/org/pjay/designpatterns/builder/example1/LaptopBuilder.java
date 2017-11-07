/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
public class LaptopBuilder implements ComputerBuilder {

	Computer computer;

	public LaptopBuilder() {
		computer = new Computer();
	}

	@Override
	public void buildBody() {
		computer.setBody("Laptop is build using aluminium unibody design");
	}

	@Override
	public void buildMotherBoard() {
		computer.setMotherBoard("Laptop is configured with intel Motherboard");
	}

	@Override
	public void buildProcessor() {
		computer.setProcessor("Laptop is configured with intel i5 Processor");
	}

	@Override
	public void buildRam() {
		computer.setRam("Laptop is configured with 16 GB of RAM");
	}

	@Override
	public void buildHardDisk() {
		computer.setHardDisk("Laptop is configured with 2 TB SSD");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
