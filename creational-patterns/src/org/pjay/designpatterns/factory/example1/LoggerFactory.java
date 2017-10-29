/**
 * 
 */
package org.pjay.designpatterns.factory.example1;

/**
 * @author vijayk
 *
 */
public class LoggerFactory {

	public Logger getLogger(String loggerType) {
		Logger logger = null;
		if("DB".equalsIgnoreCase(loggerType)) {
			logger = new DataBaseLogger();
		}else if("File".equalsIgnoreCase(loggerType)) {
			logger = new FileLogger();
		}else if("Console".equalsIgnoreCase(loggerType)) {
			logger = new ConsoleLogger();
		}
		return logger;
	}
	
}
