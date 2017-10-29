/**
 * 
 */
package org.pjay.designpatterns.factory.example1;

/**
 * @author vijayk
 *
 */
public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		// Real implementation will be with opening a file and writing log to file
		System.out.println("Writing log message to File... ");
		System.out.println("Log Message:: " + message);
	}

}
