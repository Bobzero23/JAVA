package logging;

/*Debuggin is used for capturing application activity which is very useful for understandin what is going on.
 * wide log manager manages both configuration of the logging system and the objects that do the actual logging
 * Logger class provides methods for logging since logmanage is the one that does the actual work we access it 
 * using get logger method */

/*must imports*/
import java.util.logging.*;

/*mian class*/
public class Demo {
	
	/*main driver method*/
	public static void main(String[] args) {

		/*creating a static object because log manager is universal*/
		private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		public void makeSomeLog() {
			System.out.println();
		}
	}

}
