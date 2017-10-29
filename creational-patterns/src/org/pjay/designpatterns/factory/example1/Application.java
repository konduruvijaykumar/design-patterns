/**
 * 
 */
package org.pjay.designpatterns.factory.example1;

/**
 * @author vijayk
 *
 */
public class Application {
	
	public static void main(String[] args) {
		LoggerFactory loggerFactory = new LoggerFactory();
		Logger logger = null;
		logger = loggerFactory.getLogger("Console");
		logger.log("Hello from factory pattern... ");
	}

}
