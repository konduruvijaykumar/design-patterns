/**
 * 
 */
package org.pjay.designpatterns.factory.example1;

/**
 * @author vijayk
 *
 */
public class DataBaseLogger implements Logger {

	@Override
	public void log(String message) {
		// Real implementation will be with opening a DB connection and inserting log message to DB
		System.out.println("Writing log message to Database... ");
		System.out.println("Log Message:: " + message);
	}

}
