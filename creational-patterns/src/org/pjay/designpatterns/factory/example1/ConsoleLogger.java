/**
 * 
 */
package org.pjay.designpatterns.factory.example1;

/**
 * @author vijayk
 *
 */
public class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		// Below message are anyways written to console, so this works as console Logger
		System.out.println("Writing log message to Console... ");
		System.out.println("Log Message:: " + message);
	}

}
