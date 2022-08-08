package logging;

/*Debuggin is used for capturing application activity which is very useful for understandin what is going on.
 * wide log manager manages both configuration of the logging system and the objects that do the actual logging
 * Logger class provides methods for logging since logmanage is the one that does the actual work we access it 
 * using get logger method */

/*must imports*/
import java.util.logging.*;

class DemoLogger {
	
	/*creating a static object because log manager is universal*/
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void makeSomeLog() {
		LOGGER.log(Level.INFO,"My first Log");
	}
}

/*mian class*/
public class Demo {
	
	/*main driver method*/
	public static void main(String[] args) {

		/*creating object of the DemoLogger class*/
		DemoLogger demologger = new DemoLogger();
		
		/*calling the method inside it using the object we created*/
		demologger.makeSomeLog();
		
		/*creating object of the LogManager and getLogManager*/
		LogManager logmanager = LogManager.getLogManager();
		
		/*creating object of the Logger and getLogger using the LogManager object*/
		/*whenever we create object of the Logger class we should put this Logger.GLOBAL_LOGGER_NAME
		 *  as parameter fo the constructor*/
		Logger logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		/*using the object of Logger class and log method we get the logger now*/
		/*I think there must be level.INFO whenever we use object of Logge class*/
		logger.log(Level.INFO, "This is my second Log");
		
		
	}

}
