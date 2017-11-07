/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
public interface ComputerBuilder {

	void buildBody();

	void buildMotherBoard();

	void buildProcessor();

	void buildRam();

	void buildHardDisk();

	Computer getComputer();

}
