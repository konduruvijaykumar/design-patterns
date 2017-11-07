/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
public class Computer implements ComputerPlan {

	private String body;
	private String motherBoard;
	private String processor;
	private String ram;
	private String hardDisk;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}

	@Override
	public String toString() {
		return "Computer [body=" + body + ", motherBoard=" + motherBoard + ", processor=" + processor + ", ram=" + ram
				+ ", hardDisk=" + hardDisk + "]";
	}

}
