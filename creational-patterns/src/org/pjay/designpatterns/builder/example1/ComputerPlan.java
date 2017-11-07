/**
 * 
 */
package org.pjay.designpatterns.builder.example1;

/**
 * @author vijayk
 *
 */
public interface ComputerPlan {

	void setBody(String body);

	void setMotherBoard(String motherBoard);

	void setProcessor(String processor);

	void setRam(String ram);

	void setHardDisk(String hardDisk);

}
